package programmers.lv0;

import java.util.Arrays;

// OX퀴즈
// https://school.programmers.co.kr/learn/courses/30/lessons/120907
public class OXQuiz_120907 {
    public static void main(String[] args) {
        String[] quiz = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};

        System.out.println(Arrays.toString(solution(quiz)));
    }

    public static String[] solution(String[] quiz) {
        String[] result = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] QA = quiz[i].split("=");
            String[] question = QA[0].strip().split(" ");

            if(question[1].equals("-")) {
                result[i] = Integer.parseInt(question[0]) - Integer.parseInt(question[2]) == Integer.parseInt(QA[1].strip()) ? "O" : "X";
            }
            else if(question[1].equals("+")) {
                result[i] = Integer.parseInt(question[0]) + Integer.parseInt(question[2]) == Integer.parseInt(QA[1].strip()) ? "O" : "X";
            }
        }

        return result;
    }
}
