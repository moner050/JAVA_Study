package ch07;

import ch07.CustomException.MinusScoreException;

public class ExceptionTest05 {
    public static void main(String[] args) {

        try
        {
            int javaScore = Integer.parseInt(args[0]);
            if(javaScore < 0) throw new MinusScoreException("음수 입력 불가!");

            System.out.println("입력한 자바 점수 : " + javaScore);
        }
        catch (IllegalArgumentException e)
        {
            System.out.println("예외 메시지 : " + e.getMessage());
            System.out.println("-----------< 예외 발생 위치 >-------------");
            e.printStackTrace();
            System.out.println("-----------------------------------------");
        }
    }
}
