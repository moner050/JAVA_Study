package effectiveJava.item1.getNameTest;

public class StaticSeoul {
    private String name;

    // private 생성자
    private StaticSeoul(String name){
        this.name = name;
    }

    // 정적 팩토리 메서드를 사용하면 어떤 역활을 하는지 명시적인 표현이 가능하다
    public static StaticSeoul hangangDiveWithNameFrom(String name) {
        return new StaticSeoul(name);
    }
}
