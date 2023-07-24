-- 가격대 별 상품 개수 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131530

SELECT (PRICE - (PRICE % 10000)) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP ASC;