package StringSentence;

public class IDentifycationSentence {

	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// ���� 1) ���� ���
		// ���� 1) 33��
		String year = jumin.substring(0,2);
		int intAge = Integer.parseInt(year);
		int age = 2022 - (1900 + intAge);
		System.out.println(age + "��");
		
		// ���� 2) ���� ���
		// ���� 2) ����
		String gender = jumin.substring(7,8);
		int intGender = Integer.parseInt(gender);
		if(intGender == 2) System.out.println("����");
		else System.out.println("����");
	}

}
