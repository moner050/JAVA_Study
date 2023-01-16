-- 중복 제거하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59408

--- DDL
CREATE TABLE ANIMAL_INS (
                            ANIMAL_ID VARCHAR(255) PRIMARY KEY NOT NULL,
                            ANIMAL_TYPE VARCHAR(255) NOT NULL,
                            DATETIME DATETIME NOT NULL,
                            INTAKE_CONDITION VARCHAR(255) NOT NULL,
                            NAME VARCHAR(255),
                            SEX_UPON_INTAKE VARCHAR(255) NOT NULL
);
---

--- DML(INSERT)
INSERT INTO ANIMAL_INS(ANIMAL_ID, ANIMAL_TYPE, DATETIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE)
VALUES('A562649', '	Dog', '2014-03-20 18:06:00', 'Sick',  NULL, 'Spayed Female'),
      ('A412626', '	Dog', '2016-03-13 11:17:00', 'Normal', '*Sam', 'Neutered Male'),
      ('A563492', '	Dog', '2014-10-24 14:45:00', 'Normal', '*Sam', 'Neutered Male'),
      ('A513956', '	Dog', '2017-06-14 11:54:00', 'Normal', '*Sweetie', 'Spayed Female');
---


--- DML(SELECT)
SELECT COUNT(DISTINCT(NAME)) AS count
FROM ANIMAL_INS
WHERE NAME IS NOT NULL;
---