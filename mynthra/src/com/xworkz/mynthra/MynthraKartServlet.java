package com.xworkz.mynthra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/MynthraKart")
public class MynthraKartServlet extends HttpServlet{
	
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = (String)req.getAttribute("name");
		String Qty = (String)req.getAttribute("Qty");
		String amount = (String)req.getAttribute("amount");
		
		double totalSum=Double.parseDouble(amount)*Double.parseDouble(Qty);
		
		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print("product Details" + name  +totalSum );
	}

}
