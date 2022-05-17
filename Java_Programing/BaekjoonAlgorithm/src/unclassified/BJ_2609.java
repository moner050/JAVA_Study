package unclassified;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class BJ_2609 {
    public static BigInteger lcm(BigInteger n , BigInteger m)
    {
        BigInteger max = m.gcd(n);
        return n.multiply(m).divide(max);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        BigInteger firstNum = BigInteger.valueOf(arr[0]);
        BigInteger secondNum = BigInteger.valueOf(arr[1]);

        // 최대공약수
        BigInteger maxResult = firstNum.gcd(secondNum);
        // 최소공배수
        BigInteger minResult = lcm(firstNum, secondNum);

        bw.write(maxResult + "\n" + minResult);
        bw.close();
    }
}
