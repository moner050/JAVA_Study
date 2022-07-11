package effectiveJava.item6;

public class Strings {
    public static void main(String[] args) {
        String hello1 = "hello";
        // 해당 방법을 사용 X
        String hello2 = new String("hello");
        String hello3 = "hello";

        // false
        System.out.println("hello1 == hello2 : " + (hello1 == hello2));
        System.out.println("hello1.equals(hello2) : " + hello1.equals(hello2));

        System.out.println();
        // true
        System.out.println("hello1 == hello3 : " + (hello1 == hello3));
        System.out.println("hello1.equals(hello3) : " + hello1.equals(hello3));
    }
}