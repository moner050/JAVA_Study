package ch03;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BJ_17413 {

    // 문자열 배열을 매개변수로 받는 단어 거꾸로 뒤집는 메소드
    static String reverse(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < args.length; i++)
        {   // StringBuilder 의 reverse 를 이용하기 위해 다시 생성
            sb.append(new StringBuilder(args[i]).reverse());
            // 만약 args 가 배열형태라면(단어가 한개 이상이라면) 띄어쓰기 추가
            if(i != args.length - 1)
            {
                sb.append(" ");
            }
        }
        // 거꾸로 넣어준 다음 toString 해줘서 리턴
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        // 정규표현식을 사용해 >가 아닌 < 자로 시작해서 앞 문자가 0개 이상 존재하며 >로 끝나는 패턴을 입력
        Pattern pattern = Pattern.compile("<[^>]*>");
        // 문자열 입력받기
        String S = br.readLine();
        // 대상 문자열과 패턴을 판별하기 위해 Matcher 사용
        Matcher matcher = pattern.matcher(S);

        // matcher 가 false 가 될때까지 (< > 를 다 찾을때까지)
        while(matcher.find())
        {   // str 배열에 문자열 S 의 idx 부터 매칭이 시작한 인덱스까지 띄어쓰기로 나눠주기.
            String[] str = S.substring(idx, matcher.start()).split(" ");
            sb.append(reverse(str));        // 문자열을 거꾸로 한 것을 sb 에 추가
            sb.append(matcher.group());     // 패턴과 일치한 문자열을 sb 에 추가
            idx = matcher.end();            // idx 를 매칭이 끝난 인덱스의 값으로 넣어주기
        }

        // total 에 문자열 처음부터 끝까지 띄어쓰기 기준으로 나눠서 넣어주기 (<>가 아닐때를 대비해서)
        String[] total = S.substring(idx, S.length()).split(" ");
        sb.append(reverse(total));      // total 거꾸로 해서 넣어주기
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}
