use QuanLySinhVien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
-- cach 1:
select * from subject order by credit desc limit 1;
-- cach 2:


-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
-- cach 1:
select * from subject inner join mark on mark.subID = subject.subID order by Mark desc limit 1;
-- cach 2:
select subject.SubId, subject.SubName, subject.Status, max(mark) from mark inner join subject on mark.subId = subject.subId group by subject.SubId;


-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.StudentID, student.StudentName, student.Address, student.Phone, avg(Mark) from student inner join mark on student.StudentID = mark.StudentID group by student.StudentID order by avg(Mark) desc;
