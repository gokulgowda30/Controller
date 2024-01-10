package Sevlet.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sevlet.dao.Servlet_dao;
import Sevlet.dto.Servlet_dto;
@WebServlet("/fetchall123")
public class Fetchall extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	//Servlet_dao dao=new Servlet_dao();
	//Object msg=dao.fetchall();
	//resp.getWriter().print(msg);
	//PrintWriter out = resp.getWriter();
//	Servlet_dao dao = new Servlet_dao();
//    List<Servlet_dto> dataList = dao.fetchall();
//
//   
//    PrintWriter out = resp.getWriter();
//
//    
//    out.println("<html><head><title>Data Table</title></head><body>");
//    out.println("<h2>Data Table</h2>");
//    out.println("<table border=\"1\"><tr><th>ID</th><th>Name</th><th>Mobile</th><th>DOB</th><th>Email</th><th>Gender</th><th>Country</th><th>Checkbox</th></tr>");
//
//    
//    for (Servlet_dto dto : dataList) {
//        out.println("<tr>");
//        out.println("<td>" + dto.getID() + "</td>");
//        out.println("<td>" + dto.getName() + "</td>");
//        out.println("<td>" + dto.getMobile() + "</td>");
//        out.println("<td>" + dto.getDOB() + "</td>");
//        out.println("<td>" + dto.getEmail() + "</td>");
//        out.println("<td>" + dto.getGender() + "</td>");
//        out.println("<td>" + dto.getCountry() + "</td>");
//        out.println("<td>" + dto.getCheckbox() + "</td>");
//        out.println("</tr>");
//    }
//
//    
//    out.println("</table></body></html>");

    Servlet_dao dao=new Servlet_dao();
    List<Servlet_dto> list=dao.fetchall();
    
    req.setAttribute("objects", list);
    
    RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
    rd.forward(req, resp);
	
    }
    
}

