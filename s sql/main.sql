#Q1. Write a query to fetch the EmpFname from the EmployeeInfo table in upper case and use the ALIAS name as EmpName.
SELECT UPPER(EmpFname)  AS EmpName  FROM EmployeeInfo

#Q2. Write a query to fetch the number of employees working in the department ‘HR’.
SELECT COUNT(*)  FROM EmployeeInfo WHERE Department = HR

#Q3. Write a query to get the current date.
SELECT SYSTDATE();

# Q4. Write a query to retrieve the first four characters of  EmpLname from the EmployeeInfo table.
SELECT SUBSTRING(EmpLname, 1, 4) FROM EmployeeInfo;

#Write a query to fetch only the place name(string before brackets) from the Address column of EmployeeInfo table.
SELECT LEFT(EmpLname, LOCATE('(', EmpLname) )FROM EmployeeInfo;

#Write a query to create a new table that consists of data and structure copied from the other table.
CREATE TABLE NewTable AS SELECT * FROM EmployeeInfo;
#Write q query to find all the employees whose salary is between 50000 to 100000.
SELECT *  FROM EmployeePosition WHERE  BETWEEN '50000' AND '100000';
#Write a query to find the names of employees that begin with ‘S’
SELECT * FROM EmployeeInfo WHERE EmpFname LIKE 'S%';
#Write a query to fetch top N records.

#Write a query to retrieve the EmpFname and EmpLname in a single column as “FullName”. The first name and the last name must be separated with space.

SELECT CONCAT(EmpFname, ' ', EmpLname) AS 'FullName' FROM EmployeeInfo ;

#Q11. Write a query find number of employees whose DOB is between 02/05/1970 to 31/12/1975 and are grouped according to gender