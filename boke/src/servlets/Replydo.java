package servlets;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import dao.ReplyDao;
import entity.Reply;
import entity.User;

/**
 * Servlet implementation class Reply
 */
@WebServlet("/reply.do")
public class Replydo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = request.getSession();
		String a = request.getParameter("articleid");
		int articleid = Integer.parseInt(a);
		System.out.println(articleid);
		session.setAttribute("articleid", articleid);
		
		ReplyDao replydao = new ReplyDao();
		List<Reply> replylist = null;
		
		replylist=replydao.findall(articleid);
		
		session.setAttribute("replylist", replylist);
		
		response.sendRedirect("detail.jsp");
			
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = request.getSession();
		ReplyDao replydao = new ReplyDao();
		String content = request.getParameter("content");
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		 String time =sdf.format(new Date());
		 System.out.println(time);
		 Date utilDate = null;
		try {
			utilDate = sdf.parse(time);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		User user = (User) session.getAttribute("user");
		String username = user.getName();
		
		String a = request.getParameter("articleid");
		int articleid = Integer.parseInt(a);
		
		
		
		Reply reply = new Reply();
		reply.setContent(content);
		reply.setArticleid(articleid);
		reply.setTime(utilDate);
		reply.setUsername(username);
		int row = replydao.insert(reply);
		if(row > 0)
		{
			System.out.println("succeful");
		}else {
			System.out.println("fail");
		}
		session.setAttribute("articleid", articleid);				
		
		
		
		List<Reply> replylist = null;
		
		replylist=replydao.findall(articleid);
		
		session.setAttribute("replylist", replylist);
		request.getRequestDispatcher("detail.jsp").forward(request, response);
		
	}

}
