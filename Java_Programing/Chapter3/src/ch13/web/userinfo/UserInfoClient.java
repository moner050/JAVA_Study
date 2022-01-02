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
		
		// db.properties 를 읽기
		FileInputStream fis = new FileInputStream("db.properties");
		
		// key와 value를 pair로 읽어들일수 있는 객체
		Properties prop = new Properties();
		
		prop.load(fis);
		
		// DBTYPE의 value값을 가져오기
		String dbType = prop.getProperty("DBTYPE");
		
		// 유저 정보에 값 넣어주기.
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("12345");
		userInfo.setPassword("!@#$%");
		userInfo.setUserName("Lee");
		
		UserInfoDao userInfoDao = null;
		
		// DBTYPE의 value값에 따라 다른 인스턴스 생성
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
