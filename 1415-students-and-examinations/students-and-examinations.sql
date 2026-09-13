# Write your MySQL query statement below
SELECT st.student_id , st.student_name , s.subject_name ,
    COUNT(e.STUDENT_ID) AS attended_exams 
        FROM STUDENTS st 
    CROSS JOIN SUBJECTS s 
    LEFT JOIN EXAMINATIONS e 
        ON st.student_id = e.student_id
        AND s.subject_name = e.subject_name 

GROUP BY st.STUDENT_ID,st.STUDENT_NAME,s.SUBJECT_NAME
ORDER BY st.student_id, st.student_name, s.subject_name;
