package lv1;

import java.io.*;

public class BJ_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int fstNum = Integer.parseInt(br.readLine());
        String scdNum = br.readLine();

        for(int i = scdNum.length() - 1; i >= 0; i--)
        {
            int temp  = scdNum.charAt(i) - 48;
            System.out.println(fstNum * temp);
        }

        int result = fstNum * Integer.parseInt(scdNum);
        System.out.println(result);
    }
}
