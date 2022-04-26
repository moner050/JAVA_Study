package ch06.interface01;

// Singer 인터페이스가 Gamer 인터페이스를 상속받았으니 doGame 을 오버라이드 가능하다.
public class Student implements Singer{

    String name;
    int score;

    Student(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    @Override
    public void doGame() {
        System.out.println(name + "이 게임을 한다.");
    }

    @Override
    public void singSong() {
        System.out.println(name +"이 노래를 부른다.");
    }
}
