package ch11;

public class LoggerTest {

	public static void main(String[] args) {

		MyLogger logger = MyLogger.getLogger();
		
		// ��� �α׷����� �ش� ������ �� ��´�.
		logger.log("log test");
		
	}

}
