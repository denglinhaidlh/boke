package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDao;
import entity.User;

/**
 * Servlet implementation class Delectdo
 */
@WebServlet("/delect.do")
public class Delectdo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userdao = new UserDao();
		HttpSession session = request.getSession();
		int delect = Integer.parseInt(request.getParameter("userid"));
		userdao.deletyById( delect);
		
		List<User> userlist = userdao.findall();
		session.setAttribute("userlist", userlist);
		
		request.getRequestDispatcher("users.jsp").forward(request, response);
	}

}
