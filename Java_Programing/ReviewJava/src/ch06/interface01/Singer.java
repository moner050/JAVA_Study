package ch06.interface01;

// 인터페이스간에 상속도 가능하다.
public interface Singer extends Gamer{
    int AUDITION_MAX_CHANCE = 10;
    int GAME_MAX_LEVEL = 99;

    void singSong();
}
