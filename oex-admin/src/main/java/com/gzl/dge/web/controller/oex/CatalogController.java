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
import com.gzl.dge.oex.domain.Catalog;
import com.gzl.dge.oex.service.ICatalogService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 考试类别 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Controller
@RequestMapping("/oex/catalog")
public class CatalogController extends BaseController
{
    private String prefix = "oex/catalog";
	
	@Autowired
	private ICatalogService catalogService;
	
	@RequiresPermissions("oex:catalog:view")
	@GetMapping()
	public String catalog()
	{
	    return prefix + "/catalog";
	}
	
	/**
	 * 查询考试类别列表
	 */
	@RequiresPermissions("oex:catalog:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Catalog catalog)
	{
		startPage();
        List<Catalog> list = catalogService.selectCatalogList(catalog);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出考试类别列表
	 */
	@RequiresPermissions("oex:catalog:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Catalog catalog)
    {
    	List<Catalog> list = catalogService.selectCatalogList(catalog);
        ExcelUtil<Catalog> util = new ExcelUtil<Catalog>(Catalog.class);
        return util.exportExcel(list, "catalog");
    }
	
	/**
	 * 新增考试类别
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存考试类别
	 */
	@RequiresPermissions("oex:catalog:add")
	@Log(title = "考试类别", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Catalog catalog)
	{		
		return toAjax(catalogService.insertCatalog(catalog));
	}

	/**
	 * 修改考试类别
	 */
	@GetMapping("/edit/{iD}")
	public String edit(@PathVariable("iD") Long iD, ModelMap mmap)
	{
		Catalog catalog = catalogService.selectCatalogById(iD);
		mmap.put("catalog", catalog);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存考试类别
	 */
	@RequiresPermissions("oex:catalog:edit")
	@Log(title = "考试类别", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Catalog catalog)
	{		
		return toAjax(catalogService.updateCatalog(catalog));
	}
	
	/**
	 * 删除考试类别
	 */
	@RequiresPermissions("oex:catalog:remove")
	@Log(title = "考试类别", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(catalogService.deleteCatalogByIds(ids));
	}
	
}
