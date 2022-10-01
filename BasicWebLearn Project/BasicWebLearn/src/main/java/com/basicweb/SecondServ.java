package com.basicweb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

@WebServlet("/SecondServ")
public class SecondServ extends HttpServlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method from second servlet");
	}

	

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		System.out.println("get servlet info method from second servlet");
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method from second servlet");
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method from second servlet");
		PrintWriter pw = arg1.getWriter();
		pw.print("Message from second servlet program, Thank you for contacting");
		
	}



	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		System.out.println("get servlet config from second servlet");
		return null;
	}

}
