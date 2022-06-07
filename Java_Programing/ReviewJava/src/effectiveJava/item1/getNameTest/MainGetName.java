package effectiveJava.item1.getNameTest;

public class MainGetName {
    public static void main(String[] args) {

        // 일반 생성자를 활용하면 박태환과 서울에서 뭘 하는지 알 수 없다.
        Seoul seoul = new Seoul("박태환");

        // 정적 팩토리 매서드를 활용하면
        // 박태환과 함께 한강간다는 것을 명시적으로 표현 가능하다.
        StaticSeoul staticSeoul = StaticSeoul.hangangDiveWithNameFrom("박태환");


    }
}
