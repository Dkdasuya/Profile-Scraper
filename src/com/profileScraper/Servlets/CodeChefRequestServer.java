package com.profileScraper.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.profileScraper.Entities.CodeChefProfile;
import com.profileScraper.Scrapers.CodeChefScraper;

/**
 * Servlet implementation class CodeChefRequestServer
 */
@WebServlet("/CodeChef")
public class CodeChefRequestServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
	   String user_name = req.getParameter("username");
	   System.out.print(user_name);
	   CodeChefScraper scraper = new CodeChefScraper();
	   CodeChefProfile userProfile = null;
	   PrintWriter r = res.getWriter();
		try {
			userProfile = scraper.codeChefProfileProvider(user_name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			if(e.getMessage()=="wrong User Id") {
				r.println("Wrong User Id");
				System.out.println("inside exception");
				return;
			}
		}
	   System.out.println("Reached Here");
	   r.println(new Gson().toJson(userProfile));
   }
}
