### 界面上多条件查询的拼接

### 用户查询界面上面的查询条件
#sql("findUser")
select *
  from t_zuser
where 1 = 1
#if(userName)
  AND userName like concat('%', #para(userName), '%')
#end
#if(email)
  AND email like concat('%', #para(email), '%')
#end
#if(company)
  AND company like concat('%', #para(company), '%')
#end
#if(department)
  AND department like concat('%', #para(department), '%')
#end
#if(city)
  AND city = #para(city)
#end
order by id asc
#end

### 后面有分页，所以这里结束不能有分号;
