package baekjoon.lv13;

import java.io.*;
import java.util.StringTokenizer;

public class BJ_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[6];

        int maxR = 0, maxL = 0;
        int indexR = 0, indexL = 0;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int dir = Integer.parseInt(st.nextToken());
            int distance = Integer.parseInt(st.nextToken());

            if(dir == 3 || dir == 4){
                maxR = maxR < distance ? distance : maxR;
                if(maxR == distance) indexR = i;
            }
            else{
                maxL = maxL < distance ? distance : maxL;
                if(maxL == distance) indexL = i;
            }
            arr[i] = distance;
        }

        int nextR1=arr[5],nextC1=arr[5];
        int nextR2=arr[0],nextC2=arr[0];
        if (indexL-1>-1) nextR1=arr[indexL-1];
        if (indexL+1<6) nextR2=arr[indexL+1];
        if (indexR-1>-1) nextC1=arr[indexR-1];
        if (indexR+1<6) nextC2=arr[indexR+1];

        int area=maxL*Math.min(nextR1, nextR2)+Math.min(nextC1, nextC2)*(maxR-(Math.min(nextR1, nextR2)));

        bw.write((area*N) + "");
        br.close();
        bw.close();
    }
}
