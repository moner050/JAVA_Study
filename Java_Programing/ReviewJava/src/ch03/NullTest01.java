package ch03;

public class NullTest01 {

    public static void main(String[] args) {
        int[] scoreList = {83, 76, 99, 100, 68};
        System.out.println(scoreList);

        scoreList = null;
        System.out.println(scoreList);

        String name = "김둘리";
        System.out.println(name);

        name = null;
        System.out.println(name);
    }
}
