package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSoSodetailsplan<M extends BaseSoSodetailsplan<M>> extends Model<M> implements IBean {

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

	public void setDDATE(java.lang.String DDATE) {
		set("DDATE", DDATE);
	}
	
	public java.lang.String getDDATE() {
		return getStr("DDATE");
	}

	public void setIQUANTITY(java.lang.Integer IQUANTITY) {
		set("IQUANTITY", IQUANTITY);
	}
	
	public java.lang.Integer getIQUANTITY() {
		return getInt("IQUANTITY");
	}

	public void setRMK(java.lang.String RMK) {
		set("RMK", RMK);
	}
	
	public java.lang.String getRMK() {
		return getStr("RMK");
	}

}