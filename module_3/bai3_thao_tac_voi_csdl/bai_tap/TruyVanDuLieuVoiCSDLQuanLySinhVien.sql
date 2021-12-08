use QuanLySinhVien;
-- Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự ‘h’
select * from student where StudentName like "H%";

-- Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
select * from class where StartDate like "%-12-%";

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
select * from subject where Credit between 3 and 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
set SQL_SAFE_UPDATES=0;
update student set ClassID ="2" where StudentName = "Hung";
set SQL_SAFE_UPDATES=1;
select * from student;

-- Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
select student.StudentName, subject.SubName, mark.Mark from student 
inner join mark on student.StudentID = mark.StudentId
inner join subject on mark.SubID = subject.SubID order by Mark desc;
