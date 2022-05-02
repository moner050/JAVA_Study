package member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import member.JDBCUtil;
import member.Member;

public class MemberDao {

	private Connection conn = null;
	private PreparedStatement ps = null;
	private ResultSet rs = null;
	
	// 회원 목록
	private String MEMBER_LIST = "select MEMBER_ID, NAME, PHONE_NUMBER from member";
	// 회원 등록
	private String INSERT_MEMBER = "insert into MEMBER values(?, ?, ?)";
	// 회원 수정
	private String UPDATE_MEMBER = "update MEMBER set PHONE_NUMBER = ? where MEMBER_ID = ?";
	// 회원 삭제
	private String DELETE_MEMBER = "delete MEMBER where MEMBER_ID = ?";
	
	
    public static void close(Connection conn) 
    {
        try { conn.close(); }
        catch (SQLException e) {e.printStackTrace();}
    }
	
	
    public static void close(PreparedStatement stmt, Connection conn) 
    {
        try { stmt.close(); }
        catch (SQLException e) {e.printStackTrace();}

        try { conn.close(); }
        catch (SQLException e) {e.printStackTrace();}
    }
	
	
    public static void close(ResultSet rs, PreparedStatement stmt, Connection conn) 
    {
        try { rs.close();}
        catch (SQLException e) { e.printStackTrace(); }

        try { stmt.close(); }
        catch (SQLException e) { e.printStackTrace(); }

        try { conn.close(); }
        catch (SQLException e) { e.printStackTrace(); }
    }
    
    // 회원 목록
    public void getMemberList()
    {
    	Member member = new Member();
    	try 
    	{
    		int size = 0;
    		StringBuilder sb = new StringBuilder();
    		conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(MEMBER_LIST);
			rs = ps.executeQuery();

			sb.append("현재 등록된 회원 목록입니다.\n");
			while(rs.next())
			{	
				member.setMember_id(rs.getString("MEMBER_ID"));
				member.setName(rs.getString("NAME"));
				member.setPhone_number(rs.getString("PHONE_NUMBER"));
				sb.append("---> ");
				sb.append(member.toString()+ "\n" );
				size++;
			}
			
			if(size < 1) System.out.println("등록된 회원이 없습니다.");
			else System.out.println(sb);

		} 
    	catch (SQLException e) { e.printStackTrace(); }
    	finally
    	{	
    		MemberDao.close(rs, ps, conn);
    	}
    }
    
    // 회원 등록
    public boolean insertMember(String member_id, String name, String phone_number)
    {
    	try 
    	{
    		conn = JDBCUtil.getConnection();
			ps = conn.prepareStatement(INSERT_MEMBER);
			ps.setString(1, member_id);
			ps.setString(2, name);
			ps.setString(3, phone_number);
			ps.executeUpdate();
			return true;
    	} 
    	catch (SQLException e) 
    	{
    		e.printStackTrace();
    		return false;
    	} 
    	finally 
    	{
    		MemberDao.close(ps, conn);
    	}
    }
    
    // 회원 수정
    public boolean updateMember(String phone_number, String member_id)
    {
    	try
    	{
    		conn = JDBCUtil.getConnection();
    		ps = conn.prepareStatement(UPDATE_MEMBER);
    		ps.setString(1, phone_number);
    		ps.setString(2, member_id);
    		ps.executeUpdate();
    		return true;
    	}
    	catch(SQLException e) 
    	{ 
    		e.printStackTrace(); 
    		return false;
    	}
    	finally
    	{
    		MemberDao.close(ps, conn);
    	}
    }
    
    // 회원 삭제
    public boolean deleteMember(String member_id)
    {
    	try 
    	{
    		conn = JDBCUtil.getConnection();
    		ps = conn.prepareStatement(DELETE_MEMBER);
    		ps.setString(1, member_id);
    		ps.executeUpdate();
    		return true;
    	} 
    	catch (SQLException e) 
    	{
    		e.printStackTrace();
    		return false;
    	} 
    	finally 
    	{
    		MemberDao.close(ps, conn);
    	}
    }
    
	
}
