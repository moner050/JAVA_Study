package com.my.biz.user;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.my.biz.user.common.JDBCUtil;

public class UserDAO {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	// 회원 목록
	private final String USER_LIST = "select * from USERS order by id desc";
	private final String USER_GET = "select * from USERS where id = ?";
	
    // 회원 목록
    public List<UserVO> getUserList()
    {
    	List<UserVO> userList = new ArrayList<UserVO>();
    	try 
    	{
    		int size = 0;
    		StringBuilder sb = new StringBuilder();
    		conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(USER_LIST);
			rs = ps.executeQuery();

			sb.append("현재 등록된 회원 목록입니다.\n");
			while(rs.next())
			{	
				UserVO user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
				userList.add(user);
			}
			
			if(size < 1) System.out.println("등록된 회원이 없습니다.");
			else System.out.println(sb);

		} 
    	catch (SQLException e) { e.printStackTrace(); }
    	finally
    	{	
    		JDBCUtil.close(rs, ps, conn);
    	}
    	return userList;
    }
    
    // 회원 상세 목록
    public UserVO getUser(UserVO vo) 
    {	
    	UserVO user = null;
    	try 
    	{
    		conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(USER_GET);
			ps.setString(1, vo.getId());
			rs = ps.executeQuery();
			if(rs.next())
			{
				user = new UserVO();
				user.setId(rs.getString("ID"));
				user.setPassword(rs.getString("PASSWORD"));
				user.setName(rs.getString("NAME"));
				user.setRole(rs.getString("ROLE"));
			}
    	} 
    	catch (SQLException e) 
    	{
    		e.printStackTrace();
    	} 
    	finally 
    	{
    		JDBCUtil.close(ps, conn);
    	}
    	return user;
    }

    
	
}
