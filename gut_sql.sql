use batch74;
#09/09/2026-Day1
# 1.Display the highest-paid employee from each department.
select * from (select *,dense_rank() over(partition by deptno order by sal) as payRank from emp ) as e where e.payRank=1;

# 2.Find names whose first letter is capital.
select ename from emp where substring(ename,1,1)  between 'A' and 'Z';
select ename from emp where ename REGEXP "^[A-Z]";

#10/09/2026-Day2
# 1.Display employees in the custom order of job roles.
select * from emp order by field(job,'CLERK','MANAGER','SALESMAN',job);

# 2.Retrieve employees whose salary exceeds the company average salary.
select * from emp where sal>(select avg(sal) from emp);

#11/09/2026-Day3
# 1. List employees earning more than their managers.
select * from emp e1 where e1.sal >(select e2.sal from emp e2 where e1.mgr=e2.empno );
select * from emp e1 join emp e2 on e1.mgr=e2.empno where e1.sal>e2.sal;

# 2. Display Employees Whose Salary Rank is Between 3 and 5
select * from (select *,dense_rank() over(order by sal) as salary from emp ) as ranking where ranking.salary between 3 and 5;
with salary_rank as(
	select * from (select *,dense_rank() over(order by sal) as salary from emp ) as ranking where ranking.salary between 3 and 5
)select * from salary_rank where salary between 3 and 5;

#15/09/2026-Day4
# 1. Show employees whose commsision exceeds their salary
select * from emp where  comm>sal;

#16/09/2026-Day5
# 1. Display the employee who receives the Nth highest salary?
# without using limit
select * from (select *,dense_rank() over(order by sal) as rnk from emp ) as temp where rnk=N;
with rnk_table as (
	select *,dense_rank() over(order by sal) as rnk from emp 
)select * from rnk_table where rnk=4;

# using limit;
select * from (select *,dense_rank() over(order by sal) as rnk from emp ) as temp limit 1,1;

#17/09/2026-Day6
# 1. Calculate the difference between the highest and lowest salaries.
select max(sal)-min(sal) as diff from emp;

#18/09/2026-Day7
# 1.Display the highest-paid employee from each department.
select * from emp e where sal=(select max(sal) as high from emp where e.deptno=deptno);

#21/09/2026-Day8
# 1.List departments whose average salary exceeds the company average salary.
select deptno from emp group by deptno having avg(sal)>(select avg(sal) from emp);


#22/09/2026-Day9
# 1.Show departments where total salary expenditure is greater than 10000.
select deptno,sum(sal) from emp group by deptno having sum(sal)>10000;
