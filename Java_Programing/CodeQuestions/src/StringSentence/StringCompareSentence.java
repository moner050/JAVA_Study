package StringSentence;

public class StringCompareSentence {

	public static void main(String[] args) {
		
		// 문제 ) 사전 순으로 이름 정렬
		String[] names = { "홍길동", "김유신", "마동석", "자바킹", "서동요" };
		
		for(int i = 0; i < names.length; i++)
		{
			String minString = names[i];
			int minIdx = i;
			
			for(int j = i; j < names.length; j++)
			{
				if(minString.compareTo(names[j]) > 0)
				{
					minString = names[j];
					minIdx = j;
				}
			}
			String temp = names[i];
			names[i] = names[minIdx];
			names[minIdx] = temp;
		}
		
		for(int i = 0; i < names.length; i++)
		{
			System.out.print(names[i] + " ");
		}
	}

}
