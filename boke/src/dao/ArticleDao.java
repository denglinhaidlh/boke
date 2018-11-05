package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



import entity.Article;
public class ArticleDao {
	public int insert(Article article) {
		Connection conn = null;
		   
        PreparedStatement pstmt = null;
        SQLException ex = null;
       
        try {
			conn = DBUtils.getConnection();
			
			String sql = "Insert into t_article(content,pub_date,userid,title) values(?,?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getContent());
			java.sql.Date date =new java.sql.Date(article.getPub_date().getTime()); //sql.Date与util.Date日期格式化和转换
			pstmt.setDate(2, date);
			pstmt.setInt(3, article.getUserid());	
			pstmt.setString(4, article.getTitle());
			int rows = pstmt.executeUpdate();
			return  rows;
        } catch (SQLException e) {
			// TODO Auto-generated catch block
			ex=e;
			return 0;
		}finally {
			DBUtils.closeAll(conn, pstmt, null);
    }
		
	}
	public Article findby(int userid){
        
        Connection conn = null;
        PreparedStatement prep = null;
        ResultSet re = null;
        SQLException ex = null;                        
        try {
			conn=DBUtils.getConnection();
		
			String sql = "select * from t_article where userid = ?";
			prep = conn.prepareStatement(sql);
			prep.setInt(1, userid);			
			re = prep.executeQuery();
			Article article = null;
			while(re.next()) {
				article = new Article();
				article.setArticleid(re.getInt("articleid"));
				article.setTitle(re.getString("title"));
				article.setContent(re.getString("content"));
				article.setPub_date(re.getDate("pub_date"));
				article.setUserid(re.getInt("userid"));
				
			}
			return article;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ex=e;
			return null;
		}finally {
			DBUtils.closeAll(conn, prep, re);
		}
	}
	public List<Article> findall(int userid){
        
        Connection conn = null;
        Statement stat = null;
        ResultSet re = null;
        SQLException ex = null;
        Article article = null;
                
        try {
			conn=DBUtils.getConnection();
			stat= conn.createStatement();
			re=stat.executeQuery("select * from t_article  where userid  ='"+userid+"' ");
			List<Article> all = new ArrayList<>();
			while(re.next()) {
				article = new Article();
				article.setArticleid(re.getInt("articleid"));
				article.setTitle(re.getString("title"));
				article.setContent(re.getString("content"));
				article.setPub_date(re.getDate("pub_date"));
				article.setUserid(re.getInt("userid"));
				
				all.add(article);
			}
			return all;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ex=e;
			return null;
		}finally {
			DBUtils.closeAll(conn, stat, re);
		}
	}
	
	public List<Article> findall(){
		        
        Connection conn = null;
        Statement stat = null;
        ResultSet re = null;
        SQLException ex = null;
        Article article = null;
                
        try {
			conn=DBUtils.getConnection();
			stat= conn.createStatement();
			re=stat.executeQuery("select * from t_article");
			List<Article> all = new ArrayList<>();
			while(re.next()) {
				article = new Article();
				article.setArticleid(re.getInt("articleid"));
				article.setTitle(re.getString("title"));
				article.setContent(re.getString("content"));
				article.setPub_date(re.getDate("pub_date"));
				article.setUserid(re.getInt("userid"));
				
				all.add(article);
			}
			return all;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ex=e;
			return null;
		}finally {
			DBUtils.closeAll(conn, stat, re);
		}
	}
	
	
}
