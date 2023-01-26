-- 그룹별 조건에 맞는 식당 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131124

--- DDL
CREATE TABLE MEMBER_PROFILE (
    MEMBER_ID VARCHAR(100) PRIMARY KEY,
    MEMBER_NAME VARCHAR(50) NOT NULL,
    TLNO VARCHAR(50),
    GENDER VARCHAR(1),
    DATE_OF_BIRTH DATE
);

CREATE TABLE REST_REVIEW (
    REVIEW_ID VARCHAR(10) PRIMARY KEY,
    REST_ID VARCHAR(10),
    MEMBER_ID VARCHAR(100),
    REVIEW_SCORE NUMBER,
    REVIEW_TEXT VARCHAR(1000),
    REVIEW_DATE DATE
);
---

--- DML(INSERT)
INSERT INTO MEMBER_PROFILE(MEMBER_ID, MEMBER_NAME, TLNO, GENDER, DATE_OF_BIRTH)
VALUES('jiho92@naver.com', '이지호', '01076432111', 'W', '1992-02-12'),
       ('jiyoon22@hotmail.com', '김지윤', '01032324117', 'W', '1992-02-22'),
       ('jihoon93@hanmail.net', '김지훈', '01023258688', 'M', '1993-02-23'),
       ('seoyeons@naver.com', '박서연', '01076482209', 'W', '1993-03-16'),
       ('yelin1130@gmail.com', '조예린', '01017626711', 'W', '1990-11-30');

INSERT INTO REST_REVIEW(REVIEW_ID, REST_ID, MEMBER_ID, REVIEW_SCORE, REVIEW_TEXT, REVIEW_DATE)
VALUES('R000000065', '00028', 'soobin97@naver.com', 5, '부찌 국물에서 샤브샤브 맛이나고 깔끔', '2022-04-12'),
      ('R000000066', '00039', 'yelin1130@gmail.com', 5, '김치찌개 최곱니다.', '2022-02-12'),
      ('R000000067', '00028', 'yelin1130@gmail.com', 5, '햄이 많아서 좋아요', '2022-02-22'),
      ('R000000068', '00035', 'ksyi0316@gmail.com', 5, '숙성회가 끝내줍니다.', '2022-02-15'),
      ('R000000069', '00035', 'yoonsy95@naver.com', 4, '비린내가 전혀없어요.', '2022-04-16');
---

--- DML(SELECT)
SELECT A.MEMBER_NAME, B.REVIEW_TEXT, DATE_FORMAT(B.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM MEMBER_PROFILE AS A
LEFT JOIN REST_REVIEW AS B
ON A.MEMBER_ID = B.MEMBER_ID
WHERE A.MEMBER_ID = (
    SELECT MEMBER_ID
    FROM REST_REVIEW
    GROUP BY MEMBER_ID
    ORDER BY COUNT(1) DESC
    LIMIT 1
    )
ORDER BY 3, 2
---