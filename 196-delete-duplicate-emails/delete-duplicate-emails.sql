-- Write your PostgreSQL query statement below
DELETE from person p1 using person p2 where p1.email = p2.email AND p1.id > p2.id;