package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserQuestionMapper;
import com.gzl.dge.oex.domain.UserQuestion;
import com.gzl.dge.oex.service.IUserQuestionService;
import com.gzl.dge.common.support.Convert;

/**
 * 用户做题 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class UserQuestionServiceImpl implements IUserQuestionService 
{
	@Autowired
	private UserQuestionMapper userQuestionMapper;

	/**
     * 查询用户做题信息
     * 
     * @param id 用户做题ID
     * @return 用户做题信息
     */
    @Override
	public UserQuestion selectUserQuestionById(Long id)
	{
	    return userQuestionMapper.selectUserQuestionById(id);
	}
	
	/**
     * 查询用户做题列表
     * 
     * @param userQuestion 用户做题信息
     * @return 用户做题集合
     */
	@Override
	public List<UserQuestion> selectUserQuestionList(UserQuestion userQuestion)
	{
	    return userQuestionMapper.selectUserQuestionList(userQuestion);
	}
	
    /**
     * 新增用户做题
     * 
     * @param userQuestion 用户做题信息
     * @return 结果
     */
	@Override
	public int insertUserQuestion(UserQuestion userQuestion)
	{
	    return userQuestionMapper.insertUserQuestion(userQuestion);
	}
	
	/**
     * 修改用户做题
     * 
     * @param userQuestion 用户做题信息
     * @return 结果
     */
	@Override
	public int updateUserQuestion(UserQuestion userQuestion)
	{
	    return userQuestionMapper.updateUserQuestion(userQuestion);
	}

	/**
     * 删除用户做题对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserQuestionByIds(String ids)
	{
		return userQuestionMapper.deleteUserQuestionByIds(Convert.toStrArray(ids));
	}
	
}
