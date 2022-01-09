package ch11;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {

	Logger logger = Logger.getLogger("mylogger");
	// 싱글톤패턴으로 MyLogger 인스턴스 생성
	private static MyLogger instance = new MyLogger();
	
	public static final String errorLog = "log.txt";
	public static final String warningLog = "warning.txt";
	public static final String fineLog = "fine.txt";
	
	private FileHandler logFile = null;
	private FileHandler warningFile = null;
	private FileHandler fineFile = null;

	private MyLogger()
	{
			try 
			{
				logFile = new FileHandler(errorLog, true);
				warningFile = new FileHandler(warningLog, true);
				fineFile = new FileHandler(fineLog, true);
			} 
			catch (SecurityException e) 
			{
				e.printStackTrace();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
	
			logFile.setFormatter(new SimpleFormatter());
			warningFile.setFormatter(new SimpleFormatter());
			fineFile.setFormatter(new SimpleFormatter());
			
			// 모든 로그 레벨
			logger.setLevel(Level.ALL);
			
			// 로그레벨 FINE부터 기록
			fineFile.setLevel(Level.FINE);
			// 로그레벨 WARNING부터 기록
			warningFile.setLevel(Level.WARNING);
			
			logger.addHandler(logFile);
			logger.addHandler(warningFile);
			logger.addHandler(fineFile);
	}	
	
	public static MyLogger getLogger()
	{
		return instance;
	}

	
	public void log(String msg)
	{
		// 정보를 주기위해서 쓰는 로그
		logger.finest(msg);
		logger.finer(msg);
		logger.fine(msg);
		logger.config(msg);
		logger.info(msg);
		logger.warning(msg);
		logger.severe(msg);
		
	}
	
	public void fine(String msg)
	{
		logger.fine(msg);
	}
	
	public void warning(String msg)
	{
		logger.warning(msg);
	}

	
}
