-- 코드를 입력하세요
SELECT YEAR(sales_date) as YEAR,
    MONTH(sales_date) as MONTH, 
    count(DISTINCT O.USER_ID) as puchased_users, 
    ROUND(count(DISTINCT O.USER_ID)/(SELECT COUNT(USER_ID) 
    -- 2.select절 쿼리로 2021년에 가입한 전체 회원 수를 하나의 컬럼처럼 사용한다.
                                     FROM USER_INFO WHERE 
                                     YEAR(JOINED) = 2021),1) as puchased_ratio
-- 3.비율을 round 함수를 통해 소수점 첫째자리까지 표현한다.
FROM ONLINE_SALE O
INNER JOIN USER_INFO U ON U.USER_ID = O.USER_ID 
-- 1. 2021년에 가입한 조건에 해당하는 회원의 아이디로 조인한다. 
-- 연별,월별 조회를 위해 GROUP BY를 사용한다. 
WHERE YEAR(JOINED) = 2021
GROUP BY year(sales_date),month(sales_date)
ORDER BY year(sales_date),month(sales_date)