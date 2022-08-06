package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutServlet extends HttpServlet{

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException{
		
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		Cookie c [] = request.getCookies();
		if (c==null) {
			pw.println("PLEASE LOGIN FIRST");
		}
	}
}
