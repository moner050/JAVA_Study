package effectiveJava.item6;

public class MainEmail {

    public static void main(String[] args) {

        // 정적팩터리 메서드를 이용해 이메일 검증
        long start = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++)
        {
            boolean emailCheckStatic = StaticEmailValidate.isEmail("tesasdf234@gmail.com");
//            boolean emailCheck = EmailValidate.email("t156fasd19@naver.com");
        }
        long end = System.currentTimeMillis() - start;
        System.out.println("걸린 시간 : " + end +"ms");
    }
}
