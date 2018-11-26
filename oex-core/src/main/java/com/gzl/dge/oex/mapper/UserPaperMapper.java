package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.UserPaper;
import java.util.List;	

/**
 * 用户试卷 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface UserPaperMapper 
{
	/**
     * 查询用户试卷信息
     * 
     * @param iD 用户试卷ID
     * @return 用户试卷信息
     */
	public UserPaper selectUserPaperById(Long iD);
	
	/**
     * 查询用户试卷列表
     * 
     * @param userPaper 用户试卷信息
     * @return 用户试卷集合
     */
	public List<UserPaper> selectUserPaperList(UserPaper userPaper);
	
	/**
     * 新增用户试卷
     * 
     * @param userPaper 用户试卷信息
     * @return 结果
     */
	public int insertUserPaper(UserPaper userPaper);
	
	/**
     * 修改用户试卷
     * 
     * @param userPaper 用户试卷信息
     * @return 结果
     */
	public int updateUserPaper(UserPaper userPaper);
	
	/**
     * 删除用户试卷
     * 
     * @param iD 用户试卷ID
     * @return 结果
     */
	public int deleteUserPaperById(Long iD);
	
	/**
     * 批量删除用户试卷
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserPaperByIds(String[] iDs);
	
}