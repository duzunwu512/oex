package com.gzl.dge.web.controller.oex;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzl.dge.common.annotation.Log;
import com.gzl.dge.common.enums.BusinessType;
import com.gzl.dge.oex.domain.Area;
import com.gzl.dge.oex.service.IAreaService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 地区 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Controller
@RequestMapping("/oex/area")
public class AreaController extends BaseController
{
    private String prefix = "oex/area";
	
	@Autowired
	private IAreaService areaService;
	
	@RequiresPermissions("oex:area:view")
	@GetMapping()
	public String area()
	{
	    return prefix + "/area";
	}
	
	/**
	 * 查询地区列表
	 */
	@RequiresPermissions("oex:area:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Area area)
	{
		startPage();
        List<Area> list = areaService.selectAreaList(area);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出地区列表
	 */
	@RequiresPermissions("oex:area:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Area area)
    {
    	List<Area> list = areaService.selectAreaList(area);
        ExcelUtil<Area> util = new ExcelUtil<Area>(Area.class);
        return util.exportExcel(list, "area");
    }
	
	/**
	 * 新增地区
	 */
	@GetMapping("/add/{parentId}")
	public String add(@PathVariable String parentId, ModelMap model)
	{
		if(StringUtils.isBlank(parentId)){
			parentId = "1";
		}
		Area area = areaService.selectAreaById(new Integer(parentId));
		model.addAttribute("area", area);
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存地区
	 */
	@RequiresPermissions("oex:area:add")
	@Log(title = "地区", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Area area)
	{		
		return toAjax(areaService.insertArea(area));
	}

	/**
	 * 修改地区
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Integer id, ModelMap mmap)
	{
		Area area = areaService.selectAreaById(id);
		mmap.put("area", area);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存地区
	 */
	@RequiresPermissions("oex:area:edit")
	@Log(title = "地区", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Area area)
	{		
		return toAjax(areaService.updateArea(area));
	}
	
	/**
	 * 删除地区
	 */
	@RequiresPermissions("oex:area:remove")
	@Log(title = "地区", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(areaService.deleteAreaByIds(ids));
	}


	@GetMapping("/treeData")
	@ResponseBody
	public List<Map<String, Object>> treeData()
	{
		List<Map<String, Object>> tree = areaService.selectAreaTree();
		return tree;
	}
	
}
