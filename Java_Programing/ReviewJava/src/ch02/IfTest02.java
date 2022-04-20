package ch02;

public class IfTest02 {

    public static void main(String[] args) {
        int javaScore = 40;

        // 60점 이상이면 합격, 30점 이하면 패널티 대상이라고 출력
        if(javaScore >= 60) System.out.println(javaScore + "점은 합격입니다.");
        else
        {
            if(javaScore <= 30) System.out.println(javaScore + "점은 패널티 대상입니다.");
            else System.out.println(javaScore + "점은 불합격입니다.");
        }
    }

}
