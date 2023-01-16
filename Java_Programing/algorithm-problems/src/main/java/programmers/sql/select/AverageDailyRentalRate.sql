-- 평균 일일 대여 요금 구하기
-- https://school.programmers.co.kr/learn/courses/30/lessons/151136

--- DDL
CREATE TABLE CAR_RENTAL_COMPANY_CAR (
    CAR_ID  INTEGER PRIMARY KEY AUTO_INCREMENT NOT NULL,
    CAR_TYPE VARCHER(255) NOT NULL,
    DAILY_FEE   INTEGER NOT NULL,
    OPTIONS     VARCHAR(255) NOT NULL
);
---

--- DML(INSERT)
INSERT INTO car_rental_company_car(CAR_TYPE, DAILY_FEE, OPTIONS)
VALUES('세단', 16000, '가죽시트,열선시트,후방카메라'),
      ('SUV', 14000, '스마트키,네비게이션,열선시트'),
      ('SUV', 22000, '주차감지센서,후방카메라,가죽시트')
---

--- DML
SELECT ROUND(AVG(DAILY_FEE), 0) AS AVERAGE_FEE
FROM CAR_RENTAL_COMPANY_CAR
WHERE CAR_TYPE = 'SUV'
---