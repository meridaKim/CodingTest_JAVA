-- 코드를 입력하세요
SELECT first_half.flavor
from first_half, (select flavor, sum(total_order) as total_order
                 from july
                 group by flavor) as tmp
where first_half.flavor = tmp.flavor
order by (tmp.total_order+first_half.total_order) desc
limit 3;
