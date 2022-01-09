package ch08;

public class ArrayIndexException {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		// ArrayIndexOutOfBoundsException 테스트
			
		try
		{
			for(int i = 0; i<=5; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			// 오류 메세지만 출력
			System.out.println(e.getMessage());
			// 오류의 풀 네임과 메세지 출력
			System.out.println(e.toString());
		}
		
		// try-catch 문을 사용해서 메세지 출력됨.
		System.out.println("실행 완료");
	}

}
