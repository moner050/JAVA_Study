package decoratorPatternTest;

public class Latte extends Decorator{

    // 상위클래스에서 기본생성자가 없기 때문에 매개변수가 있는 생성자가 super() 를 명시적으로 생성해야한다.
    public Latte(Coffee coffee) {
        super(coffee);
    }

    public void brewing()
    {
        super.brewing();
        System.out.print(" Adding Milk");
    }
}
