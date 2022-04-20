package ch03;

public class ArrayTest05 {

    public static void main(String[] args) {
        // 배열 객체를 생성한다.
        int[] scoreList = {76, 92, 49, 78, 83};

        int maxScore = 0;
        int minScore = 100;
        int sumScore = 0;
        int avgScore = 0;

        for (int i = 0; i < scoreList.length; i++) {
            // 배열에서 꺼낸 점수가 min 변수 값보다 낮으면 값을 변경한다.
            if (minScore > scoreList[i]) minScore = scoreList[i];

            // 배열에서 꺼낸 점수가 max 변수 값보다 낮으면 값을 변경한다.
            if (maxScore < scoreList[i]) maxScore = scoreList[i];

            // 배열에서 꺼낸 점수를 sum 변수에 누적한다.
            sumScore = sumScore + scoreList[i];
        }
        avgScore = sumScore / scoreList.length;

        System.out.println("최고 점수 : " + maxScore);
        System.out.println("최저 점수 : " + minScore);
        System.out.println("점수 총합 : " + sumScore);
        System.out.println("점수 평균 : " + avgScore);
    }
}
