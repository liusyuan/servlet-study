package com.netease.server.example.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {
	
	@Override
	public void destroy() {
		System.out.println("destroy method");
		super.destroy();
	}
	@Override
	
	public void init() throws ServletException {
		System.out.println("init method");
		super.init();
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		System.out.println("service method");
		super.service(arg0, arg1);
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet method");
		PrintWriter pw=resp.getWriter();
		pw.println("hello world");
		pw.close();
	}



}
