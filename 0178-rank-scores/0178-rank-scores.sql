# Write your MySQL query statement below
select s1.score, count(s2.score) as "rank" from Scores s1, 
(select distinct score from Scores) s2 
where s1.score<=s2.score group by s1.id order by score desc;
