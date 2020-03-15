package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBpmDelegation<M extends BaseBpmDelegation<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 授权人
	 */
	public void setUsrNme(java.lang.String usrNme) {
		set("USR_NME", usrNme);
	}
	
	/**
	 * 授权人
	 */
	public java.lang.String getUsrNme() {
		return getStr("USR_NME");
	}

	/**
	 * 被授权的人
	 */
	public void setDelegateTo(java.lang.String delegateTo) {
		set("DELEGATE_TO", delegateTo);
	}
	
	/**
	 * 被授权的人
	 */
	public java.lang.String getDelegateTo() {
		return getStr("DELEGATE_TO");
	}

	/**
	 * 授权开始时间
	 */
	public void setStartDte(java.lang.String startDte) {
		set("START_DTE", startDte);
	}
	
	/**
	 * 授权开始时间
	 */
	public java.lang.String getStartDte() {
		return getStr("START_DTE");
	}

	/**
	 * 授权结束时间
	 */
	public void setEndDte(java.lang.String endDte) {
		set("END_DTE", endDte);
	}
	
	/**
	 * 授权结束时间
	 */
	public java.lang.String getEndDte() {
		return getStr("END_DTE");
	}

	/**
	 * 授权是否有效
	 */
	public void setValidInd(java.lang.String validInd) {
		set("VALID_IND", validInd);
	}
	
	/**
	 * 授权是否有效
	 */
	public java.lang.String getValidInd() {
		return getStr("VALID_IND");
	}

}
