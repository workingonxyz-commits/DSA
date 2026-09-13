# Write your MySQL query statement below
SELECT o.unique_id,e.NAME FROM EMPLOYEES e LEFT JOIN EMPLOYEEUNI o 
ON e.ID=o.ID ;