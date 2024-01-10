package Sevlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sevlet.dao.Servlet_dao;

@WebServlet("/delete321")
public class DeleteAll extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//	// TODO Auto-generated method stub
//	super.doGet(req, resp);
	Servlet_dao dao=new Servlet_dao();
	String msg=dao.deleteall();
	resp.getWriter().print(msg);
}
}
