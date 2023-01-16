-- 3월에 태어난 여성 회원 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131120

--- DDL
CREATE TABLE MEMBER_PROFILE (
    MEMBER_ID VARCHAR(100) PRIMARY KEY NOT NULL,
    MEMBER_NAME VARCHAR(50) NOT NULL,
    TLNO VARCHAR(50),
    GENDER VARCHAR(1),
    DATE_OF_BIRTH DATE
);
---

--- DML(INSERT)
INSERT INTO MEMBER_PROFILE(MEMBER_ID, MEMBER_NAME, TLNO, GENDER, DATE_OF_BIRTH)
VALUES('jiho92@naver.com', '이지호', '01076432111', 'W', '1992-02-12'),
      ('jiyoon22@hotmail.com', '김지윤', '01032324117', 'W', '1992-02-22'),
      ('jihoon93@hanmail.net', '김지훈', '01023258688', 'M', '1993-02-23'),
      ('seoyeons@naver.com', '박서연', '01076482209', 'W', '1993-03-16'),
      ('yoonsy94@gmail.com', '윤서연', '', 'W', '1994-03-19');
---

--- DML(SELECT)
SELECT MEMBER_ID, MEMBER_NAME, GENDER, DATE_FORMAT(DATE_OF_BIRTH, '%Y-%m-%d') AS DATE_OF_BIRTH
FROM MEMBER_PROFILE
WHERE DATE_OF_BIRTH LIKE '%-03-%' AND GENDER = 'W' AND NOT TLNO IS NULL
ORDER BY MEMBER_ID ASC
---
