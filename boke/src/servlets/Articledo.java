package servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.ArticleDao;
import entity.Article;
import entity.User;

/**
 * Servlet implementation class Articledo
 */
@WebServlet("/article.do")
public class Articledo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = request.getSession();
		ArticleDao articledao = new ArticleDao();
		 
		 
		String articlecontent = request.getParameter("articlecontent");
		
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
		
		String a = request.getParameter("userid");
		int userid = Integer.parseInt(a);
		
		String title = request.getParameter("title");
		
		Article article = new Article();
		article.setContent(articlecontent);
		article.setPub_date(utilDate);
		article.setUserid(userid);
		article.setTitle(title);
		articledao.insert(article);
		
		
		List<Article> articlelist = null;
		article = articledao.findby(userid);
		
		if( article != null ) {
			articlelist = articledao.findall(userid);
		}else {
			articlelist = articledao.findall();
		}
		session.setAttribute("articlelist", articlelist);
		
		
		request.getRequestDispatcher("index1.jsp").forward(request, response);
	}

}
