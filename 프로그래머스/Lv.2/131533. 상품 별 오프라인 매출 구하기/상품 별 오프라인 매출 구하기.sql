-- 코드를 입력하세요
select product.product_code, (product.price* tmp.amount) as sales
from product
join (select product_id, sum(sales_amount) as amount
from offline_sale
group by product_id
having sum(sales_amount)) as tmp
on product.product_id = tmp.product_id
order by sales desc, product.product_code;
