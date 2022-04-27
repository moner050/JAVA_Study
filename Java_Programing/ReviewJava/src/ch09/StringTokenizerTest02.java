package ch09;

import java.util.StringTokenizer;

public class StringTokenizerTest02 {
    public static void main(String[] args) {
        String stdInfo = "NO=STD-000001&NAME=김둘리&SCORE=83&MAJOR=컴퓨터 공학";
        Student student = convertStudent(stdInfo);
        System.out.println(student.getName() + "의 점수 : " + student.getScore());
    }

    private static Student convertStudent(String studentInfo) {
        String studentNo = null;
        String name = null;
        int score = 0;
        String major = null;

        // &를 구분자로 하여 문자열을 분리시킨다.
        StringTokenizer tokens = new StringTokenizer(studentInfo, "&");
        // tokens 에 토큰이 있을 때 까지
        while(tokens.hasMoreTokens())
        {
            String token = tokens.nextToken();
            String[] elements = token.split("=");

            if(elements[0].equals("NO")) studentNo = elements[1];
            else if(elements[0].equals("NAME")) name = elements[1];
            else if(elements[0].equals("SCORE")) score = Integer.parseInt(elements[1]);
            else if(elements[0].equals("MAJOR")) major = elements[1];
        }
        return new Student(studentNo, name, score, major);
    }
}
