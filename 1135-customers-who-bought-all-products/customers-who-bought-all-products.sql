# Write your MySQL query statement below
#SELECT COUNT(DISTINCT PRODUCT_KEY) FROM CUSTOMER GROUP BY CUSTOMER_ID;
SELECT customer_id
FROM Customer
GROUP BY customer_id
HAVING COUNT(DISTINCT product_key) =
       (SELECT COUNT(*) FROM Product);