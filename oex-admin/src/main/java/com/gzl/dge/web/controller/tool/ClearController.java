package com.gzl.dge.web.controller.tool;


import com.gzl.dge.common.annotation.Log;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.constant.RedisConstants;
import com.gzl.dge.common.enums.BusinessType;
import com.gzl.dge.framework.redis.RedisConfig;
import com.gzl.dge.framework.util.ShiroUtils;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.system.domain.SysMenu;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Set;

@Controller
@RequestMapping("/tool/clear")
public class ClearController extends BaseController {

    private String prefix = "tool/clear";

    @Autowired
    private RedisTemplate redisTemplate;

    @RequiresPermissions("tool:clear:view")
    @GetMapping()
    public String index()
    {
        return prefix+"/index";
    }


    @Log(title = "清除服务器端缓存", businessType = BusinessType.DELETE)
    @RequiresPermissions("tool:clear:done")
    @PostMapping("/done")
    @ResponseBody
    public AjaxResult clear()
    {
        redisTemplate.execute((RedisCallback<Object>) connection -> {

            Set<byte[]> caches = connection.keys((RedisConstants.REDIS_KEY_MENU+"*").getBytes());
            if(!caches.isEmpty()){
                connection.del(caches.toArray(new byte[][]{}));
            }

            caches = connection.keys((RedisConstants.REDIS_KEY_BASE_DATE+"*").getBytes());
            if(!caches.isEmpty()){
                connection.del(caches.toArray(new byte[][]{}));
            }

            //connection.flushAll();
            return null;
        });
        return success();
    }
}
