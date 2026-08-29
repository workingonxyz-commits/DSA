# Write your MySQL query statement below
SELECT e.NAME AS EMPLOYEE FROM EMPLOYEE e INNER JOIN EMPLOYEE f ON e.managerId=f.id where e.salary>f.salary; 
#SELECT * FROM EMPLOYEE e INNER JOIN EMPLOYEE f ON e.managerId=f.id