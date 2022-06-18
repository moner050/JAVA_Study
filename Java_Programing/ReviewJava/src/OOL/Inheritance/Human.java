package OOL.Inheritance;

import OOL.Inheritance.eat.Eat;
import OOL.Inheritance.move.Move;

public class Human implements Eat, Move {

    // 필드 선언
    protected String name;

    @Override
    public void eatPrint() {
        System.out.println(name + "가 먹는다");
    }

    @Override
    public void movePrint() {
        System.out.println(name + "가 움직인다");
    }
}
