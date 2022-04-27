package ch08;

public class StringTest01 {
    public static void main(String[] args) {
        String name1 = new String("김둘리");
        String name2 = new String("김둘리");
        String name3 = "김둘리";
        String name4 = "김둘리";

        if(name1 == name2)  System.out.println("name1과 name2의 주소는 같다.");
        else System.out.println("name1과 name2의 주소는 다르다.");

        if(name2 == name3)  System.out.println("name2과 name3의 주소는 같다.");
        else System.out.println("name2과 name3의 주소는 다르다.");

        if(name3 == name4) System.out.println("name3과 name4의 주소는 같다.");
        else  System.out.println("name3과 name4의 주소는 다르다.");
    }
}
