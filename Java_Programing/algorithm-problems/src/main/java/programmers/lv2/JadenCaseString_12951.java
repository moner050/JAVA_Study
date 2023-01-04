package programmers.lv2;

// JadenCase 문자열 만들기
// https://school.programmers.co.kr/learn/courses/30/lessons/12951
public class JadenCaseString_12951 {
    public static void main(String[] args) {
//        String s = "3people unFollowed me";
        String s = "3people          unFollowed me ";

        System.out.println(solution1(s));
        System.out.println(solution2(s));
    }

    public static String solution1(String s) {
        StringBuilder sb = new StringBuilder();
        boolean spaceCheck = false;

        s = s.toLowerCase();

        for (int i = 0; i < s.length(); i++) {
            if(i == 0) {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                continue;
            }

            if(spaceCheck && s.charAt(i) != ' ') {
                sb.append(String.valueOf(s.charAt(i)).toUpperCase());
                spaceCheck = false;
                continue;
            }
            else if(!spaceCheck && s.charAt(i) == ' ') {
                sb.append(s.charAt(i));
                spaceCheck = true;
            }
            else sb.append(s.charAt(i));
        }

        return sb.toString();
    }

    public static String solution2(String s) {
        StringBuilder sb = new StringBuilder();

        boolean spaceCheck = true;
        String[] strs = s.toLowerCase().split("");

        for (String txt : strs) {
            sb.append(spaceCheck ? txt.toUpperCase() : txt);
            spaceCheck = txt.equals(" ");
        }

        return sb.toString();
    }
}
