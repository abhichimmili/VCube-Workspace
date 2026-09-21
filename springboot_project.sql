SELECT user, host, plugin
FROM mysql.user
WHERE user = 'root';
ALTER USER 'root'@'localhost'
IDENTIFIED BY 'Admin@1289';
FLUSH PRIVILEGES;
select * from employees;