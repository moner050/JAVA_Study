package baekjoon.lv10;

import java.io.*;
import java.util.Arrays;

public class BJ_2798 {

    public static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static int pickCard(int[] cards, int N, int M) throws IOException {
        int max = 0;
        // 3개를 고르니 N-2 까지 검사함.
        for (int i = 0; i < N - 2; i++)
        {   // 두번째 카드는 i+1 번 째 부터
            for (int j = i + 1; j < N - 1; j++)
            {   // 세번째 카드는 j + 1 번 째 부터
                for (int k = j + 1; k < N; k++)
                {   // temp 에 세 카드들을 더해줌
                    int temp = cards[i] + cards[j] + cards[k];
                    // 만약 더한 값이 M과 값이 같으면 max 에 temp 를 넣어주고 max 리턴
                    if(M == temp)
                    {
                        max = temp;
                        return max;
                    }
                    // max 가 temp 보다 작고, temp 가 M 보다 작으면 max 에 temp 값 넣어주기.
                    if(max < temp && temp < M) max = temp;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 숫자들을 입력받고 띄어쓰기 기준으로 int 배열로 형변환시킴
        int[] num = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // N 과 M 을 설정
        int N = num[0], M = num[1];
        // 카드의 값을 입력받고 띄어쓰기 기준으로 int 배열로 형변환시킴
        int[] cards = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        // 변수 max 에 pickCard 함수의 값을 저장,
        int max = pickCard(cards, N, M);
        // 출력
        bw.write(max + "");
        bw.close();
    }
}
