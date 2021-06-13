package com.profileScraper.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.profileScraper.Entities.LeetCodeProfile;
import com.profileScraper.Scrapers.LeetCodeScraper;

/**
 * Servlet implementation class LeetCodeRequestServer
 */
@WebServlet("/LeetCode")
public class LeetCodeRequestServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	String user_name = req.getParameter("username");
 	   System.out.print(user_name);
 	   LeetCodeScraper scraper = new LeetCodeScraper();
 	   LeetCodeProfile userProfile = null;
 	   PrintWriter r = res.getWriter();
 		try {
 			userProfile = scraper.codeForcesProfileProvider(user_name);
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
