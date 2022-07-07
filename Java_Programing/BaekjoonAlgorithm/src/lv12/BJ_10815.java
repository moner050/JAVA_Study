package lv12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_10815 {

    public static int[] cards;
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 숫자 카드의 개수 입력받기
        N = Integer.parseInt(br.readLine());
        cards = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬
        Arrays.sort(cards);

        // 숫자카드 검사 몇번할지 입력받기
        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());

            // 이분탐색을 해 숫자가 있는경우 1, 없으면 0
            if(binarySearch(num)) bw.write("1 ");
            else bw.write("0 ");
        }
        // 출력
        bw.close();
        br.close();
    }

    // 이분 탐색
    private static boolean binarySearch(int num){
        int left = 0;
        int right = N - 1;

        while(left <= right){
            int middle = (left + right) / 2;
            int mid = cards[middle];

            if(num < mid) right = middle - 1;
            else if(num > mid) left = middle + 1;
            else return true;
        }
        return false;
    }

}
