use batch74;
select * from emp;

#30/06/2026
# 1. Display employees sorted by age from oldest to youngest
# 2. Display the top 3 highest-paid employees.

# 01/07/2026
# 1.Display employees in the order: SALESMAN, MANAGER, CLERK.
select * from emp order by field( job , "SALESMAN","MANAGER","CLERK");
select * from emp order by field(job , 'MANAGER','ANALYST','CLERK') = 0 , field(job,'MANAGER','ANALYST','CLERK');
select * from emp order by field(job , 'MANAGER','ANALYST','CLERK', job );

select * from emp order by field(sal, 5000,3000);
select * from emp order by field(deptno, 30, 40 , 20 , 30,  20);

# 2.Display employee names in the order: SMITH, ALLEN, KING.
SELECT ename,
FIELD(ename,'SMITH','ALLEN','KING')
FROM emp;
select * from emp order by field(ename , "ALLEN", "SMITH", "KING") = 0 , field(ename ,"KING", "SMITH", "ALLEN");

# 02/07/2026
# 1. Find all employees whose salary is greater than 50,000.
select * from emp where sal>1100;

# 2.Display all employees who do not have a manager.
select * from emp where job <> "MANAGER";

# 03/07/2026
# 1.Display the first 5 employees whose salary is less than or equal to 2000 , ordered by salary in ascending order 
select * from emp where sal<=2000 order by sal asc limit 0,5 ;

# 2.Display the First 2 Clerks , Ordered Alphabetically by name of the employee
select * from emp where job='clerk' order by ename asc limit 0,2;

# 06/07/2026
# 1.Write a query to display all employees whose name starts with 'R'.
# 2.Write a query to display all employees whose name starts with 'N' and ends with 'a'.
# 3.Write a query to display all employees whose third letter is 'h'.

# 07/07/2026
#1.Display all employees whose names contain "ra".
#2.Display employees whose names contain exactly 5 characters.

# 08/07/2026
# 1.Display the total salary of employees whose salary is greater than 30000, grouped by department using ROLLUP.
select sum(sal) as Salary from emp group by deptno with rollup having sum(sal)>3000;

# 2.Display the maximum salary grouped by department and job using ROLLUP.
select deptno,job, max(sal) from emp group by deptno , job with rollup ;

# 3.Display the average salary of employees whose names end with 'A', grouped by department number, using ROLLUP.
select deptno,avg(sal) from emp where ename like '%t' group by deptno with rollup;

# 09/07/2026
# 1.Display departments whose average salary is greater than 5000.
select avg(sal) as average from emp group by deptno having avg(sal) >500;

# 2.Display departments having fewer than 4 employees.
select deptno from emp group by deptno having count(*) >4;

# 10/07/2026
# 1.Display employees who earn exactly the average salary.
select  * from emp where sal = (select avg(sal) from emp);

# 2.Display employees whose manager is NULL, without directly using IS NULL in the outer query (use a subquery)
select * from emp where empno= (select empno from emp where mgr is null );

select * from emp where empno = (select empno from emp order by sal desc limit 1,1);
select * from emp;
select sal from emp order by sal desc;

# 3.Display employees whose salary is equal to the second highest salary.
select max(sal) from emp where sal <> (select max(sal) from emp);

# 13/07/2026
# 1.Display employees earning the highest salary in each department.
select max(sal) from emp group by deptno;

# 2.Display employees earning the second lowest salary
select min(sal) from emp where sal >(select min(sal) from emp);

# 3.Display employees who earn the same salary as another employee. 
select sal from emp where sal =(select sal from emp); -- todo

# 14/07/2026
# 1.Write a query to display employees hired first in each department?.
select  * from emp as e where hiredate in (select min(hiredate) from emp group by deptno);
select  * from emp as e where hiredate = (select min(hiredate) from emp where deptno = e.deptno);

SHOW COLUMNS FROM dept;

# 2.Write a query to display employees working in departments located in NEW YORK or CHICAGO?(Use ANY)
select * from emp where deptno in (select deptno from deptment where loc in ('new york','chicago'));

# 3.Display employees whose salary is greater than the average salary of their department.
select * from emp as e1 where sal > (select avg(sal) from emp as e2 where e2.deptno = e1.deptno);

select ename,(select dname from deptment where deptment.deptno=emp.deptno)as dname,
(select loc from deptment where deptment.deptno=emp.deptno)as loc from emp ;

#15/07/2026
# 1.Write a query to display employee name, department name, and department location?
select ename,deptment.dname,deptment.loc from emp inner join deptment on emp.deptno=deptment.deptno;

# 2.Write a query to display all employees working in the SALES department
select * from emp where deptno =(select deptno from deptment where dname ='SALES');

# 16/07/2026
# 1. Display employee name and department name
# 2. Display employee name, salary, and department name for employees whose salary is between 1500 and 3000.
# 3. Display employee name, department name, and location for employees whose name starts with S.
# 4. Display departments that have more than 3 employees
# 5. Display employee name, job, and department name for employees whose job is MANAGER

# 20/07/2026
# 1.Display all departments and list the names of managers working in each department. Include departments without managers
select d.deptno,d.dname,d.loc,e.mgr,m.ename from deptment d 
left outer join emp e on d.deptno =e.deptno 
left outer join emp m on e.mgr=m.empno;

# 2.Display departments that have exactly one employee.
select d.deptno,d.dname from deptment d join emp e 
on d.deptno=e.deptno group by d.deptno,d.dname having count(e.empno) =1;

# 3.Display departments with no employees or only one employee.
select d.deptno,d.dname,loc from deptment d join emp e 
on d.deptno=e.deptno group by d.deptno,d.dname having count(e.empno) <=1;

# 4.Display department names and the average salary of employees in each department. Include departments with no employees
select d.deptno,d.dname,loc,avg(e.sal) as salary from deptment d 
left join emp e on d.deptno=e.deptno group by d.deptno,d.dname;

#21/07/2026
# 1.Display all departments, including those with no employees, but show only employees whose salary is greater than 2000.
select * from deptment d left join emp e 
on d.deptno=e.deptno and e.sal>2000;

# 2.Display departments that have no employees.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno,d.dname having count(e.empno)<1;

# 3.Display the department with the highest number of employees.
select d.deptno,d.dname,loc,count(e.empno) from deptment d left join emp e on d.deptno=e.deptno 
group by d.deptno,d.dname order by count(e.empno) desc limit 0,1;

# 4.Display all departments along with the highest-paid employee in each department.
select d.deptno,d.dname,loc,max(e.sal) from deptment d left join emp e on d.deptno=e.deptno 
group by d.deptno,d.dname;

# 5.Display departments where all employees earn more than 1500.
select * from deptment d join emp e 
on d.deptno=e.deptno and e.sal>1500;

# 6.Display departments that have exactly one employee.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno,d.dname having count(e.empno)=1;

# 7.Display departments where the average salary is greater than 2500.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno,d.dname having avg(e.sal)>2500;

# 8.Display departments that do not have any managers (JOB <> 'MANAGER').
select distinct d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno and e.job<>'MANAGER';

# 9.Display departments where no employee has a commission
select distinct d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno,d.dname having count(e.comm)=0;

#22/07/2026
# 1.Display departments where all employees have the same job.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno having count(distinct e.job)=1;

# 2.Display departments where no employee earns less than the department's average salary.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno having min(e.sal)>= avg(e.sal);

# 3.Display the department(s) with the lowest average salary.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno  having  ROUND(AVG(sal),2)=
( select MIN(ROUND(salary,2))
from ( select avg(sal) as salary from emp group by deptno) as result);

# 4.Display departments that have more employees than the SALES department.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno group by d.deptno having count(*)>(
select count(*) from emp where deptno=(select deptno from deptment where dname='SALES'));

# 5.Display departments where exactly two employees earn more than 3000.
select d.deptno,d.dname,loc from deptment d left join emp e on d.deptno=e.deptno where d.deptno=(
select deptno from emp group by deptno having sum(sal>3000)=1);

#23/07/2026
# 1.Display all department numbers from both the EMP and DEPT tables without duplicate
select deptno from emp union select deptno from deptment;

# 2.Display employee names and department names with a new column called TYPE showing 'Employee' or 'Department'.
select ename as 'Name','Employee' as 'TYPE' from emp union all
select dname as 'Name','Department' as 'TYPE' from deptment;

# 3.Display all department numbers from EMP and DEPT, then sort the result in ascending order.
select * from emp;
select deptno from emp union
select deptno from deptment order by deptno desc;

# 4.Display employee names hired before 01-JAN-1982 and employee names whose salary is greater than 2500 using UNION.
select * from emp where hiredate<'1982-01-01'
union select * from emp where sal>2500;

#24/07/2026
# 1.Display the names of employees who work in the 'SALES' department
select ename from emp where deptno = (select deptno from deptment where dname='SALES');
select ename from emp e join deptment d on e.deptno=d.deptno where d.dname='SALES';

# 2.Display employees who belong to departments that exist in the Department table
select * from emp e where exists(select 1 from deptment d where d.deptno=e.deptno);
select * from emp where deptno in(select deptno from deptment);

# 3.Display the employee ID and employee name for all employees.
select empno,ename from emp;

# 4.Display the top 10 highest-paid employees.
select * from emp order by sal desc limit 0,10;

# 27/07/2026
# 1.Create a view to display employee name, department number, and salary
create view employeeView as
select e.ename,e.deptno,d.dname,e.sal from emp e inner join deptment d on e.deptno=d.deptno;

# 2.Create a composite index on (deptno, salary )
create index dept_sal_index on emp(deptno,sal);

# 3.Create a view to display employee names and salaries.
create view empNamesSal as
select ename,sal from emp;

# 4.Create a view to display employees working in department 10.
create view empDept10 as
select empno,ename,hiredate,sal from emp where deptno=10;

# 28/07/2026
# 1.Find the second highest salary in each department using window functions.
select * from (select *,dense_rank() over(order by sal desc) as rowNum from emp) as res where rowNum=2;

# 2.Find the third highest salary in each department.
select * from (select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp) as res where rowNum=3;

# 3.Display employee names with their rank based on salary.
select ename,dense_rank() over(order by sal desc) as rankNum from emp;

# 29/07/2026
# 1.Write an SQL query to display the previous employee's salary using the LAG() function.
select *,lag(sal) over() as prevSal from emp;

# 2.Write an SQL query to display the next employee's salary using the LEAD() function.
select *,lead(sal) over() as nextSal from emp;

# 3.Write an SQL query to display the lowest and highest salary in each department using the FIRST_VALUE() and LAST_VALUE() functions.
select *,first_value(sal) over(partition by deptno order by sal desc) as highest,
last_value(sal) over(partition by deptno order by sal desc rows between unbounded preceding and unbounded following) as lowest from emp;


# 30/07/2026
# 1.Display employees whose salary is greater than 2000 using a CTE.
with employeeDetails as (
 select * from emp where sal>2000
) select * from employeeDetails;

# 2.Find the highest paid employee in each department using a CTE.
with employeeSalDetails as (
select max(sal) as maxSal from emp group by deptno
) select e.ename,e.deptno,e.sal from emp e join employeeSalDetails as es on e.sal=es.maxSal order by deptno;

# 3.Display employee name,department name,and salary using a CTE and a join.
with empDetails as(
select e.ename,d.dname,sal from emp e inner join deptment d on e.deptno=d.deptno
)select * from empDetails;

# 4.Display the toal salary paid in each department.
with totalSalPaid as(
select deptno,sum(sal) as 'Total Salary' from emp group by deptno
) select * from totalSalPaid;

# 31/07/2026
# 1.Display the second highest salary in each department
with salDetails as(
	select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp
)select * from salDetails where rowNum=2;
select * from (select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp) as res where rowNum=2;

# 2.Count the number of the employees in each department
select deptno,count(*) from emp group by deptno ;

# 3.Display all employees belonging to the IT department using a CTE
with ITEmp as (
	select deptno from deptment where dname='IT'
) select * from emp as e join ITEmp as it on e.deptno=it.deptno;
select * from deptment;

# 4. Find the highest-paid employee in each department using window function
with salDetails as(
	select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp
)select * from salDetails where rowNum=1;
select * from (select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp) as res where rowNum=1;

#3/8/2026
# 1.
select * from (select *,dense_rank() over(partition by deptno order by sal desc) as rowNum from emp) as res where rowNum<=3;

# 2.
#CREATE PROCEDURE `update_deptno`(in eNo int,in dNo int)
#BEGIN
#   update emp set deptno=dNo where empno=eNo;
#END
call update_deptno(7521,20);

# 5/08/2026
# 1.1. Create a stored procedure that accepts a department number as input. The procedure should retrieve all employees working in the specified department and categorize them based on their salary using the following criteria:
##Excellent – Salary greater than or equal to 5000
##Good – Salary between 3000 and 4999
##Needs Improvement – Salary less than 3000

#CREATE DEFINER=`root`@`localhost` PROCEDURE `sal_category`(in salary int,out category varchar(20))
#BEGIN
#	if salary>= 5000 then
#		set category='Excellent';
#	elseif salary>=3000 then
#		set category='Good';
#	else 
#		set category='Needs Improvement';
#     end if;
#END
call sal_category(2000,@category);
select @category  as Categry;

# 2. Create a stored procedure that accepts the following input parameters: Department Number and Salary Increment Percentage

#CREATE DEFINER=`root`@`localhost` PROCEDURE `sal_increment`(in dNo int,in percentage int)
#BEGIN
#	update emp set sal=sal+(sal*(percentage/100)) where deptno=dNo;
#    select * from emp where deptno=dNo;
#END
set autocommit =0;
rollback;
select * from emp;
call sal_increment(10,15);

select new_function();
select emp_earnings(7844);

select getSalaryGrade(7844);

select e.empno,e.ename as Employee ,e.sal as 'Emp Sal',m.ename as 'Manager',m.sal as'Manager Sal' 
from emp e join emp m on e.mgr=m.empno where e.sal>m.sal;

select e.empno,e.ename as Employee ,e.sal as 'Emp Sal',esalgrad.grade as 'Emp Sal Grade',
m.ename as 'Manager',m.sal as 'Manager Sal' ,msalgrad.grade as 'Manager Sal Grade'
from emp e join salgrade as esalgrad on e.sal between losal and hisal 
join 
emp m join salgrade as msalgrad on m.sal between losal and hisal 
on e.mgr=m.empno where esalgrad.grade>msalgrad.grade;

#27/08/2026
#1.
create table customers(
	customer_id int auto_increment primary key,
    name varchar(120) not null,
    email varchar(100) unique not null,
    created_at timestamp default current_timestamp
);

create table products(
	product_id int auto_increment primary key,
    name varchar(120) not null,
    price decimal(10,2) not null check(price>=0),
    stock_quantity int not null check(stock_quantity>=0) default 1
);
create table orders(
	order_id int auto_increment primary key,
    customer_id int not null,
    order_status varchar(25) default 'Pending' check(order_status in('Pending','Completed','Cancelled')),
    created_at timestamp default current_timestamp,
    foreign key (customer_id) references customers(customer_id)
);

create table order_items(
	item_id int auto_increment primary key,
    product_id int not null,
    order_id int not null,
    quantity int not null check(quantity>0),
    unit_price decimal(10,2),
    total_price decimal(10,2),
    foreign key (order_id) references orders(order_id),
    foreign key (product_id) references products(product_id)
);

create table order_audit(
	audit_id int auto_increment primary key,
    order_id int not null,
    old_status varchar(20),
    new_status varchar(20),
    changed_at timestamp default current_timestamp
);

#
DELIMITER //
create trigger trg_order_items_before_insert
before insert on order_items
for each row
begin 
	declare v_stock int;
    declare v_price decimal(10,2);
    
    select stock_quantity ,price into v_stock,v_price
    from products
    where product_id = new.product_id;
    
    if v_stock<new.quantity then
		signal sqlstate '45000'
        set message_text ="Insufficient stock for this product.";
	end if;
    
    set new.unit_price = v_price;
    set new.total_price =v_price* new.quantity;
    
END //
DELIMITER ;

#28/08/2026
#1.
with top_2_high_paid as(
	select *,row_number() over (partition by deptno order by sal desc) as rowNo from emp
)select * from top_2_high_paid where rowNo<=2;


#31/08/2026
#1.
with total_sal as (
	select deptno,sum(sal) as salary from emp group by deptno
) select * from total_sal where salary>5000;

#2.
with second_lowest_sal as(
	select *,dense_rank() over(partition by deptno order by sal desc) as rowNo from emp
) select * from second_lowest_sal where rowNo=2;


#01/09/2026
select empno,ename,deptno,sal,dense_rank() over (order by sal desc) as ranking from emp;

#02/09/2026
with gtr_than_avg_sal as(
	select * from emp as e1 where sal > (select avg(sal) from emp as e2 where e2.deptno=e1.deptno group by deptno)
)
, less_than_max_sal as(
	select * from gtr_than_avg_sal as ga where sal > (select max(sal) from emp as e2 where e2.deptno=ga.deptno group by deptno)
), mgr_earns_less_sal as(
	select * from less_than_max_sal as lm where sal > (select sal from emp as e2 where lm.mgr=e2.empno)
)select * from mgr_earns_less_sal;

#03/09/2026
call emp_dept_name(7369,@dept);
select @dept;

call even_or_odd(0,@res);
select @res;