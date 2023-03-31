package programmers.lv1;

// 카드 뭉치
// https://school.programmers.co.kr/learn/courses/30/lessons/159994
public class Cards_159994 {
    public static void main(String[] args) {
/*        String[] cards1 = {"i", "drink", "water"},
                cards2 = {"want", "to"},
                goal = {"i", "want", "to", "drink", "water"};*/

/*        String[] cards1 = {"i", "water", "drink"},
                cards2 = {"want", "to"},
                goal = {"i", "want", "to", "drink", "water"};*/

        String[] cards1 = {"a", "b", "c"},
                cards2 = {"d", "e"},
                goal = {"b", "c", "d", "e"};

        System.out.println(solution(cards1, cards2, goal));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        int idx1 = 0, idx2 = 0;

        for (String s : goal) {
            if (idx1 < cards1.length && s.equals(cards1[idx1])) {
                idx1++;
            } else if (idx2 < cards2.length && s.equals(cards2[idx2])) {
                idx2++;
            } else return "No";
        }

        return "Yes";
    }
}
