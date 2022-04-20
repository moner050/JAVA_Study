package ch02;

public class IfTest03 {

    public static void main(String[] args) {
        // 90점 이상이면 A, 80점 이상이면 B, 70점 이상이면 C, 60점 이상이면 D, 그 미만이면 F 등급 출력
        int javaScore = 89;

        if(javaScore >= 90) System.out.println(javaScore + "점은 A 등급입니다.");
        else if(javaScore >= 80) System.out.println(javaScore + "점은 B 등급입니다.");
        else if(javaScore >= 70) System.out.println(javaScore + "점은 C 등급입니다.");
        else if(javaScore >= 60) System.out.println(javaScore + "점은 D 등급입니다.");
        else System.out.println(javaScore + "점은 F 등급입니다.");
    }

}
