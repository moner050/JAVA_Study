-- 보호소에서 중성화한 동물
-- https://school.programmers.co.kr/learn/courses/30/lessons/59045

SELECT AI.ANIMAL_ID, AI.ANIMAL_TYPE, AI.NAME
FROM ANIMAL_INS AI
         LEFT JOIN ANIMAL_OUTS AO
                   USING (ANIMAL_ID)
WHERE AI.SEX_UPON_INTAKE IN ('Intact Male', 'Intact Female') AND AO.SEX_UPON_OUTCOME IN ('Neutered Male', 'Spayed Female')
ORDER BY AI.ANIMAL_ID ASC;