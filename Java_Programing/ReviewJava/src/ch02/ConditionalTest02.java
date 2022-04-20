package ch02;

public class ConditionalTest02 {

    public static void main(String[] args) {
        // num1 이 가진 숫자와 num2 가 가진 숫자를 교환하는 프로그램 작성

        int num1 = 4;
        int num2 = 44;
        int temp = 0;

        temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println(num1);	// 44
        System.out.println(num2);	// 4
    }

}
