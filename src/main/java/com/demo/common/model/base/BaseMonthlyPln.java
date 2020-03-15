package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseMonthlyPln<M extends BaseMonthlyPln<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	public void setFileNme(java.lang.String fileNme) {
		set("FILE_NME", fileNme);
	}
	
	public java.lang.String getFileNme() {
		return getStr("FILE_NME");
	}

	public void setDteStr(java.lang.String dteStr) {
		set("DTE_STR", dteStr);
	}
	
	public java.lang.String getDteStr() {
		return getStr("DTE_STR");
	}

	public void setNO(java.lang.Integer NO) {
		set("NO", NO);
	}
	
	public java.lang.Integer getNO() {
		return getInt("NO");
	}

	public void setCTGRY(java.lang.String CTGRY) {
		set("CTGRY", CTGRY);
	}
	
	public java.lang.String getCTGRY() {
		return getStr("CTGRY");
	}

	public void setSEQ(java.lang.String SEQ) {
		set("SEQ", SEQ);
	}
	
	public java.lang.String getSEQ() {
		return getStr("SEQ");
	}

	public void setPTFM(java.lang.String PTFM) {
		set("PTFM", PTFM);
	}
	
	public java.lang.String getPTFM() {
		return getStr("PTFM");
	}

	public void setCUST(java.lang.String CUST) {
		set("CUST", CUST);
	}
	
	public java.lang.String getCUST() {
		return getStr("CUST");
	}

	public void setPROJ(java.lang.String PROJ) {
		set("PROJ", PROJ);
	}
	
	public java.lang.String getPROJ() {
		return getStr("PROJ");
	}

	public void setMATRL(java.lang.String MATRL) {
		set("MATRL", MATRL);
	}
	
	public java.lang.String getMATRL() {
		return getStr("MATRL");
	}

	public void setM1ACTUAL(java.lang.Integer M1ACTUAL) {
		set("M1ACTUAL", M1ACTUAL);
	}
	
	public java.lang.Integer getM1ACTUAL() {
		return getInt("M1ACTUAL");
	}

	public void setM1FORCAST(java.lang.Integer M1FORCAST) {
		set("M1FORCAST", M1FORCAST);
	}
	
	public java.lang.Integer getM1FORCAST() {
		return getInt("M1FORCAST");
	}

	public void setM2FORCAST(java.lang.Integer M2FORCAST) {
		set("M2FORCAST", M2FORCAST);
	}
	
	public java.lang.Integer getM2FORCAST() {
		return getInt("M2FORCAST");
	}

	public void setM3FORCAST(java.lang.Integer M3FORCAST) {
		set("M3FORCAST", M3FORCAST);
	}
	
	public java.lang.Integer getM3FORCAST() {
		return getInt("M3FORCAST");
	}

	public void setM4FORCAST(java.lang.Integer M4FORCAST) {
		set("M4FORCAST", M4FORCAST);
	}
	
	public java.lang.Integer getM4FORCAST() {
		return getInt("M4FORCAST");
	}

}
