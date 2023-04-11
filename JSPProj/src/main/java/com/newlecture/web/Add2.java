package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.imageio.plugins.tiff.ExifGPSTagSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/add2")
public class Add2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		String[] numbers = request.getParameterValues("num");
		
		int sum = 0;
		for(String num : numbers) {
			int i = Integer.parseInt(num);
			sum += i;
		}
		
		out.printf("result is %d",sum);
	}
}
