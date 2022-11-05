package programmers.lv1;

//  https://school.programmers.co.kr/learn/courses/30/lessons/131128
public class NumberPartner_131128 {

    public static void main(String[] args) {
//        String X = "100";
//        String Y = "2345";
//        String X = "100";
//        String Y = "203045";
//        String X = "100";
//        String Y = "123450";
//        String X = "12321";
//        String Y = "42531";
        String X = "5525";
        String Y = "1255";

        System.out.println(solution(X, Y));
    }

    public static String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();

        String[] xString = X.split("");
        String[] yString = Y.split("");

        int[] xArr = new int[10];
        int[] yArr = new int[10];

        for (String x : xString) {
            int tempNum = Integer.parseInt(x);
            xArr[tempNum]++;
        }

        for (String y : yString) {
            int tempNum = Integer.parseInt(y);
            yArr[tempNum]++;
        }

        for (int i = 9; i >= 0; i--) {
            while(xArr[i] > 0 && yArr[i] > 0) {
                sb.append(i);
                xArr[i]--;
                yArr[i]--;
            }
        }

        if(sb.toString().isEmpty()) return "-1";
        else if(sb.toString().startsWith("0")) return "0";

        return sb.toString();
    }
}
