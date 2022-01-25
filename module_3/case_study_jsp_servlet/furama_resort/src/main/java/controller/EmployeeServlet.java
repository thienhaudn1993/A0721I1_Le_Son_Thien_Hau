package controller;

import model.Customer;
import model.DevisionEmployee;
import model.Employee;
import service.IDevisionEmployeeService;
import service.IEmployeeService;
import service.impl.DevisionEmployeeService;
import service.impl.EmployeeService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "EmployeeServlet", urlPatterns = "/employee")
public class EmployeeServlet extends HttpServlet {
    private IEmployeeService iEmployeeService = new EmployeeService();
    private IDevisionEmployeeService iDevisionEmployeeService = new DevisionEmployeeService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "create": {
//                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String dateOfBirth = request.getParameter("dateOfBirth");
                String employeeIdCard = request.getParameter("employeeIdCard");
                String salary = request.getParameter("salary");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String positionId = request.getParameter("positionId");
                String educationDegreeId = request.getParameter("educationDegreeId");
                String divisionId = request.getParameter("divisionId");
                Employee employee = new Employee(name,dateOfBirth,employeeIdCard,Double.parseDouble(salary),phone,email,address,Integer.parseInt(positionId),Integer.parseInt(educationDegreeId),Integer.parseInt(divisionId));
                if (iEmployeeService.createEmployee(employee)) {
                    request.setAttribute("msg","Thêm mới thành công");
                    List<Employee> employeeList = iEmployeeService.findAll();
                    request.setAttribute("employeeList", employeeList);
                    request.getRequestDispatcher("/list_employee.jsp").forward(request,response);
                }else {
                    request.setAttribute("msg", " Thêm mới thất bại");
                    request.getRequestDispatcher("/create_employee.jsp").forward(request,response);
                }
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                if (iEmployeeService.remove(id)) {
                    request.setAttribute("msgDelete","xóa thành công");
                    List<Employee> employeeList = iEmployeeService.findAll();
                    request.setAttribute("employeeList", employeeList);
                    request.getRequestDispatcher("/list_employee.jsp").forward(request,response);
                }
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                iEmployeeService.save(id, name, email, address);
                response.sendRedirect("/employee");
            }
            break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "search": {
                List<Employee> employeeList = new ArrayList<>();
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String divisionId = request.getParameter("divisionId");
                employeeList = iEmployeeService.search(name,email,divisionId);



                if (employeeList.size()!=0) {
                    request.setAttribute("employeeList", employeeList);
                }
                else {
                    request.setAttribute("mess","không có dữ liệu nào tìm thấy");
                }
                List<DevisionEmployee> devisionEmployeeList = iDevisionEmployeeService.findByAll();
                request.setAttribute("devisionEmployeeList", devisionEmployeeList);
                request.getRequestDispatcher("/list_employee.jsp").forward(request, response);
            }
            break;
            case "create": {
                request.getRequestDispatcher("/create_employee.jsp").forward(request,response);
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                Employee employee = iEmployeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("/delete_employee.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                Employee employee = iEmployeeService.findById(id);
                request.setAttribute("employee", employee);
                request.getRequestDispatcher("/update_employee.jsp").forward(request, response);
            }
            break;
            default: {
                List<Employee> employeeList = iEmployeeService.findAll();
                request.setAttribute("employeeList", employeeList);
                List<DevisionEmployee> devisionEmployeeList = iDevisionEmployeeService.findByAll();
                request.setAttribute("devisionEmployeeList", devisionEmployeeList);
                request.getRequestDispatcher("/list_employee.jsp").forward(request, response);
            }
        }
    }
}
