package effectiveJava.item3.singletonTest;

public class Singleton2 {
    // public static final 맴버
    public static final Singleton2 s2 = new Singleton2();
    // private 생성자
    private Singleton2() { }
    // 정적 팩토리 메서드
    public static Singleton2 getInstance(){ return s2; }

    public void doSomething2() { }
}
