### movement detail

#sql("updateAllocQty")
UPDATE mvmt_dtl
SET
    allocQty = #para(allocatedQty)
WHERE id = #para(detailID)
;
#end

#sql("cancelDelivered")
delete from mvmt_dtl
WHERE orderNum = #para(orderNum)
  and movementType = '销售出库'
;
#end


#sql("findAll")
SELECT m.*
  FROM mvmt_dtl m
WHERE 1 = 1
  #if(materialCode)
  AND m.materialCode like concat('%', #para(materialCode), '%')
  #end
  ;
#end

#sql("getCurrentInvLevel")
select a.materialCode,
       sum(a.movementQty * a.ind) totalQty,
       sum(a.allocQty * a.ind) allcQty,
       sum(a.avlQty * a.ind) avlQty
from ( select m.materialCode,
          (case when m.movementType = '入库' then 1 else -1 end) ind,
          m.movementQty, ifnull(m.allocQty,0) allocQty, (m.movementQty - ifnull(m.allocQty,0)) avlQty
       from mvmt_dtl m
       where 1 = 1
            #if(materialCode)
            AND m.materialCode like concat('%', #para(materialCode), '%')
            #end
        ) a
group by a.materialCode
;
#end


#sql("findAllOpen")
SELECT m.*
  FROM mvmt_dtl m
WHERE 1 = 1
  AND ((m.allocQty IS NULL) OR (m.allocQty < m.movementQty))
ORDER BY m.movementDate ASC
;
#end
