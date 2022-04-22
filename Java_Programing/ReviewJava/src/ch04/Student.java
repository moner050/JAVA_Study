package ch04;

// 클래스 선언
public class Student {

    // 맴버 변수
    public String name = "둘리";
    public int score = 52;

    // 생성자 메소드
    public Student()
    {
        System.out.println("===> Student 객체 생성");
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

    public double printAvg(double javaScore, double pythonScore)
    {
        System.out.println("printAvg(int, int, int) 호출");
        double sumScore = javaScore + pythonScore;
        double avgScore = sumScore / 3;
        return avgScore;
    }

    public int printAvg(double javaScore, int pythonScore)
    {
        System.out.println("printAvg(int, int, int) 호출");
        int sumScore = (int) (javaScore + pythonScore);
        int avgScore = sumScore / 2;
        return avgScore;
    }

}
