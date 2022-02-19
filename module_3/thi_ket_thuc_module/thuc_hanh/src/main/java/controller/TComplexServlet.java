package controller;

import model.TComplex;
import service.ITComplexService;
import service.impl.TComplexService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "TComplexServlet", urlPatterns = "/complex")
public class TComplexServlet extends HttpServlet {
    private ITComplexService itComplexService = new TComplexService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {
                String maMB = request.getParameter("maMB");
                String dienTich = request.getParameter("dienTich");
                String trangThai = request.getParameter("trangThai");
                String tang = request.getParameter("tang");
                String loaiVanPhong = request.getParameter("loaiVanPhong");
                String gia = request.getParameter("gia");
                String ngayBatDau = request.getParameter("ngayBatDau");
                String ngayKetThuc = request.getParameter("ngayKetThuc");
                TComplex tComplex = new TComplex(maMB, Double.parseDouble(dienTich), trangThai, Integer.parseInt(tang), loaiVanPhong, Double.parseDouble(gia), ngayBatDau, ngayKetThuc);
                if (itComplexService.createComplex(tComplex)) {
                    request.setAttribute("msg", "Thêm mới thành công");
                    List<TComplex> tComplexList = itComplexService.findAll();
                    request.setAttribute("tComplexList", tComplexList);
                    request.getRequestDispatcher("/list.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", " Thêm mới thất bại");
                    request.getRequestDispatcher("/create.jsp").forward(request, response);
                }

            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                if (itComplexService.remove(id)) {
                    request.setAttribute("msgDelete","xóa thành công");
                    List<TComplex> tComplexList = itComplexService.findAll();
                    request.setAttribute("tComplexList",tComplexList);
                    request.getRequestDispatcher("/list.jsp").forward(request, response);
                }
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
            case "create": {
                request.getRequestDispatcher("/create.jsp").forward(request,response);
            }
            break;
            case "delete": {
                String id = request.getParameter("id");
                TComplex tComplex = itComplexService.findById(id);
                request.setAttribute("tComplex",tComplex);
                request.getRequestDispatcher("/delete.jsp").forward(request, response);
            }
            break;
            case "search": {
                List<TComplex> tComplexList = new ArrayList<>();
                String loaiVanPhong = request.getParameter("loaiVanPhong");
                String tang = request.getParameter("tang");
                tComplexList = itComplexService.search(loaiVanPhong,tang);
                request.setAttribute("tComplexList",tComplexList);
                request.getRequestDispatcher("/list.jsp").forward(request, response);
            }
            break;
            default: {
                List<TComplex> tComplexList = itComplexService.findAll();
                request.setAttribute("tComplexList",tComplexList);
                request.getRequestDispatcher("/list.jsp").forward(request, response);
            }
        }
    }
}
