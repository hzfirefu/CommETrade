package com.zhzx.dao.bean.prod;import com.zhzx.dao.bean.BaseBean;public class ProdComment extends BaseBean {		/**	*评分编号	*/	private String id;		/**	*产品编号	*/	private String prodNo;		/**	*	*/	private String custNo;		/**	*分数1	*/	private String mark1;		/**	*分数2	*/	private String mark2;		/**	*分数3	*/	private String mark3;		/**	*评语	*/	private String comm;		/**	*创建时间	*/	private String createTime;			public String getId() {	    return this.id;	}	public void setId(String id) {	    this.id=id;	}	public String getProdNo() {	    return this.prodNo;	}	public void setProdNo(String prodNo) {	    this.prodNo=prodNo;	}	public String getCustNo() {	    return this.custNo;	}	public void setCustNo(String custNo) {	    this.custNo=custNo;	}	public String getMark1() {	    return this.mark1;	}	public void setMark1(String mark1) {	    this.mark1=mark1;	}	public String getMark2() {	    return this.mark2;	}	public void setMark2(String mark2) {	    this.mark2=mark2;	}	public String getMark3() {	    return this.mark3;	}	public void setMark3(String mark3) {	    this.mark3=mark3;	}	public String getComm() {	    return this.comm;	}	public void setComm(String comm) {	    this.comm=comm;	}	public String getCreateTime() {	    return this.createTime;	}	public void setCreateTime(String createTime) {	    this.createTime=createTime;	}}