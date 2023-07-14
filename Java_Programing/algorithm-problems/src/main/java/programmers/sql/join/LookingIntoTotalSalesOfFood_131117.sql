-- 5월 식품들의 총매출 조회하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131117

SELECT FP.PRODUCT_ID, FP.PRODUCT_NAME, SUM(FP.PRICE * FO.AMOUNT) AS TOTAL_SALES
FROM FOOD_PRODUCT FP
         LEFT JOIN FOOD_ORDER FO
                   ON FP.PRODUCT_ID = FO.PRODUCT_ID
WHERE FO.PRODUCE_DATE LIKE '2022-05%'
GROUP BY FP.PRODUCT_ID
ORDER BY TOTAL_SALES DESC, FP.PRODUCT_ID ASC;