package ch08;

public class WrapperTest03 {
    public static void main(String[] args) {

        int score1 = 83;
        // 정상적인 박싱
        Integer wrapperInt1 = Integer.valueOf(score1);
        // 정상적인 언박싱
        int basicInt1 = wrapperInt1.intValue();
        System.out.println("점수1 : " + basicInt1);


        int score2 = 100;
        // 오토 박싱
        Integer wrapperInt2 = score2;
        // 오토 언박싱
        int basicInt2 = wrapperInt2;
        System.out.println("점수2 : " + basicInt2);
    }
}
