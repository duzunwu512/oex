package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserMapper;
import com.gzl.dge.oex.domain.User;
import com.gzl.dge.oex.service.IUserService;
import com.gzl.dge.common.support.Convert;

/**
 * 前台用户 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class UserServiceImpl implements IUserService 
{
	@Autowired
	private UserMapper userMapper;

	/**
     * 查询前台用户信息
     * 
     * @param id 前台用户ID
     * @return 前台用户信息
     */
    @Override
	public User selectUserById(Long id)
	{
	    return userMapper.selectUserById(id);
	}
	
	/**
     * 查询前台用户列表
     * 
     * @param user 前台用户信息
     * @return 前台用户集合
     */
	@Override
	public List<User> selectUserList(User user)
	{
	    return userMapper.selectUserList(user);
	}
	
    /**
     * 新增前台用户
     * 
     * @param user 前台用户信息
     * @return 结果
     */
	@Override
	public int insertUser(User user)
	{
	    return userMapper.insertUser(user);
	}
	
	/**
     * 修改前台用户
     * 
     * @param user 前台用户信息
     * @return 结果
     */
	@Override
	public int updateUser(User user)
	{
	    return userMapper.updateUser(user);
	}

	/**
     * 删除前台用户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserByIds(String ids)
	{
		return userMapper.deleteUserByIds(Convert.toStrArray(ids));
	}
	
}
