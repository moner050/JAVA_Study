package com.my.biz.user.lisener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class BoardWebContextListener implements ServletContextListener {


    public BoardWebContextListener() {
    	System.out.println("===> BoardWebContextListener 생성");
    }

    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("===> contextInitialized() 호출");
   }

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("===> contextDestroyed() 호출");
    }
	
}
