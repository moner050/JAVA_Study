package programmers.lv1;

// 신규 아이디 추천
// https://school.programmers.co.kr/learn/courses/30/lessons/72410
public class RecommendNewID_72410 {
    public static void main(String[] args) {
//        String new_id = "...!@BaT#*..y.abcdefghijklm";
//        String new_id = "z-+.^.";
//        String new_id = "=.=";
//        String new_id = "123_.def";
        String new_id = "abcdefghijklmn.p";

        System.out.println(solution1(new_id));
        System.out.println(solution2(new_id));
    }

    public static String solution1(String new_id) {
        String temp = "";
        StringBuilder answer = new StringBuilder(new_id.toLowerCase()
                .replaceAll("[~!@#$%^&*()=+{}:?,<>/]", "")
                .replaceAll("\\[", "")
                .replaceAll("]", "")
                .replaceAll("[.]+", "."));

        deletePoint(answer);

        if(answer.length() <= 0) {
            answer.append("a");
        }

        if(answer.length() >= 15) {
            answer.delete(15, answer.length());
        }

        temp = answer.length() <= 2 ? String.valueOf(answer.charAt(answer.length() - 1)) : "";

        while(answer.length() < 3) {
            answer.append(temp);
        }

        deletePoint(answer);

        return answer.toString();
    }

    private static StringBuilder deletePoint(StringBuilder id) {
        if(id.charAt(0) == '.') {
            id.deleteCharAt(0);
        }
        else if(id.charAt(id.length() - 1) == '.') {
            id.deleteCharAt(id.length() - 1);
        }
        return id;
    }

    public static String solution2(String new_id) {
        KakaoId kakaoId = new KakaoId(new_id)
                .replaceLowerCase()
                .filter()
                .singleDot()
                .removeFirstLastDot()
                .noBlank()
                .length16()
                .lessThen2();

        return kakaoId.result();
    }

    private static class KakaoId {
        private String s;

        public KakaoId(String s) {
            this.s = s;
        }

        private KakaoId replaceLowerCase() {
            s = s.toLowerCase();
            return this;
        }

        private KakaoId filter() {
            s = s.replaceAll("[^a-z0-9._-]", "");
            return this;
        }

        private KakaoId singleDot() {
            s = s.replaceAll("[.]{2,}", ".");
            return this;
        }

        private KakaoId removeFirstLastDot() {
            s = s.replaceAll("^[.]|[.]$", "");
            return this;
        }

        private KakaoId noBlank() {
            s = s.isEmpty() ? "a" : s;
            return this;
        }

        private KakaoId length16() {
            s = s.length() >= 15 ? s.substring(0, 15) : s;
            removeFirstLastDot();
            return this;
        }

        private KakaoId lessThen2() {
            StringBuilder sb = new StringBuilder(s);
            while(sb.length() <= 2) {
                sb.append(String.valueOf(s.charAt(s.length() - 1)));
            }
            s = sb.toString();
            return this;
        }

        private String result() {
            return s;
        }
    }
}
