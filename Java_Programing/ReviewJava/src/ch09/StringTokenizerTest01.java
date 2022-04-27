package ch09;

import java.util.StringTokenizer;

public class StringTokenizerTest01 {
    public static void main(String[] args) {
        String stdInfo = "NO=STD-000001&NAME=김둘리&SCORE=83&MAJOR=컴퓨터 공학";

        // &를 구분자로 하여 문자열을 분리시킨다.
        StringTokenizer st = new StringTokenizer(stdInfo, "&");

        // 토큰이 있을때까지
        while(st.hasMoreTokens())
        {
            String token = st.nextToken();
            String[] elements = token.split("=");
            System.out.println(elements[0] + "정보 : " + elements[1]);
        }
    }
}
