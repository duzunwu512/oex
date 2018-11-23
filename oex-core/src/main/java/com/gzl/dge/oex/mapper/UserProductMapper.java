package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.UserProduct;
import java.util.List;	

/**
 * 用户产品 数据层
 * 
 * @author Dge
 * @date 2018-11-23
 */
public interface UserProductMapper 
{
	/**
     * 查询用户产品信息
     * 
     * @param iD 用户产品ID
     * @return 用户产品信息
     */
	public UserProduct selectUserProductById(Long iD);
	
	/**
     * 查询用户产品列表
     * 
     * @param userProduct 用户产品信息
     * @return 用户产品集合
     */
	public List<UserProduct> selectUserProductList(UserProduct userProduct);
	
	/**
     * 新增用户产品
     * 
     * @param userProduct 用户产品信息
     * @return 结果
     */
	public int insertUserProduct(UserProduct userProduct);
	
	/**
     * 修改用户产品
     * 
     * @param userProduct 用户产品信息
     * @return 结果
     */
	public int updateUserProduct(UserProduct userProduct);
	
	/**
     * 删除用户产品
     * 
     * @param iD 用户产品ID
     * @return 结果
     */
	public int deleteUserProductById(Long iD);
	
	/**
     * 批量删除用户产品
     * 
     * @param iDs 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserProductByIds(String[] iDs);
	
}