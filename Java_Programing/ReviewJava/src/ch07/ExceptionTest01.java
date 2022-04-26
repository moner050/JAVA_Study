package ch07;

public class ExceptionTest01 {
    public static void main(String[] args) {
        // 오류가 발생하지 않게 조건문으로 처리를 하는 방법도 있다.
//        if(args.length >= 2)
//        {
//            int number1 = Integer.parseInt(args[0]);
//            int number2 = Integer.parseInt(args[1]);
//
//            System.out.println("나누기 결과 : " + (number1 / number2));
//        }
//        else
//        {
//            System.out.println("반드시 2개의 정수를 입력하세요.");
//        }

        // 다중 catch 문으로 예외처리를 하는 방법도 있다.
        try
        {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            System.out.println("나누기 결과 : " + (number1 / number2));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("반드시 2개의 정수를 입력하세요.");
        }
        catch(ArithmeticException e)
        {
            System.out.println("두 번째 숫자는 0이 아닌 수를 입력하세요.");
        }
        catch(NumberFormatException e)
        {
            System.out.println("입력한 데이터가 숫자 형식이 아닙니다.");
        }
        catch(Exception e)  // Exception 을 사용할 경우 catch 문에서 반드시 맨 마지막에 위치해야 한다.
        {
            System.out.println("예상하지 못한 문제가 발생했습니다.");
        }
    }
}
