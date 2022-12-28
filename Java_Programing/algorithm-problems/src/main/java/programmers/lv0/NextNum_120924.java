package programmers.lv0;

// 다음에 올 숫자
// https://school.programmers.co.kr/learn/courses/30/lessons/120924
public class NextNum_120924 {
    public static void main(String[] args) {
//        int[] common = {1, 2, 3 ,4};
        int[] common = {1, 2 ,4};

        System.out.println(solution(common));
    }

    public static int solution(int[] common) {
        int chk = common[1] - common[0];

        if(common[2] - common[1] == chk) {
            return common[common.length - 1] + chk;
        }
        else {
            if(common[0] == 1) {
                return (int) Math.pow(common[1], common.length);
            }
            else return (int) Math.pow(common[0], common.length);
        }
    }
}
