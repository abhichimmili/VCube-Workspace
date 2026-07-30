create database batch74;
use batch74;
create table student(
	sid int not null,
    stname varchar(50) not null,
    marks int
);

insert student values (1,'abhi',98);
insert into student(sid,stname) values (1,'suji');

select sid,stname,marks from student;

create table product(
	product_id int not null,
    product_name varchar(50) not null,
    price int
);

insert product values (12,'watch',565);
insert product values (15,'laptop',67640);
insert product values (17,'mobile',25450);
insert product values (10,'Ear Buds',1230);
insert product values (18,'Mac Book',175690);

select product_id,product_name,price from product;


create table course(
cid int primary key,
cname varchar(10) not null,
duration int not null,
fee int not null);

drop table trainee;
create table trainee(
sid int primary key,
stname varchar(50) not null,
marks int,
cid int,
foreign key(cid) references course(cid)
);

insert into course values(1,'jfs',6,32000),(2,'pfs',6,35000),(3,'devops',4,20000),(4,'testing',3,22000);

insert into trainee values(1,'abhi',98,1),(2,'suji',99,1);

select * from course;
select * from trainee;


create table Department(
dept_id int primary key,
dept_name varchar(30) not null,
location varchar(50) not null,
manager_name varchar(40) not null
);

drop table department;
drop table Employee;

create table Employee(
emp_id int primary key,
emp_name varchar(40) not null,
salary int,
dept_id int,
foreign key(dept_id) references Department(dept_id) );

insert into Department values(101,'Java','KPHB,Phase-1', 'Srikanth'),
(102,'SQL','KPHB,Phase-1', 'Vihwanath'),(103,'Frontned','KPHB,Phase-1', 'Vishwanath');

insert into Employee values(1,'Abhi',27000,101),(2,'Suji',27000,101),
(3,'Sandhya',27000,103),(4,'Mounika',27000,103),(5,'Supriya',27000,103),(6,'Asiya',27000,101);

select * from department;
select * from employee;

update Department set dept_id=201 where dept_id=101;
update Employee set dept_id=201 where dept_id=101;

drop table Employee;

create table Employee(
emp_id int primary key,
emp_name varchar(40) not null,
salary int,
dept_id int,
foreign key(dept_id) references Department(dept_id) 
on update cascade on delete cascade);


create table A(
id int primary key,
age int check(age>18));
insert into A values(1,18);

DROP TABLE IF EXISTS deptment;
CREATE TABLE deptment (
deptno int(2) not NULL,
dname varchar(20) not NULL,
loc varchar(20) not NULL,
primary key(deptno)
);

INSERT INTO deptment VALUES ('40','OPERATIONS','BOSTON');
INSERT INTO deptment VALUES ('10','ACCOUNTING','NEW YORK');
INSERT INTO deptment VALUES ('30','SALES','CHICAGO');
INSERT INTO deptment VALUES ('20','RESEARCH','DALLAS');

select * from deptment;
select * from emp;

DROP TABLE IF EXISTS emp;
CREATE TABLE emp (
empno int(6) NOT NULL,
ename varchar(10) not NULL,
job varchar(15) not NULL,
mgr int(6) default NULL,
hiredate date not NULL,
sal int(8) not NULL,
comm int(5) default NULL,
deptno int(2) not NULL,
primary key(empno),
foreign key(deptno)
references deptment(deptno)
);

INSERT INTO emp VALUES ('7934','MILLER','CLERK','7782','1982-01-23','1300.00',NULL,'10');
INSERT INTO emp VALUES ('7839','KING','PRESIDENT',NULL,'1981-11-17','5000.00',NULL,'10');
INSERT INTO emp VALUES ('7566','JONES','MANAGER','7839','1981-04-02','2975.00',NULL,'20');
INSERT INTO emp VALUES ('7844','TURNER','SALESMAN','7698','1981-09-08','1500.00','0.00','30');
INSERT INTO emp VALUES ('7788','SCOTT','ANALYST','7566','1982-12-09','3000.00',NULL,'20');
INSERT INTO emp VALUES ('7698','BLAKE','MANAGER','7839','1981-05-01','2850.00',NULL,'30');
INSERT INTO emp VALUES ('7902','FORD','ANALYST','7566','1981-12-03','3000.00',NULL,'20');
INSERT INTO emp VALUES ('7521','WARD','SALESMAN','7698','1981-02-22','1250.00','500.00','30');
INSERT INTO emp VALUES ('7876','ADAMS','CLERK','7788','1983-01-12','1100.00',NULL,'20');
INSERT INTO emp VALUES ('7654','MARTIN','SALESMAN','7698','1981-09-28','1250.00','1400.00','30');
INSERT INTO emp VALUES ('7900','JAMES','CLERK','7698','1981-12-03','950.00',NULL,'30');
INSERT INTO emp VALUES ('7369','SMITH','CLERK','7902','1980-12-17','800.00',NULL,'20');
INSERT INTO emp VALUES ('7499','ALLEN','SALESMAN','7698','1981-02-20','1600.00','300.00','30');
INSERT INTO emp VALUES ('7782','CLARK','MANAGER','7839','1981-06-09','2450.00',NULL,'10');
