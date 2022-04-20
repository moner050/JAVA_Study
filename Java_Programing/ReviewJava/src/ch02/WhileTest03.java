package ch02;

import java.util.Scanner;

public class WhileTest03 {

    public static void main(String[] args) {
        // 사용자가 입력한 메시지를 읽기 위한 Scanner 객체
        Scanner input = new Scanner(System.in);

        // 사용자가 입력한 메시지를 읽는 작업을 무한 반복하는 반복문
        while (true)
        {
            System.out.println("메시지 입력 후 Enter를 치세요.(종료는 quit)");
            String message = input.nextLine();
            if (message.equals("quit"))
            {
                // 읽은 메시지가 quit인 경우 while 블록을 종료
                break;
            }
            System.out.println("입력한 메시지 : " + message);
        }

        // Scanner를 종료한다.
        input.close();
    }
}