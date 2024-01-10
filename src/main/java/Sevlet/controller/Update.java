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
@WebServlet("/updatejsp")
public class Update extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int id=Integer.parseInt(req.getParameter("id"));
	String name=req.getParameter("name");
	long mobile=Long.parseLong(req.getParameter("mobile"));
	String dob=req.getParameter("dob");
	String email=req.getParameter("email");
	String gender=req.getParameter("gender");
	String country=req.getParameter("country");
	String chechbox=req.getParameter("checkbox");
	
	System.out.println(id+" "+name+" "+mobile+" "+dob+" "+email+" "+gender+" "+country+" "+chechbox);
	
	Servlet_dto dto= new Servlet_dto();
	dto.setID(id);
	dto.setName(name);
	dto.setMobile(mobile);
	dto.setDOB(dob);
	dto.setEmail(email);
	dto.setGender(gender);
	dto.setCountry(country);
	dto.setCheckbox(chechbox);
	
	Servlet_dao dao=new Servlet_dao();
	dao.update(dto);
	
	
    List<Servlet_dto> list=dao.fetchall();
    
    req.setAttribute("objects", list);
    
    RequestDispatcher rd=req.getRequestDispatcher("download.jsp");
    rd.forward(req, resp);
	
	
}
}
