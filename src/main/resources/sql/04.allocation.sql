### allocation

#sql("markDelivered")
UPDATE invtr_alloc_dtl d
    INNER JOIN so_itm i
    ON d.soItemId = i.id
        AND i.orderNum = #para(0)
SET d.isDelivery = 'Y'
;
#end

#sql("cancelDelivered")
UPDATE invtr_alloc_dtl d
    INNER JOIN so_itm i
    ON d.soItemId = i.id
        AND i.orderNum = #para(0)
SET d.isDelivery = 'N'
;
#end

#sql("delete")
delete from invtr_alloc_dtl
where id = #para(0)
;
#end

#sql("cancelAllocMM")
update so_itm a
    inner join invtr_alloc_dtl b
    on b.soItemId = a.id
        and b.id = #para(0)
set a.allocQty = a.allocQty - b.allocQty,
    a.priorityTick = ifnull(a.priorityTick, 0) + 10
;
#end

#sql("cancelAllocItm")
update mvmt_dtl a
    inner join invtr_alloc_dtl b
    on b.movementItemId = a.id
        and b.id = #para(0)
set a.allocQty = a.allocQty - b.allocQty
;
#end

#sql("findAll")
SELECT
    a.*,
    b.customerCode,
    b.materialCode,
    b.itemSeq,
    b.orderNum,
    b.placeDate
FROM invtr_alloc_dtl a
         INNER JOIN so_itm b ON a.soItemId = b.id
    AND ( (a.isDelivery = 'N') or (a.isDelivery is null) )
    #if(materialCode)
    AND b.materialCode like CONCAT('%', #para(materialCode), '%')
    #end
;
#end

#sql("findByMaterial")
SELECT
    b.materialCode,
    b.customerCode,
    b.orderNum,
    sum(a.allocQty) allocQty
FROM invtr_alloc_dtl a
         INNER JOIN so_itm b ON a.soItemId = b.id
    and ( (a.isDelivery = 'N') or (a.isDelivery is null) )
    #if(materialCode)
    AND b.materialCode = #para(materialCode)
    #end
group by b.materialCode, b.customerCode, b.orderNum
;
#end

