package com.jialei;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class HelloServerlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        PrintWriter out = response.getWriter();
        out.println("Print my works");
        out.flush();
        out.close();
    }

}