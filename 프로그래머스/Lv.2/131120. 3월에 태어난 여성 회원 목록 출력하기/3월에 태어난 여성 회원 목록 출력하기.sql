-- 코드를 입력하세요
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(date_of_birth,'%Y-%m-%d') as DATE_OF_BIRTH
from member_profile
where DATE_FORMAT(date_of_birth,'%m')='03' 
and tlno is not null
and gender ='W'
order by member_id asc;