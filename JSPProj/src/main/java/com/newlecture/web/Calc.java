package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Calc")
public class Calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");
		
		int x = 100;
		int y = 100;
		if(!x_.equals("")) x = Integer.parseInt(x_);
		if(!y_.equals("")) y = Integer.parseInt(y_);
		
		PrintWriter out = response.getWriter();
		
		switch(request.getParameter("operator")) {
		case "add":
			out.printf("result: %d",x+y);
			break;
		case "sub":
			out.printf("result: %d",x-y);
			break;
		}		
	}

}
