package ch11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectTest01 {
    public static void main(String[] args) {

        // JDBC 관련 변수
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try
        {
            conn = JDBCUtil.getConnection();

            // JDBC 3단계 : Statement 생성
            String sql = "select * from student";
            stmt = conn.prepareStatement(sql);

            // JDBC 4단계 : SQL 전송
            rs = stmt.executeQuery();

            // JDBC 5단계 : 조회 결과 사용
            System.out.println("[ STUDENT 목록 ]");
            while(rs.next())
            {
                System.out.print(rs.getString("STUDENT_NO") + " : ");
                System.out.print(rs.getString("NAME") + " : ");
                System.out.print(rs.getInt("SCORE") + " : ");
                System.out.println(rs.getString("MAJOR"));
            }

        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally
        {
            JDBCUtil.close(rs, stmt, conn);
        }
    }
}
