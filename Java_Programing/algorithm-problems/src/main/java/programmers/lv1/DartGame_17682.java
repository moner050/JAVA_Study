package programmers.lv1;

// 다트 게임
// https://school.programmers.co.kr/learn/courses/30/lessons/17682
public class DartGame_17682 {
    public static void main(String[] args) {
//        String dartResult = "1S2D*3T";
        String dartResult = "1D2S#10S";

        System.out.println(solution(dartResult));
    }

    public static int solution(String dartResult) {
        int answer = 0;

        StringBuilder temp = new StringBuilder();
        int[] arr = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case '*' :
                    arr[idx - 1] *= 2;
                    if(idx > 1) arr[idx - 2] *= 2;
                    break;
                case '#' :
                    arr[idx - 1] *= -1;
                    break;
                case 'S' :
                    arr[idx++] = (int)Math.pow(Integer.parseInt(temp.toString()), 1);
                    temp = new StringBuilder();
                    break;
                case 'D' :
                    arr[idx++] = (int)Math.pow(Integer.parseInt(temp.toString()), 2);
                    temp = new StringBuilder();
                    break;
                case 'T' :
                    arr[idx++] = (int)Math.pow(Integer.parseInt(temp.toString()), 3);
                    temp = new StringBuilder();
                    break;
                default :
                    temp.append(dartResult.charAt(i));
                    break;
            }
        }

        for (int num : arr) {
            answer += num;
        }

        return answer;
    }
}
