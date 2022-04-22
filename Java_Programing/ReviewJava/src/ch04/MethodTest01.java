package ch04;

public class MethodTest01 {

    public static void main(String[] args) {
        System.out.println("===> main() Start");
        methodA();
        System.out.println("===> main() End");
    }

    public static void methodA()
    {
        System.out.println("===> methodA Start");
        methodB();
        System.out.println("===> methodA End");
    }

    public static void methodB()
    {
        System.out.println("===> methodB 실행");
    }

}
