-- 코드를 입력하세요
# SELECT first_half.flavor
# from first_half
# join july
# on first_half.shipment_id = july.shipment_id
# group by first_half.flavor
# having sum(first_half.total_order+july.total_order)
# order by sum(first_half.total_order+july.total_order) desc
# limit 3;

SELECT FIRST_HALF.FLAVOR
FROM FIRST_HALF ,(SELECT FLAVOR, SUM(TOTAL_ORDER) AS TOTAL
     FROM JULY
     GROUP BY FLAVOR) AS TMP
WHERE TMP.FLAVOR = FIRST_HALF.FLAVOR
ORDER BY (TOTAL + TOTAL_ORDER) DESC
LIMIT 3
