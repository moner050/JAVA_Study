package ch02;

public class ReturnTest01 {

    public static void main(String[] args) {
        System.out.println("main() 시작");
        otherMethod();	// 메소드 호출
        System.out.println("main() 종료");
    }

    private static void otherMethod() {
        System.out.println("otherMethod() 시작");
        for (int i = 1; i <= 10; i++)
        {
            if (i == 5) return;
        }
        System.out.println("otherMethod() 종료");
    }
}
