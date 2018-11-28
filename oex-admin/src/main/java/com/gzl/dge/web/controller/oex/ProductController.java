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
import com.gzl.dge.oex.domain.Product;
import com.gzl.dge.oex.service.IProductService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 产品 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/product")
public class ProductController extends BaseController
{
    private String prefix = "oex/product";
	
	@Autowired
	private IProductService productService;
	
	@RequiresPermissions("oex:product:view")
	@GetMapping()
	public String product()
	{
	    return prefix + "/product";
	}
	
	/**
	 * 查询产品列表
	 */
	@RequiresPermissions("oex:product:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(Product product)
	{
		startPage();
        List<Product> list = productService.selectProductList(product);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出产品列表
	 */
	@RequiresPermissions("oex:product:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Product product)
    {
    	List<Product> list = productService.selectProductList(product);
        ExcelUtil<Product> util = new ExcelUtil<Product>(Product.class);
        return util.exportExcel(list, "product");
    }
	
	/**
	 * 新增产品
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存产品
	 */
	@RequiresPermissions("oex:product:add")
	@Log(title = "产品", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(Product product)
	{		
		return toAjax(productService.insertProduct(product));
	}

	/**
	 * 修改产品
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		Product product = productService.selectProductById(id);
		mmap.put("product", product);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存产品
	 */
	@RequiresPermissions("oex:product:edit")
	@Log(title = "产品", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(Product product)
	{		
		return toAjax(productService.updateProduct(product));
	}
	
	/**
	 * 删除产品
	 */
	@RequiresPermissions("oex:product:remove")
	@Log(title = "产品", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(productService.deleteProductByIds(ids));
	}
	
}
