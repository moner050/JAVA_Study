package StringSentence;

public class String2ArraySentence {

	public static void main(String[] args) {

		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
			
		String str = "김철수/87,이만수/42,이영희/95";
		
		String temp[] = str.split(",");
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		for(int i = 0; i < temp.length; i++)
		{
			String strTemp[] = temp[i].split("/");
			
			name[i] = strTemp[0];
			score[i] = Integer.parseInt(strTemp[1]);
		}
		
		for(int i = 0; i < 3; i++)
		{
			System.out.println(name[i] + " ");
			System.out.println(score[i] + " ");
		}
			
			
			
	}

}
