package controller;

import model.Student;
import service.IStudentService;
import service.impl.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "StudentServiceServlet", urlPatterns = {"/student"})
public class StudentServiceServlet extends HttpServlet {
    // trước interface, phía sau thì class ( ép kiểu ngầm định - theo cơ chế DI được học ở module 4)
    private IStudentService iStudentService = new StudentService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "create": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String gender = request.getParameter("gender");
                String grade = request.getParameter("grade");
                Student student = new Student(Integer.parseInt(id),name,dateOfBirth,Integer.parseInt(gender),Double.parseDouble(grade));
                if (iStudentService.createStudent(student)) {
                    request.setAttribute("msg", "Thêm mới thành công");
                    List<Student> studentList = iStudentService.findAll();
                    request.setAttribute("studentList", studentList);
                    request.getRequestDispatcher("/list_student.jsp").forward(request, response);
                }else {
                    request.setAttribute("msg", "Thêm mới thất bại");
                    request.getRequestDispatcher("/create_student.jsp").forward(request, response);
                }
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String grade = request.getParameter("grade");
                iStudentService.save(id,name,grade);
                response.sendRedirect("/student");
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String gender = request.getParameter("gender");
                String grade = request.getParameter("grade");
                Student student = new Student(Integer.parseInt(id),name,dateOfBirth,Integer.parseInt(gender),Double.parseDouble(grade));
                iStudentService.remove(student);
                request.setAttribute("msgDelete", "Xóa thành công");
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("studentList", studentList);
                request.getRequestDispatcher("/list_student.jsp").forward(request, response);
            }
            break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Student> studentList = iStudentService.findAll();
        // trả về trang phút 33
//        request.setAttribute("studentList", studentList);
//        request.getRequestDispatcher("/list_student.jsp").forward(request,response);
        // trang chúng ta cần hiển thị, foward chuyeenr hướng đến trang list_student kèm theo 1 cái list có tên studentList
        //Phut 54
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "delete" : {
                String id = request.getParameter("id");
                Student student = iStudentService.findById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("/delete_student.jsp").forward(request, response);
            }
            break;
            case "create" : {
                request.getRequestDispatcher("/create_student.jsp").forward(request,response);
                // phút 34_video bai 11
            }
            break;
            case "update" : {
                String id = request.getParameter("id");
                Student student = iStudentService.findById(id);
                request.setAttribute("student", student);
                request.getRequestDispatcher("/update_student.jsp").forward(request,response);
            }
            break;
            default: {
                List<Student> studentList = iStudentService.findAll();
                request.setAttribute("studentList", studentList);
                request.getRequestDispatcher("/list_student.jsp").forward(request,response);
            }
            break;
        }
    }
}
