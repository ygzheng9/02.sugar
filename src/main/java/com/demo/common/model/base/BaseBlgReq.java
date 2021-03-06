package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseBlgReq<M extends BaseBlgReq<M>> extends Model<M> implements IBean {

	public void setId(java.lang.Integer id) {
		set("id", id);
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public void setBlgReqCde(java.lang.String blgReqCde) {
		set("blg_req_cde", blgReqCde);
	}
	
	public java.lang.String getBlgReqCde() {
		return getStr("blg_req_cde");
	}

	public void setVndrNme(java.lang.String vndrNme) {
		set("vndr_nme", vndrNme);
	}
	
	public java.lang.String getVndrNme() {
		return getStr("vndr_nme");
	}

	public void setInvTyp(java.lang.String invTyp) {
		set("inv_typ", invTyp);
	}
	
	public java.lang.String getInvTyp() {
		return getStr("inv_typ");
	}

	public void setReqDte(java.util.Date reqDte) {
		set("req_dte", reqDte);
	}
	
	public java.util.Date getReqDte() {
		return get("req_dte");
	}

	public void setRmk(java.lang.String rmk) {
		set("rmk", rmk);
	}
	
	public java.lang.String getRmk() {
		return getStr("rmk");
	}

}
