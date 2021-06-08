use cititraining;

select * from share;

desc share;

create database wileyc112;
use wileyc112;

create table emp(
id int primary key,
name varchar(20),
department varchar(20),
designation varchar(20),
salary int);

insert into emp values(1,'Amit','IT','Associate',45000);
insert into emp values(2,'Bharti','Sales','Executive',25000);
insert into emp values(3,'Charu','Marketing','Manager',98000);
insert into emp values(4,'Deepti','IT','Sr. Associate',78000);
insert into emp values(5,'Esha','IT','Manager',135000);

select * from emp;
commit;