package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/118666
public class TestMBTI_118666 {

    public static void main(String[] args) {
//        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
//        int[] choices = {5, 3, 2, 7, 5};
        String[] survey = {"TR", "RT", "TR"};
        int[] choices = {7, 1, 3};

        System.out.println(solution(survey, choices));
    }

    public static String solution(String[] survey, int[] choices) {
        StringBuilder sb = new StringBuilder();
        String[] RCJATemp = {"R", "C", "J", "A"};
        String[] TFMNTemp = {"T", "F", "M", "N"};

        int[] RCJA = new int[4];
        int[] TFMN = new int[4];

        for(int i = 0; i < choices.length; i++) {
            int score = 0;
            if(choices[i] == 1 || choices[i] == 7) score = 3;
            else if(choices[i] == 2 || choices[i] == 6) score = 2;
            else if(choices[i] == 3 || choices[i] == 5) score = 1;

            if(survey[i].startsWith("A")) {
                if(choices[i] > 4) TFMN[3] += score;
                else RCJA[3] += score;
            }
            else if(survey[i].startsWith("J")) {
                if(choices[i] > 4) TFMN[2] += score;
                else RCJA[2] += score;
            }
            else if(survey[i].startsWith("C")) {
                if(choices[i] > 4) TFMN[1] += score;
                else RCJA[1] += score;
            }
            else if(survey[i].startsWith("R")) {
                if(choices[i] > 4) TFMN[0] += score;
                else RCJA[0] += score;
            }
            else if(survey[i].startsWith("N")) {
                if(choices[i] > 4) RCJA[3] += score;
                else TFMN[3] += score;
            }
            else if(survey[i].startsWith("M")) {
                if(choices[i] > 4) RCJA[2] += score;
                else TFMN[2] += score;
            }
            else if(survey[i].startsWith("F")) {
                if(choices[i] > 4) RCJA[1] += score;
                else TFMN[1] += score;
            }
            else if(survey[i].startsWith("T")) {
                if(choices[i] > 4) RCJA[0] += score;
                else TFMN[0] += score;
            }
        }

        for (int i = 0; i < 4; i++) {
            if(RCJA[i] > TFMN[i]) {
                sb.append(RCJATemp[i]);
            }
            else if(RCJA[i] < TFMN[i]) {
                sb.append(TFMNTemp[i]);
            }
            else{
                sb.append(RCJATemp[i]);
            }
        }

        return sb.toString();
    }
}
