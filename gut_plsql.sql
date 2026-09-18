#16/09/2026
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

#17/09/2026
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

