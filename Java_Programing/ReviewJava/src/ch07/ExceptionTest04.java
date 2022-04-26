package ch07;

public class ExceptionTest04 {
    public static void main(String[] args) {

        int javaScore = Integer.parseInt(args[0]);

        // 0보다 작은 수가 들어오면 강제적으로 예외를 발생시켜 더이상 프로그램이 진행되지 않도록 throw 예약어 사용
        if(javaScore < 0) throw new IllegalArgumentException();

        System.out.println("입력한 자바점수 : " + javaScore);

    }
}
