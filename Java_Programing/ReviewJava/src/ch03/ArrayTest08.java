package ch03;

public class ArrayTest08 {

    public static void main(String[] args) {
//		int[][] scoreList = new int[3][5];
//		// 1열
//		scoreList[0][0] = 11;
//		scoreList[0][1] = 12;
//		scoreList[0][2] = 13;
//		scoreList[0][3] = 14;
//		scoreList[0][4] = 15;
//		// 2열
//		scoreList[1][0] = 21;
//		scoreList[1][1] = 22;
//		scoreList[1][2] = 23;
//		scoreList[1][3] = 24;
//		scoreList[1][4] = 25;
//		// 3열
//		scoreList[2][0] = 31;
//		scoreList[2][1] = 32;
//		scoreList[2][2] = 33;
//		scoreList[2][3] = 34;
//		scoreList[2][4] = 35;

        int[][] scoreList = {{11,12,13,14,15},
                {21,22,23,24,25},
                {31,32,33,34,35}};

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.print(scoreList[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
