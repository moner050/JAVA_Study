package ch01;

public class OperatorTest3 {
    public static void main(String[] args) {
        char gender = 'F';
        int score = 87;

        System.out.println(gender == 'F' || (score % 0) == 0);
    }
}
