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
import com.gzl.dge.oex.domain.PaperQtype;
import com.gzl.dge.oex.service.IPaperQtypeService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 试卷题型 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Controller
@RequestMapping("/oex/paperQtype")
public class PaperQtypeController extends BaseController
{
    private String prefix = "oex/paperQtype";
	
	@Autowired
	private IPaperQtypeService paperQtypeService;
	
	@RequiresPermissions("oex:paperQtype:view")
	@GetMapping()
	public String paperQtype()
	{
	    return prefix + "/paperQtype";
	}
	
	/**
	 * 查询试卷题型列表
	 */
	@RequiresPermissions("oex:paperQtype:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(PaperQtype paperQtype)
	{
		startPage();
        List<PaperQtype> list = paperQtypeService.selectPaperQtypeList(paperQtype);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出试卷题型列表
	 */
	@RequiresPermissions("oex:paperQtype:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PaperQtype paperQtype)
    {
    	List<PaperQtype> list = paperQtypeService.selectPaperQtypeList(paperQtype);
        ExcelUtil<PaperQtype> util = new ExcelUtil<PaperQtype>(PaperQtype.class);
        return util.exportExcel(list, "paperQtype");
    }
	
	/**
	 * 新增试卷题型
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存试卷题型
	 */
	@RequiresPermissions("oex:paperQtype:add")
	@Log(title = "试卷题型", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(PaperQtype paperQtype)
	{		
		return toAjax(paperQtypeService.insertPaperQtype(paperQtype));
	}

	/**
	 * 修改试卷题型
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Long iD, ModelMap mmap)
	{
		PaperQtype paperQtype = paperQtypeService.selectPaperQtypeById(iD);
		mmap.put("paperQtype", paperQtype);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存试卷题型
	 */
	@RequiresPermissions("oex:paperQtype:edit")
	@Log(title = "试卷题型", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(PaperQtype paperQtype)
	{		
		return toAjax(paperQtypeService.updatePaperQtype(paperQtype));
	}
	
	/**
	 * 删除试卷题型
	 */
	@RequiresPermissions("oex:paperQtype:remove")
	@Log(title = "试卷题型", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(paperQtypeService.deletePaperQtypeByIds(ids));
	}
	
}
