package programmers.lv0;

// 수 조작하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181925
public class OperateNum2_181925 {
    public static void main(String[] args) {
        int[] numLog = {0, 1, 0, 10, 0, 1, 0, 10, 0, -1, -2, -1};

        System.out.println(solution(numLog));
    }

    public static String solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < numLog.length - 1; i++) {
            if(numLog[i] - numLog[i + 1] == -1) sb.append("w");
            else if(numLog[i] - numLog[i + 1] == 1) sb.append("s");
            else if(numLog[i] - numLog[i + 1] == -10) sb.append("d");
            else if(numLog[i] - numLog[i + 1] == 10) sb.append("a");
        }

        return sb.toString();
    }
}
