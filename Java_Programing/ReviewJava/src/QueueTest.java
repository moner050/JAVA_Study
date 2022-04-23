import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class test {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Queue<Integer> queue = new LinkedList<Integer>();

        int n = 3;
        for(int i = 1; i <= n; i++)
        {
            queue.add(i);
        }

        while(n-- > 0)
        {
            String[] input = br.readLine().split(" ");
            switch(input[0])
            {
                case "enqueue":
                    queue.add(Integer.valueOf(input[1]));
                    System.out.println(queue);
                    break;
                case "dequeue":
                    queue.remove();
                    System.out.println(queue);
                    break;
                default:
                    break;
            }
        }
    }
}
