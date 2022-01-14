create database student_manager;
use student_manager;
create table student(
id int primary key auto_increment,
name varchar(255),
date_of_birth date,
gender int,
grade int
);
select * from student;
insert into student (id,name,date_of_birth,gender,grade) values(1,"hau","1993-06-15",1,8.0);
insert into student (name,date_of_birth,gender,grade) values
("hau2","1992-06-15",0,7.0),
("hau3","1993-04-15",1,6.0),
("hau4","1993-06-12",1,3.0),
("Phuong","1996-11-12",1,10.0),
("Dung","1993-06-15",1,8.0),
("hau1","1997-06-15",1,9.0);

