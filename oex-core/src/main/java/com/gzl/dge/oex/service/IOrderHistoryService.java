package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.OrderHistory;
import java.util.List;

/**
 * 订单付款记录 服务层
 * 
 * @author Dge
 * @date 2018-11-28
 */
public interface IOrderHistoryService 
{
	/**
     * 查询订单付款记录信息
     * 
     * @param id 订单付款记录ID
     * @return 订单付款记录信息
     */
	public OrderHistory selectOrderHistoryById(Long id);
	
	/**
     * 查询订单付款记录列表
     * 
     * @param orderHistory 订单付款记录信息
     * @return 订单付款记录集合
     */
	public List<OrderHistory> selectOrderHistoryList(OrderHistory orderHistory);
	
	/**
     * 新增订单付款记录
     * 
     * @param orderHistory 订单付款记录信息
     * @return 结果
     */
	public int insertOrderHistory(OrderHistory orderHistory);
	
	/**
     * 修改订单付款记录
     * 
     * @param orderHistory 订单付款记录信息
     * @return 结果
     */
	public int updateOrderHistory(OrderHistory orderHistory);
		
	/**
     * 删除订单付款记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderHistoryByIds(String ids);
	
}
