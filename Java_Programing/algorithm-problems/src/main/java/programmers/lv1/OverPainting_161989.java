package programmers.lv1;

import java.util.LinkedList;

// 덧칠하기
// https://school.programmers.co.kr/learn/courses/30/lessons/161989
public class OverPainting_161989 {
    public static void main(String[] args) {
        int n = 8, m = 4;
        int[] section = {2, 3, 6};

        System.out.println(solution1(n, m, section));
        System.out.println(solution2(n, m, section));
    }

    public static int solution1(int n, int m, int[] section) {
        int result = 0;
        LinkedList<Integer> secArr = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            secArr.add(1);
        }

        for (int sec : section) {
            secArr.set(sec-1, 0);
        }

        while(secArr.contains(0)) {
            int idx = secArr.indexOf(0);

            if(idx+m > n) {
                secArr.set(idx, 1);
                result++;
                break;
            }
            else {
                for (int i = 0; i < m; i++) {
                    secArr.set(idx++, 1);
                }
            }
            result++;
        }
        return result;
    }

    public static int solution2(int n, int m, int[] section) {
        int start = section[0], result = 1;

        for (int i = 1; i < section.length; i++) {
            if(start + m - 1 < section[i]) {
                result++;
                start = section[i];
            }
        }
        return result;
    }

}
