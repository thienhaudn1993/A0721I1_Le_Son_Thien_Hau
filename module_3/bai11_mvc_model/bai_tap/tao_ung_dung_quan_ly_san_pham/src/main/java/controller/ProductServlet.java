package controller;

import model.Product;
import service.ProductService;
import service.ProductServiceImpl;
import sun.rmi.server.Dispatcher;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.Customizer;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createProduct(request,response);
                break;
            case "edit":
                editProduct(request,response);
                break;
            case "delete":
                deleteProduct(request,response);
                break;
            case "searchByname":
                break;
            default:
                break;
        }
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product = this.productService.findById(id);
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("delete_product.jsp");
        }
        try {
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        int quatity = Integer.parseInt(request.getParameter("quatity"));
        String status = request.getParameter("status");
        RequestDispatcher dispatcher;
        Product product = this.productService.findById(id);
        if (product == null) {
            dispatcher = request.getRequestDispatcher("/error-404.jsp");
        }
        else {
            product.setName(name);
            product.setBrand(brand);
            product.setQuatity(quatity);
            product.setStatus(status);
            this.productService.update(id, product);
            request.setAttribute("product", product);
            request.setAttribute("message", "Update Success");
            dispatcher = request.getRequestDispatcher("/edit_product.jsp");
            try {
                dispatcher.forward(request, response);
            }catch (ServletException e) {
                e.printStackTrace();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

//

        request.setAttribute("message", "Update Product Success");
        try{
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void createProduct(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        int quatity = Integer.parseInt(request.getParameter("quatity"));
        String status = request.getParameter("status");
        int id = (int)(Math.random() * 10000);
        Product product = new Product(id,name,brand,quatity,status);
        this.productService.save(product);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create_product.jsp");
        request.setAttribute("message", "New Product Success");
//        List<Product> productList = productService.findAll();
//        request.setAttribute("productList",productList);
        try{
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createByForm(request,response);
                break;
            case "edit":
                editByForm(request,response);
                break;
            case "delete":
                deleteByForm(request,response);
                break;
            case "view":
                break;
            case "searchByname":
                break;
            default:
                listProducts(request, response);
                break;
        }
    }

    private void deleteByForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product = this.productService.findById(id);
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("delete_product.jsp");
        }
        try {
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void editByForm(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        RequestDispatcher dispatcher;
        Product product = this.productService.findById(id);
        if (product == null) {
            dispatcher = request.getRequestDispatcher("error-404.jsp");
        }else {
            request.setAttribute("product", product);
            dispatcher = request.getRequestDispatcher("edit_product.jsp");
        }
        try {
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createByForm(HttpServletRequest request, HttpServletResponse response) {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/create_product.jsp");
        try {
            dispatcher.forward(request, response);
        }catch (ServletException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response) {
        List<Product> products = this.productService.findAll();
        request.setAttribute("productList", products);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/list.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

