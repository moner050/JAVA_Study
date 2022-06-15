package lv11;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BJ_2108 {
    // 산술평균
    public static int avg(int[] arr){
        double result = 0.0, sum = 0.0;

        for (int n : arr){
            sum += n;
        }
        result = Math.round(sum / (double)arr.length);
        return (int)Math.ceil(result);
    }
    // 중앙값
    public static int mid(int[] arr){
        return arr[arr.length/2];
    }

    // 최빈값
    public static int manny(int[] arr){
        List<Integer> numList = new ArrayList<>();
        int[] cnt = new int[8001];
        int max = -5000;

        for (int n : arr){
            // 음수가 들어오면 음수 인덱스+4000 증가시켜주기. 아니면 그냥 증가
            if(n < 0) cnt[Math.abs(n) + 4000]++;
            else cnt[n]++;
        }

        for (int i = 0; i < cnt.length; i++) {
            // 카운트가 되었고 max 보다 크면 max 에 값 넣어주고 인덱스 넣어주기
            if(cnt[i] != 0 && cnt[i] > max){
                max = cnt[i];
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            if(cnt[i] == max){
                if(i > 4000){
                    int j = i;
                    j -= 4000;
                    j *= -1;
                    numList.add(j);
                }
                else numList.add(i);
            }
        }

        Collections.sort(numList);

        if(numList.size() > 1) return numList.get(1);
        else return numList.get(0);

    }

    public static int range(int[] arr){
        return arr[arr.length-1] - arr[0];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) {
            numList[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numList);

        bw.write(avg(numList) + "\n");
        bw.write(mid(numList) + "\n");
        bw.write(manny(numList) + "\n");
        bw.write(range(numList) + "");

        bw.close();
    }

}
