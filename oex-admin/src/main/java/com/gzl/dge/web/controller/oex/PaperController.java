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
import com.gzl.dge.oex.domain.Paper;
import com.gzl.dge.oex.service.IPaperService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 试卷名称 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-29
 */
@Controller
@RequestMapping("/oex/paper")
public class PaperController extends BaseController
{
    private String prefix = "oex/paper";
	
	@Autowired
	private IPaperService paperService;
	
	@RequiresPermissions("oex:paper:view")
	@GetMapping()
	public String paper()
	{
	    return prefix + "/paper";
	}
	
	/**
	 * 查询试卷名称列表
	 */
	@RequiresPermissions("oex:paper:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Paper paper)
	{
		startPage();
        List<Paper> list = paperService.selectPaperList(paper);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出试卷名称列表
	 */
	@RequiresPermissions("oex:paper:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Paper paper)
    {
    	List<Paper> list = paperService.selectPaperList(paper);
        ExcelUtil<Paper> util = new ExcelUtil<Paper>(Paper.class);
        return util.exportExcel(list, "paper");
    }
	
	/**
	 * 新增试卷名称
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存试卷名称
	 */
	@RequiresPermissions("oex:paper:add")
	@Log(title = "试卷名称", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Paper paper)
	{		
		return toAjax(paperService.insertPaper(paper));
	}

	/**
	 * 修改试卷名称
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Paper paper = paperService.selectPaperById(id);
		mmap.put("paper", paper);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存试卷名称
	 */
	@RequiresPermissions("oex:paper:edit")
	@Log(title = "试卷名称", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Paper paper)
	{		
		return toAjax(paperService.updatePaper(paper));
	}
	
	/**
	 * 删除试卷名称
	 */
	@RequiresPermissions("oex:paper:remove")
	@Log(title = "试卷名称", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(paperService.deletePaperByIds(ids));
	}
	
}
