package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12940
public class GcdLcm_12940 {
    public static void main(String[] args) {
        int n = 3, m = 12;
//        int n = 2, m = 5;

        System.out.println(solution1(n, m)[0] + " " + solution1(n, m)[1]);
        System.out.println(solution2(n, m)[0] + " " + solution2(n, m)[1]);
    }

    public static int[] solution1(int n, int m) {
        return new int[]{gcd(n, m), lcm(n, m)};
    }

    public static int gcd(int n, int m) {
        if(n < m) {
            int temp = n;
            n = m;
            m = temp;
        }

        while(m != 0) {
            int r = n % m;
            n = m;
            m = r;
        }
        return n;
    }

    public static int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static int[] solution2(int n, int m) {
        int[] answer = new int[2];

        for (int i = 1; i < n + m; i++) {
            if(n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
            }
        }

        return answer;
    }
}
