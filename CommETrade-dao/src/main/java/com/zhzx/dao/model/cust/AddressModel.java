package com.zhzx.dao.model.cust;import com.zhzx.dao.model.BaseModel;public class AddressModel extends BaseModel {		/**	*	*/	private String id;		/**	*用户id	*/	private String custNo;		/**	*地址	*/	private String address;		/**	*详细地址	*/	private String detailAddress;		/**	*收件人姓名	*/	private String receiverName;		/**	*收件人电话	*/	private String receiverPhone;		/**	*邮编	*/	private String postCode;		/**	*是否是默认地址0,：否；1：是	*/	private String isDefault;		/**	*创建时间	*/	private String createTime;		/**	*	*/	private String updateTime;		/**	*状态（1:正常，2：废弃）	*/	private String status;			public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getCustNo() {	    return this.custNo;	}	public void setCustNo(String custNo) {	    this.custNo=custNo;	}	public String getAddress() {	    return this.address;	}	public void setAddress(String address) {	    this.address=address;	}	public String getDetailAddress() {	    return this.detailAddress;	}	public void setDetailAddress(String detailAddress) {	    this.detailAddress=detailAddress;	}	public String getReceiverName() {	    return this.receiverName;	}	public void setReceiverName(String receiverName) {	    this.receiverName=receiverName;	}	public String getReceiverPhone() {	    return this.receiverPhone;	}	public void setReceiverPhone(String receiverPhone) {	    this.receiverPhone=receiverPhone;	}	public String getPostCode() {	    return this.postCode;	}	public void setPostCode(String postCode) {	    this.postCode=postCode;	}	public String getIsDefault() {	    return this.isDefault;	}	public void setIsDefault(String isDefault) {	    this.isDefault=isDefault;	}	public String getCreateTime() {	    return this.createTime;	}	public void setCreateTime(String createTime) {	    this.createTime=createTime;	}	public String getUpdateTime() {	    return this.updateTime;	}	public void setUpdateTime(String updateTime) {	    this.updateTime=updateTime;	}	public String getStatus() {	    return this.status;	}	public void setStatus(String status) {	    this.status=status;	}	}