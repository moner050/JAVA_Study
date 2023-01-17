-- 조건에 맞는 도서와 저자 리스트 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/144854

--- DDL
CREATE TABLE BOOK (
    BOOK_ID INTEGER PRIMARY KEY COMMENT '도서 ID' AS Description,
    CATEGORY VARCHAR(255) NOT NULL COMMENT '카테고리 (경제, 인문, 소설, 생활, 기술)' AS Description,
    AUTHOR_ID INTEGER NOT NULL COMMENT '저자 ID' AS Description,
    PRICE INTEGER NOT NULL COMMENT '판매가 (원)' AS Description,
    PUBLISHED_DATE DATE NOT NULL COMMENT '출판일' AS Description
);

CREATE TABLE AUTHOR (
    AUTHOR_ID INTEGER PRIMARY KEY COMMENT '저자 ID',
    AUTHOR_NAME VARCHAR(255) NOT NULL COMMENT '저자명'
);
---

--- DML(INSERT)
INSERT INTO BOOK (BOOK_ID, CATEGORY, AUTHOR_ID, PRICE, PUBLISHED_DATE)
VALUES(1, '인문', 1, 10000, '2020-01-01'),
      (2, '경제', 1, 9000, '2021-04-11'),
      (3, '경제', 2, 11000, '2021-02-05');

INSERT INTO AUTHOR (AUTHOR_ID, AUTHOR_NAME)
VALUES(1, '홍길동'),
        (2, '김영호');
---

--- DML(SELECT)
SELECT A.BOOK_ID, B.AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') AS PUBLISHED_DATE
FROM BOOK AS A
INNER JOIN AUTHOR AS B
ON A.AUTHOR_ID = B.AUTHOR_ID
WHERE A.CATEGORY = '경제'
ORDER BY PUBLISHED_DATE ASC;
---