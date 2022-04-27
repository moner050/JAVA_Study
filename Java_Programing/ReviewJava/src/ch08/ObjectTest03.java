package ch08;

public class ObjectTest03 {
    public static void main(String[] args) {
        Student lee = new Student("이완용", 18);
        System.out.println(lee.toString());
        System.out.println(lee.hashCode());

        Student kim = new Student("김말이", 88);
        System.out.println(kim.toString());
        System.out.println(kim.hashCode());

        System.out.println(lee.equals(kim));
    }
}
