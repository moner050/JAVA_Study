package ch07;

public class ExceptionTest03 {
    public static void main(String[] args) {
        // throws 를 사용하여 예외처리 넘겨주기
        try
        {
            divide(args[0], args[1]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("반드시 숫자 형식의 값을 입력하세요.");
        }
        catch (ArithmeticException e)
        {
            System.out.println("두 번째 숫자는 0이 아닌 수를 입력하세요.");
        }
        catch (Exception e)
        {
            System.out.println("예상하지 못한 문제가 발생했습니다.");
        }
    }

    // 메소드에서 발생한 예외 객체를 호출한 쪽으로 던지기위해 throws 사용
    private static void divide(String num1, String num2) throws Exception {
        int fstNum = Integer.parseInt(num1);
        int scdNum = Integer.parseInt(num2);
        System.out.println(fstNum / scdNum);
    }
}
