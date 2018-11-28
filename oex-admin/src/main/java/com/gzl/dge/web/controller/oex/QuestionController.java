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
import com.gzl.dge.oex.domain.Question;
import com.gzl.dge.oex.service.IQuestionService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 试题 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/question")
public class QuestionController extends BaseController
{
    private String prefix = "oex/question";
	
	@Autowired
	private IQuestionService questionService;
	
	@RequiresPermissions("oex:question:view")
	@GetMapping()
	public String question()
	{
	    return prefix + "/question";
	}
	
	/**
	 * 查询试题列表
	 */
	@RequiresPermissions("oex:question:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Question question)
	{
		startPage();
        List<Question> list = questionService.selectQuestionList(question);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出试题列表
	 */
	@RequiresPermissions("oex:question:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Question question)
    {
    	List<Question> list = questionService.selectQuestionList(question);
        ExcelUtil<Question> util = new ExcelUtil<Question>(Question.class);
        return util.exportExcel(list, "question");
    }
	
	/**
	 * 新增试题
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存试题
	 */
	@RequiresPermissions("oex:question:add")
	@Log(title = "试题", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Question question)
	{		
		return toAjax(questionService.insertQuestion(question));
	}

	/**
	 * 修改试题
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Question question = questionService.selectQuestionById(id);
		mmap.put("question", question);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存试题
	 */
	@RequiresPermissions("oex:question:edit")
	@Log(title = "试题", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Question question)
	{		
		return toAjax(questionService.updateQuestion(question));
	}
	
	/**
	 * 删除试题
	 */
	@RequiresPermissions("oex:question:remove")
	@Log(title = "试题", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(questionService.deleteQuestionByIds(ids));
	}
	
}
