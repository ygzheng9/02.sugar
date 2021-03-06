package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCtrctInv<M extends BaseCtrctInv<M>> extends Model<M> implements IBean {

	public void setID(java.lang.Long ID) {
		set("ID", ID);
	}
	
	public java.lang.Long getID() {
		return getLong("ID");
	}

	/**
	 * 合同ID
	 */
	public void setCtrctId(java.lang.Long ctrctId) {
		set("CTRCT_ID", ctrctId);
	}
	
	/**
	 * 合同ID
	 */
	public java.lang.Long getCtrctId() {
		return getLong("CTRCT_ID");
	}

	/**
	 * 合同里程碑 ID
	 */
	public void setMlstId(java.lang.Long mlstId) {
		set("MLST_ID", mlstId);
	}
	
	/**
	 * 合同里程碑 ID
	 */
	public java.lang.Long getMlstId() {
		return getLong("MLST_ID");
	}

	/**
	 * 发票号
	 */
	public void setInvNum(java.lang.String invNum) {
		set("INV_NUM", invNum);
	}
	
	/**
	 * 发票号
	 */
	public java.lang.String getInvNum() {
		return getStr("INV_NUM");
	}

	/**
	 * 开票日期
	 */
	public void setInvDte(java.lang.String invDte) {
		set("INV_DTE", invDte);
	}
	
	/**
	 * 开票日期
	 */
	public java.lang.String getInvDte() {
		return getStr("INV_DTE");
	}

	/**
	 * 供应商
	 */
	public void setVenderNme(java.lang.String venderNme) {
		set("VENDER_NME", venderNme);
	}
	
	/**
	 * 供应商
	 */
	public java.lang.String getVenderNme() {
		return getStr("VENDER_NME");
	}

	/**
	 * 专票、普票
	 */
	public void setInvTyp(java.lang.String invTyp) {
		set("INV_TYP", invTyp);
	}
	
	/**
	 * 专票、普票
	 */
	public java.lang.String getInvTyp() {
		return getStr("INV_TYP");
	}

	/**
	 * 币种
	 */
	public void setCcyCde(java.lang.String ccyCde) {
		set("CCY_CDE", ccyCde);
	}
	
	/**
	 * 币种
	 */
	public java.lang.String getCcyCde() {
		return getStr("CCY_CDE");
	}

	/**
	 * 总额
	 */
	public void setTtlAmt(java.math.BigDecimal ttlAmt) {
		set("TTL_AMT", ttlAmt);
	}
	
	/**
	 * 总额
	 */
	public java.math.BigDecimal getTtlAmt() {
		return get("TTL_AMT");
	}

	/**
	 * 税额
	 */
	public void setTaxAmt(java.math.BigDecimal taxAmt) {
		set("TAX_AMT", taxAmt);
	}
	
	/**
	 * 税额
	 */
	public java.math.BigDecimal getTaxAmt() {
		return get("TAX_AMT");
	}

	/**
	 * 税率
	 */
	public void setTaxRate(java.math.BigDecimal taxRate) {
		set("TAX_RATE", taxRate);
	}
	
	/**
	 * 税率
	 */
	public java.math.BigDecimal getTaxRate() {
		return get("TAX_RATE");
	}

	/**
	 * 发票描述
	 */
	public void setRMK(java.lang.String RMK) {
		set("RMK", RMK);
	}
	
	/**
	 * 发票描述
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

	/**
	 * 交接人
	 */
	public void setHdovUsr(java.lang.String hdovUsr) {
		set("HDOV_USR", hdovUsr);
	}
	
	/**
	 * 交接人
	 */
	public java.lang.String getHdovUsr() {
		return getStr("HDOV_USR");
	}

	/**
	 * 交给的财务同事
	 */
	public void setFinUsr(java.lang.String finUsr) {
		set("FIN_USR", finUsr);
	}
	
	/**
	 * 交给的财务同事
	 */
	public java.lang.String getFinUsr() {
		return getStr("FIN_USR");
	}

	/**
	 * 交给财务的时间
	 */
	public void setFinDte(java.lang.String finDte) {
		set("FIN_DTE", finDte);
	}
	
	/**
	 * 交给财务的时间
	 */
	public java.lang.String getFinDte() {
		return getStr("FIN_DTE");
	}

	/**
	 * 交给交接备注
	 */
	public void setFinRmk(java.lang.String finRmk) {
		set("FIN_RMK", finRmk);
	}
	
	/**
	 * 交给交接备注
	 */
	public java.lang.String getFinRmk() {
		return getStr("FIN_RMK");
	}

	/**
	 * 发票是否已提付款
	 */
	public void setIsPaid(java.lang.String isPaid) {
		set("IS_PAID", isPaid);
	}
	
	/**
	 * 发票是否已提付款
	 */
	public java.lang.String getIsPaid() {
		return getStr("IS_PAID");
	}

	/**
	 * 是否是预付款
	 */
	public void setIsPpaid(java.lang.String isPpaid) {
		set("IS_PPAID", isPpaid);
	}
	
	/**
	 * 是否是预付款
	 */
	public java.lang.String getIsPpaid() {
		return getStr("IS_PPAID");
	}

	/**
	 * 付款申请提交日期
	 */
	public void setPaidDte(java.lang.String paidDte) {
		set("PAID_DTE", paidDte);
	}
	
	/**
	 * 付款申请提交日期
	 */
	public java.lang.String getPaidDte() {
		return getStr("PAID_DTE");
	}

	/**
	 * 付款备注
	 */
	public void setPaidRmk(java.lang.String paidRmk) {
		set("PAID_RMK", paidRmk);
	}
	
	/**
	 * 付款备注
	 */
	public java.lang.String getPaidRmk() {
		return getStr("PAID_RMK");
	}

	/**
	 * 付款申请提交人
	 */
	public void setReqUsr(java.lang.String reqUsr) {
		set("REQ_USR", reqUsr);
	}
	
	/**
	 * 付款申请提交人
	 */
	public java.lang.String getReqUsr() {
		return getStr("REQ_USR");
	}

}
