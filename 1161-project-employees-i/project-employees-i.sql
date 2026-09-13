# Write your MySQL query statement below
SELECT p.project_id , ROUND(AVG(e.EXPERIENCE_YEARS),2) AS average_years FROM PROJECT p JOIN EMPLOYEE e ON p.employee_id =e.employee_id 
GROUP BY p.project_id 
ORDER BY p.project_id;