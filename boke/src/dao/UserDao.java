package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserDao {
	public int insert(User user) {
		Connection conn = null;
	     //   Statement stat = null;
	        PreparedStatement pstmt = null;
	        SQLException ex = null;
	       
	        try {
				conn = DBUtils.getConnection();
				System.out.println("成功链接上数据库");
			//	stat = conn.createStatement();
			//	int rows = stat.executeUpdate("insert into t_users(username,pwd,gendar,category,interest,photo) values('"+ user.getUsername()+"','"+ user.getPwd()+"','"+ user.getGendar()+"',  '"+ user.getCategory()+"', '"+ user.getInterest()+"','"+user.getPhoto()+"')");
				String sql = "Insert into t_users(name,password,email,phone) values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, user.getName());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getEmail());
				pstmt.setString(4, user.getPhone());
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
	
	public int deletyById(int id) {
		Connection conn = null;
		Statement stat = null;
		
		try {
			conn=DBUtils.getConnection();
			stat = conn.createStatement();
			int rows = stat.executeUpdate("Delete FROM t_users WHERE userid = '" + id +"'");
			return  rows;
			
		}catch(SQLException e){
			e.printStackTrace();
			return 0;
		}finally {
			DBUtils.closeAll(conn, stat, null);
			
		}
		
		
	}
	public User findBy(String email,String password) {
		Connection conn = null;
		PreparedStatement prep = null;
		ResultSet re = null;
		
		try {
			conn = DBUtils.getConnection();
			String sql = "select * from t_users where email = ? and password = ?";
			prep = conn.prepareStatement(sql);
			prep.setString(1, email);
			prep.setString(2, password);
			re = prep.executeQuery();
			User user = null;
			while(re.next()) {
				user = new User();
				user.setUserid(re.getInt("userid"));
				user.setName(re.getString("name"));;
				user.setPassword(re.getString("password"));
				user.setEmail(re.getString("email"));
				user.setPhone(re.getString("phone"));
			}
			
			return  user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return null;
		}finally {
			DBUtils.closeAll(conn, prep, re);
			
		}
	}
	
	
	public List<User> findall(){
        
        Connection conn = null;
        Statement stat = null;
        ResultSet re = null;
        SQLException ex = null;
        User user = null;
                
        try {
			conn=DBUtils.getConnection();
			stat= conn.createStatement();
			re=stat.executeQuery("select * from t_users");
			List<User> all = new ArrayList<>();
			while(re.next()) {
				user = new User();
				user.setUserid(re.getInt("userid"));
				user.setName(re.getString("name"));
				user.setPassword(re.getString("password"));
				user.setEmail(re.getString("email"));
				user.setPhone(re.getString("phone"));
				
				all.add(user);
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
	
	public int update(User user,int userid) {
		 Connection conn = null;
		 PreparedStatement prep = null;
		 
		try {
			conn=DBUtils.getConnection();	
			String sql = "update t_users set password=?,phone=?,email=?,name=? where userid = '"+userid+"'";
			prep =  conn.prepareStatement(sql);
	
			prep.setString(1,user.getPassword());
			prep.setString(2,user.getPhone());
			prep.setString(3,user.getEmail());
			prep.setString(4,user.getName());
			

			int rows = prep.executeUpdate();
				return rows;
					
				} catch (Exception e) {							
					e.printStackTrace();							
					return 0;										
				}finally {
					DBUtils.closeAll(conn, prep, null);
				}
						
	}

	
}
