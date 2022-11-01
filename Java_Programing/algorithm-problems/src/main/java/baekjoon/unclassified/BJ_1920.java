package baekjoon.unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BJ_1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numList);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < M; i++) {
            if(Arrays.binarySearch(numList, Integer.parseInt(st.nextToken())) >= 0){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
    }

    static int binarySearch(int[] arr, int num){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int middle = (start + end) / 2;

            if(num < arr[middle]){
                start = middle - 1;
            }
            else if(num > arr[middle]){
                start = middle + 1;
            }
            else {
                return middle;
            }
        }

        return -1;
    }
}
