package ch20;

public class CharArrayTest {

	public static void main(String[] args) {

		char[] alphabets = new char[26];
		char ch = 'A';
		
		for(int i = 0; i < alphabets.length; i++)
		{
			alphabets[i] = ch++;
		}
		
		// 알파벳과 그 알파벳의 아스키코드 출력
		for(char alpha : alphabets)
		{
			System.out.println(alpha + "," + (int)alpha);
		}
		
	}

}
