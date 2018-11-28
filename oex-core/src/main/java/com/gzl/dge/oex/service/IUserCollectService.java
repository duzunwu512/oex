package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.UserCollect;
import java.util.List;

/**
 * 用户收藏试题 服务层
 * 
 * @author Dge
 * @date 2018-11-28
 */
public interface IUserCollectService 
{
	/**
     * 查询用户收藏试题信息
     * 
     * @param id 用户收藏试题ID
     * @return 用户收藏试题信息
     */
	public UserCollect selectUserCollectById(Long id);
	
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
     * 删除用户收藏试题信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserCollectByIds(String ids);
	
}
