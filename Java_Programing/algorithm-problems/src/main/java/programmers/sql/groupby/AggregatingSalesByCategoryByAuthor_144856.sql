-- 저자 별 카테고리 별 매출액 집계하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/144856

SELECT
    A.AUTHOR_ID,
    A.AUTHOR_NAME,
    B.CATEGORY,
    SUM(B.PRICE * BS.SALES) AS TOTAL_SALES
FROM
    BOOK B
LEFT JOIN
    AUTHOR A
ON
    B.AUTHOR_ID = A.AUTHOR_ID
LEFT JOIN
    BOOK_SALES BS
ON
    B.BOOK_ID = BS.BOOK_ID
WHERE
    BS.SALES_DATE LIKE '2022-01%'
GROUP BY AUTHOR_ID, CATEGORY
ORDER BY AUTHOR_ID ASC, CATEGORY DESC;