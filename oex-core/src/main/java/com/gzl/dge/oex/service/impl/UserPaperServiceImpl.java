package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserPaperMapper;
import com.gzl.dge.oex.domain.UserPaper;
import com.gzl.dge.oex.service.IUserPaperService;
import com.gzl.dge.common.support.Convert;

/**
 * 用户试卷 服务层实现
 * 
 * @author Dge
 * @date 2018-11-28
 */
@Service
public class UserPaperServiceImpl implements IUserPaperService 
{
	@Autowired
	private UserPaperMapper userPaperMapper;

	/**
     * 查询用户试卷信息
     * 
     * @param id 用户试卷ID
     * @return 用户试卷信息
     */
    @Override
	public UserPaper selectUserPaperById(Long id)
	{
	    return userPaperMapper.selectUserPaperById(id);
	}
	
	/**
     * 查询用户试卷列表
     * 
     * @param userPaper 用户试卷信息
     * @return 用户试卷集合
     */
	@Override
	public List<UserPaper> selectUserPaperList(UserPaper userPaper)
	{
	    return userPaperMapper.selectUserPaperList(userPaper);
	}
	
    /**
     * 新增用户试卷
     * 
     * @param userPaper 用户试卷信息
     * @return 结果
     */
	@Override
	public int insertUserPaper(UserPaper userPaper)
	{
	    return userPaperMapper.insertUserPaper(userPaper);
	}
	
	/**
     * 修改用户试卷
     * 
     * @param userPaper 用户试卷信息
     * @return 结果
     */
	@Override
	public int updateUserPaper(UserPaper userPaper)
	{
	    return userPaperMapper.updateUserPaper(userPaper);
	}

	/**
     * 删除用户试卷对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserPaperByIds(String ids)
	{
		return userPaperMapper.deleteUserPaperByIds(Convert.toStrArray(ids));
	}
	
}
