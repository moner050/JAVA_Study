package ch02;

public class WhileTest01 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i <= 10)
        {
            if(i % 2 == 0)
            {
                sum = sum + i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println("1 ~ 10까지 짝수의 총 합 : " + sum);
    }

}
