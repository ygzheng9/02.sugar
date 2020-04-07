package com.demo.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseTtPcbaTestInfo<M extends BaseTtPcbaTestInfo<M>> extends Model<M> implements IBean {

	public void setTtPcbaTestInfoId(java.lang.Long ttPcbaTestInfoId) {
		set("TT_PCBA_TEST_INFO_ID", ttPcbaTestInfoId);
	}
	
	public java.lang.Long getTtPcbaTestInfoId() {
		return getLong("TT_PCBA_TEST_INFO_ID");
	}

	/**
	 * 序号
	 */
	public void setSEQ(java.lang.String SEQ) {
		set("SEQ", SEQ);
	}
	
	/**
	 * 序号
	 */
	public java.lang.String getSEQ() {
		return getStr("SEQ");
	}

	/**
	 * 检测项目
	 */
	public void setTestProject(java.lang.String testProject) {
		set("TEST_PROJECT", testProject);
	}
	
	/**
	 * 检测项目
	 */
	public java.lang.String getTestProject() {
		return getStr("TEST_PROJECT");
	}

	/**
	 * 检测条件
	 */
	public void setTestCondition(java.lang.String testCondition) {
		set("TEST_CONDITION", testCondition);
	}
	
	/**
	 * 检测条件
	 */
	public java.lang.String getTestCondition() {
		return getStr("TEST_CONDITION");
	}

	/**
	 * 检测结果
	 */
	public void setTestResult(java.lang.String testResult) {
		set("TEST_RESULT", testResult);
	}
	
	/**
	 * 检测结果
	 */
	public java.lang.String getTestResult() {
		return getStr("TEST_RESULT");
	}

	/**
	 * 检测结论
	 */
	public void setTestConclusion(java.lang.String testConclusion) {
		set("TEST_CONCLUSION", testConclusion);
	}
	
	/**
	 * 检测结论
	 */
	public java.lang.String getTestConclusion() {
		return getStr("TEST_CONCLUSION");
	}

	/**
	 * N：不打印 Y：打印
	 */
	public void setIsPrint(java.lang.String isPrint) {
		set("IS_PRINT", isPrint);
	}
	
	/**
	 * N：不打印 Y：打印
	 */
	public java.lang.String getIsPrint() {
		return getStr("IS_PRINT");
	}

	/**
	 * 上限
	 */
	public void setMaxValue(java.lang.String maxValue) {
		set("MAX_VALUE", maxValue);
	}
	
	/**
	 * 上限
	 */
	public java.lang.String getMaxValue() {
		return getStr("MAX_VALUE");
	}

	/**
	 * 上限
	 */
	public void setMinValue(java.lang.String minValue) {
		set("MIN_VALUE", minValue);
	}
	
	/**
	 * 上限
	 */
	public java.lang.String getMinValue() {
		return getStr("MIN_VALUE");
	}

	/**
	 * 工单ID
	 */
	public void setToOrderId(java.lang.Long toOrderId) {
		set("TO_ORDER_ID", toOrderId);
	}
	
	/**
	 * 工单ID
	 */
	public java.lang.Long getToOrderId() {
		return getLong("TO_ORDER_ID");
	}

	/**
	 * 站点ID
	 */
	public void setTmStationId(java.lang.Long tmStationId) {
		set("TM_STATION_ID", tmStationId);
	}
	
	/**
	 * 站点ID
	 */
	public java.lang.Long getTmStationId() {
		return getLong("TM_STATION_ID");
	}

	/**
	 * 0：默认 如有采集数据每次+1
	 */
	public void setNUM(java.lang.Integer NUM) {
		set("NUM", NUM);
	}
	
	/**
	 * 0：默认 如有采集数据每次+1
	 */
	public java.lang.Integer getNUM() {
		return getInt("NUM");
	}

	/**
	 * 收集时间
	 */
	public void setCollectionDate(java.util.Date collectionDate) {
		set("COLLECTION_DATE", collectionDate);
	}
	
	/**
	 * 收集时间
	 */
	public java.util.Date getCollectionDate() {
		return get("COLLECTION_DATE");
	}

	/**
	 * 创建时间
	 */
	public void setCreateDate(java.util.Date createDate) {
		set("CREATE_DATE", createDate);
	}
	
	/**
	 * 创建时间
	 */
	public java.util.Date getCreateDate() {
		return get("CREATE_DATE");
	}

	/**
	 * 创建人
	 */
	public void setCreateBy(java.lang.String createBy) {
		set("CREATE_BY", createBy);
	}
	
	/**
	 * 创建人
	 */
	public java.lang.String getCreateBy() {
		return getStr("CREATE_BY");
	}

	/**
	 * 修改人
	 */
	public void setUpdateBy(java.lang.String updateBy) {
		set("UPDATE_BY", updateBy);
	}
	
	/**
	 * 修改人
	 */
	public java.lang.String getUpdateBy() {
		return getStr("UPDATE_BY");
	}

	/**
	 * 修改时间
	 */
	public void setUpdateDate(java.util.Date updateDate) {
		set("UPDATE_DATE", updateDate);
	}
	
	/**
	 * 修改时间
	 */
	public java.util.Date getUpdateDate() {
		return get("UPDATE_DATE");
	}

}