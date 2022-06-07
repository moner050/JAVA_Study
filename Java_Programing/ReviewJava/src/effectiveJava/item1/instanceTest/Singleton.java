package effectiveJava.item1.instanceTest;

public class Singleton {
    // 외부에 제공할 자기 자신의 인스턴스.
    private static Singleton instance = null;
    private Singleton() { }

    public static Singleton getInstance(){
        // 만약 instance 가 null 이면 instance 생성
        if(instance == null) instance = new Singleton();

        return Singleton.instance;
    }
}
