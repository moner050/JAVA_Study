package ch05.promotion02;

public class LgTV extends TV{

    LgTV(){
        System.out.println("===> LgTV 생성");
    }

    @Override
    void powerOn() {
        System.out.println("===> LgTV 의 전원이 켜졌습니다");
    }

    @Override
    void powerOff() {
        System.out.println("===> LgTV 의 전원이 꺼졌습니다");
    }

    @Override
    void volumeUp() {
        System.out.println("===> LgTV 의 소리를 높혔습니다.");
    }

    @Override
    void volumeDown() {
        System.out.println("===> LgTV 의 소리를 낮췄습니다.");
    }
}
