-- 최댓값 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/59415

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
VALUES('A399552', '	Dog', '2013-10-14 15:38:00', 'Normal', 'Jack', 'Neutered Male'),
      ('A379998', '	Dog', '2013-10-23 11:42:00', 'Normal', 'Disciple', 'Intact Male'),
      ('A370852', '	Dog', '2013-11-03 15:04:00', 'Normal', 'Katie', 'Spayed Female'),
      ('A403564', '	Dog', '2013-11-18 17:03:00', 'Normal', 'Anna', 'Spayed Female');
---

--- DML(SELECT)
SELECT MAX(DATETIME) AS TIME
FROM ANIMAL_INS;
---