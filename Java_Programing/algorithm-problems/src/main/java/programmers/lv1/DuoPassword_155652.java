package programmers.lv1;

// 둘만의 암호
// https://school.programmers.co.kr/learn/courses/30/lessons/155652
public class DuoPassword_155652 {
    public static void main(String[] args) {
        String s = "aukks", skip = "wbqd";
        int index = 5;
//        String s = "abcdefghijklmnopqrstuvwxyz", skip = "az";
//        int index = 20;

        System.out.println(solution(s, skip, index));
    }

    public static String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) {
            for (int i = 0; i < index; i++) {
                do {
                    c = (char) (c + 1);
                    if(c > 'z') c = 'a';
                } while(skip.contains(String.valueOf(c)));
            }
            sb.append(c);
        }

        return sb.toString();
    }

}
