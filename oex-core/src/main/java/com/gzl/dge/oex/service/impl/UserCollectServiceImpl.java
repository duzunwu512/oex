package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserCollectMapper;
import com.gzl.dge.oex.domain.UserCollect;
import com.gzl.dge.oex.service.IUserCollectService;
import com.gzl.dge.common.support.Convert;

/**
 * 用户收藏试题 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class UserCollectServiceImpl implements IUserCollectService 
{
	@Autowired
	private UserCollectMapper userCollectMapper;

	/**
     * 查询用户收藏试题信息
     * 
     * @param iD 用户收藏试题ID
     * @return 用户收藏试题信息
     */
    @Override
	public UserCollect selectUserCollectById(Long iD)
	{
	    return userCollectMapper.selectUserCollectById(iD);
	}
	
	/**
     * 查询用户收藏试题列表
     * 
     * @param userCollect 用户收藏试题信息
     * @return 用户收藏试题集合
     */
	@Override
	public List<UserCollect> selectUserCollectList(UserCollect userCollect)
	{
	    return userCollectMapper.selectUserCollectList(userCollect);
	}
	
    /**
     * 新增用户收藏试题
     * 
     * @param userCollect 用户收藏试题信息
     * @return 结果
     */
	@Override
	public int insertUserCollect(UserCollect userCollect)
	{
	    return userCollectMapper.insertUserCollect(userCollect);
	}
	
	/**
     * 修改用户收藏试题
     * 
     * @param userCollect 用户收藏试题信息
     * @return 结果
     */
	@Override
	public int updateUserCollect(UserCollect userCollect)
	{
	    return userCollectMapper.updateUserCollect(userCollect);
	}

	/**
     * 删除用户收藏试题对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserCollectByIds(String ids)
	{
		return userCollectMapper.deleteUserCollectByIds(Convert.toStrArray(ids));
	}
	
}
