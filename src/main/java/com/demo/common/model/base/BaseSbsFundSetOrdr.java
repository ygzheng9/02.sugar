package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseSbsFundSetOrdr<M extends BaseSbsFundSetOrdr<M>> extends Model<M> implements IBean {

	public void setFundSetOrdrId(java.lang.Long fundSetOrdrId) {
		set("FUND_SET_ORDR_ID", fundSetOrdrId);
	}
	
	public java.lang.Long getFundSetOrdrId() {
		return getLong("FUND_SET_ORDR_ID");
	}

	public void setFundSetOrdrNum(java.lang.String fundSetOrdrNum) {
		set("FUND_SET_ORDR_NUM", fundSetOrdrNum);
	}
	
	public java.lang.String getFundSetOrdrNum() {
		return getStr("FUND_SET_ORDR_NUM");
	}

	public void setFundSetOrdrSts(java.lang.String fundSetOrdrSts) {
		set("FUND_SET_ORDR_STS", fundSetOrdrSts);
	}
	
	public java.lang.String getFundSetOrdrSts() {
		return getStr("FUND_SET_ORDR_STS");
	}

	public void setLatestDte(java.util.Date latestDte) {
		set("LATEST_DTE", latestDte);
	}
	
	public java.util.Date getLatestDte() {
		return get("LATEST_DTE");
	}

	public void setCompCde(java.lang.String compCde) {
		set("COMP_CDE", compCde);
	}
	
	public java.lang.String getCompCde() {
		return getStr("COMP_CDE");
	}

	public void setSetTyp(java.lang.String setTyp) {
		set("SET_TYP", setTyp);
	}
	
	public java.lang.String getSetTyp() {
		return getStr("SET_TYP");
	}

	public void setPymtMthdCde(java.lang.String pymtMthdCde) {
		set("PYMT_MTHD_CDE", pymtMthdCde);
	}
	
	public java.lang.String getPymtMthdCde() {
		return getStr("PYMT_MTHD_CDE");
	}

	public void setPymtTyp(java.lang.String pymtTyp) {
		set("PYMT_TYP", pymtTyp);
	}
	
	public java.lang.String getPymtTyp() {
		return getStr("PYMT_TYP");
	}

	public void setPrTyp(java.lang.String prTyp) {
		set("PR_TYP", prTyp);
	}
	
	public java.lang.String getPrTyp() {
		return getStr("PR_TYP");
	}

	public void setPpaidGlAcctNum(java.lang.String ppaidGlAcctNum) {
		set("PPAID_GL_ACCT_NUM", ppaidGlAcctNum);
	}
	
	public java.lang.String getPpaidGlAcctNum() {
		return getStr("PPAID_GL_ACCT_NUM");
	}

	public void setPpaidByPersonInd(java.lang.String ppaidByPersonInd) {
		set("PPAID_BY_PERSON_IND", ppaidByPersonInd);
	}
	
	public java.lang.String getPpaidByPersonInd() {
		return getStr("PPAID_BY_PERSON_IND");
	}

	public void setFrgCcyPurInd(java.lang.String frgCcyPurInd) {
		set("FRG_CCY_PUR_IND", frgCcyPurInd);
	}
	
	public java.lang.String getFrgCcyPurInd() {
		return getStr("FRG_CCY_PUR_IND");
	}

	public void setNote3rdPrtyTxt(java.lang.String note3rdPrtyTxt) {
		set("NOTE_3RD_PRTY_TXT", note3rdPrtyTxt);
	}
	
	public java.lang.String getNote3rdPrtyTxt() {
		return getStr("NOTE_3RD_PRTY_TXT");
	}

	public void setActingCompCde(java.lang.String actingCompCde) {
		set("ACTING_COMP_CDE", actingCompCde);
	}
	
	public java.lang.String getActingCompCde() {
		return getStr("ACTING_COMP_CDE");
	}

	public void setActingDeptCde(java.lang.String actingDeptCde) {
		set("ACTING_DEPT_CDE", actingDeptCde);
	}
	
	public java.lang.String getActingDeptCde() {
		return getStr("ACTING_DEPT_CDE");
	}

	public void setArapPrtyId(java.lang.Long arapPrtyId) {
		set("ARAP_PRTY_ID", arapPrtyId);
	}
	
	public java.lang.Long getArapPrtyId() {
		return getLong("ARAP_PRTY_ID");
	}

	public void setArapPrtySapId(java.lang.String arapPrtySapId) {
		set("ARAP_PRTY_SAP_ID", arapPrtySapId);
	}
	
	public java.lang.String getArapPrtySapId() {
		return getStr("ARAP_PRTY_SAP_ID");
	}

	public void setArapSetObjTyp(java.lang.String arapSetObjTyp) {
		set("ARAP_SET_OBJ_TYP", arapSetObjTyp);
	}
	
	public java.lang.String getArapSetObjTyp() {
		return getStr("ARAP_SET_OBJ_TYP");
	}

	public void setActPrtyId(java.lang.Long actPrtyId) {
		set("ACT_PRTY_ID", actPrtyId);
	}
	
	public java.lang.Long getActPrtyId() {
		return getLong("ACT_PRTY_ID");
	}

	public void setActPrtySapId(java.lang.String actPrtySapId) {
		set("ACT_PRTY_SAP_ID", actPrtySapId);
	}
	
	public java.lang.String getActPrtySapId() {
		return getStr("ACT_PRTY_SAP_ID");
	}

	public void setActSetObjTyp(java.lang.String actSetObjTyp) {
		set("ACT_SET_OBJ_TYP", actSetObjTyp);
	}
	
	public java.lang.String getActSetObjTyp() {
		return getStr("ACT_SET_OBJ_TYP");
	}

	public void setBnkCde(java.lang.String bnkCde) {
		set("BNK_CDE", bnkCde);
	}
	
	public java.lang.String getBnkCde() {
		return getStr("BNK_CDE");
	}

	public void setBnkAcctNum(java.lang.String bnkAcctNum) {
		set("BNK_ACCT_NUM", bnkAcctNum);
	}
	
	public java.lang.String getBnkAcctNum() {
		return getStr("BNK_ACCT_NUM");
	}

	public void setBnkProvinceCde(java.lang.String bnkProvinceCde) {
		set("BNK_PROVINCE_CDE", bnkProvinceCde);
	}
	
	public java.lang.String getBnkProvinceCde() {
		return getStr("BNK_PROVINCE_CDE");
	}

	public void setBnkCityCde(java.lang.String bnkCityCde) {
		set("BNK_CITY_CDE", bnkCityCde);
	}
	
	public java.lang.String getBnkCityCde() {
		return getStr("BNK_CITY_CDE");
	}

	public void setSetCcyCde(java.lang.String setCcyCde) {
		set("SET_CCY_CDE", setCcyCde);
	}
	
	public java.lang.String getSetCcyCde() {
		return getStr("SET_CCY_CDE");
	}

	public void setManlSetExchgInd(java.lang.String manlSetExchgInd) {
		set("MANL_SET_EXCHG_IND", manlSetExchgInd);
	}
	
	public java.lang.String getManlSetExchgInd() {
		return getStr("MANL_SET_EXCHG_IND");
	}

	public void setSetAmt(java.math.BigDecimal setAmt) {
		set("SET_AMT", setAmt);
	}
	
	public java.math.BigDecimal getSetAmt() {
		return get("SET_AMT");
	}

	public void setGlAcctNum(java.lang.String glAcctNum) {
		set("GL_ACCT_NUM", glAcctNum);
	}
	
	public java.lang.String getGlAcctNum() {
		return getStr("GL_ACCT_NUM");
	}

	public void setPpaidBalAmt(java.math.BigDecimal ppaidBalAmt) {
		set("PPAID_BAL_AMT", ppaidBalAmt);
	}
	
	public java.math.BigDecimal getPpaidBalAmt() {
		return get("PPAID_BAL_AMT");
	}

	public void setSetPayableAmt(java.math.BigDecimal setPayableAmt) {
		set("SET_PAYABLE_AMT", setPayableAmt);
	}
	
	public java.math.BigDecimal getSetPayableAmt() {
		return get("SET_PAYABLE_AMT");
	}

	public void setLocCcyCde(java.lang.String locCcyCde) {
		set("LOC_CCY_CDE", locCcyCde);
	}
	
	public java.lang.String getLocCcyCde() {
		return getStr("LOC_CCY_CDE");
	}

	public void setSetLocAmt(java.math.BigDecimal setLocAmt) {
		set("SET_LOC_AMT", setLocAmt);
	}
	
	public java.math.BigDecimal getSetLocAmt() {
		return get("SET_LOC_AMT");
	}

	public void setPpaidBalLocAmt(java.math.BigDecimal ppaidBalLocAmt) {
		set("PPAID_BAL_LOC_AMT", ppaidBalLocAmt);
	}
	
	public java.math.BigDecimal getPpaidBalLocAmt() {
		return get("PPAID_BAL_LOC_AMT");
	}

	public void setOrigCcyAmtNote(java.lang.String origCcyAmtNote) {
		set("ORIG_CCY_AMT_NOTE", origCcyAmtNote);
	}
	
	public java.lang.String getOrigCcyAmtNote() {
		return getStr("ORIG_CCY_AMT_NOTE");
	}

	public void setRequestUsr(java.lang.String requestUsr) {
		set("REQUEST_USR", requestUsr);
	}
	
	public java.lang.String getRequestUsr() {
		return getStr("REQUEST_USR");
	}

	public void setRequestDeptCde(java.lang.String requestDeptCde) {
		set("REQUEST_DEPT_CDE", requestDeptCde);
	}
	
	public java.lang.String getRequestDeptCde() {
		return getStr("REQUEST_DEPT_CDE");
	}

	public void setRequestDte(java.util.Date requestDte) {
		set("REQUEST_DTE", requestDte);
	}
	
	public java.util.Date getRequestDte() {
		return get("REQUEST_DTE");
	}

	public void setDueDte(java.util.Date dueDte) {
		set("DUE_DTE", dueDte);
	}
	
	public java.util.Date getDueDte() {
		return get("DUE_DTE");
	}

	public void setClrSts(java.lang.String clrSts) {
		set("CLR_STS", clrSts);
	}
	
	public java.lang.String getClrSts() {
		return getStr("CLR_STS");
	}

	public void setAtId(java.lang.Long atId) {
		set("AT_ID", atId);
	}
	
	public java.lang.Long getAtId() {
		return getLong("AT_ID");
	}

	public void setPaidSts(java.lang.String paidSts) {
		set("PAID_STS", paidSts);
	}
	
	public java.lang.String getPaidSts() {
		return getStr("PAID_STS");
	}

	public void setDataSrc(java.lang.String dataSrc) {
		set("DATA_SRC", dataSrc);
	}
	
	public java.lang.String getDataSrc() {
		return getStr("DATA_SRC");
	}

	public void setDataSrcId(java.lang.Long dataSrcId) {
		set("DATA_SRC_ID", dataSrcId);
	}
	
	public java.lang.Long getDataSrcId() {
		return getLong("DATA_SRC_ID");
	}

	public void setRMK(java.lang.String RMK) {
		set("RMK", RMK);
	}
	
	public java.lang.String getRMK() {
		return getStr("RMK");
	}

	public void setDelInd(java.lang.String delInd) {
		set("DEL_IND", delInd);
	}
	
	public java.lang.String getDelInd() {
		return getStr("DEL_IND");
	}

	public void setVerId(java.lang.Integer verId) {
		set("VER_ID", verId);
	}
	
	public java.lang.Integer getVerId() {
		return getInt("VER_ID");
	}

	public void setCreAtDt(java.util.Date creAtDt) {
		set("CRE_AT_DT", creAtDt);
	}
	
	public java.util.Date getCreAtDt() {
		return get("CRE_AT_DT");
	}

	public void setCreByUsr(java.lang.String creByUsr) {
		set("CRE_BY_USR", creByUsr);
	}
	
	public java.lang.String getCreByUsr() {
		return getStr("CRE_BY_USR");
	}

	public void setUpdAtDt(java.util.Date updAtDt) {
		set("UPD_AT_DT", updAtDt);
	}
	
	public java.util.Date getUpdAtDt() {
		return get("UPD_AT_DT");
	}

	public void setUpdByUsr(java.lang.String updByUsr) {
		set("UPD_BY_USR", updByUsr);
	}
	
	public java.lang.String getUpdByUsr() {
		return getStr("UPD_BY_USR");
	}

	public void setPostingDt(java.util.Date postingDt) {
		set("POSTING_DT", postingDt);
	}
	
	public java.util.Date getPostingDt() {
		return get("POSTING_DT");
	}

}