package ch03;

public class ArrayTest07 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < args.length; i++)
        {
            sum = sum + Integer.parseInt(args[i]);
        }

        System.out.println(args.length + "명의 평균 점수 : " +
                (double) sum/args.length);
    }
}
