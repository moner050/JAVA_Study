package effectiveJava.item3.singletonTest;

public class Singleton1 {
    // public static final 맴버
    public static final Singleton1 s1 = new Singleton1();
    // private 생성자
    private Singleton1() { }

    public void doSomething1() { }
}
