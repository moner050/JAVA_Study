package effectiveJava.item3.singletonTest;

public class MainSingleton {
    public static void main(String[] args) {

        // public static 맴버가 final 필드인 방식의 Singleton
        Singleton1 chk1_s1 = Singleton1.s1;
        Singleton1 chk2_s1 = Singleton1.s1;
        // 둘이 주소값이 같은지 확인
        System.out.println(chk1_s1 == chk2_s1);


        // 정적 팩터리 메서드를 public static 멤버로 제공하는 방식의 Singleton
        Singleton2 chk1_s2 = Singleton2.getInstance();
        Singleton2 chk2_s2 = Singleton2.getInstance();
        // 둘이 주소값이 같은지 확인
        System.out.println(chk1_s2 == chk2_s2);


        // 열거 타입 싱글턴
        Singleton3 chk1_s3 = Singleton3.s3;
        Singleton3 chk2_s3 = Singleton3.s3;
        // 둘이 주소값이 같은지 확인
        System.out.println(chk1_s3 == chk2_s3);
    }
}
