package com.gzl.dge.oex.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gzl.dge.oex.mapper.ProductMapper;
import com.gzl.dge.oex.domain.Product;
import com.gzl.dge.oex.service.IProductService;
import com.gzl.dge.common.support.Convert;

/**
 * 产品 服务层实现
 * 
 * @author Dge
 * @date 2018-11-23
 */
@Service
public class ProductServiceImpl implements IProductService 
{
	@Autowired
	private ProductMapper productMapper;

	/**
     * 查询产品信息
     * 
     * @param iD 产品ID
     * @return 产品信息
     */
    @Override
	public Product selectProductById(Long iD)
	{
	    return productMapper.selectProductById(iD);
	}
	
	/**
     * 查询产品列表
     * 
     * @param product 产品信息
     * @return 产品集合
     */
	@Override
	public List<Product> selectProductList(Product product)
	{
	    return productMapper.selectProductList(product);
	}
	
    /**
     * 新增产品
     * 
     * @param product 产品信息
     * @return 结果
     */
	@Override
	public int insertProduct(Product product)
	{
	    return productMapper.insertProduct(product);
	}
	
	/**
     * 修改产品
     * 
     * @param product 产品信息
     * @return 结果
     */
	@Override
	public int updateProduct(Product product)
	{
	    return productMapper.updateProduct(product);
	}

	/**
     * 删除产品对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProductByIds(String ids)
	{
		return productMapper.deleteProductByIds(Convert.toStrArray(ids));
	}
	
}
