# Write your MySQL query statement below
 # select * form Products where low_fats == 'y' AND recyclable == 'y';
 SELECT product_id
FROM Products 
WHERE low_fats = 'y' AND recyclable = 'y';
