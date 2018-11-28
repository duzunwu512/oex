package com.gzl.dge.web.controller.oex;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.gzl.dge.common.annotation.Log;
import com.gzl.dge.common.enums.BusinessType;
import com.gzl.dge.oex.domain.UserCollect;
import com.gzl.dge.oex.service.IUserCollectService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 用户收藏试题 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/userCollect")
public class UserCollectController extends BaseController
{
    private String prefix = "oex/userCollect";
	
	@Autowired
	private IUserCollectService userCollectService;
	
	@RequiresPermissions("oex:userCollect:view")
	@GetMapping()
	public String userCollect()
	{
	    return prefix + "/userCollect";
	}
	
	/**
	 * 查询用户收藏试题列表
	 */
	@RequiresPermissions("oex:userCollect:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserCollect userCollect)
	{
		startPage();
        List<UserCollect> list = userCollectService.selectUserCollectList(userCollect);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户收藏试题列表
	 */
	@RequiresPermissions("oex:userCollect:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserCollect userCollect)
    {
    	List<UserCollect> list = userCollectService.selectUserCollectList(userCollect);
        ExcelUtil<UserCollect> util = new ExcelUtil<UserCollect>(UserCollect.class);
        return util.exportExcel(list, "userCollect");
    }
	
	/**
	 * 新增用户收藏试题
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户收藏试题
	 */
	@RequiresPermissions("oex:userCollect:add")
	@Log(title = "用户收藏试题", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserCollect userCollect)
	{		
		return toAjax(userCollectService.insertUserCollect(userCollect));
	}

	/**
	 * 修改用户收藏试题
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		UserCollect userCollect = userCollectService.selectUserCollectById(id);
		mmap.put("userCollect", userCollect);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户收藏试题
	 */
	@RequiresPermissions("oex:userCollect:edit")
	@Log(title = "用户收藏试题", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserCollect userCollect)
	{		
		return toAjax(userCollectService.updateUserCollect(userCollect));
	}
	
	/**
	 * 删除用户收藏试题
	 */
	@RequiresPermissions("oex:userCollect:remove")
	@Log(title = "用户收藏试题", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userCollectService.deleteUserCollectByIds(ids));
	}
	
}
