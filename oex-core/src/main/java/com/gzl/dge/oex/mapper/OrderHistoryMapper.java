package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.OrderHistory;
import java.util.List;	

/**
 * 订单收款凭证 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface OrderHistoryMapper 
{
	/**
     * 查询订单收款凭证信息
     * 
     * @param id 订单收款凭证ID
     * @return 订单收款凭证信息
     */
	public OrderHistory selectOrderHistoryById(Long id);
	
	/**
     * 查询订单收款凭证列表
     * 
     * @param orderHistory 订单收款凭证信息
     * @return 订单收款凭证集合
     */
	public List<OrderHistory> selectOrderHistoryList(OrderHistory orderHistory);
	
	/**
     * 新增订单收款凭证
     * 
     * @param orderHistory 订单收款凭证信息
     * @return 结果
     */
	public int insertOrderHistory(OrderHistory orderHistory);
	
	/**
     * 修改订单收款凭证
     * 
     * @param orderHistory 订单收款凭证信息
     * @return 结果
     */
	public int updateOrderHistory(OrderHistory orderHistory);
	
	/**
     * 删除订单收款凭证
     * 
     * @param id 订单收款凭证ID
     * @return 结果
     */
	public int deleteOrderHistoryById(Long id);
	
	/**
     * 批量删除订单收款凭证
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderHistoryByIds(String[] ids);
	
}