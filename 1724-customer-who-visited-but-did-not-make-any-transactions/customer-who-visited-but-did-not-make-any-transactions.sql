# Write your MySQL query statement below
SELECT v.CUSTOMER_ID AS customer_id,
    COUNT(v.VISIT_ID) AS count_no_trans
    FROM VISITS v 
    LEFT JOIN TRANSACTIONS t
    ON v.VISIT_ID=t.VISIT_ID
    WHERE t.transaction_id IS NULL
    GROUP BY v.customer_id;