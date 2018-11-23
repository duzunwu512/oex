package com.gzl.dge.oex.service;

import com.gzl.dge.oex.domain.UserQuestion;
import java.util.List;

/**
 * 用户做题 服务层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface IUserQuestionService 
{
	/**
     * 查询用户做题信息
     * 
     * @param iD 用户做题ID
     * @return 用户做题信息
     */
	public UserQuestion selectUserQuestionById(Long iD);
	
	/**
     * 查询用户做题列表
     * 
     * @param userQuestion 用户做题信息
     * @return 用户做题集合
     */
	public List<UserQuestion> selectUserQuestionList(UserQuestion userQuestion);
	
	/**
     * 新增用户做题
     * 
     * @param userQuestion 用户做题信息
     * @return 结果
     */
	public int insertUserQuestion(UserQuestion userQuestion);
	
	/**
     * 修改用户做题
     * 
     * @param userQuestion 用户做题信息
     * @return 结果
     */
	public int updateUserQuestion(UserQuestion userQuestion);
		
	/**
     * 删除用户做题信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserQuestionByIds(String ids);
	
}
