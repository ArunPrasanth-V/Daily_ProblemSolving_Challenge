-- Problem No: 176 
-- link : https://leetcode.com/problems/second-highest-salary/

-- 1) solution

SELECT MAX(salary)AS SecondHighestSalary  FROM Employee 
WHERE salary NOT IN (SELECT MAX(salary) FROM Employee );

-- 2) solution by null is work instead it show empty

select max(salary) as "SecondHighestSalary" from Employee 
group by salary limit 1 offset 1;
