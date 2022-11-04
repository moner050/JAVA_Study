package programmers.lv1;

//  https://school.programmers.co.kr/learn/courses/30/lessons/87389
public class FindRemainderValueOne_87389 {

    public static void main(String[] args) {
        int n = 10;
//        int n = 12;

        System.out.println(solution(n));
    }

    public static int solution(int n) {
        int answer = 1;

        while(true) {
            if(n % answer == 1) break;
            answer++;
        }

        return answer;
    }
}
