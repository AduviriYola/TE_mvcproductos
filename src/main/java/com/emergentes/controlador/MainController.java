package com.emergentes.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MainController", urlPatterns = {"/MainController"})
public class MainController extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession ses = request.getSession();
       if (ses.getAttibute("listaprod") == null){
           ArrayList<Productos> listaux = new ArrayList<Productos>();
           ses.setAttribute("listaprod", listaax);
       }
       ArrayList<Productos> lista =(ArrayList<Productos>) ses.getAttribute("listaprod");
       String op = request.getParameter("op");
       String opcion = (op != null) ? request.getParameter("op") : "view";
       
       Productos obj1 =new Productos();
       int id, pos;
   
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

}
