package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Reply;


public class ReplyDao {
	
	public int insert(Reply reply) {
		Connection conn = null;
	   
	        PreparedStatement pstmt = null;
	        SQLException ex = null;
	       
	        try {
				conn = DBUtils.getConnection();
				
				String sql = "Insert into t_reply(content,time,articleid,username) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, reply.getContent());
				java.sql.Date date =new java.sql.Date(reply.getTime().getTime()); //sql.Date与util.Date日期格式化和转换
				pstmt.setDate(2, date);
				pstmt.setInt(3, reply.getArticleid());
				pstmt.setString(4, reply.getUsername());
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
	

public List<Reply> findall(int articleid){
        
        Connection conn = null;
        Statement stat = null;
        ResultSet re = null;
        SQLException ex = null;
        Reply reply = null;
                
        try {
			conn=DBUtils.getConnection();
			stat= conn.createStatement();
			re=stat.executeQuery("select * from t_reply  where articleid  ='"+articleid+"' ");
			List<Reply> all = new ArrayList<>();
			while(re.next()) {
				reply = new Reply();
				reply.setReplyid(re.getInt("replyid"));
				reply.setContent(re.getString("content"));
				reply.setTime(re.getDate("time"));
				reply.setArticleid(re.getInt("articleid"));
				reply.setUsername(re.getString("username"));
				all.add(reply);
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
