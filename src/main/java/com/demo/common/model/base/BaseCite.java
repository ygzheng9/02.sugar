package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCite<M extends BaseCite<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 编号
	 */
	public void setSEQ(java.lang.String SEQ) {
		set("SEQ", SEQ);
	}
	
	/**
	 * 编号
	 */
	public java.lang.String getSEQ() {
		return getStr("SEQ");
	}

	/**
	 * 内容
	 */
	public void setCTENT(java.lang.String CTENT) {
		set("CTENT", CTENT);
	}
	
	/**
	 * 内容
	 */
	public java.lang.String getCTENT() {
		return getStr("CTENT");
	}

	/**
	 * 标签
	 */
	public void setTAGS(java.lang.String TAGS) {
		set("TAGS", TAGS);
	}
	
	/**
	 * 标签
	 */
	public java.lang.String getTAGS() {
		return getStr("TAGS");
	}

	/**
	 * 参考
	 */
	public void setREFS(java.lang.String REFS) {
		set("REFS", REFS);
	}
	
	/**
	 * 参考
	 */
	public java.lang.String getREFS() {
		return getStr("REFS");
	}

}
