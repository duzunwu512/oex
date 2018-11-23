package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.OrderHistory;
import java.util.List;

/**
 * 订单收款凭证 服务层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface IOrderHistoryService 
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
     * 删除订单收款凭证信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderHistoryByIds(String ids);
	
}
