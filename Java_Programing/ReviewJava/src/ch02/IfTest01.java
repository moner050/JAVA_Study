package ch02;

public class IfTest01 {

    public static void main(String[] args) {
        // 60점 이상이면 고득접으로 합격입니다 출력
        int javaScore = 89;

        if(javaScore >= 60)
        {
            if(javaScore >= 80) {System.out.print("고득점으로 ");}
            System.out.println("합격입니다.");
        }
    }

}
