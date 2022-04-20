package decoratorPatternTest;

// 상속용으로만 쓸것이기 때문에 abstract 선언
public abstract class Decorator extends Coffee{

    Coffee coffee;
    public Decorator(Coffee coffee)
    {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
    }
}
