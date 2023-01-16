-- 동물의 아이디와 이름
-- https://school.programmers.co.kr/learn/courses/30/lessons/59403

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
VALUES('A365172', '	Dog', '2014-08-26 12:53:00', 'Normal', 'Diablo', 'Neutered Male'),
      ('A367012', '	Dog', '2015-09-16 09:06:00', 'Sick', 'Miller', 'Neutered Male'),
      ('A365302', '	Dog', '2017-01-08 16:34:00', 'Aged', 'Minnie', 'Spayed Female'),
      ('A381217', '	Dog', '2017-07-08 09:41:00', 'Sick', 'Cherokee', 'Neutered Male');
---

--- DML(SELECT)
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
ORDER BY ANIMAL_ID ASC;
---