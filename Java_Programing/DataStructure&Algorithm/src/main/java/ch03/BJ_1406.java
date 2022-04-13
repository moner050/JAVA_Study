package ch03;

import java.io.*;
import java.util.Stack;

public class BJ_1406 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String text = br.readLine();                // 문자열 받기
        int N = Integer.parseInt(br.readLine());    // 명령어의 개수 받기

//        String[] textArr = text.split("(?<!^)");
        Stack stackLeft = new Stack<>();
        Stack stackRight = new Stack<>();

        for(int i = 0; i < text.length(); i++)
        {   // stackLeft 에 textArr 배열 집어넣기
            stackLeft.push(text.charAt(i));
        }

        while(N > 0)
        {   // 문자열 입력받기
            String input = br.readLine();
            // 띄어쓰기 기준으로 나누기

            if(input.equals("L"))  // L 이 입력됬는데
            {   // 만약 stackLeft 가 비어있지 않다면 stackRight 에 stackLeft 를 pop (가장 나중에 넣은것 빼기)
                if(!stackLeft.isEmpty()) stackRight.push(stackLeft.pop());
            }
            else if(input.equals("D")) // D 가 입력됬는데
            {   // 만약 stackRight 가 비어있지 않다면 stackLeft 에 stackRight 를 pop (가장 나중에 넣은것 빼기)
                if(!stackRight.isEmpty()) stackLeft.push(stackRight.pop());
            }
            else if(input.equals("B")) // B 가 입력됬는데
            {   // 만약 stackLeft 가 비어있지 않다면 stackLeft 에서 가장 나중에 넣은 값 빼기.
                if(!stackLeft.isEmpty()) stackLeft.pop();
            }
            else if(input.contains("P")) // P 가 입력되면
            {   // stackLeft 에 값 push  하기
                char c = input.charAt(2);
                stackLeft.push(c);
            }
            N--;
        }

        // stackLeft 가 비어있을때 까지
        while(!stackLeft.isEmpty())
        {   // stackRight 에 stackLeft 에 가장 나중에 넣은 값 push 하기
            stackRight.push(stackLeft.pop());
        }

        // stackRight 가 비어있을때 까지
        while(!stackRight.isEmpty())
        {   // bw 에 stackRight 값 차례대로 pop
            bw.write(String.valueOf(stackRight.pop()));
        }
        bw.close();
    }
}
