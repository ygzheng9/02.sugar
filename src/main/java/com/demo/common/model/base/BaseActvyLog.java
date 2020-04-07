package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseActvyLog<M extends BaseActvyLog<M>> extends Model<M> implements IBean {

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
	 * 文本1
	 */
	public void setMSG1(java.lang.String MSG1) {
		set("MSG1", MSG1);
	}
	
	/**
	 * 文本1
	 */
	public java.lang.String getMSG1() {
		return getStr("MSG1");
	}

	/**
	 * 文本2
	 */
	public void setMSG2(java.lang.String MSG2) {
		set("MSG2", MSG2);
	}
	
	/**
	 * 文本2
	 */
	public java.lang.String getMSG2() {
		return getStr("MSG2");
	}

	/**
	 * 文本3
	 */
	public void setMSG3(java.lang.String MSG3) {
		set("MSG3", MSG3);
	}
	
	/**
	 * 文本3
	 */
	public java.lang.String getMSG3() {
		return getStr("MSG3");
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