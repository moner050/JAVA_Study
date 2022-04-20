package ch03;

public class ArrayTest10 {

    public static void main(String[] args) {
        int[][] scoreList = {
                {76, 92, 49, 78, 83},
                {88, 69},
                {99, 92, 89}};

        for (int i = 0; i < scoreList.length; i++)
        {
            for (int j = 0; j < scoreList[i].length; j++)
            {
                System.out.print("["+i+"]["+j+"]("+scoreList[i][j]+") ");
            }
            System.out.println("");
        }

    }
}
