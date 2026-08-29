# Write your MySQL query statement below
SELECT DISTINCT p.PROJECT_ID ,
ROUND(AVG(e.EXPERIENCE_YEARS),2) AS AVERAGE_YEARS 
FROM Project p INNER JOIN EMPLOYEE e ON p.employee_id=e.employee_id GROUP BY p.project_id;