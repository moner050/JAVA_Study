package programmers.lv2;

// 다음 큰 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/12911
public class NextBigNumber_12911 {
    public static void main(String[] args) {
        int n = 78;

        System.out.println(solution1(n));
        System.out.println(solution2(n));
    }

    public static int solution1(int n) {
        int oneCnt = Integer.bitCount(n);
        int sameCnt = n + 1;

        while(true) {
            if(oneCnt == Integer.bitCount(sameCnt)){
                break;
            }
            else {
                sameCnt++;
            }
        }

        return sameCnt;
    }

    public static int solution2(int n) {
        // if n == 78

        // 0100 1110 & 0011 0010 = 0010
        int postPattern = n & -n;
        // 0100 1110 ^ 0101 0000 = 0001 1110
        int smallPattern = n ^ (n + postPattern);
        // 30 / 2 = 15
        int smallPattern1 = smallPattern / postPattern;
        // 1111 >> 2 = 0011
        int smallPattern2 = smallPattern1 >> 2;

        // 0101 0000 | 0000 0011 = 0101 0011
        return n + postPattern | smallPattern2;
    }
}
