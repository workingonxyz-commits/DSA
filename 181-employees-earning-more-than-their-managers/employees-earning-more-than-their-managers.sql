# Write your MySQL query statement below
#SELECT e.NAME AS EMPLOYEE FROM EMPLOYEE e INNER JOIN EMPLOYEE f ON e.managerId=f.id where e.salary>f.salary; 
#SELECT * FROM EMPLOYEE e INNER JOIN EMPLOYEE f ON e.managerId=f.id
SELECT e.NAME AS Employee  FROM EMPLOYEE e JOIN EMPLOYEE f ON e.MANAGERID=f.ID 
WHERE e.SALARY>f.SALARY;