package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/notice-reg")
public class notice extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		request.setCharacterEncoding("UTF-8"); // request body 데이터의 인코딩 방식 설정
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		PrintWriter out = response.getWriter();
		

		out.printf(title+"<br>");
		out.printf(content);
	}
}
