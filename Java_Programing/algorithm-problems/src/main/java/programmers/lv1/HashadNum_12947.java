package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class HashadNum_12947 {
    public static void main(String[] args) {
        int arr = 12;
//        int arr = 10;

        System.out.println(solution1(arr));
        System.out.println(solution2(arr));
    }

    public static boolean solution1(int x) {
        int sum = 0;
        String[] numList = String.valueOf(x).split("");

        for (String num : numList) {
            sum += Integer.parseInt(num);
        }

        return x % sum == 0;
    }

    public static boolean solution2(int x) {
        int sum = String.valueOf(x).chars().map(n -> n - '0').sum();

        return x % sum == 0;
    }
}
