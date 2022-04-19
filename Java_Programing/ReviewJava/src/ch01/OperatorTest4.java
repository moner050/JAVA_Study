package ch01;

public class OperatorTest4 {
    public static void main(String[] args) {
        int javaScore = 83;
        System.out.println((javaScore > 60) ? "합격" : "불합격"); // 합격

        int pythonScore = 55;
        String result = (pythonScore > 60) ? "합격" : "불합격";
        System.out.println("Python 시험 결과 : " + result);
    }
}
