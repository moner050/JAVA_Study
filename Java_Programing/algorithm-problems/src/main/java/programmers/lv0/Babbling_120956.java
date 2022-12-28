package programmers.lv0;

// 옹알이
// https://school.programmers.co.kr/learn/courses/30/lessons/120956
public class Babbling_120956 {
    public static void main(String[] args) {
//        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};

        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int result = 0;
        for (String babble : babbling) {
            if(isBabble(babblingChk(babble))) result++;
        }
        return result;
    }

    public static String babblingChk(String babble) {
        String[] saying = {"aya", "ye", "woo", "ma"};
        for (int i = 0; i < saying.length; i++) {
            babble = babble.replaceAll(saying[i], String.valueOf(i));
        }
        return babble;
    }

    public static boolean isBabble(String babble) {
        for (String s : babble.split("")) {
            if(s.matches("[^0-9]")) {
                return false;
            }
        }
        return true;
    }

}
