package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12943
public class CollatzConjecture_12943 {

    public static void main(String[] args) {
//        int n = 6;
        int n = 16;
//        int n = 626331;
        System.out.println(solution(n));
    }

    public static int solution(long num) {
        int cnt = 0;
        if(num == 1) return 0;

        while(cnt <= 500) {
            num = (num % 2 == 0) ? num/2 : num*3 + 1;
            cnt++;
            if(num == 1) return cnt;
        }
        return -1;
    }
}
