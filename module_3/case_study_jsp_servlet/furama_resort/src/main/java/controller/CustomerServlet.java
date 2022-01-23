package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {"/customer"})
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
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
                String customerIdCard = request.getParameter("customerIdCard");
                String phone = request.getParameter("phone");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                String customerTypeId = request.getParameter("customerTypeId");
                Customer customer= new Customer(Integer.parseInt(id),name,dateOfBirth,Integer.parseInt(gender),customerIdCard,phone,email,address,Integer.parseInt(customerTypeId));
                if (iCustomerService.createCustomer(customer)) {
                    request.setAttribute("msg","Thêm mới thành công");
                    List<Customer> customerList = iCustomerService.findAll();
                    request.setAttribute("customerList", customerList);
                    request.getRequestDispatcher("/list_customer.jsp").forward(request,response);
                }else {
                    request.setAttribute("msg", " Thêm mới thất bại");
                    request.getRequestDispatcher("/create_customer.jsp").forward(request,response);
                }
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                if (iCustomerService.remove(id)) {
                    request.setAttribute("msgDelete","xóa thành công");
                    List<Customer> customerList = iCustomerService.findAll();
                    request.setAttribute("customerList", customerList);
                    request.getRequestDispatcher("/list_customer.jsp").forward(request,response);
                }
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                String name = request.getParameter("name");
                String email = request.getParameter("email");
                String address = request.getParameter("address");
                iCustomerService.save(id, name, email, address);
                response.sendRedirect("/customer");
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
                String name = request.getParameter("searchByName");
                List<Customer> customerList = iCustomerService.findByName(name);
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/list_customer.jsp").forward(request,response);

            }
            break;
            case "create": {
                request.getRequestDispatcher("/create_customer.jsp").forward(request,response);
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                Customer customer = iCustomerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("/delete_customer.jsp").forward(request, response);
            }
            break;
            case "update": {
                String id = request.getParameter("id");
                Customer customer = iCustomerService.findById(id);
                request.setAttribute("customer", customer);
                request.getRequestDispatcher("/update_customer.jsp").forward(request, response);
            }
            break;
            default: {
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/list_customer.jsp").forward(request, response);
            }
        }
    }
}
