/**
   175. Combine Two Tables

   Table: Person

   +-------------+---------+
   | Column Name | Type    |
   +-------------+---------+
   | PersonId    | int     |
   | FirstName   | varchar |
   | LastName    | varchar |
   +-------------+---------+
   PersonId is the primary key column for this table.
   Table: Address

   +-------------+---------+
   | Column Name | Type    |
   +-------------+---------+
   | AddressId   | int     |
   | PersonId    | int     |
   | City        | varchar |
   | State       | varchar |
   +-------------+---------+
   AddressId is the primary key column for this table.


   Write a SQL query for a report that provides the following information for each person in the Person table, regardless if there is an address for each of those people:

   FirstName, LastName, City, State
 */

DROP TABLE IF EXISTS `Person`;
CREATE TABLE `Person` (
  `PersonId` int(10) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(20),
  `LastName` varchar(20),
  PRIMARY KEY (`PersonId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Person';

DROP TABLE IF EXISTS `Address`;
CREATE TABLE `Address` (
  `AddressId` int(10) NOT NULL AUTO_INCREMENT,
  `PersonId` int(10),
  `City` varchar(20),
  `State` varchar(20),
  PRIMARY KEY (`AddressId`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='Address';

INSERT INTO Person(`FirstName`, `LastName`)VALUES('aa', 'bb');
INSERT INTO Person(`FirstName`, `LastName`)VALUES('mm', 'nn');

INSERT INTO Address(`PersonId`, `City`, `State`)VALUES(1, 'tt', 'ss');
INSERT INTO Address(`PersonId`, `City`, `State`)VALUES(1, 'xx', 'yy');

SELECT p.FirstName, p.LastName, a.City, a.State
FROM Person p LEFT JOIN Address a ON (p.PersonId = a.PersonId);

SELECT FirstName, LastName, City, State
FROM Person LEFT JOIN Address USING(PersonId);

