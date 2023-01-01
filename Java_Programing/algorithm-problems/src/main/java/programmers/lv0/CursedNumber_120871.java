package programmers.lv0;

// 저주받은 숫자 3
// https://school.programmers.co.kr/learn/courses/30/lessons/120871
public class CursedNumber_120871 {
    public static void main(String[] args) {
        int n = 15;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int result = 0, cnt = 1;

        while(true){
            if(result % 3 == 0) {
                result++;
                continue;
            }

            String temp = String.valueOf(result);
            if(temp.contains("3")) {
                result++;
                continue;
            }

            if(cnt == n) break;
            cnt++;
            result++;
        }

        return result;
    }

    public static int solution2(int n) {
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result++;

            if(result % 3 == 0 || String.valueOf(result).contains("3")) i--;
        }

        return result;
    }
}
