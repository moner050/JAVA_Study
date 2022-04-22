package ch04.packageTest;

// 클래스 선언
public class Student {

    // 맴버 변수
    public String name = "둘리";
    public int score = 52;

    // 생성자 메소드
    public Student()
    {
        System.out.println("===> package안의 Student 객체 생성");
    }

    // 맴버 메소드
    public int forTest()
    {
        int sum = 0;
        for(int i = 1; i <= 100; i++)
        {
            sum += i;
        }
        return sum;
    }

    public String printInfo()
    {
        return name + "의 점수 : " + score;
    }

    public double printAvg(int javaScore, int pythonScore, int sqlScore)
    {
        System.out.println("printAvg(int, int, int) 호출");
        int sumScore = javaScore + pythonScore + sqlScore;
        int avgScore = sumScore / 3;
        return avgScore;
    }

}