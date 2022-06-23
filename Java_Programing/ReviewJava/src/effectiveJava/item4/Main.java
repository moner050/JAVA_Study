package effectiveJava.item4;

public class Main {

    public static void main(String[] args) {

        // 이렇게 사용하길 기대했으나
        double myCircumference = MathUtility.getCircumference(10);
        System.out.println("원의 둘레 : " + myCircumference);

        // 누군가는 이렇게 인스턴스를 생성해 사용할수도 있다.
        MathUtility mathUtility = new MathUtility();
        double instanceCircumference = mathUtility.getCircumference(10);
        System.out.println("원의 둘레(인스턴스 생성)" + instanceCircumference);
    }
}
