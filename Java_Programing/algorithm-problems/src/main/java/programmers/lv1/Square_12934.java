package programmers.lv1;

public class Square_12934 {

    public static void main(String[] args) {
        System.out.println(solution(121));
        System.out.println(solution(3));
    }

    public static long solution(long n) {
        double sqrt = Math.pow(n, 0.5);
        if(sqrt % 1 == 0){
            return (long) Math.pow((sqrt + 1), 2);
        }
        else return -1;
    }
}
