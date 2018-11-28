package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.OrderHistoryMapper;
import com.gzl.dge.oex.domain.OrderHistory;
import com.gzl.dge.oex.service.IOrderHistoryService;
import com.gzl.dge.common.support.Convert;

/**
 * 订单付款记录 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class OrderHistoryServiceImpl implements IOrderHistoryService 
{
	@Autowired
	private OrderHistoryMapper orderHistoryMapper;

	/**
     * 查询订单付款记录信息
     * 
     * @param id 订单付款记录ID
     * @return 订单付款记录信息
     */
    @Override
	public OrderHistory selectOrderHistoryById(Long id)
	{
	    return orderHistoryMapper.selectOrderHistoryById(id);
	}
	
	/**
     * 查询订单付款记录列表
     * 
     * @param orderHistory 订单付款记录信息
     * @return 订单付款记录集合
     */
	@Override
	public List<OrderHistory> selectOrderHistoryList(OrderHistory orderHistory)
	{
	    return orderHistoryMapper.selectOrderHistoryList(orderHistory);
	}
	
    /**
     * 新增订单付款记录
     * 
     * @param orderHistory 订单付款记录信息
     * @return 结果
     */
	@Override
	public int insertOrderHistory(OrderHistory orderHistory)
	{
	    return orderHistoryMapper.insertOrderHistory(orderHistory);
	}
	
	/**
     * 修改订单付款记录
     * 
     * @param orderHistory 订单付款记录信息
     * @return 结果
     */
	@Override
	public int updateOrderHistory(OrderHistory orderHistory)
	{
	    return orderHistoryMapper.updateOrderHistory(orderHistory);
	}

	/**
     * 删除订单付款记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteOrderHistoryByIds(String ids)
	{
		return orderHistoryMapper.deleteOrderHistoryByIds(Convert.toStrArray(ids));
	}
	
}
