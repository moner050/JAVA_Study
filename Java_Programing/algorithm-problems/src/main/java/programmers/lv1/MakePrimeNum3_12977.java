package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12977
public class MakePrimeNum3_12977 {
    public static void main(String[] args) {
        int[] nums = {1,2,7,6,4};

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(isPrime(nums[i] + nums[j] + nums[k])) answer++;
                }
            }
        }

        return answer;
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i*i <= num; i++) {
            if(num % i == 0) return false;
        }
        return true;
    }
}
