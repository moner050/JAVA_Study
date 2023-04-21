package programmers.lv0;

// 배열 비교하기
// https://school.programmers.co.kr/learn/courses/30/lessons/181856
public class CompareArr_181856 {
    public static void main(String[] args) {
        int[] arr1 = {49, 13}, arr2 = {70, 11, 2};

        System.out.println(solution(arr1, arr2));
    }

    public static int solution(int[] arr1, int[] arr2) {
        if(arr1.length == arr2.length) {
            int total1 = 0, total2 = 0;

            for (int num1 : arr1) {
                total1 += num1;
            }

            for (int num2 : arr2) {
                total2 += num2;
            }
            return Integer.compare(total1, total2);
        }
        else {
            return arr1.length > arr2.length ? 1 : -1;
        }
    }
}
