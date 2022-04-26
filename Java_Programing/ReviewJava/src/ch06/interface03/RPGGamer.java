package ch06.interface03;

public class RPGGamer implements Gamer{

    String name;

    RPGGamer()
    {

    }

    RPGGamer(String name)
    {
        this.name = name;
    }

    @Override
    public void doGame() {
        System.out.println("RPG 게임을 한다.");
    }

    @Override
    public void calculate() {
        System.out.println("게이머가 계산을 한다.");
    }
}
