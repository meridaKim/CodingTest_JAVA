-- 코드를 입력하세요
SELECT DATE_FORMAT(o.sales_date,'%Y') as YEAR, DATE_FORMAT(o.sales_date,'%m') as MONTH, u.gender, count(distinct o.user_id) as USER
FROM online_sale as o ,user_info as u
where u.user_id = o.user_id and u.gender is not null
group by DATE_FORMAT(o.sales_date,'%Y'),DATE_FORMAT(o.sales_date,'%m'),u.gender
order by DATE_FORMAT(o.sales_date,'%Y'), DATE_FORMAT(o.sales_date,'%m'),u.gender;