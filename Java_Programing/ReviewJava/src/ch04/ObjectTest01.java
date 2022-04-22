package ch04;

public class ObjectTest01 {
    public static void main(String[] args) {

        Student lee = new Student();

        lee.score = 84;
        System.out.println("lee의 점수 : " + lee.score);

        Student copyLee = lee;
        copyLee.score = 65;

        // 참조변수는 기본타입의 변수와 달리 객체의 주소 정보가 할당된다.
        System.out.println("lee의 점수 : " + lee.score);
        System.out.println("copyLee의 점수 : " + copyLee.score);
    }
}
