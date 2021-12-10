USE QuanLySinhVien;
-- Hiển thị số lượng sinh viên ở từng nơi
select address, count(StudentID) as "Số lượng sv" from student group by address;

-- Tính điểm trung bình các môn học của mỗi học viên
select student.StudentID, student.StudentName, avg(Mark) as "Điểm trung bình" from mark 
inner join student on mark.studentId = student.studentId 
group by student.StudentID;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select student.StudentID, student.StudentName, avg(Mark) as "Điểm trung bình" from mark 
inner join student on mark.studentId = student.studentId 
group by student.StudentID having avg(Mark)>15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất
select student.StudentID, student.StudentName, avg(Mark) 
from mark 
inner join student on mark.studentId = student.studentId 
group by student.StudentID having avg(Mark) >= all (SELECT AVG(Mark) FROM Mark GROUP BY Mark.StudentId) ;

