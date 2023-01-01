package programmers.lv0;

import java.util.*;

// 특이한 정렬
// https://school.programmers.co.kr/learn/courses/30/lessons/120880
public class UniqueSort_120880 {
    public static void main(String[] args) {
        int[] numlist = {1, 2, 3, 4, 5, 6};
        int n = 4;
//        int[] numlist = {10000,20,36,47,40,6,10,7000};
//        int n = 30;

        System.out.println(Arrays.toString(solution1(numlist, n)));
        System.out.println(Arrays.toString(solution2(numlist, n)));
    }

    public static int[] solution1(int[] numlist, int n) {
        List<Integer> numList = new ArrayList<>();
        Arrays.sort(numlist);

        for(int num : numlist) numList.add(num);

        numList.sort((s1, s2) -> Integer.compare(Math.abs(s2 - n), Math.abs(s1 - n)));
        Collections.reverse(numList);

        return numList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] solution2(int[] numlist, int n) {
        return Arrays.stream(numlist)
                .boxed()
                .sorted((s1, s2) -> Math.abs(s1 - n) == Math.abs(s2 - n) ? s2.compareTo(s1) : Integer.compare(Math.abs(s1 - n), Math.abs(s2 - n)))
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
