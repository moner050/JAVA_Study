package ch05.promotion02;

public abstract class TV {

    TV(){
        System.out.println("===> TV 생성");
    }

    abstract void powerOn();
    abstract void powerOff();
    abstract void volumeUp();
    abstract void volumeDown();

}




