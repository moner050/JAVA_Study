package programmers.lv0;

// 영어가 싫어요
// https://school.programmers.co.kr/learn/courses/30/lessons/120894
public class IHateEnglish_120894 {
    public static void main(String[] args) {
        String numbers = "onetwothreefourfivesixseveneightnine";
//        String numbers = "onefourzerosixseven";

        System.out.println(solution(numbers));
    }

    public static long solution(String numbers) {
        String[] numberList = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < numberList.length; i++) {
            numbers = numbers.replaceAll(numberList[i], String.valueOf(i));
        }

        return Long.parseLong(numbers);
    }
}
