package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSoSomain<M extends BaseSoSomain<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	public void setSOHEADERID(java.lang.Long SOHEADERID) {
		set("SOHEADERID", SOHEADERID);
	}
	
	public java.lang.Long getSOHEADERID() {
		return getLong("SOHEADERID");
	}

	public void setCPERSONCODE(java.lang.String CPERSONCODE) {
		set("CPERSONCODE", CPERSONCODE);
	}
	
	public java.lang.String getCPERSONCODE() {
		return getStr("CPERSONCODE");
	}

	public void setCPERSONNAME(java.lang.String CPERSONNAME) {
		set("CPERSONNAME", CPERSONNAME);
	}
	
	public java.lang.String getCPERSONNAME() {
		return getStr("CPERSONNAME");
	}

	public void setCMAKER(java.lang.String CMAKER) {
		set("CMAKER", CMAKER);
	}
	
	public java.lang.String getCMAKER() {
		return getStr("CMAKER");
	}

	public void setCSOCODE(java.lang.String CSOCODE) {
		set("CSOCODE", CSOCODE);
	}
	
	public java.lang.String getCSOCODE() {
		return getStr("CSOCODE");
	}

	public void setCCUSCODE(java.lang.String CCUSCODE) {
		set("CCUSCODE", CCUSCODE);
	}
	
	public java.lang.String getCCUSCODE() {
		return getStr("CCUSCODE");
	}

	public void setCDEPNAME(java.lang.String CDEPNAME) {
		set("CDEPNAME", CDEPNAME);
	}
	
	public java.lang.String getCDEPNAME() {
		return getStr("CDEPNAME");
	}

	public void setCCUSNAME(java.lang.String CCUSNAME) {
		set("CCUSNAME", CCUSNAME);
	}
	
	public java.lang.String getCCUSNAME() {
		return getStr("CCUSNAME");
	}

	public void setDDATE(java.lang.String DDATE) {
		set("DDATE", DDATE);
	}
	
	public java.lang.String getDDATE() {
		return getStr("DDATE");
	}

}
