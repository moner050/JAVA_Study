package ch05.promotion02;

public class TVClientTest {
    public static void main(String[] args) {

        TV samsungTv = new SamsungTV();
        TV lgTv = new LgTV();

        samsungTv.powerOn();
        samsungTv.volumeUp();
        samsungTv.volumeDown();
        samsungTv.powerOff();

        lgTv.powerOn();
        lgTv.volumeUp();
        lgTv.volumeDown();
        lgTv.powerOff();

    }
}
