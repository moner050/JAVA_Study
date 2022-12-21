package programmers.lv1;


// 옹알이
// https://school.programmers.co.kr/learn/courses/30/lessons/133499
public class Babbling2_133499 {
    public static void main(String[] args) {
//        String[] babbling = {"aya", "yee", "u", "maa"};
        String[] babbling = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        System.out.println(solution(babbling));
    }

    public static int solution(String[] babbling) {
        int answer = 0;
        String[] sayings = {"aya", "ye", "woo", "ma"};

        for (String babble : babbling) {
            babble = replaceKeyword(sayings, babble);

            if(babble.matches("^[0-9]*$") && isDuplicate(babble)) {
                answer++;
            }
        }
        return answer;
    }

    private static String replaceKeyword(String[] sayings, String babble) {
        for (int i = 0; i < sayings.length; i++) {
            babble = babble.replaceAll(sayings[i], String.valueOf(i));
        }
        return babble;
    }

    private static boolean isDuplicate(String babble) {
        for (int i = 0; i < babble.length() - 1; i++) {
            if(babble.charAt(i) == babble.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }


}
