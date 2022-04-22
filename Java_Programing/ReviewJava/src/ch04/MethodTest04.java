package ch04;

public class MethodTest04 {

    public static void main(String[] args) {

        // 두개의
        int firstScore = 99;
        int secondScore = 33;

        System.out.println("before(firstScore) : " + firstScore);
        System.out.println("before(secondScore) : " + secondScore);
        swapValue(firstScore, secondScore);

        System.out.println("after(firstScore) : " + firstScore);
        System.out.println("after(secondScore) : " + secondScore);
    }

    private static void swapValue(int score1, int score2)
    {
        int temp = score1;
        score1 = score2;
        score2 = temp;
        System.out.println("swapValue() 에서 score1 : " + score1);
        System.out.println("swapValue() 에서 score2 : " + score2);
    }
}
