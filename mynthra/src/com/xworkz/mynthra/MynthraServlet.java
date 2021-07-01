package com.xworkz.mynthra;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mynthra")
public class MynthraServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String product = req.getParameter("product");
		String qty = req.getParameter("qty");
		String price = req.getParameter("price");
		
		req.setAttribute("name", product);
		req.setAttribute("Qty", qty);
		req.setAttribute("amount", price);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("MynthraKart");
		dispatcher.forward(req, resp);
	}
	

	

}
