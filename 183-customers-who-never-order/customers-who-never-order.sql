# Write your MySQL query statement below
SELECT c.NAME AS Customers FROM CUSTOMERS c LEFT JOIN ORDERS o ON c.id=o.customerId WHERE o.customerId IS NULL;