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
import com.gzl.dge.oex.domain.UserQuestion;
import com.gzl.dge.oex.service.IUserQuestionService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 用户做题 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Controller
@RequestMapping("/oex/userQuestion")
public class UserQuestionController extends BaseController
{
    private String prefix = "oex/userQuestion";
	
	@Autowired
	private IUserQuestionService userQuestionService;
	
	@RequiresPermissions("oex:userQuestion:view")
	@GetMapping()
	public String userQuestion()
	{
	    return prefix + "/userQuestion";
	}
	
	/**
	 * 查询用户做题列表
	 */
	@RequiresPermissions("oex:userQuestion:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserQuestion userQuestion)
	{
		startPage();
        List<UserQuestion> list = userQuestionService.selectUserQuestionList(userQuestion);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户做题列表
	 */
	@RequiresPermissions("oex:userQuestion:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserQuestion userQuestion)
    {
    	List<UserQuestion> list = userQuestionService.selectUserQuestionList(userQuestion);
        ExcelUtil<UserQuestion> util = new ExcelUtil<UserQuestion>(UserQuestion.class);
        return util.exportExcel(list, "userQuestion");
    }
	
	/**
	 * 新增用户做题
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户做题
	 */
	@RequiresPermissions("oex:userQuestion:add")
	@Log(title = "用户做题", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserQuestion userQuestion)
	{		
		return toAjax(userQuestionService.insertUserQuestion(userQuestion));
	}

	/**
	 * 修改用户做题
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Long iD, ModelMap mmap)
	{
		UserQuestion userQuestion = userQuestionService.selectUserQuestionById(iD);
		mmap.put("userQuestion", userQuestion);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户做题
	 */
	@RequiresPermissions("oex:userQuestion:edit")
	@Log(title = "用户做题", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserQuestion userQuestion)
	{		
		return toAjax(userQuestionService.updateUserQuestion(userQuestion));
	}
	
	/**
	 * 删除用户做题
	 */
	@RequiresPermissions("oex:userQuestion:remove")
	@Log(title = "用户做题", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userQuestionService.deleteUserQuestionByIds(ids));
	}
	
}
