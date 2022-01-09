package ch11;

public class LoggerTest {

	public static void main(String[] args) {

		MyLogger logger = MyLogger.getLogger();
		
		// 모든 로그레벨에 해당 문장을 다 찍는다.
		logger.log("log test");
		
	}

}
