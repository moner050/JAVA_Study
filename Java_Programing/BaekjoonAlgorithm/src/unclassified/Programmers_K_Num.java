package unclassified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands)
    {
        int[] answer = new int[commands.length];

        for (int l = 0; l < commands.length; l++)
        {
            List<Integer> temp = new ArrayList<>();
            int i = commands[l][0], j = commands[l][1], k = commands[l][2];

            for (int n = i - 1; n < j; n++)
            {
                temp.add(array[n]);
            }
            Collections.sort(temp);

            answer[l] = temp.get(k-1);
        }
        return answer;
    }
}

public class Programmers_K_Num {

    public static void main(String[] args)
    {
        Solution solution = new Solution();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result =  solution.solution(array, commands);

        for (int n : result)
        {
            System.out.print(n + " ");
        }
    }
}
