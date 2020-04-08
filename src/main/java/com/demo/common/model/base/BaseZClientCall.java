package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseZClientCall<M extends BaseZClientCall<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setClientId(java.lang.Integer clientId) {
		set("clientId", clientId);
	}
	
	public java.lang.Integer getClientId() {
		return getInt("clientId");
	}

	public void setReportName(java.lang.String reportName) {
		set("reportName", reportName);
	}
	
	public java.lang.String getReportName() {
		return getStr("reportName");
	}

	public void setCallDate(java.lang.String callDate) {
		set("callDate", callDate);
	}
	
	public java.lang.String getCallDate() {
		return getStr("callDate");
	}

	public void setCallAddress(java.lang.String callAddress) {
		set("callAddress", callAddress);
	}
	
	public java.lang.String getCallAddress() {
		return getStr("callAddress");
	}

	public void setCallHost(java.lang.String callHost) {
		set("callHost", callHost);
	}
	
	public java.lang.String getCallHost() {
		return getStr("callHost");
	}

	public void setHostTitle(java.lang.String hostTitle) {
		set("hostTitle", hostTitle);
	}
	
	public java.lang.String getHostTitle() {
		return getStr("hostTitle");
	}

	public void setHostPhone(java.lang.String hostPhone) {
		set("hostPhone", hostPhone);
	}
	
	public java.lang.String getHostPhone() {
		return getStr("hostPhone");
	}

	public void setSalesName(java.lang.String salesName) {
		set("salesName", salesName);
	}
	
	public java.lang.String getSalesName() {
		return getStr("salesName");
	}

	public void setSalesTitle(java.lang.String salesTitle) {
		set("salesTitle", salesTitle);
	}
	
	public java.lang.String getSalesTitle() {
		return getStr("salesTitle");
	}

	public void setCallType(java.lang.String callType) {
		set("callType", callType);
	}
	
	public java.lang.String getCallType() {
		return getStr("callType");
	}

	public void setRemark(java.lang.String remark) {
		set("remark", remark);
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

}
