package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.UserCollect;
import java.util.List;	

/**
 * 用户收藏试题 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface UserCollectMapper 
{
	/**
     * 查询用户收藏试题信息
     * 
     * @param iD 用户收藏试题ID
     * @return 用户收藏试题信息
     */
	public UserCollect selectUserCollectById(Long iD);
	
	/**
     * 查询用户收藏试题列表
     * 
     * @param userCollect 用户收藏试题信息
     * @return 用户收藏试题集合
     */
	public List<UserCollect> selectUserCollectList(UserCollect userCollect);
	
	/**
     * 新增用户收藏试题
     * 
     * @param userCollect 用户收藏试题信息
     * @return 结果
     */
	public int insertUserCollect(UserCollect userCollect);
	
	/**
     * 修改用户收藏试题
     * 
     * @param userCollect 用户收藏试题信息
     * @return 结果
     */
	public int updateUserCollect(UserCollect userCollect);
	
	/**
     * 删除用户收藏试题
     * 
     * @param iD 用户收藏试题ID
     * @return 结果
     */
	public int deleteUserCollectById(Long iD);
	
	/**
     * 批量删除用户收藏试题
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserCollectByIds(String[] iDs);
	
}