-- 자동차 종류 별 특정 옵션이 포함된 자동차 수 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/151137

SELECT CAR_TYPE, COUNT(CAR_TYPE) AS CARS
FROM CAR_RENTAL_COMPANY_CAR
WHERE OPTIONS REGEXP '통풍시트|열선시트|가죽시트'
GROUP BY CAR_TYPE
ORDER BY CAR_TYPE ASC;