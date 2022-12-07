package programmers.lv1;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class PhoneCatMon_1845 {
    public static void main(String[] args) {
//        int[] nums = {3,1,2,3};
        int[] nums = {3,3,3,2,2,4};

        System.out.println(solution1(nums));
        System.out.println(solution2(nums));
    }

    public static int solution1(int[] nums) {
        int numsLength = nums.length / 2;
        int disLength = Arrays.stream(nums).distinct().toArray().length;

        return Math.min(disLength, numsLength);
    }

    public static int solution2(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.collectingAndThen(Collectors.toSet(),
                        phoneCatMon -> Math.min(phoneCatMon.size(), nums.length / 2)));
    }
}
