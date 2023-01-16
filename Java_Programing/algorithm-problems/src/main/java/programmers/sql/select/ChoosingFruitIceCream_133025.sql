-- 과일로 만든 아이스크림 고르기
-- https://school.programmers.co.kr/learn/courses/30/lessons/133025

--- DDL
CREATE TABLE FIRST_HALF (
    SHIPMENT_ID INTEGER NOT NULL PRIMARY KEY,
    FLAVOR VARCHAR(255) NOT NULL,
    TOTAL_ORDER INTEGER NOT NULL
);

CREATE TABLE ICECREAM_INFO (
    FLAVOR VARCHAR(255) NOT NULL PRIMARY KEY,
    INGREDIENT_TYPE VARCHAR(255) NOT NULL
);
---

--- DML(INSERT)
INSERT INTO FIRST_HALF(SHIPMENT_ID, FLAVOR, TOTAL_ORDER)
VALUES(101, 'chocolate', 3200),
      (102, 'vanilla', 2800),
      (103, 'mint_chocolate', 1700),
      (104, 'caramel', 2600),
      (105, 'white_chocolate', 3100),
      (106, 'peach', 2450),
      (107, 'watermelon', 2150),
      (108, 'mango', 2900),
      (109, 'strawberry', 3100),
      (110, 'melon', 2150),
      (111, 'orange', 2900),
      (112, 'pineapple', 2900);

INSERT INTO ICECREAM_INFO(FLAVOR, INGREDIENT_TYPE)
VALUES('chocolate', 'sugar_based'),
      ('vanilla', 'sugar_based'),
      ('mint_chocolate', 'sugar_based'),
      ('caramel', 'sugar_based'),
      ('white_chocolate', 'sugar_based'),
      ('peach', 'fruit_based'),
      ('watermelon', 'fruit_based'),
      ('mango', 'fruit_based'),
      ('strawberry', 'fruit_based'),
      ('melon', 'fruit_based'),
      ('orange', 'fruit_based'),
      ('pineapple', 'fruit_based');
---

--- DML(SELECT)
SELECT A.FLAVOR
FROM FIRST_HALF AS A
JOIN ICECREAM_INFO AS B
ON A.FLAVOR = B.FLAVOR
WHERE A.TOTAL_ORDER > 3000 AND B.INGREDIENT_TYPE = 'fruit_based'
ORDER BY TOTAL_ORDER DESC;
---