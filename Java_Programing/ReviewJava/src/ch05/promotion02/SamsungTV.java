package ch05.promotion02;

public class SamsungTV extends TV{

    SamsungTV(){
        System.out.println("===> SamsungTV 생성");
    }

    @Override
    void powerOn() {
        System.out.println("===> SamsungTV 의 전원이 켜졌습니다");
    }

    @Override
    void powerOff() {
        System.out.println("===> SamsungTV 의 전원이 꺼졌습니다");
    }

    @Override
    void volumeUp() {
        System.out.println("===> SamsungTV 의 소리를 높혔습니다.");
    }

    @Override
    void volumeDown() {
        System.out.println("===> SamsungTV 의 소리를 낮췄습니다.");
    }
}
