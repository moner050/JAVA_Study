package unclassified;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BJ_10448 {
    static List<Integer> eureka = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사전계산
        preCalculate();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int num = Integer.parseInt(br.readLine());
            if(isEureka(num)) System.out.println(1);
            else System.out.println(0);
        }
    }

    public static void preCalculate(){
        int N = 1;

        while( N*(N+1) / 2 < 1000 ) {
            eureka.add(N*(N+1) / 2);
            N++;
        }
    }

    public static boolean isEureka(int num) {
        for (int i = 0; i < eureka.size(); i++) {
            for (int j = 0; j < eureka.size(); j++) {
                for (int k = 0; k < eureka.size(); k++) {
                    if(eureka.get(i) + eureka.get(j) + eureka.get(k) == num) return true;
                }
            }
        }
        return false;
    }
}
