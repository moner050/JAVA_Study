-- 모든 레코드 조회하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59034

--- DDL
CREATE TABLE ANIMAL_INS (
    ANIMAL_ID VARCHAR(255) PRIMARY KEY NOT NULL,
    ANIMAL_TYPE VARCHAR(255) NOT NULL,
    DATATIME DATETIME NOT NULL,
    INTAKE_CONDITION VARCHAR(255) NOT NULL,
    NAME VARCHAR(255),
    SEX_UPON_INTAKE VARCHAR(255) NOT NULL
);
---

--- DML(INSERT)
INSERT INTO ANIMAL_INS(ANIMAL_ID, ANIMAL_TYPE, DATATIME, INTAKE_CONDITION, NAME, SEX_UPON_INTAKE)
VALUES('A349996', '	Cat', '2018-01-22 14:32:00', 'Normal', 'Sugar', 'Neutered Male'),
      ('A350276', '	Cat', '2017-08-13 13:50:00', 'Normal', 'Jewel', 'Spayed Female'),
      ('A350375', '	Cat', '2017-03-06 15:01:00', 'Normal', 'Meo', 'Neutered Male'),
      ('A352555', '	Dog', '2014-08-08 04:20:00', 'Normal', 'Harley', 'Spayed Female');
---

--- DML(SELECT)
SELECT *
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;
---