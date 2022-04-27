package ch08;

public class StringTest03 {
    public static void main(String[] args) {
        String studentInfo = "STUDENT_NO=STD-000001&NAME=김둘리&SCORE=83&MAJOR=컴퓨터 공학";

        String[] parameters = studentInfo.split("&");

        for (String parameter : parameters)
        {
            String[] param = parameter.split("=");
            if(param[0].equals("STUDENT_NO")) System.out.println("학번(STUDENT_NO) : " + param[1]);
            else if(param[0].equals("NAME")) System.out.println("이름(NAME) : " + param[1]);
            else if(param[0].equals("SCORE")) System.out.println("점수(SCORE) : " + param[1]);
            else if(param[0].equals("MAJOR")) System.out.println("전공(MAJOR) : " + param[1]);
        }
    }
}
