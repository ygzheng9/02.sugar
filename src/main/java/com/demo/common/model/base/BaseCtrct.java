package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCtrct<M extends BaseCtrct<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 合同号
	 */
	public void setCtrctNum(java.lang.String ctrctNum) {
		set("CTRCT_NUM", ctrctNum);
	}
	
	/**
	 * 合同号
	 */
	public java.lang.String getCtrctNum() {
		return getStr("CTRCT_NUM");
	}

	/**
	 * 合同名称
	 */
	public void setCtrctTitle(java.lang.String ctrctTitle) {
		set("CTRCT_TITLE", ctrctTitle);
	}
	
	/**
	 * 合同名称
	 */
	public java.lang.String getCtrctTitle() {
		return getStr("CTRCT_TITLE");
	}

	/**
	 * 供应商
	 */
	public void setVndrNme(java.lang.String vndrNme) {
		set("VNDR_NME", vndrNme);
	}
	
	/**
	 * 供应商
	 */
	public java.lang.String getVndrNme() {
		return getStr("VNDR_NME");
	}

	/**
	 * 开始日期
	 */
	public void setFmDte(java.lang.String fmDte) {
		set("FM_DTE", fmDte);
	}
	
	/**
	 * 开始日期
	 */
	public java.lang.String getFmDte() {
		return getStr("FM_DTE");
	}

	/**
	 * 终止日期
	 */
	public void setToDte(java.lang.String toDte) {
		set("TO_DTE", toDte);
	}
	
	/**
	 * 终止日期
	 */
	public java.lang.String getToDte() {
		return getStr("TO_DTE");
	}

	/**
	 * 内容描述
	 */
	public void setRMK(java.lang.String RMK) {
		set("RMK", RMK);
	}
	
	/**
	 * 内容描述
	 */
	public java.lang.String getRMK() {
		return getStr("RMK");
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