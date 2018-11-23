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
import com.gzl.dge.oex.domain.OrderHistory;
import com.gzl.dge.oex.service.IOrderHistoryService;
import com.gzl.dge.framework.web.base.BaseController;
import com.gzl.dge.framework.web.page.TableDataInfo;
import com.gzl.dge.common.base.AjaxResult;
import com.gzl.dge.common.utils.ExcelUtil;

/**
 * 订单收款凭证 信息操作处理
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Controller
@RequestMapping("/oex/orderHistory")
public class OrderHistoryController extends BaseController
{
    private String prefix = "oex/orderHistory";
	
	@Autowired
	private IOrderHistoryService orderHistoryService;
	
	@RequiresPermissions("oex:orderHistory:view")
	@GetMapping()
	public String orderHistory()
	{
	    return prefix + "/orderHistory";
	}
	
	/**
	 * 查询订单收款凭证列表
	 */
	@RequiresPermissions("oex:orderHistory:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(OrderHistory orderHistory)
	{
		startPage();
        List<OrderHistory> list = orderHistoryService.selectOrderHistoryList(orderHistory);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出订单收款凭证列表
	 */
	@RequiresPermissions("oex:orderHistory:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OrderHistory orderHistory)
    {
    	List<OrderHistory> list = orderHistoryService.selectOrderHistoryList(orderHistory);
        ExcelUtil<OrderHistory> util = new ExcelUtil<OrderHistory>(OrderHistory.class);
        return util.exportExcel(list, "orderHistory");
    }
	
	/**
	 * 新增订单收款凭证
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存订单收款凭证
	 */
	@RequiresPermissions("oex:orderHistory:add")
	@Log(title = "订单收款凭证", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(OrderHistory orderHistory)
	{		
		return toAjax(orderHistoryService.insertOrderHistory(orderHistory));
	}

	/**
	 * 修改订单收款凭证
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") Long id, ModelMap mmap)
	{
		OrderHistory orderHistory = orderHistoryService.selectOrderHistoryById(id);
		mmap.put("orderHistory", orderHistory);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存订单收款凭证
	 */
	@RequiresPermissions("oex:orderHistory:edit")
	@Log(title = "订单收款凭证", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(OrderHistory orderHistory)
	{		
		return toAjax(orderHistoryService.updateOrderHistory(orderHistory));
	}
	
	/**
	 * 删除订单收款凭证
	 */
	@RequiresPermissions("oex:orderHistory:remove")
	@Log(title = "订单收款凭证", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(orderHistoryService.deleteOrderHistoryByIds(ids));
	}
	
}
