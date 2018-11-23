package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserReceiveMapper;
import com.gzl.dge.oex.domain.UserReceive;
import com.gzl.dge.oex.service.IUserReceiveService;
import com.gzl.dge.common.support.Convert;

/**
 * 送货 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class UserReceiveServiceImpl implements IUserReceiveService 
{
	@Autowired
	private UserReceiveMapper userReceiveMapper;

	/**
     * 查询送货信息
     * 
     * @param id 送货ID
     * @return 送货信息
     */
    @Override
	public UserReceive selectUserReceiveById(Long id)
	{
	    return userReceiveMapper.selectUserReceiveById(id);
	}
	
	/**
     * 查询送货列表
     * 
     * @param userReceive 送货信息
     * @return 送货集合
     */
	@Override
	public List<UserReceive> selectUserReceiveList(UserReceive userReceive)
	{
	    return userReceiveMapper.selectUserReceiveList(userReceive);
	}
	
    /**
     * 新增送货
     * 
     * @param userReceive 送货信息
     * @return 结果
     */
	@Override
	public int insertUserReceive(UserReceive userReceive)
	{
	    return userReceiveMapper.insertUserReceive(userReceive);
	}
	
	/**
     * 修改送货
     * 
     * @param userReceive 送货信息
     * @return 结果
     */
	@Override
	public int updateUserReceive(UserReceive userReceive)
	{
	    return userReceiveMapper.updateUserReceive(userReceive);
	}

	/**
     * 删除送货对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserReceiveByIds(String ids)
	{
		return userReceiveMapper.deleteUserReceiveByIds(Convert.toStrArray(ids));
	}
	
}
