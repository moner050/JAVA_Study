package programmers.lv0;

// 배열의 유사도
// https://school.programmers.co.kr/learn/courses/30/lessons/120903
public class SimilarArray_120903 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};

        System.out.println(solution(s1, s2));
    }

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String one : s1) {
            for(String two : s2) {
                if (one.compareTo(two) == 0) answer++;
            }
        }
        return answer;
    }

}
