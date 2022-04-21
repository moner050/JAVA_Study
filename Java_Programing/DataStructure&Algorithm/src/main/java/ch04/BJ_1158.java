package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BJ_1158 {
    /*
    요세푸스 문제는 다음과 같다.

    1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 K(≤ N)가 주어진다.
    이제 순서대로 K번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다.
    이 과정은 N명의 사람이 모두 제거될 때까지 계속된다.
    원에서 사람들이 제거되는 순서를 (N, K)-요세푸스 순열이라고 한다.
    예를 들어 (7, 3)-요세푸스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

    N과 K가 주어지면 (N, K)-요세푸스 순열을 구하는 프로그램을 작성하시오.

    첫째 줄에 N과 K가 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ K ≤ N ≤ 5,000)
     */

    public static void main(String[] args) throws IOException {

        // 1차원적 악으로 깡으로 풀어보기

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();       // 제거한 사람을 넣을 배열

        int cnt = 1, temp = 0;      // M과 비교할 수와 temp 선언

        // 입력값을 띄어쓰기 기준으로 배열로 나누기.
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        // 1부터 N 번째까지 순서대로 queue 에 데이터 넣기
        for(int i = 1; i <= N; i++)
        {
            queue.offer(i);
        }

        while(!queue.isEmpty())
        {   // temp 에 queue 의 가장 첫번째값 빼서 넣고
            temp = queue.poll();
            if(cnt != K)            // 만약 cnt 가 K 와 같지 않다면(K 번째가 아니라면)
            {
                queue.offer(temp);  // queue 에 가장 첫번째였던 값을 넣고
                cnt++;              // cnt++
            }
            else                    // 만약 cnt 가 K 와 같다면(K 번째 라면)
            {
                result.add(temp);   // result 배열에 temp를 넣고
                cnt = 1;            // cnt 및 temp 초기화
                temp = 0;
            }
        }

        // 그리고 1차원적으로 출력하기.
        System.out.print("<");
        for(int i = 0; i < result.size(); i++)
        {   // 마지막에만 , 를 제거하게 설정.
            if(i != result.size()-1) System.out.print(result.get(i) + ", ");
            else System.out.print(result.get(i));
        }
        System.out.print(">");
    }

}
