package ch08;

public class WrapperTest04 {
    public static void main(String[] args) {

        int intData = Integer.parseInt(args[0]);
        System.out.println("정수 값 : " + intData);

        double doubleData = Double.parseDouble(args[1]);
        System.out.println("실수 값 : " + doubleData);

        boolean booleanData = Boolean.parseBoolean(args[2]);
        System.out.println("논리 값 : " + booleanData);
    }
}
