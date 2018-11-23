package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.UserReceive;
import java.util.List;	

/**
 * 送货 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface UserReceiveMapper 
{
	/**
     * 查询送货信息
     * 
     * @param id 送货ID
     * @return 送货信息
     */
	public UserReceive selectUserReceiveById(Long id);
	
	/**
     * 查询送货列表
     * 
     * @param userReceive 送货信息
     * @return 送货集合
     */
	public List<UserReceive> selectUserReceiveList(UserReceive userReceive);
	
	/**
     * 新增送货
     * 
     * @param userReceive 送货信息
     * @return 结果
     */
	public int insertUserReceive(UserReceive userReceive);
	
	/**
     * 修改送货
     * 
     * @param userReceive 送货信息
     * @return 结果
     */
	public int updateUserReceive(UserReceive userReceive);
	
	/**
     * 删除送货
     * 
     * @param id 送货ID
     * @return 结果
     */
	public int deleteUserReceiveById(Long id);
	
	/**
     * 批量删除送货
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserReceiveByIds(String[] ids);
	
}