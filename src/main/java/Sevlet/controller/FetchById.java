package Sevlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sevlet.dao.Servlet_dao;
import Sevlet.dto.Servlet_dto;
@WebServlet("/fetchbyid")
public class FetchById extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	String id=req.getParameter("id");
	int cid=Integer.parseInt(id);
	System.out.println(id);
	Servlet_dao dao=new Servlet_dao();
	Object msg=dao.fetchbyid(cid);
	resp.getWriter().print(msg);
}
}
