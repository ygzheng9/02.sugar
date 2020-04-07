package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBpmIns<M extends BaseBpmIns<M>> extends Model<M> implements IBean {

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
	 * 审批流程ID
	 */
	public void setProcessId(java.lang.Long processId) {
		set("PROCESS_ID", processId);
	}
	
	/**
	 * 审批流程ID
	 */
	public java.lang.Long getProcessId() {
		return getLong("PROCESS_ID");
	}

	/**
	 * 业务ID
	 */
	public void setRefId(java.lang.Long refId) {
		set("REF_ID", refId);
	}
	
	/**
	 * 业务ID
	 */
	public java.lang.Long getRefId() {
		return getLong("REF_ID");
	}

	/**
	 * 提交人
	 */
	public void setSubmitUsr(java.lang.String submitUsr) {
		set("SUBMIT_USR", submitUsr);
	}
	
	/**
	 * 提交人
	 */
	public java.lang.String getSubmitUsr() {
		return getStr("SUBMIT_USR");
	}

	/**
	 * 提交日期
	 */
	public void setSubmitDte(java.lang.String submitDte) {
		set("SUBMIT_DTE", submitDte);
	}
	
	/**
	 * 提交日期
	 */
	public java.lang.String getSubmitDte() {
		return getStr("SUBMIT_DTE");
	}

	/**
	 * 审批内容
	 */
	public void setBizDesc(java.lang.String bizDesc) {
		set("BIZ_DESC", bizDesc);
	}
	
	/**
	 * 审批内容
	 */
	public java.lang.String getBizDesc() {
		return getStr("BIZ_DESC");
	}

	/**
	 * 当前节点
	 */
	public void setCurrStep(java.lang.Long currStep) {
		set("CURR_STEP", currStep);
	}
	
	/**
	 * 当前节点
	 */
	public java.lang.Long getCurrStep() {
		return getLong("CURR_STEP");
	}

	/**
	 * 是否结束
	 */
	public void setIsCmpl(java.lang.String isCmpl) {
		set("IS_CMPL", isCmpl);
	}
	
	/**
	 * 是否结束
	 */
	public java.lang.String getIsCmpl() {
		return getStr("IS_CMPL");
	}

	/**
	 * 最终状态
	 */
	public void setFinalSts(java.lang.String finalSts) {
		set("FINAL_STS", finalSts);
	}
	
	/**
	 * 最终状态
	 */
	public java.lang.String getFinalSts() {
		return getStr("FINAL_STS");
	}

	/**
	 * 属性1
	 */
	public void setRefText1(java.lang.String refText1) {
		set("REF_TEXT1", refText1);
	}
	
	/**
	 * 属性1
	 */
	public java.lang.String getRefText1() {
		return getStr("REF_TEXT1");
	}

	/**
	 * 属性2
	 */
	public void setRefText2(java.lang.String refText2) {
		set("REF_TEXT2", refText2);
	}
	
	/**
	 * 属性2
	 */
	public java.lang.String getRefText2() {
		return getStr("REF_TEXT2");
	}

	/**
	 * 属性3
	 */
	public void setRefText3(java.lang.String refText3) {
		set("REF_TEXT3", refText3);
	}
	
	/**
	 * 属性3
	 */
	public java.lang.String getRefText3() {
		return getStr("REF_TEXT3");
	}

	/**
	 * 金额1
	 */
	public void setRefAmount1(java.lang.String refAmount1) {
		set("REF_AMOUNT1", refAmount1);
	}
	
	/**
	 * 金额1
	 */
	public java.lang.String getRefAmount1() {
		return getStr("REF_AMOUNT1");
	}

	/**
	 * 金额2
	 */
	public void setRefAmount2(java.lang.String refAmount2) {
		set("REF_AMOUNT2", refAmount2);
	}
	
	/**
	 * 金额2
	 */
	public java.lang.String getRefAmount2() {
		return getStr("REF_AMOUNT2");
	}

	/**
	 * 记录更新日期
	 */
	public void setRecUpdDte(java.lang.String recUpdDte) {
		set("REC_UPD_DTE", recUpdDte);
	}
	
	/**
	 * 记录更新日期
	 */
	public java.lang.String getRecUpdDte() {
		return getStr("REC_UPD_DTE");
	}

}