package Sevlet.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sevlet.dao.Servlet_dao;
import Sevlet.dto.Servlet_dto;
@WebServlet("/delete123")
public class DeleteById extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doPost(req, resp);
		String id = req.getParameter("PK");
		int cid = Integer.parseInt(id);
		System.out.println(cid);
        
		Servlet_dao dao=new Servlet_dao();
		String d2=dao.delete(cid);
		//resp.getWriter().print(d2);
		List<Servlet_dto> d3=dao.fetchall();
		req.setAttribute("objects", d3);
		
		RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
		rd.forward(req, resp);
	}
}
