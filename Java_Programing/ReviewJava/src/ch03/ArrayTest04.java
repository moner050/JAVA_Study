package ch03;

public class ArrayTest04 {

    public static void main(String[] args) {
        double[] scoreList = {76, 92.4, 49, 78.3, 83.7};

        System.out.println("scoreList 배열의 크기 : " + scoreList.length);

        for (int i = 0; i < scoreList.length; i++)
        {
            System.out.println("scoreList[" + i + "] : " + scoreList[i]);
        }
    }
}
