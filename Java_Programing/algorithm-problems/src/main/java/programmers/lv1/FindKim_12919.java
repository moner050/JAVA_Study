package programmers.lv1;

// https://school.programmers.co.kr/learn/courses/30/lessons/12919
public class FindKim_12919 {
    public static void main(String[] args) {
        String[] arr = {"Jane", "Kim"};
        System.out.println(solution(arr));
    }

    public static String solution(String[] seoul) {
        StringBuilder sb = new StringBuilder();
        sb.append("김서방은 ");

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].equalsIgnoreCase("Kim")) {
                sb.append(i);
                break;
            }
        }

        sb.append("에 있다");
        return sb.toString();
    }
}
