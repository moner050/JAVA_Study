package ch03;

public class ArrayTest03 {

    public static void main(String[] args) {
        int[] scoreList = {76, 92, 49, 83, 100};

//		for (int i = 0; i < 5; i++)
//		{
//			System.out.println("scoreList[" + i + "] : " + scoreList[i]);
//		}

        for (int score : scoreList)
        {
            System.out.println("score : " + score);
        }
    }
}
