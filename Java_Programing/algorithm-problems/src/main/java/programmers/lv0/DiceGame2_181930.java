package programmers.lv0;

// 주사위 게임 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181930
public class DiceGame2_181930 {
    public static void main(String[] args) {
        int a = 2,  b = 6,  c = 1;

        System.out.println(solution(a, b, c));
    }

    public static int solution(int a, int b, int c) {
        if(a != b && b != c && a != c) return a + b + c;
        else if((a == b && b != c) || (a != b && b == c) || (a == c && b != c)) return (a + b + c) * ((int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)));
        else return (a + b + c) * ((int)(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))) * ((int)(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3)));
    }
}
