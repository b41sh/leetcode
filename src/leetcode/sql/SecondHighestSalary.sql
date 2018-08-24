/**
   176. Second Highest Salary

   Write a SQL query to get the second highest salary from the Employee table.

   +----+--------+
   | Id | Salary |
   +----+--------+
   | 1  | 100    |
   | 2  | 200    |
   | 3  | 300    |
   +----+--------+
   For example, given the above Employee table, the query should return 200 as the second highest salary. If there is no second highest salary, then the query should return null.

   +---------------------+
   | SecondHighestSalary |
   +---------------------+
   | 200                 |
   +---------------------+
 */

DROP TABLE IF EXISTS `Employee`;
CREATE TABLE `Employee` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Salary` int(10),
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Employee';

INSERT INTO Employee(`Salary`)VALUES(100);
INSERT INTO Employee(`Salary`)VALUES(200);
INSERT INTO Employee(`Salary`)VALUES(300);


SELECT MAX(Salary) AS SecondHighestSalary
FROM Employee
WHERE Salary < (SELECT MAX(Salary) FROM Employee);

SELECT IFNULL(
  (SELECT DISTINCT Salary
   FROM Employee
   ORDER BY Salary DESC
   LIMIT 1 OFFSET 1),
NULL) AS SecondHighestSalary;
