package OOL.Inheritance;

public class Main extends Human{

    // Human 을 상속받아서 가능한 생성자
    Main(String name){
        // Human 에 필드를 상속받아 name 넣어주기
        this.name = name;
    }

    public static void main(String[] args) {

        // main 이름의 인스턴스 생성
        Main main = new Main("잠만보");

        main.eatPrint();
        main.movePrint();

    }
}
