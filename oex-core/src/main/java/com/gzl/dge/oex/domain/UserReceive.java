package com.gzl.dge.oex.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.gzl.dge.common.base.BaseEntity;
import java.util.Date;

/**
 * 送货表 oex_user_receive
 * 
 * @author Dge
 * @date 2018-11-28
 */
public class UserReceive extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 收货id */
	private Long id;
	/** 用户id */
	private Long userId;
	/** 收货人姓名 */
	private String contact;
	/** 收货人电话 */
	private String tel;
	/** 收货地址：省 */
	private String receiveProvince;
	/** 收货地址：城市 */
	private String receiveCity;
	/** 收货地址：县/区 */
	private String receiveCounty;
	/** 收货地址 详细地址 */
	private String receiveAddress;
	/** 默认收货地址标志 0 否 1 是 */
	private String isdefault;
	/** 支付状态 */
	private String status;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;
	/** 备注 */
	private String remark;

	public void setId(Long id) 
	{
		this.id = id;
	}

	public Long getId() 
	{
		return id;
	}
	public void setUserId(Long userId) 
	{
		this.userId = userId;
	}

	public Long getUserId() 
	{
		return userId;
	}
	public void setContact(String contact) 
	{
		this.contact = contact;
	}

	public String getContact() 
	{
		return contact;
	}
	public void setTel(String tel) 
	{
		this.tel = tel;
	}

	public String getTel() 
	{
		return tel;
	}
	public void setReceiveProvince(String receiveProvince) 
	{
		this.receiveProvince = receiveProvince;
	}

	public String getReceiveProvince() 
	{
		return receiveProvince;
	}
	public void setReceiveCity(String receiveCity) 
	{
		this.receiveCity = receiveCity;
	}

	public String getReceiveCity() 
	{
		return receiveCity;
	}
	public void setReceiveCounty(String receiveCounty) 
	{
		this.receiveCounty = receiveCounty;
	}

	public String getReceiveCounty() 
	{
		return receiveCounty;
	}
	public void setReceiveAddress(String receiveAddress) 
	{
		this.receiveAddress = receiveAddress;
	}

	public String getReceiveAddress() 
	{
		return receiveAddress;
	}
	public void setIsdefault(String isdefault) 
	{
		this.isdefault = isdefault;
	}

	public String getIsdefault() 
	{
		return isdefault;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("userId", getUserId())
            .append("contact", getContact())
            .append("tel", getTel())
            .append("receiveProvince", getReceiveProvince())
            .append("receiveCity", getReceiveCity())
            .append("receiveCounty", getReceiveCounty())
            .append("receiveAddress", getReceiveAddress())
            .append("isdefault", getIsdefault())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
