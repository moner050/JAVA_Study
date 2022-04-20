package ch02;

public class BreakTest02 {

    public static void main(String[] args) {
        outer: for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= 5; j++)
            {   // 만약 j 가 i 보다 크면 outer 로 돌아감
                if(j > i) break outer;
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
