-- 조건에 맞는 사용자와 총 거래금액 조회하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/164668

SELECT UU.USER_ID, UU.NICKNAME, SUM(UB.PRICE) AS TOTAL_SALES
FROM USED_GOODS_BOARD UB
         LEFT JOIN USED_GOODS_USER UU
                   ON UB.WRITER_ID = UU.USER_ID
WHERE UB.STATUS = 'DONE'
GROUP BY UB.WRITER_ID
HAVING TOTAL_SALES >= 700000
ORDER BY TOTAL_SALES ASC;