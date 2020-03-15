### so item

#sql("findAll")
SELECT  a.*
FROM so_itm a
WHERE ( (a.isDelivered is null) or (a.isDelivered != 'Y') )
    #if(orderNum)
    AND a.orderNum like CONCAT('%', #para(orderNum), '%')
    #end
;
#end

#sql("findAllOpen")
select a.*
  FROM so_itm a
WHERE ((a.isDelivered IS NULL) OR (a.isDelivered != 'Y'))
  AND ((a.allocQty IS NULL) OR (a.allocQty < a.orderQty))
ORDER BY a.priorityTick, a.placeDate ASC, a.soId ASC;
#end

#sql("findByOrderNum")
SELECT a.*
  FROM so_itm a
 WHERE a.orderNum = #para(orderNum)
;
#end

#sql("findAllDelivered")
SELECT a.*
FROM so_itm a
where a.isDelivered = 'Y'
  #if(orderNum)
  AND a.orderNum like CONCAT('%', #para(orderNum), '%')
  #end
;
#end

#sql("updateAllocQty")
UPDATE so_itm
SET
    allocQty = #para(allocQty)
WHERE id = #para(itemID)
;
#end

#sql("markDelivered")
UPDATE so_itm
SET
    deliveryQty = allocQty,
    isDelivered   = 'Y'
WHERE orderNum = #para(orderNum)
;
#end

#sql("cancelDelivered")
UPDATE so_itm
SET
    deliveryQty = 0,
    isDelivered   = 'N'
WHERE orderNum = #para(orderNum)
;
#end
