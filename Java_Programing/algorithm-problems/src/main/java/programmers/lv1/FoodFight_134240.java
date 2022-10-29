package programmers.lv1;

public class FoodFight_134240 {
//    https://school.programmers.co.kr/learn/courses/30/lessons/134240

    public static void main(String[] args) {
//        int[] foods = {1, 3, 4, 6};
        int[] foods = {1, 7, 1, 2};
        System.out.println(solution(foods));
    }

    public static String solution(int[] food) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < food.length; i++) {
            int eat = food[i] / 2;
            sb.append(String.valueOf(i).repeat(Math.max(0, eat)));
        }
        String answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}
