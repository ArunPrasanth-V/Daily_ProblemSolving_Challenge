 -- problem number : 177
 -- https://leetcode.com/problems/nth-highest-salary/
 
 
 SELECT DISTINCT salary  from Employee
      ORDER BY salary desc limit 1 OFFSET N
