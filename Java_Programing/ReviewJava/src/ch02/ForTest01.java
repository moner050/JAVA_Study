package ch02;

public class ForTest01 {

    public static void main(String[] args) {
        // 1부터 10까지의 홀수의 개수와 총 합 출력

        int sum = 0;
        int oddCount = 0;

        for (int i = 1; i <= 10; i++)
        {
            if(i % 2 != 0)
            {
                sum = sum + i;
                oddCount++;
            }
        }
        System.out.println("1 ~ 10까지 홀수의 개수 : " + oddCount);
        System.out.println("1 ~ 10까지 홀수의 총 합 : " + sum);
    }

}
