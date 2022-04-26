package ch03;

import java.io.*;
import java.util.Stack;

public class BJ_10799 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Character> st = new Stack<>();

        int total = 0;
        String input = br.readLine();

        // input 문자열의 길이만큼 반복
        for(int i = 0; i < input.length(); i++)
        {   // ( 가 입력되면 스택에 push
            if(input.charAt(i) == '(') st.push('(');
            else if(input.charAt(i) == ')')     // ) 가 입력되면
            {   // 스택에서 마지막에 넣은 값을 빼준다.
                st.pop();
                // 만약 전에 ( 가 입력 되있었다면 스택의 사이즈만큼 더해주고 ) 가 입력됬었다면 1을 더해준다
                if(input.charAt(i - 1) == '(') total += st.size();
                else total++;
            }
        }
        bw.write(String.valueOf(total));
        bw.close();
        br.close();
    }
}
