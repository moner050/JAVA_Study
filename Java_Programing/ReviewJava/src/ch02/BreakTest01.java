package ch02;

public class BreakTest01 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
        {
            if(i == 5) break;
            System.out.println("i 변수 값 : " + i);
        }
    }
}
