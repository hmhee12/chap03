package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      System.out.println("************************************");
      System.out.println("HelloServlet.doGet()...");
      System.out.println("************************************");
      
      response.setContentType("text/html; charset=utf-8");
      PrintWriter out = response.getWriter();
      
      out.println("<!doctype.html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HelloServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("***************************<br>");
      out.println("HelloServlet.doGet()....<br>");
      out.println("***************************<br>");
      out.println("</body>");
      out.println("</html>");
   }

   }

