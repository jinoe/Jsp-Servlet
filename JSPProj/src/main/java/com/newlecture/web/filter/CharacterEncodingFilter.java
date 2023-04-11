package com.newlecture.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class CharacterEncodingFilter implements Filter {
	
	@Override
	public void doFilter(ServletRequest request, 
			ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// 사전작업 doFilter 이전
		System.out.println("before filter");
		request.setCharacterEncoding("UTF-8"); // request body 데이터의 인코딩 방식 설정
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		
		chain.doFilter(request, response); // 제어 설정

		// 사후작업 doFilter 이후
		System.out.println("after filter");
	}

}
