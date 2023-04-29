package programmers.lv0;

// 문자열 여러 번 뒤집기
// https://school.programmers.co.kr/learn/courses/30/lessons/181913
public class InvertStringMultipleTimes_181913 {
    public static void main(String[] args) {
        String my_string = "rermgorpsam";
        int[][] queries = {{2, 3}, {0, 7}, {5, 9}, {6, 10}};

        System.out.println(solution1(my_string, queries));
        System.out.println(solution2(my_string, queries));
    }

    public static String solution1(String my_string, int[][] queries) {
        StringBuilder sb = new StringBuilder();

        for (int[] query : queries) {
            sb = new StringBuilder();
            if(query[0] > 0) sb.append(my_string.substring(0, query[0]));

            char[] temp = my_string.substring(query[0], query[1] + 1).toCharArray();

            for (int i = temp.length - 1; i >= 0; i--) {
                sb.append(temp[i]);
            }

            if(query[1] < my_string.length()) sb.append(my_string.substring(query[1] + 1, my_string.length()));

            my_string = sb.toString();
        }

        return sb.toString();
    }

    public static String solution2(String my_string, int[][] queries) {
        for (int[] query : queries) {
            my_string = my_string.substring(0, query[0]) +
                    new StringBuilder(my_string.substring(query[0], query[1] + 1)).reverse().toString() +
                    my_string.substring(query[1] + 1, my_string.length());
        }

        return my_string;
    }
}
