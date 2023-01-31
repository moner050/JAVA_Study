-- 이름에 el이 들어가는 동물 찾기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59047

--- DDL
CREATE TABLE ANIMAL_INS (
    ANIMAL_ID VARCHAR(255) PRIMARY KEY,
    ANIMAL_TYPE VARCHAR(255) NOT NULL,
    DATETIME DATETIME NOT NULL,
    INTAKE_CONDITION VARCHAR(255) NOT NULL,
    NAME VARCHAR(255),
    SEX_UPON_INTAKE VARCHAR(255) NOT NULL
);
---

--- DML(INSERT)
INSERT INTO ANIMAL_INS(ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE)
VALUES('A355753', 'Dog', '2015-09-10 13:14:00', 'Normal', 'Elijah', 'Neutered Male'),
      ('A352872', 'Dog', '2015-07-09 17:51:00', 'Aged', 'Peanutbutter', 'Neutered Male'),
      ('A353259', 'Dog', '2016-05-08 12:57:00', 'Injured', 'Bj', 'Neutered Male'),
      ('A373219', 'Cat', '2014-07-29 11:43:00', 'Normal', 'Ella', 'Spayed Female'),
      ('A382192', 'Dog', '2015-03-13 13:14:00', 'Normal', 'Maxwell 2', 'Intact Male');
---

--- DML(SELECT)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NAME LIKE '%el%' AND ANIMAL_TYPE = 'Dog'
ORDER BY NAME ASC
---