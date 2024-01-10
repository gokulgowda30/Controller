package Sevlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Sevlet.dao.Servlet_dao;
import Sevlet.dto.Servlet_dto;

@WebServlet("/controler")
public class Controller extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//	super.doPost(req, resp);
		String id = req.getParameter("sid");
		int cid=Integer.parseInt(id);
		String name = req.getParameter("sname");
		String mobile = req.getParameter("sno");
		long cmobile=Long.parseLong(mobile);
		String dob = req.getParameter("sdob");
		String mail = req.getParameter("smail");
		String gender = req.getParameter("gender");
		String country = req.getParameter("country");
		String ac = req.getParameter("checkbox");
		
		System.out.println(id + " " + name + " " + " " + mobile + " " + " " + dob + " " + mail + " " + gender + " "
				+ country + " " + ac);
		Servlet_dto dto1=new Servlet_dto();
		dto1.setID(cid);
		dto1.setName(name);
		dto1.setMobile(cmobile);
		dto1.setDOB(dob);
		dto1.setEmail(mail);
		dto1.setGender(gender);
		dto1.setCountry(country);
		dto1.setCheckbox(ac);
		Servlet_dao dao1=new Servlet_dao();
		String s1=dao1.insert(dto1);
		resp.getWriter().print(s1);
	}
}
