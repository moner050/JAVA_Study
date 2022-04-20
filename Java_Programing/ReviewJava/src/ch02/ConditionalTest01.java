package ch02;

public class ConditionalTest01 {

    public static void main(String[] args) {
        // num 변수에 할당되 숫자가 짝수인지 홀수인지 출력하는 프로그램 구현
        int num = 56;

        if((num % 2) == 0) System.out.println("짝수");
        else System.out.println("홀수");
    }

}
