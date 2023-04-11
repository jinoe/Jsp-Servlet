package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class Nana extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		
		// response의 set~ 함수로 전달하는 데이터의 헤더 정보를 수정 할 수 있다.
//		response.setCharacterEncoding("UTF-8");
//		response.setContentType("text/html; charset=UTF-8");
		
		String cnt_ = request.getParameter("cnt");
		int cnt = 100;
		if(cnt_ != null && !cnt_.equals("")) {
			cnt = Integer.parseInt(cnt_);
		}
		PrintWriter out = response.getWriter();
		for(int i = 0; i<cnt; i++) {
			out.printf("%d : 안녕~!!<br/>", i+1);			
		}
	}
}
