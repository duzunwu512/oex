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
import com.gzl.dge.oex.domain.UserProduct;
import com.gzl.dge.oex.service.IUserProductService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 用户产品 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Controller
@RequestMapping("/oex/userProduct")
public class UserProductController extends BaseController
{
    private String prefix = "oex/userProduct";
	
	@Autowired
	private IUserProductService userProductService;
	
	@RequiresPermissions("oex:userProduct:view")
	@GetMapping()
	public String userProduct()
	{
	    return prefix + "/userProduct";
	}
	
	/**
	 * 查询用户产品列表
	 */
	@RequiresPermissions("oex:userProduct:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(UserProduct userProduct)
	{
		startPage();
        List<UserProduct> list = userProductService.selectUserProductList(userProduct);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出用户产品列表
	 */
	@RequiresPermissions("oex:userProduct:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UserProduct userProduct)
    {
    	List<UserProduct> list = userProductService.selectUserProductList(userProduct);
        ExcelUtil<UserProduct> util = new ExcelUtil<UserProduct>(UserProduct.class);
        return util.exportExcel(list, "userProduct");
    }
	
	/**
	 * 新增用户产品
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存用户产品
	 */
	@RequiresPermissions("oex:userProduct:add")
	@Log(title = "用户产品", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(UserProduct userProduct)
	{		
		return toAjax(userProductService.insertUserProduct(userProduct));
	}

	/**
	 * 修改用户产品
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		UserProduct userProduct = userProductService.selectUserProductById(id);
		mmap.put("userProduct", userProduct);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存用户产品
	 */
	@RequiresPermissions("oex:userProduct:edit")
	@Log(title = "用户产品", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(UserProduct userProduct)
	{		
		return toAjax(userProductService.updateUserProduct(userProduct));
	}
	
	/**
	 * 删除用户产品
	 */
	@RequiresPermissions("oex:userProduct:remove")
	@Log(title = "用户产品", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(userProductService.deleteUserProductByIds(ids));
	}
	
}
