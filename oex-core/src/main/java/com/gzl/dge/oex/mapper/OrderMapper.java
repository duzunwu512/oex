package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.Order;
import java.util.List;	

/**
 * 订单 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface OrderMapper 
{
	/**
     * 查询订单信息
     * 
     * @param iD 订单ID
     * @return 订单信息
     */
	public Order selectOrderById(Long iD);
	
	/**
     * 查询订单列表
     * 
     * @param order 订单信息
     * @return 订单集合
     */
	public List<Order> selectOrderList(Order order);
	
	/**
     * 新增订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	public int insertOrder(Order order);
	
	/**
     * 修改订单
     * 
     * @param order 订单信息
     * @return 结果
     */
	public int updateOrder(Order order);
	
	/**
     * 删除订单
     * 
     * @param iD 订单ID
     * @return 结果
     */
	public int deleteOrderById(Long iD);
	
	/**
     * 批量删除订单
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteOrderByIds(String[] iDs);
	
}