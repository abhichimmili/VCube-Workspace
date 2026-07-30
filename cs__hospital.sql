# Hospital Management System
CREATE TABLE Patient(
	patient_id INT auto_increment PRIMARY KEY,
    patient_name varchar(50),
    department varchar(30),
    priority_status enum('Critical','High','Medium','Low')
)auto_increment=100;

insert into Patient 
(patient_name,department,priority_status)  
values
('Rahul','Cardiology','Critical'),
('Sneha','Neurology','High'),
('Kiran','Orthopedics','Medium'),
('Anjali','ENT','Low'),
('Aman','Cardiology','Low'),
('Priya','Neurology','Medium');

select distinct department from patient;

select * from patient order by patient_name asc;

select * from patient order by department,patient_name;

select * from patient order by field(priority_status, 'Critical','High','Medium','Low',priority_status);
