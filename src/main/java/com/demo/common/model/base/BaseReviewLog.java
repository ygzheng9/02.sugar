package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseReviewLog<M extends BaseReviewLog<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 引用的父记录类型
	 */
	public void setRefTyp(java.lang.String refTyp) {
		set("REF_TYP", refTyp);
	}
	
	/**
	 * 引用的父记录类型
	 */
	public java.lang.String getRefTyp() {
		return getStr("REF_TYP");
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
	 * 原状态
	 */
	public void setFmSts(java.lang.String fmSts) {
		set("FM_STS", fmSts);
	}
	
	/**
	 * 原状态
	 */
	public java.lang.String getFmSts() {
		return getStr("FM_STS");
	}

	/**
	 * 操作后状态
	 */
	public void setToSts(java.lang.String toSts) {
		set("TO_STS", toSts);
	}
	
	/**
	 * 操作后状态
	 */
	public java.lang.String getToSts() {
		return getStr("TO_STS");
	}

	/**
	 * 操作人
	 */
	public void setOprUsr(java.lang.String oprUsr) {
		set("OPR_USR", oprUsr);
	}
	
	/**
	 * 操作人
	 */
	public java.lang.String getOprUsr() {
		return getStr("OPR_USR");
	}

	/**
	 * 操作时间
	 */
	public void setOprDte(java.lang.String oprDte) {
		set("OPR_DTE", oprDte);
	}
	
	/**
	 * 操作时间
	 */
	public java.lang.String getOprDte() {
		return getStr("OPR_DTE");
	}

}
