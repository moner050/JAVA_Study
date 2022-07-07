package effectiveJava.item6;

public class StringTest {

    public static void main(String[] args) {
        // 시간 측정
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            String s = new String("Java");
            String s = "java";
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("걸린 시간 : " + end +"ms");
    }
}
