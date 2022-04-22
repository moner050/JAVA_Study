package MultiThreadTest;

class Bank
{
    private int money = 10000;

    // 어떤 쓰레드가 synchronized 가 붙은 메서드를 수행하는 동안 다른 메서드들이 접근을 못하게 막아준다.
    public void saveMoney(int save)
    {
        // saveMoney 가 수행되는 동안 synchronized 에 lock 을 걸어라
        int m = getMoney();

        // 3초 대기
        try
        {
            Thread.sleep(3000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        setMoney(m + save);

    }

    public synchronized void minusMoney(int minus)
    {
        int m = getMoney();

        // 0.2초 대기
        try
        {
            Thread.sleep(200);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        setMoney(m - minus);
    }


    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}

class Park extends Thread {
    public void run()
    {
        synchronized(SyncMain.myBank)
        {
            System.out.println("start save");
            SyncMain.myBank.saveMoney(3000);    // 3000원 저금
            System.out.println("saveMoney(3000) : " + SyncMain.myBank.getMoney());
        }
    }
}

class ParkWife extends Thread{
    public void run()
    {
        synchronized(SyncMain.myBank) {
            System.out.println("start minus");
            SyncMain.myBank.minusMoney(1000);    // 3000원 저금
            System.out.println("minusMoney(1000) : " + SyncMain.myBank.getMoney());
        }
    }
}

public class SyncMain {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();
        ParkWife pw = new ParkWife();
        // 박씨 와이프가 돈 쓰기 시작
        pw.start();

        // 0.2초 기다리기
        Thread.sleep(200);

        // 박씨가 돈 저금 시작
        p.start();
    }
}
