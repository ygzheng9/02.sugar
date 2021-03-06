package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBpmProcess<M extends BaseBpmProcess<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 业务类型
	 */
	public void setBizTyp(java.lang.String bizTyp) {
		set("BIZ_TYP", bizTyp);
	}
	
	/**
	 * 业务类型
	 */
	public java.lang.String getBizTyp() {
		return getStr("BIZ_TYP");
	}

	/**
	 * 业务单据的主键字段
	 */
	public void setKeyField(java.lang.String keyField) {
		set("KEY_FIELD", keyField);
	}
	
	/**
	 * 业务单据的主键字段
	 */
	public java.lang.String getKeyField() {
		return getStr("KEY_FIELD");
	}

	/**
	 * 审批状态更新字段
	 */
	public void setStsField(java.lang.String stsField) {
		set("STS_FIELD", stsField);
	}
	
	/**
	 * 审批状态更新字段
	 */
	public java.lang.String getStsField() {
		return getStr("STS_FIELD");
	}

	/**
	 * 流程名称
	 */
	public void setProcessNme(java.lang.String processNme) {
		set("PROCESS_NME", processNme);
	}
	
	/**
	 * 流程名称
	 */
	public java.lang.String getProcessNme() {
		return getStr("PROCESS_NME");
	}

	/**
	 * 优先级
	 */
	public void setPriorityNum(java.lang.Long priorityNum) {
		set("PRIORITY_NUM", priorityNum);
	}
	
	/**
	 * 优先级
	 */
	public java.lang.Long getPriorityNum() {
		return getLong("PRIORITY_NUM");
	}

	/**
	 * 是否有效 Y/N
	 */
	public void setValidInd(java.lang.String validInd) {
		set("VALID_IND", validInd);
	}
	
	/**
	 * 是否有效 Y/N
	 */
	public java.lang.String getValidInd() {
		return getStr("VALID_IND");
	}

	/**
	 * 流程描述
	 */
	public void setProcessDesc(java.lang.String processDesc) {
		set("PROCESS_DESC", processDesc);
	}
	
	/**
	 * 流程描述
	 */
	public java.lang.String getProcessDesc() {
		return getStr("PROCESS_DESC");
	}

	/**
	 * 流程规则
	 */
	public void setBizRule(java.lang.String bizRule) {
		set("BIZ_RULE", bizRule);
	}
	
	/**
	 * 流程规则
	 */
	public java.lang.String getBizRule() {
		return getStr("BIZ_RULE");
	}

	/**
	 * 更新人
	 */
	public void setUpdUsr(java.lang.String updUsr) {
		set("UPD_USR", updUsr);
	}
	
	/**
	 * 更新人
	 */
	public java.lang.String getUpdUsr() {
		return getStr("UPD_USR");
	}

	/**
	 * 更新时间
	 */
	public void setUpdDte(java.lang.String updDte) {
		set("UPD_DTE", updDte);
	}
	
	/**
	 * 更新时间
	 */
	public java.lang.String getUpdDte() {
		return getStr("UPD_DTE");
	}

}
