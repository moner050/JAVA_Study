package programmers.lv0;

// 커피 심부름
// https://school.programmers.co.kr/learn/courses/30/lessons/181837
public class CoffeeErrands_181837 {
    public static void main(String[] args) {
        String[] order = {"cafelatte", "americanoice", "hotcafelatte", "anything"};

        System.out.println(solution(order));
    }

    public static int solution(String[] order) {
        int result = 0;
        for (String o : order) {
            if(o.equals("anything") || o.contains("americano")) result += 4500;
            else result += 5000;
        }

        return result;
    }
}
