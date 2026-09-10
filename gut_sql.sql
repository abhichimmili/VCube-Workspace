#09/09/2026
# 1.Display the highest-paid employee from each department.
select * from (select *,dense_rank() over(partition by deptno order by sal) as payRank from emp ) as e where e.payRank=1;

# 2.Find names whose first letter is capital.
select ename from emp where substring(ename,1,1)  between 'A' and 'Z';
select ename from emp where ename REGEXP "^[A-Z]";

#10/09/2026
# 1.Display employees in the custom order of job roles.
select * from emp order by field(job,'CLERK','MANAGER','SALESMAN');

# 2.Retrieve employees whose salary exceeds the company average salary.