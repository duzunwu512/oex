package com.gzl.dge.oex.mapper;

import com.gzl.dge.oex.domain.UserProduct;
import java.util.List;	

/**
 * 用户产品 数据层
 * 
 * @author Dge
 * @date 2018-11-28
 */
public interface UserProductMapper 
{
	/**
     * 查询用户产品信息
     * 
     * @param id 用户产品ID
     * @return 用户产品信息
     */
	public UserProduct selectUserProductById(Long id);
	
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
     * @param id 用户产品ID
     * @return 结果
     */
	public int deleteUserProductById(Long id);
	
	/**
     * 批量删除用户产品
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteUserProductByIds(String[] ids);
	
}