-- 조건에 맞는 회원수 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/131535

--- DDL
CREATE TABLE USER_INFO (
    USER_ID INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    GENDER TINIINT(1),
    AGE INTEGER,
    JOINED DATE NOT NULL
);
---

--- DML(INSERT)
INSERT INTO USER_INFO(GENDER, AGE, JOINED)
VALUES(1, 26, '2021-10-05'),
      (0, , '2021-11-25'),
      (1, 22, '2021-11-30'),
      (0, 31, '2021-12-03'),
      (0, 28, '2021-12-16'),
      (1, 24, '2022-01-03'),
      (1, , '2022-01-09');
---

--- DML(SELECT)
SELECT COUNT(AGE) AS USERS
FROM USER_INFO
WHERE AGE >= 20 AND AGE <= 29 AND JOINED LIKE '%2021-%';
---