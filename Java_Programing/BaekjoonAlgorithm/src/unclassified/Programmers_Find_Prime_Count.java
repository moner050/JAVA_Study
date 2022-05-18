package unclassified;
import java.io.*;
import java.util.ArrayList;

class Solution_Prime {
    public int solution(int n) {
        if(n <= 1) return 0;

        int cnt = 0;

        ArrayList<Boolean> primeList = new ArrayList<>(n+1);
        primeList.add(false);
        primeList.add(false);

        for (int i = 2; i <= n; i++)
        {
            primeList.add(i, true);
        }

        for (int i = 2; (i * i) <= n; i++)
        {
            if(primeList.get(i))
            {
                for (int j = (i*i); j <= n; j += i)
                {
                    primeList.set(j, false);
                }
            }
        }

        for (int i = 0; i <= n; i++)
        {
            if(primeList.get(i)) cnt++;
        }
        return cnt;
    }
}
public class Programmers_Find_Prime_Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Solution_Prime solution = new Solution_Prime();

        int n = Integer.parseInt(br.readLine());
        bw.write(solution.solution(n) + "");
        bw.close();
    }
}
