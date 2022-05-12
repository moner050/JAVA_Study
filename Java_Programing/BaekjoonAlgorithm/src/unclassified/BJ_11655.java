package unclassified;

import java.io.*;

public class BJ_11655 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 입력받은 문자열을 char 배열 형태로 변환 후 넣어준다.
        char[] S = br.readLine().toCharArray();

        for (char c : S)
        {
            // 값을 넣어줄 temp 값 선언
            char temp = ' ';
            // 만약 c 문자가 a~m(A~M) 이면 13을 더해준 후 문자 형태로 변환후 temp 에 넣어준다.
            if((c >= 'a' && c <= 'm')|| (c >= 'A' && c <= 'M')) temp = (char)(c + 13);
            // 만약 c 문자가 n~z(N~Z) 이면 13을 빼준 후 문자 형태로 변환후 temp 에 넣어준다.
            else if((c >= 'n' && c <= 'z') || (c >= 'N' && c <= 'Z')) temp = (char)(c - 13);
            // 그 무엇도 아닌 문자라면 그냥 temp 에 넣어준다.
            else temp = c;
            // 그리고 bw에 넣어준 뒤
            bw.write(temp + "");
        }
        // 출력.
        bw.close();
    }
}
