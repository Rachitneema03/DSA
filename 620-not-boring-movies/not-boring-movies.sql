-- Write your PostgreSQL query statement below
Select * from cinema c where c.id % 2 != 0 AND c.description != 'boring' order by rating DESC;