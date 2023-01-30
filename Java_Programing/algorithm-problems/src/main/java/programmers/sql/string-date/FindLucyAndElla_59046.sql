-- 루시와 엘라 찾기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59046

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
VALUES('A373219', 'Cat', '2014-07-29 11:43:00', 'Normal', 'Ella', 'Spayed Female'),
      ('A377750', 'Dog', '2017-10-25 17:17:00', 'Normal', 'Lucy', 'Spayed Female'),
      ('A353259', 'Dog', '2016-05-08 12:57:00', 'Injured', 'Bj', 'Neutered Male'),
      ('A354540', 'Cat', '2014-12-11 11:48:00', 'Normal', 'Tux', 'Neutered Male'),
      ('A354597', 'Cat', '2014-05-02 12:16:00', 'Normal', 'Ariel', 'Spayed Female');
---

--- DML(SELECT)
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME = 'Lucy' OR NAME = 'Ella' OR NAME = 'Pickle' OR NAME = 'Rogan' OR NAME = 'Sabrina' OR NAME = 'Mitty'
---