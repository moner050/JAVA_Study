package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/17681
public class SecretMap_17681 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1 = {9, 20, 28, 18, 11}, arr2 = {30, 1, 21, 17, 28};

        for (String result : solution(n, arr1, arr2)) {
            System.out.println(result + " ");
        }
    }

    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            String temp1 = Integer.toBinaryString(arr1[i]);
            String temp2 = Integer.toBinaryString(arr2[i]);

            temp1 = "0".repeat(n - temp1.length()) + temp1;
            temp2 = "0".repeat(n - temp2.length()) + temp2;

            for (int j = 0; j < n; j++) {
                if(temp1.charAt(j) == '0' && temp2.charAt(j) == '0'){
                    sb.append(" ");
                }
                else sb.append("#");
            }

            answer[i] = sb.toString();
        }

        return answer;
    }
}
