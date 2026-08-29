# Write your MySQL query statement below
SELECT a.NAME,a.bonus FROM 
(SELECT e.empId, e.name, b.bonus FROM EMPLOYEE e LEFT JOIN Bonus b ON e.empId=b.empId ) a
where a.bonus IS NULL OR a.bonus<1000;
