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
 * Servlet implementation class Updatedo
 */
@WebServlet("/update.do")
public class Updatedo extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		UserDao userdao = new UserDao();
		HttpSession session = request.getSession();
		int userid = Integer.parseInt(request.getParameter("userid"));
		User user=new User();
		user.setEmail(request.getParameter("email"));
		user.setName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));		
		user.setPhone(request.getParameter("phone"));
		
		userdao.update(user,userid);
		
		List<User> userlist = userdao.findall();
		session.setAttribute("userlist", userlist);
		
		request.getRequestDispatcher("users.jsp").forward(request, response);

	}

}
