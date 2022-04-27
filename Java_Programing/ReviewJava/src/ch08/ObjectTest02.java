package ch08;

public class ObjectTest02 {
    public static void main(String[] args) {

        // 생성된 객체의 메모리 주소정보 보기
        Student student1 = new Student("김둘리", 83);
        System.out.println("student1 객체의 해시코드 값 : " + student1.hashCode());

        Student student2 = new Student("김둘리", 83);
        System.out.println("student2 객체의 해시코드 값 : " + student2.hashCode());
    }
}
