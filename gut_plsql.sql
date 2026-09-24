#16/09/2026-Day5
# 1.Create function to return salary percentile
DELIMITER $
CREATE FUNCTION `sal_percentile`(salary int) RETURNS double
    DETERMINISTIC
BEGIN
	declare percent double default 0.0;
	declare total_sum double default 0;
    select sum(sal) into total_sum from emp;
    set percent=(salary/total_sum);
RETURN percent;
END
$ delimiter ;
select *, sal_percentile(sal) as percentile from emp;
select *,sal/(select sum(sal) from emp) as percentile from emp;

#17/09/2026-Day6
# 1. Create cursor logic to detect duplicate salaries
delimiter $
create procedure dup_sal_()
begin 
	declare done boolean default false;
    declare element int;
    declare dup varchar(500);
    declare prevElement int default 0;
    declare cur cursor for select sal from emp order by sal;
    DECLARE CONTINUE HANDLER FOR NOT FOUND
        SET done = TRUE;
    set dup='';
    open cur;
	salaries: loop 
		fetch cur into element;
        if done then
			leave salaries;
		end if;
        if prevElement=element then
        set dup=concat(element,' ',dup);
        end if;
		set prevElement=element;
	end loop;
    close cur;
    select dup;
end
$ delimiter ;

call dup_sal();

#18/09/2026-Day7
# 1.Create a function to encrypt employee names dynamically. Using Simple Caesar Cipher Encryption
delimiter $
CREATE  FUNCTION `encypt_name`(ename varchar(30),shift int) RETURNS varchar(30)
    DETERMINISTIC
BEGIN
	declare i int default 1;
	declare res varchar(30) default '';
    declare ch char(1);
    declare ascii_val int;
    while i<=length(ename) do
		set ch=substring(ename,i,1);
		set ascii_val=ascii(ch);
        if ch regexp '[A-Z]' then
			set res=concat(res,char(mod(ascii_val-ascii('A')+shift,26)+ascii('A')));
		elseif ch regexp '[a-z]' then
			set res=concat(res,char(mod(ascii_val-ascii('a')+shift,26)+ascii('a')));
		else 
			set res=concat(res,ch);
		end if;
        set i=i+1;
	end while;
RETURN res;
END
$
delimiter ;
select encypt_name('ABHI',2);

#21/09/2026-Day8
# 1. Create cursor logic to compare manager vs employee salaries
delimiter $
CREATE PROCEDURE `emp_mgr_sal`()
BEGIN
	declare done boolean default false;
    DECLARE empSal INT;
    DECLARE mgrSal INT;
    declare cur cursor for select e1.sal,e2.sal from emp e1 join emp e2 on e1.mgr=e2.empno;
    declare continue handler for not found set done=true;
    open cur;
    salaries:loop 
		fetch cur into empSal,mgrSal;
        if done then
			leave salaries;
		end if;
        if empSal>mgrSal then
			select 'Employee Salary is higher' as msg;
		elseif empSal<mgrSal then
			select 'Manager Salary is higher' as msg;
		else
			select 'Both have equal salary' as msg;
		end if;
	end loop;
    close cur;
END $
delimiter ;
call emp_mgr_sal();

#22/09/2026-Day9
# 1.Create function to return optimized bonus percentage.
#Logic:
#Salary < 2000 → 20%
#Salary 2000–5000 → 10%
#Salary > 5000 → 5%

delimiter $
CREATE FUNCTION `bonus_percentage`(salary int) RETURNS int
    DETERMINISTIC
BEGIN
	declare bonus double default 0.0;
    case 
		when salary <2000 then
			set bonus=20;
		when salary between 2000 and 5000 then
			set bonus=10;
		when salary>5000 then
			set bonus=5;
		end case;
RETURN bonus;
END
$
delimiter ;

 select bonus_percentage(6000);
