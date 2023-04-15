package programmers.lv0;

// A 강조하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181874
public class EmphasizeA_181874 {
    public static void main(String[] args) {
        String myString = "abstract algebra";

        System.out.println(solution(myString));
    }

    public static String solution(String myString) {
        return myString.toLowerCase().replaceAll("a", "A");
    }
}
