package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReview<M extends BaseReview<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 引用的父记录
	 */
	public void setRefId(java.lang.Long refId) {
		set("REF_ID", refId);
	}
	
	/**
	 * 引用的父记录
	 */
	public java.lang.Long getRefId() {
		return getLong("REF_ID");
	}

	/**
	 * 业务类型：例如：PBC
	 */
	public void setBizTyp(java.lang.String bizTyp) {
		set("BIZ_TYP", bizTyp);
	}
	
	/**
	 * 业务类型：例如：PBC
	 */
	public java.lang.String getBizTyp() {
		return getStr("BIZ_TYP");
	}

	/**
	 * 事项描述
	 */
	public void setTxNme(java.lang.String txNme) {
		set("TX_NME", txNme);
	}
	
	/**
	 * 事项描述
	 */
	public java.lang.String getTxNme() {
		return getStr("TX_NME");
	}

	/**
	 * 提交时间
	 */
	public void setFormDte(java.lang.String formDte) {
		set("FORM_DTE", formDte);
	}
	
	/**
	 * 提交时间
	 */
	public java.lang.String getFormDte() {
		return getStr("FORM_DTE");
	}

	/**
	 * 提交人
	 */
	public void setFormUsr(java.lang.String formUsr) {
		set("FORM_USR", formUsr);
	}
	
	/**
	 * 提交人
	 */
	public java.lang.String getFormUsr() {
		return getStr("FORM_USR");
	}

	/**
	 * 提交内容
	 */
	public void setFormCtent(java.lang.String formCtent) {
		set("FORM_CTENT", formCtent);
	}
	
	/**
	 * 提交内容
	 */
	public java.lang.String getFormCtent() {
		return getStr("FORM_CTENT");
	}

	/**
	 * 审批人
	 */
	public void setReviewUsr(java.lang.String reviewUsr) {
		set("REVIEW_USR", reviewUsr);
	}
	
	/**
	 * 审批人
	 */
	public java.lang.String getReviewUsr() {
		return getStr("REVIEW_USR");
	}

	/**
	 * 审批意见
	 */
	public void setReviewCtent(java.lang.String reviewCtent) {
		set("REVIEW_CTENT", reviewCtent);
	}
	
	/**
	 * 审批意见
	 */
	public java.lang.String getReviewCtent() {
		return getStr("REVIEW_CTENT");
	}

	/**
	 * 审批时间
	 */
	public void setReviewDte(java.lang.String reviewDte) {
		set("REVIEW_DTE", reviewDte);
	}
	
	/**
	 * 审批时间
	 */
	public java.lang.String getReviewDte() {
		return getStr("REVIEW_DTE");
	}

	/**
	 * 当前状态
	 */
	public void setCurrSts(java.lang.String currSts) {
		set("CURR_STS", currSts);
	}
	
	/**
	 * 当前状态
	 */
	public java.lang.String getCurrSts() {
		return getStr("CURR_STS");
	}

}
