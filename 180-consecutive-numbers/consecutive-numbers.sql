# Write your MySQL query statement below
#SELECT NUM AS ConsecutiveNums FROM LOGS GROUP BY NUM HAVING COUNT(NUM)>=3;
#SELECT l.NUM AS ConsecutiveNums FROM LOGS l JOIN LOGS g ON l.ID=g.IDGROUP BY g.NUM HAVING COUNT(g.NUM)>=3;
SELECT DISTINCT l.num AS ConsecutiveNums
FROM Logs l
JOIN Logs l2
    ON l.id + 1 = l2.id
JOIN Logs l3
    ON l.id + 2 = l3.id
WHERE l.num = l2.num
  AND l.num = l3.num;