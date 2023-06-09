package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Calc2")
public class Calc2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext application = request.getServletContext();
		HttpSession session =  request.getSession();
		
		
		String v_ = request.getParameter("v");
		
		int v = 0;
		if(!v_.equals("")) v = Integer.parseInt(v_);
		
		PrintWriter out = response.getWriter();
		
		String op = request.getParameter("operator");
		
		if(op.equals("=")) {
//			int x = (Integer) application.getAttribute("value");
//			int x = (Integer) session.getAttribute("value");
			Cookie[] cookies = request.getCookies();
			int x = 0;
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("value")) {
					x = Integer.parseInt(cookie.getValue());
					break;
				}
			}
			
			int y = v;

//			String operator = (String) application.getAttribute("op");
//			String operator = (String) session.getAttribute("op");
			String operator = "";
			for(Cookie cookie:cookies) {
				if(cookie.getName().equals("op")) {
					operator = cookie.getValue();
					break;
				}
			}
			if(operator.equals("+")) {
				out.printf("result is %d",x+y);
			} else {
				out.printf("result is %d",x-y);
			}
			
		} else {
//			application.setAttribute("value", v);
//			application.setAttribute("op", op);
//			session.setAttribute("value", v);
//			session.setAttribute("op", op);
			
			Cookie valueCookie = new Cookie("value", String.valueOf(v));
			Cookie opCookie = new Cookie("op", op);
			
			valueCookie.setPath("/");
			valueCookie.setMaxAge(24*60*60);

			opCookie.setPath("/");
			opCookie.setMaxAge(24*60*60);

			response.addCookie(valueCookie);
			response.addCookie(opCookie);
			
			response.sendRedirect("calc2.html");
		}
		
	} 	

}
