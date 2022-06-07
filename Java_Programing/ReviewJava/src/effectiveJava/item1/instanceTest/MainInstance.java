package effectiveJava.item1.instanceTest;

public class MainInstance {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        // 둘이 주소값이 같나 확인. 둘 다 같은 인스턴스 주소값을 반환받으니 true
        System.out.println(singleton1 == singleton2);
    }
}
