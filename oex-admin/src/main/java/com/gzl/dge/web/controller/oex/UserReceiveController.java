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
import com.gzl.dge.oex.domain.UserReceive;
import com.gzl.dge.oex.service.IUserReceiveService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 送货 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/userReceive")
public class UserReceiveController extends BaseController
{
    private String prefix = "oex/userReceive";
	
	@Autowired
	private IUserReceiveService userReceiveService;
	
	@RequiresPermissions("oex:userReceive:view")
	@GetMapping()
	public String userReceive()
	{
	    return prefix + "/userReceive";
	}
	
	/**
	 * 查询送货列表
	 */
	@RequiresPermissions("oex:userReceive:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserReceive userReceive)
	{
		startPage();
        List<UserReceive> list = userReceiveService.selectUserReceiveList(userReceive);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出送货列表
	 */
	@RequiresPermissions("oex:userReceive:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserReceive userReceive)
    {
    	List<UserReceive> list = userReceiveService.selectUserReceiveList(userReceive);
        ExcelUtil<UserReceive> util = new ExcelUtil<UserReceive>(UserReceive.class);
        return util.exportExcel(list, "userReceive");
    }
	
	/**
	 * 新增送货
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存送货
	 */
	@RequiresPermissions("oex:userReceive:add")
	@Log(title = "送货", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserReceive userReceive)
	{		
		return toAjax(userReceiveService.insertUserReceive(userReceive));
	}

	/**
	 * 修改送货
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		UserReceive userReceive = userReceiveService.selectUserReceiveById(id);
		mmap.put("userReceive", userReceive);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存送货
	 */
	@RequiresPermissions("oex:userReceive:edit")
	@Log(title = "送货", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserReceive userReceive)
	{		
		return toAjax(userReceiveService.updateUserReceive(userReceive));
	}
	
	/**
	 * 删除送货
	 */
	@RequiresPermissions("oex:userReceive:remove")
	@Log(title = "送货", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userReceiveService.deleteUserReceiveByIds(ids));
	}
	
}
