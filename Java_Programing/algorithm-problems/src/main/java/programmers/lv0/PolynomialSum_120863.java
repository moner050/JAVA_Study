package programmers.lv0;

// 다항식 더하기
// https://school.programmers.co.kr/learn/courses/30/lessons/120863
public class PolynomialSum_120863 {
    public static void main(String[] args) {
//        String polynomial = "3x + 7 + x";
        String polynomial = "7 + 8";

        System.out.println(solution(polynomial));
    }

    public static String solution(String polynomial) {
        StringBuilder sb = new StringBuilder();
        int fstNum = 0, lastNum = 0;
        String[] numbers = polynomial.replaceAll(" ", "").replaceAll("X", "").split("[+]");

        for (String num : numbers) {
            if(num.contains("x")) {
                if(num.length() >= 2) {
                    fstNum += Integer.parseInt(num.replaceAll("x", ""));
                }
                else fstNum++;
            }
            else {
                lastNum += Integer.parseInt(num);
            }
        }


        if(fstNum != 0) {
            if(fstNum == 1) sb.append("x");
            else sb.append(fstNum).append("x");
        }

        if(fstNum == 0 && lastNum != 0) sb.append(lastNum);

        if(fstNum != 0 && lastNum != 0) sb.append(" + ").append(lastNum);;

        return sb.toString();
    }
}
