package ch08;

public class StringBufferTest01 {
    public static void main(String[] args) {
        // String 과 달리 StringBuffer 는 가변 길이 문자열을 제공한다.
        StringBuffer student = new StringBuffer("김둘리");
        System.out.println(student.hashCode());

        // 문자열을 추가해도 주소는 똑같다.
        student = student.append("(컴퓨터 공학)");
        System.out.println(student.hashCode());
    }
}
