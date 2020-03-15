### MX BL 分析

#sql("findAll")
select m.id, m.bl_num, m.cust_nme,m.biz_date, m.biz_time from mxstats m;
#end

#sql("findByBL")
select id, biz_date, biz_time, bl_num, cust_nme from mxstats WHERE bl_num=#para(0);
#end

#sql("findByCust")
select id, biz_date, biz_time, bl_num, cust_nme
  from mxstats
 WHERE cust_nme like concat('%', #para(0), '%')
;
#end

#sql("getDailySales")
select biz_date, count(distinct bl_num) bl_cnt, count(distinct cust_nme) cust_cnt
    from mxstats
group by biz_date
order by biz_date
;
#end
