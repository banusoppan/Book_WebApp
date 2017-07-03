package com.bookapp.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookapp.dao.UserDAO;
import com.bookapp.model.User;

/**
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);
		UserDAO userdao=new UserDAO();
		try{
			List<User> users = new ArrayList<>();
			User u = userdao.login(user);
			System.out.println(u);
			if(u == null)
			{
				response.sendRedirect("FailureLogin.jsp");
			}
			else
			{
				//response.sendRedirect("success.jsp");
				//Object data=u.getName();
				users.add(u);
				RequestDispatcher rd=request.getRequestDispatcher("SuccessLogin.jsp");
				
				request.setAttribute("users", users);
				rd.forward(request, response);
				//response.getWriter().append("<body>"+"welcome "+u.getUsername()+"</body>");
				//request.getRequestDispatcher("success.jsp").forward(request, response);;
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
