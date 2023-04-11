package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add")
public class Add extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String x_ = request.getParameter("x");
		String y_ = request.getParameter("y");

		int x = 100;
		int y = 200;
		if((x_ != null && !x_.equals("")) && (y_ != null && !y_.equals(""))){
			try {
			x = Integer.parseInt(x_);
			y = Integer.parseInt(y_);
			} catch (NumberFormatException e) {
				out.print("잘못된 형식");
				return;
			}
			out.printf("계산결과: %d",x+y);
		}
		
	}
}
