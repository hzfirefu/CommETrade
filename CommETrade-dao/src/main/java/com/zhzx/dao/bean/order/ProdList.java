package com.zhzx.dao.bean.order;import com.zhzx.dao.bean.BaseBean;public class ProdList extends BaseBean {		/**	*产品里表编号	*/	private String id;		/**	*订单编号	*/	private String orderNo;		/**	*客户编号	*/	private String custNo;		/**	*产品编号	*/	private String prodNo;		/**	*产品名称	*/	private String prodName;		/**	*产品价格	*/	private String prodPrice;		/**	*产品数量	*/	private Integer prodNum;			public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getOrderNo() {	    return this.orderNo;	}	public void setOrderNo(String orderNo) {	    this.orderNo=orderNo;	}	public String getCustNo() {	    return this.custNo;	}	public void setCustNo(String custNo) {	    this.custNo=custNo;	}	public String getProdNo() {	    return this.prodNo;	}	public void setProdNo(String prodNo) {	    this.prodNo=prodNo;	}	public String getProdName() {	    return this.prodName;	}	public void setProdName(String prodName) {	    this.prodName=prodName;	}	public String getProdPrice() {	    return this.prodPrice;	}	public void setProdPrice(String prodPrice) {	    this.prodPrice=prodPrice;	}	public Integer getProdNum() {	    return this.prodNum;	}	public void setProdNum(Integer prodNum) {	    this.prodNum=prodNum;	}}