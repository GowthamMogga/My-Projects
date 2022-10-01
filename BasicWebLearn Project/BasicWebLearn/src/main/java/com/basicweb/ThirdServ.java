package com.basicweb;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/ThirdServ")
public class ThirdServ extends GenericServlet{
	

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("service method from third servlet");
		PrintWriter pw = arg1.getWriter();
		pw.print("Message from third servlet program, Thank you for contacting");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy method from third servlet");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init method from third servlet");
	}

}
