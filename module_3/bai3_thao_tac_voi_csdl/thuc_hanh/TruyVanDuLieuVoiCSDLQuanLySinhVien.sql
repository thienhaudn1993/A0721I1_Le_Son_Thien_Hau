USE QuanLySinhVien;
SELECT *
FROM Student;

SELECT *
FROM Subject
WHERE Credit < 10;
SELECT * FROM STUDENT INNER JOIN CLASS ON STUDENT.ClassID = CLASS.ClassID;
-- Sử dụng câu lệnh Where C.ClassName ='A1' để hiển thị danh sách học viên lớp A1
SELECT * FROM STUDENT INNER JOIN CLASS ON STUDENT.ClassID = CLASS.ClassID WHERE ClassName = "A1";
-- Hiển thị tất cả các điểm đang có của học viên
SELECT STUDENT.StudentName,SUBJECT.SubName,MARK.Mark FROM SUBJECT INNER JOIN MARK on SUBJECT.SubID = MARK.SubID  INNER JOIN STUDENT ON STUDENT.studentID = Mark.StudentID;

-- Hiển thị điểm môn CF của các học viên
SELECT STUDENT.StudentName,SUBJECT.SubName,MARK.Mark FROM SUBJECT INNER JOIN MARK on SUBJECT.SubID = MARK.SubID  INNER JOIN STUDENT ON STUDENT.studentID = Mark.StudentID WHERE SubName = "CF";

