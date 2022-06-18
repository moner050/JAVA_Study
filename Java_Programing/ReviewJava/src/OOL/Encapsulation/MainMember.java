package OOL.Encapsulation;

public class MainMember {

    public static void main(String[] args) {

        Member lee = new Member();
        Member kim = new Member();

        lee.setId("lee1234");
        lee.setPassword("12345");

        kim.setId("kim9999");
        kim.setPassword("987654");

        System.out.println(lee.toString());
        System.out.println(kim.toString());
    }

}
