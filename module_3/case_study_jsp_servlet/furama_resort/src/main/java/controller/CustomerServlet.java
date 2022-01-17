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

@WebServlet(name = "CustomerServlet", urlPatterns = "/customer")
public class CustomerServlet extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "create": {

                break;
            }
            case "delete": {

                break;
            }
            case "update": {

                break;
            }
            default:{

            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action="";
        }
        switch (action) {
            case "create": {

                break;
            }
            case "delete": {

                break;
            }
            case "update": {

                break;
            }
            default:{
                List<Customer> customerList = iCustomerService.findAll();
                request.setAttribute("customerList", customerList);
                request.getRequestDispatcher("/list_customer.jsp").forward(request,response);

            }
            break;
        }
    }
}
