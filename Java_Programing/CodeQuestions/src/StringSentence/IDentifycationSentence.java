package StringSentence;

public class IDentifycationSentence {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 33세
		String year = jumin.substring(0,2);
		int intAge = Integer.parseInt(year);
		int age = 2022 - (1900 + intAge);
		System.out.println(age + "세");
		
		// 문제 2) 성별 출력
		// 정답 2) 여성
		String gender = jumin.substring(7,8);
		int intGender = Integer.parseInt(gender);
		if(intGender == 2) System.out.println("여성");
		else System.out.println("남성");
	}

}
