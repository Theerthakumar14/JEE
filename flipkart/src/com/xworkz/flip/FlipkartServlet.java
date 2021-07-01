package com.xworkz.flip;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/amazon" ,loadOnStartup = 25, initParams={
	@WebInitParam(name="quality", value="good")
})

public class FlipkartServlet extends HttpServlet {
	public FlipkartServlet()
	{
		System.out.println("flipkart object is created");
	}
	private static final long serialVersionUID = 1L;

	



	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		
		ServletConfig config = getServletConfig();
		String parameter = config.getInitParameter("quality");
		
		ServletContext context = getServletContext();
		String parameter2 = context.getInitParameter("message");
		
		String userName= req.getParameter("userName");
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		String phoneNo= req.getParameter("phoneNo");
		

		PrintWriter writer = resp.getWriter();
		resp.setContentType("text/html");
		writer.print(" thank u for login amazon "+ userName + " " + parameter + " " +parameter2);
	}

}
