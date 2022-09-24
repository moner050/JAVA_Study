package lv1;

public class Average_12944 {
    public static void main(String[] args) {
        int[] temp = {1,2,3,4};
        System.out.println(solution(temp));
    }

    public static double solution(int[] arr) {
        double answer = 0;
        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        answer /= arr.length;
        return answer;
    }
}
