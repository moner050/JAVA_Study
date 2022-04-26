package ch07;

public class ExceptionTest02 {
    public static void main(String[] args) {
        // try-catch-finally 문으로 예외처리 후 마지막 finally 에서 반드시 실행되게 하기.
        try
        {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            System.out.println("나누기 결과 : " + (number1 / number2));
        }
        catch(Exception e)
        {
            System.out.println("예상하지 못한 문제가 발생했습니다.");
        } finally
        {
            System.out.println("무조건 실행되는 영역입니다.");
        }
    }
}
