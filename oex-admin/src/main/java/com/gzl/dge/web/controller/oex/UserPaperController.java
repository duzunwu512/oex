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
import com.gzl.dge.oex.domain.UserPaper;
import com.gzl.dge.oex.service.IUserPaperService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 用户试卷 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/userPaper")
public class UserPaperController extends BaseController
{
    private String prefix = "oex/userPaper";
	
	@Autowired
	private IUserPaperService userPaperService;
	
	@RequiresPermissions("oex:userPaper:view")
	@GetMapping()
	public String userPaper()
	{
	    return prefix + "/userPaper";
	}
	
	/**
	 * 查询用户试卷列表
	 */
	@RequiresPermissions("oex:userPaper:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserPaper userPaper)
	{
		startPage();
        List<UserPaper> list = userPaperService.selectUserPaperList(userPaper);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户试卷列表
	 */
	@RequiresPermissions("oex:userPaper:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserPaper userPaper)
    {
    	List<UserPaper> list = userPaperService.selectUserPaperList(userPaper);
        ExcelUtil<UserPaper> util = new ExcelUtil<UserPaper>(UserPaper.class);
        return util.exportExcel(list, "userPaper");
    }
	
	/**
	 * 新增用户试卷
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户试卷
	 */
	@RequiresPermissions("oex:userPaper:add")
	@Log(title = "用户试卷", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserPaper userPaper)
	{		
		return toAjax(userPaperService.insertUserPaper(userPaper));
	}

	/**
	 * 修改用户试卷
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		UserPaper userPaper = userPaperService.selectUserPaperById(id);
		mmap.put("userPaper", userPaper);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户试卷
	 */
	@RequiresPermissions("oex:userPaper:edit")
	@Log(title = "用户试卷", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserPaper userPaper)
	{		
		return toAjax(userPaperService.updateUserPaper(userPaper));
	}
	
	/**
	 * 删除用户试卷
	 */
	@RequiresPermissions("oex:userPaper:remove")
	@Log(title = "用户试卷", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userPaperService.deleteUserPaperByIds(ids));
	}
	
}
