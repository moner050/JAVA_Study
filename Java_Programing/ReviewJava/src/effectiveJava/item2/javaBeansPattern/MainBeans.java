package effectiveJava.item2.javaBeansPattern;

public class MainBeans {

  public static void main(String[] args) {

    Member jung = new Member();

    jung.setId("test1234");
    jung.setName("정재원");
    jung.setPassword("test5678");
    jung.setAge(20);
    System.out.println(jung.toString());
  }

}
