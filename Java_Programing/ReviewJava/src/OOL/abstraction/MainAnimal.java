package OOL.abstraction;

public class MainAnimal {

    public static void main(String[] args) {

        Tiger tiger = new Tiger("호랑이");
        Cat cat = new Cat("고양이");

        tiger.speaking();
        cat.speaking();
    }
}
