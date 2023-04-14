package programmers.lv0;

// 홀짝에 따라 다른 값 반환하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181935
public class ReturnOtherResultOddEven_181935 {
    public static void main(String[] args) {
//        int n = 7;
        int n = 10;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int result = 0;

        if(n % 2 == 1) {
            for (int i = 1; i <= n; i+=2) {
                result += i;
            }
        }
        else {
            for (int i = 2; i <= n; i+=2) {
                result += Math.pow(i, 2);
            }
        }

        return result;
    }

    public static int solution2(int n) {
        if (n % 2 == 1) return (n + 1) * (n + 1) / 2 / 2;
        else return 4 * n/2 * (n/2 + 1) * (2 * n/2 + 1) / 6;
    }
}
