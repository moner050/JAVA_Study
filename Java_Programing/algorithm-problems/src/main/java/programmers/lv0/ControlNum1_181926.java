package programmers.lv0;

// 수 조작하기 1
// https://school.programmers.co.kr/learn/courses/30/lessons/181926
public class ControlNum1_181926 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";

        System.out.println(solution(n, control));
    }

    public static int solution(int n, String control) {
        int result = n;

        for (String c : control.split("")) {
            switch (c) {
                case "w" :
                    result++;
                    break;
                case "s" :
                    result--;
                    break;
                case "d" :
                    result += 10;
                    break;
                case "a" :
                    result -= 10;
                    break;
                default :
                    break;
            }
        }
        return result;
    }
}
