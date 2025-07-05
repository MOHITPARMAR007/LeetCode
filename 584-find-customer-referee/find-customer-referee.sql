# Write your MySQL query statement below
 #select name 
 #form Customer where referee_if != 2  OR referee_if IS NULL ;
select name 
from Customer 
where referee_id != 2 OR referee_id IS NULL;