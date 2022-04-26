package ch06.interface03;


public class InterfaceTest03 {
    public static void main(String[] args) {
        Calculable[] memberList = {new UniversityStudent(), new HighStudent(),new RPGGamer()};

        for (int i = 0; i < memberList.length; i++)
        {
            memberList[i].calculate();
        }
    }
}
