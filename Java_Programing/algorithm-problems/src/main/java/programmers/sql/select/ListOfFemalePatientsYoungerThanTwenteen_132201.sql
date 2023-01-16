-- 12세 이하인 여자 환자 목록 출력하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/132201

--- DDL
CREATE TABLE PATIENT (
    PT_NO VARCHAR(10) NOT NULL PRIMARY KEY,
    PT_NAME VARCHAR(20) NOT NULL,
    GEND_CD VARCHAR(1) NOT NULL,
    AGE INTEGER NOT NULL,
    TLNO VARCHAR(50)
);
---

--- DML(INSERT)
INSERT INTO PATIENT(PT_NO, PT_NAME, GEND_CD, AGE, TLNO)
VALUES('PT22000003', '브라운', 'M', 18, '01031246641'),
      ('PT22000004', '크롱', 'M', 7, ''),
      ('PT22000006', '뽀뽀', 'W', 8, ''),
      ('PT22000009', '한나', 'W', 12, '01032323117'),
      ('PT22000012', '뿡뿡이', 'M', 5, ''),
      ('PT22000013', '크리스', 'M', 30, '01059341192'),
      ('PT22000014', '토프', 'W', 22, '01039458213'),
      ('PT22000018', '안나', 'W', 11, ''),
      ('PT22000019', '바라', 'W', 10, '01079068799'),
      ('PT22000021', '릴로', 'W', 33, '01023290767');
---

--- DML(SELECT)
SELECT PT_NAME, PT_NO, GEND_CD, AGE, IFNULL(TLNO, 'NONE') AS TLNO
FROM PATIENT
WHERE AGE <= 12 AND GEND_CD = 'W'
ORDER BY AGE DESC, PT_NAME ASC
---