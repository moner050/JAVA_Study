package member;

import java.io.IOException;

public class MainClass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		System.out.println("#############################\n"
						 + "###  회원 관리 프로그램 START  ##\n"
						 + "#############################");
		
		MemberManager memberManager = new MemberManager();
		memberManager.readMenu();
		
		System.out.println("#############################\n"
						 + "###  GOOD-BYE 프로그램 종료  ###\n"
						 + "#############################");
		
	}

}
