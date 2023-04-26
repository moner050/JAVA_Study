package programmers.lv0;

// 조건에 맞게 수열 변환하기 2
// https://school.programmers.co.kr/learn/courses/30/lessons/181881
public class ChangeArr_181881 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 100, 99, 98};

        System.out.println(solution(arr));
    }

    public static int solution(int[] arr) {
        int result =0;

        while(true) {
            boolean chk = false;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] = arr[i] % 2;
                    chk = true;
                }
                else if(arr[i] < 50 && arr[i] % 2 == 1) {
                    arr[i] = (arr[i] * 2) + 1;
                    chk = true;
                }
            }
            if(chk) result++;
            else break;
        }

        return result;

    }
}
