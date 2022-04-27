package ch08;

public class StringTest02 {
    public static void main(String[] args) {
        String student = "Hong Kill Dong";

        System.out.print("student 문자열의 내용 : ");
        for (int i = 0; i < student.length(); i++)
        {
            System.out.print(student.charAt(i) + " ");
        }
        System.out.println("");

        System.out.print("student 문자열이 ong로 끝나나? : ");
        System.out.println(student.endsWith("ong"));

        System.out.print("student 문자열이 Hong Kill Dong과 동일한 문자열인가? : ");
        System.out.println(student.equals("Hong Kill Dong"));

        System.out.print("student가 대소문자를 무시하면 Hong Kill Dong과 동일한가? : ");
        System.out.println(student.equalsIgnoreCase("HONG KILL DONG"));

        System.out.print("student 문자열과 (computer science)의 결합 : ");
        String studentMajor = student.concat("(computer science)");

        System.out.print("studentMajor 문자열 내용 : ");
        System.out.println(studentMajor.toString());

        System.out.print("studentMajor 문자열 길이 : ");
        System.out.println(studentMajor.length());

        System.out.print("studentMajor 문자열에서 첫 번째 'o'의 위치 : ");
        System.out.println(studentMajor.indexOf('o'));

        System.out.print("studentMajor 문자열이 Hong으로 시작하나? : ");
        System.out.println(studentMajor.startsWith("Hong"));

        System.out.print("studentMajor 문자열에서 9번 인덱스 이후의 문자열 : ");
        System.out.println(studentMajor.substring(9));

        System.out.print("studentMajor 문자열의 10에서 26 인덱스 사이의 문자열 : ");
        System.out.println(studentMajor.substring(10, 26));

        System.out.print("studentMajor 문자열을 모두 소문자로 변환 : ");
        System.out.println(studentMajor.toLowerCase());

        System.out.print("studentMajor 문자열을 모두 대문자로 변환 : ");
        System.out.println(studentMajor.toUpperCase());

        System.out.println("studentMajor 문자열을 공백을 기준으로 분리한 단어 : ");
        String[] words = studentMajor.split(" ");
        for (String word : words)
        {
            System.out.println("->" + word.toString());
        }

    }
}
