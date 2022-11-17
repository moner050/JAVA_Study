package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class NegativePositiveNumSum_76501 {
    public static void main(String[] args) {
//        int[] absolutes = {4,7,12};
//        boolean[] signs = {true,false,true};
        int[] absolutes = {1,2,3};
        boolean[] signs = {false,false,true};
        System.out.println(solution(absolutes, signs));
    }

    public static int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for (int i = 0; i < absolutes.length; i++) {
            answer += signs[i] ? absolutes[i] : -1 * absolutes[i];
        }
        return answer;
    }
}
