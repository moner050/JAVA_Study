package programmers.lv0;

// 조건 문자열
// https://school.programmers.co.kr/learn/courses/30/lessons/181934
public class ConditionString_181934 {
    public static void main(String[] args) {
        String ineq = "<", eq = "=";
        int n = 20, m = 50;

        System.out.println(solution(ineq, eq, n, m));
    }

    public static int solution(String ineq, String eq, int n, int m) {
        if(eq.equals("!")) {
            if(ineq.equals("<")) return n < m ? 1 : 0;
            else return n > m ? 1 : 0;
        }
        else {
            if(ineq.equals("<")) return n < m ? 1 : 0;
            else return n > m ? 1 : 0;
        }
    }
}
