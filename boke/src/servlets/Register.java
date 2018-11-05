package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import entity.User;


@WebServlet("/Register.do")
public class Register extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();		
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");	
	
		User user = new User();	
		user.setName(name);
		user.setPassword(password);
		user.setEmail(email);
		user.setPhone(phone);
		
		UserDao userDao = new UserDao();
		
		if(userDao.insert(user) > 0) {
			out.println("注册成功，3秒钟后将跳到登录页面");
			response.setHeader("refresh", "3;url=index.jsp");
			//request.getRequestDispatcher("login.jsp").forward(request, response);  	        
		}else {
			out.println("注册失败，3秒钟后将跳到注册页面");
			response.setHeader("refresh", "3;url=index.jsp");
		}
	}

}
