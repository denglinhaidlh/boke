package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import dao.ArticleDao;
import dao.UserDao;
import entity.Article;
import entity.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login.do")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		UserDao userdao = new UserDao();
		ArticleDao articledao = new ArticleDao();
		User user = null;
	     List<Article> articlelist = null;
	     Article article = null;	     
		
	     user = userdao.findBy(email, password);
	     article = articledao.findby(user.getUserid());
		
		if( article != null ) {
			articlelist = articledao.findall(user.getUserid());
		}else {
			articlelist = articledao.findall();
		}
		
		HttpSession session = request.getSession();
		if(user.getEmail().equals("1@qq.com")&&user.getPassword().equals("1") ) {  //判断是不是管理员账户
			List<User> userlist = null;
			userlist = userdao.findall();
			
			session.setAttribute("userlist", userlist);
						
			response.sendRedirect("users.jsp");
		}else {
			if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
				
				session.setAttribute("userid", user.getUserid());
				session.setAttribute("articlelist", articlelist);
				session.setAttribute("user", user);
			
				response.sendRedirect("index1.jsp");
				
			}else {
				response.sendRedirect("index.jsp");
			}
			
		}
		
		
		
		
		
		
	}

}
