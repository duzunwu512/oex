package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.UserProductMapper;
import com.gzl.dge.oex.domain.UserProduct;
import com.gzl.dge.oex.service.IUserProductService;
import com.gzl.dge.common.support.Convert;

/**
 * 用户产品 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class UserProductServiceImpl implements IUserProductService 
{
	@Autowired
	private UserProductMapper userProductMapper;

	/**
     * 查询用户产品信息
     * 
     * @param iD 用户产品ID
     * @return 用户产品信息
     */
    @Override
	public UserProduct selectUserProductById(Long iD)
	{
	    return userProductMapper.selectUserProductById(iD);
	}
	
	/**
     * 查询用户产品列表
     * 
     * @param userProduct 用户产品信息
     * @return 用户产品集合
     */
	@Override
	public List<UserProduct> selectUserProductList(UserProduct userProduct)
	{
	    return userProductMapper.selectUserProductList(userProduct);
	}
	
    /**
     * 新增用户产品
     * 
     * @param userProduct 用户产品信息
     * @return 结果
     */
	@Override
	public int insertUserProduct(UserProduct userProduct)
	{
	    return userProductMapper.insertUserProduct(userProduct);
	}
	
	/**
     * 修改用户产品
     * 
     * @param userProduct 用户产品信息
     * @return 结果
     */
	@Override
	public int updateUserProduct(UserProduct userProduct)
	{
	    return userProductMapper.updateUserProduct(userProduct);
	}

	/**
     * 删除用户产品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteUserProductByIds(String ids)
	{
		return userProductMapper.deleteUserProductByIds(Convert.toStrArray(ids));
	}
	
}
