package com.demo.common.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

/**
 * Generated by JFinal, do not modify this file.
 * <pre>
 * Example:
 * public void configPlugin(Plugins me) {
 *     ActiveRecordPlugin arp = new ActiveRecordPlugin(...);
 *     _MappingKit.mapping(arp);
 *     me.add(arp);
 * }
 * </pre>
 */
public class _MappingKit {
	
	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("access_log", "ACCESS_RECORDER_ID", AccessLog.class);
		arp.addMapping("address", "id", Address.class);
		arp.addMapping("area", "id", Area.class);
		arp.addMapping("area_city", "id", AreaCity.class);
		arp.addMapping("blg_req", "id", BlgReq.class);
		arp.addMapping("car", "id", Car.class);
		arp.addMapping("cite", "ID", Cite.class);
		arp.addMapping("city", "ID", City.class);
		arp.addMapping("country", "Code", Country.class);
		// Composite Primary Key order: CountryCode,Language
		arp.addMapping("countrylanguage", "CountryCode,Language", Countrylanguage.class);
		arp.addMapping("data_login", "id", DataLogin.class);
		arp.addMapping("data_money", "id", DataMoney.class);
		arp.addMapping("dicts", "id", Dicts.class);
		arp.addMapping("dispatchlist", "ID", Dispatchlist.class);
		arp.addMapping("dispatchlists", "ID", Dispatchlists.class);
		arp.addMapping("events", "ID", Events.class);
		arp.addMapping("invtr_alloc_dtl", "id", InvtrAllocDtl.class);
		arp.addMapping("monthly_pln", "ID", MonthlyPln.class);
		arp.addMapping("mvmt_dtl", "id", MvmtDtl.class);
		arp.addMapping("mxstats", "id", Mxstats.class);
		arp.addMapping("person", "id", Person.class);
		arp.addMapping("posts", "ID", Posts.class);
		arp.addMapping("rdrecord32", "ID", Rdrecord32.class);
		arp.addMapping("rdrecords32", "ID", Rdrecords32.class);
		arp.addMapping("sbs_fund_set_ordr", "FUND_SET_ORDR_ID", SbsFundSetOrdr.class);
		arp.addMapping("sbs_vc_ctrct", "VC_CTRCT_ID", SbsVcCtrct.class);
		arp.addMapping("showroom", "id", Showroom.class);
		arp.addMapping("so_itm", "id", SoItm.class);
		arp.addMapping("so_sodetails", "ID", SoSodetails.class);
		arp.addMapping("so_sodetailsplan", "ID", SoSodetailsplan.class);
		arp.addMapping("so_somain", "ID", SoSomain.class);
		arp.addMapping("t_actvy_log", "ID", ActvyLog.class);
		arp.addMapping("t_article", "ID", Article.class);
		arp.addMapping("t_asset", "ID", Asset.class);
		arp.addMapping("t_bpm_delegation", "ID", BpmDelegation.class);
		arp.addMapping("t_bpm_ins", "ID", BpmIns.class);
		arp.addMapping("t_bpm_ins_node", "ID", BpmInsNode.class);
		arp.addMapping("t_bpm_process", "ID", BpmProcess.class);
		arp.addMapping("t_bpm_process_node", "ID", BpmProcessNode.class);
		arp.addMapping("t_ctrct", "ID", Ctrct.class);
		arp.addMapping("t_ctrct_inv", "ID", CtrctInv.class);
		arp.addMapping("t_ctrct_plan", "ID", CtrctPlan.class);
		arp.addMapping("t_dept", "DEPT_ID", Dept.class);
		arp.addMapping("t_dept_viewer", "ID", DeptViewer.class);
		arp.addMapping("t_diskspace", "ID", Diskspace.class);
		arp.addMapping("t_dly_task", "ID", DlyTask.class);
		arp.addMapping("t_email", "ID", Email.class);
		arp.addMapping("t_event", "EVT_ID", Event.class);
		arp.addMapping("t_event_todo", "EVT_TODO_ID", EventTodo.class);
		arp.addMapping("t_feedback", "ID", Feedback.class);
		arp.addMapping("t_file_mgmt", "ID", FileMgmt.class);
		arp.addMapping("t_labor_claim", "ID", LaborClaim.class);
		arp.addMapping("t_logs", "id", Logs.class);
		arp.addMapping("t_mat_watchlist", "ID", MatWatchlist.class);
		arp.addMapping("t_pricepool", "ID", Pricepool.class);
		arp.addMapping("t_proj", "ID", Proj.class);
		arp.addMapping("t_review", "ID", Review.class);
		arp.addMapping("t_review_log", "ID", ReviewLog.class);
		arp.addMapping("t_soft_inst", "ID", SoftInst.class);
		arp.addMapping("t_testinghd", "ID", Testinghd.class);
		arp.addMapping("t_testingitm", "ID", Testingitm.class);
		arp.addMapping("t_tick", "ID", Tick.class);
		arp.addMapping("t_upload", "ID", Upload.class);
		arp.addMapping("t_users", "ID", Users.class);
		arp.addMapping("t_zuser", "id", Zuser.class);
		arp.addMapping("tt_pcba_test_info", "TT_PCBA_TEST_INFO_ID", TtPcbaTestInfo.class);
	}
}

