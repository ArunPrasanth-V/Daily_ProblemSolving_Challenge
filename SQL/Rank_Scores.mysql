-- problem.NO :178
-- link : https://leetcode.com/problems/rank-scores/

SELECT s2.score,
(SELECT count(DISTINCT(score)) from Scores s1 where s1.score>=s2.score)AS "rank"
from Scores s2 
order by s2.score DESC;
