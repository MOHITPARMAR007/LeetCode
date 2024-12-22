# Write your MySQL query statement below
SELECT P.product_name , S.year , S.price 
From Sales AS S 
LEFT JOIN Product AS P
on S.product_id = P.product_id