package effectiveJava.item1.returnParameter;

public class MainHuman {
    public static void main(String[] args) {
        // walk run sleep
        Human human = Human.doSomething("walk");
        System.out.println(human.getClass().getName());
    }
}
