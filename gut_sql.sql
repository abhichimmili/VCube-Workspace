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

#23/09/2026-Day10
# 1. Show the department with the highest payroll.
select deptno,max(sal) from emp group by deptno;

#24/09/2026-Day11
# 1.Create procedure to transfer employees between departments with rollback handling
delimiter $
CREATE PROCEDURE `transfer_employees`(in p_empno int,
										in p_from_dept int,
                                        in p_to_dept int)
BEGIN
	declare v_current_dept int;
    declare v_dept_exists int;
    
    -- Rollback automatically if any SQL error occurs
    declare exit handler for sqlexception
    begin
		rollback;
        select 'Transfer failed. Transaction rolled back.' AS message;
	end;
    
    start transaction;
     -- Check whether employee exists and get current department
    select deptno into v_current_dept from emp where empno = p_empno for update;
    
     -- Check employee's current department
    if v_current_dept is null then
        signal sqlstate '45000'
        set message_text = 'Employee does not exist';
    end if;
    
    -- Check whether employee belongs to source department
    IF v_current_dept <> p_from_dept THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT =
        'Employee does not belong to the source department';
    END IF;
    
    -- Check whether target department exists
    SELECT COUNT(*) INTO v_dept_exists FROM deptment WHERE deptno = p_to_dept;

    IF v_dept_exists = 0 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Target department does not exist';
    END IF;

    -- Transfer employee
    UPDATE emp SET deptno = p_to_dept WHERE empno = p_empno;
    COMMIT;
    SELECT 'Employee transferred successfully' AS message;
END $
delimiter ;

CALL transfer_employees(7369, 20, 30);

#25/09/2026-Day12
#Find the second-highest salary without using MAX() twice
select distinct sal from emp order by sal desc limit 1 offset 1;

#28/09/2026-Day13
#Generate a department-wise employee count report.
SELECT d.deptno, d.dname, d.loc, COUNT(e.empno) AS employee_count FROM deptment d LEFT JOIN emp e ON d.deptno = e.deptno
    GROUP BY d.deptno, d.dname, d.loc ORDER BY d.deptno;
 
#06/10/2026-Day18 
#1. Identify duplicate job roles within departments.
select deptno,job,COUNT(*) AS employee_count from emp group by deptno,job having count(*)>1;

#2. Find employees whose salary rank is less than 5.
select * from (select empno,ename,sal, dense_rank()  over(ORDER BY sal DESC) AS salary_rank from emp)as ranked_sal where salary_rank<5 ;
