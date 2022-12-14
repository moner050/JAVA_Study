package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// 로또의 최고 순위와 최저 순위
// https://school.programmers.co.kr/learn/courses/30/lessons/77484
public class LottoLowHighRank_77484 {
    public static void main(String[] args) {
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        System.out.println(Arrays.toString(solution1(lottos, win_nums)));
        System.out.println(Arrays.toString(solution2(lottos, win_nums)));
    }

    public static int[] solution1(int[] lottos, int[] win_nums) {
        int zeroCnt = 0, equalCnt = 0;
        int[] result = new int[2];

        for (int i = 0; i < lottos.length; i++) {
            for (int j = 0;j < win_nums.length; j++) {
                if(lottos[i] == 0) {
                    zeroCnt++;
                    break;
                }
                if(lottos[i] == win_nums[j]) equalCnt++;
            }
        }

        result[0] = lottoRank(zeroCnt + equalCnt);
        result[1] = lottoRank(equalCnt);

        return result;
    }

    public static int lottoRank(int cnt) {
        switch (cnt) {
            case 6 : return 1;
            case 5 : return 2;
            case 4 : return 3;
            case 3 : return 4;
            case 2 : return 5;
            default: return 6;
        }
    }

    public static int[] solution2(int[] lottos, int[] win_nums) {
        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();
        int zeroCount = 0;

        for(int lotto : lottos) {
            if(lotto == 0) {
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }


        int sameCount = 0;
        for(int winNum : win_nums) {
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (sameCount + zeroCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[] {maxRank, minRank};
    }
}
