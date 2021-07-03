package com.xworkz.railway;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet(urlPatterns="/tickets" , loadOnStartup=14)
public class RailwayServlet extends HttpServlet{

	public RailwayServlet() {
		System.out.println("RailwayServlet object is created");
	}
//	@Override
//	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//		String name = req.getParameter("passangerName");
//		String trainNo = req.getParameter("trainNo");
//		String source = req.getParameter("source");
//		String destination = req.getParameter("destination");
//		
//		
//		req.setAttribute("nm","Thank you" + name+ "Have a safe and happy journey");
//		RequestDispatcher dispatcher = req.getRequestDispatcher("railway_ticket.jsp");
//		dispatcher.forward(req, resp);
//	}
	
	

}
