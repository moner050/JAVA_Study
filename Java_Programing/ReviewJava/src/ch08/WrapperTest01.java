package ch08;

public class WrapperTest01 {
    public static void main(String[] args) {
        Object[] objectList = new Object[3];
        objectList[0] = new Student("김둘리", 83);
        objectList[1] = new String("박또치");
        objectList[2] = new Integer(100);

        System.out.println(objectList[0].toString());
        System.out.println(objectList[1].toString());
        System.out.println(objectList[2].toString());
    }
}
