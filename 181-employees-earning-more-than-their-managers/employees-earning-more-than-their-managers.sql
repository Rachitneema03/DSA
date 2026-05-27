/* Write your PL/SQL query statement below */
select name as employee from employee e where e.salary > (select salary from employee m where m.id = e.managerId);