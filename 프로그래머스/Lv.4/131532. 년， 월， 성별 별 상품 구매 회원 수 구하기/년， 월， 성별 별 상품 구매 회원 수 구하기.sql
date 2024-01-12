-- 코드를 입력하세요
SELECT DATE_FORMAT(o.sales_date,'%Y') as YEAR, DATE_FORMAT(o.sales_date,'%m') as MONTH, u.gender, count(distinct o.user_id) as USER
FROM online_sale as o 
JOIN user_info as u
ON u.user_id = o.user_id and u.gender is not null
group by DATE_FORMAT(o.sales_date,'%Y'),DATE_FORMAT(o.sales_date,'%m'),u.gender
order by DATE_FORMAT(o.sales_date,'%Y'), DATE_FORMAT(o.sales_date,'%m'),u.gender;


# SELECT YEAR(SALES_DATE) AS YEAR, MONTH(SALES_DATE) AS MONTH, USER_INFO.GENDER, COUNT( DISTINCT ONLINE_SALE.USER_ID) AS USERS
# FROM ONLINE_SALE
# JOIN USER_INFO
# ON ONLINE_SALE.USER_ID = USER_INFO.USER_ID AND
# GENDER IS NOT NULL
# GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), USER_INFO.GENDER 
# ORDER BY YEAR(SALES_DATE), MONTH(SALES_DATE), USER_INFO.GENDER