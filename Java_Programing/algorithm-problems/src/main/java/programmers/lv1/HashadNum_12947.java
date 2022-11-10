package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12947
public class HashadNum_12947 {
    public static void main(String[] args) {
//        int arr = 12;
        int arr = 10;

        System.out.println(solution(arr));
    }

    public static boolean solution(int x) {
        int sum = 0;
        String[] numList = String.valueOf(x).split("");

        for (String num : numList) {
            sum += Integer.parseInt(num);
        }

        return x % sum == 0;
    }
}
