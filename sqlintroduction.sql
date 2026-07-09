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
