package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSoSodetails<M extends BaseSoSodetails<M>> extends Model<M> implements IBean {

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

	public void setISOSID(java.lang.Long ISOSID) {
		set("ISOSID", ISOSID);
	}
	
	public java.lang.Long getISOSID() {
		return getLong("ISOSID");
	}

	public void setCINVCODE(java.lang.String CINVCODE) {
		set("CINVCODE", CINVCODE);
	}
	
	public java.lang.String getCINVCODE() {
		return getStr("CINVCODE");
	}

	public void setCINVNAME(java.lang.String CINVNAME) {
		set("CINVNAME", CINVNAME);
	}
	
	public java.lang.String getCINVNAME() {
		return getStr("CINVNAME");
	}

	public void setCITEMCODE(java.lang.String CITEMCODE) {
		set("CITEMCODE", CITEMCODE);
	}
	
	public java.lang.String getCITEMCODE() {
		return getStr("CITEMCODE");
	}

	public void setCITEMNAME(java.lang.String CITEMNAME) {
		set("CITEMNAME", CITEMNAME);
	}
	
	public java.lang.String getCITEMNAME() {
		return getStr("CITEMNAME");
	}

	public void setIQUANTITY(java.lang.Integer IQUANTITY) {
		set("IQUANTITY", IQUANTITY);
	}
	
	public java.lang.Integer getIQUANTITY() {
		return getInt("IQUANTITY");
	}

	public void setIFHQUANTITY(java.lang.Integer IFHQUANTITY) {
		set("IFHQUANTITY", IFHQUANTITY);
	}
	
	public java.lang.Integer getIFHQUANTITY() {
		return getInt("IFHQUANTITY");
	}

}
