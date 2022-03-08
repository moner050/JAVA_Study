package ch13.web.userinfo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;
import ch13.domain.userinfo.dao.mysql.UserInfoMySqlDao;
import ch13.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		
		// db.properties �� �б�
		FileInputStream fis = new FileInputStream("db.properties");
		
		// key�� value�� pair�� �о���ϼ� �ִ� ��ü
		Properties prop = new Properties();
		
		prop.load(fis);
		
		// DBTYPE�� value���� ��������
		String dbType = prop.getProperty("DBTYPE");
		
		// ���� ������ �� �־��ֱ�.
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;
		
		// DBTYPE�� value���� ���� �ٸ� �ν��Ͻ� ����
		if( dbType.equals("ORACLE"))
			userInfoDao = new UserInfoOracleDao();
		else if ( dbType.equals("MYSQL") )
			userInfoDao = new UserInfoMySqlDao();
		else
		{
			System.out.println("db error");
			return;
		}
		
		userInfoDao.insertUserInfo(userInfo);
		userInfoDao.updateUserInfo(userInfo);
		userInfoDao.deleteUserInfo(userInfo);
		
	}

}