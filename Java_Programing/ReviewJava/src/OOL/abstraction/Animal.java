package OOL.abstraction;

public abstract class Animal {

    // 동물의 이름과 울음소리를 받는다.
    protected String name;
    protected String speak;

    // 동물의 이름을 매개변수로 받는 생성자
    public Animal(String name) {
        this.name = name;
    }

    // 추상화 메서드 제공(상속받는 클래스들은 무조건 오버라이드 해서 구현해야함!)
    abstract void speaking();
}

class Cat extends Animal{

    public Cat(String name) {
        super(name);
        this.speak = "야옹";
    }

    @Override
    void speaking() {
        System.out.println("안뇽 나는 " + this.name + "이다옹 " + this.speak + "~!~");
    }
}

class Tiger extends Animal{

    public Tiger(String name) {
        super(name);
        this.speak = "어흥";
    }

    @Override
    void speaking() {
        System.out.println("안녕하세요 저는 " + this.name + "입니다. " + this.speak + "!!!");
    }
}
