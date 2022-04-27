package ch11;

import java.sql.*;

public class InsertTest01 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement stmt = null;

        // h2 드라이버 연결
        try
        {
            // 1단계 : 드라이버 객체 로딩
            DriverManager.registerDriver(new org.h2.Driver());
            // 2단계 : 커넥션 연결
            String jdbcUrl = "jdbc:h2:tcp://localhost/~/test";
            conn = DriverManager.getConnection(jdbcUrl, "sa", "");

            if(conn != null) System.out.println("H2 연결 성공!" + conn.toString());

            // 3단계 : Statement 생성
            String sql = "insert into student values(?, ?, ?, ?)";
            stmt = conn.prepareStatement(sql);

            if(stmt != null) System.out.println("Statement 객체 : " + stmt.toString());

            // 4단계 : SQL 전송
            // ? 값 설정
            stmt.setString(1, "STD-000005");
            stmt.setString(2, "외계인1");
            stmt.setInt(3, 88);
            stmt.setString(4, "우주항공 공학");

            int count = stmt.executeUpdate();
            System.out.println(count + "건 데이터 처리 성공!");

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            // 5단계 : 연결 해제
            try
            {
                stmt.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }

            try
            {
                conn.close();
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        }
    }
}
