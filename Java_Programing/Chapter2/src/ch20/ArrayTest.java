package ch20;

public class ArrayTest {

	public static void main(String[] args) {

		// 그냥 선언하면 배열은 자동으로 0으로 초기화 된다.
		int[] arr = new int[10];
		int total = 0;
		
		for(int i = 0, num = 1; i < arr.length; i++)
		{
			arr[i] = num++;
		}
		
		// 향상된 for문
		// num에 arr배열의 모든값이 하나씩 순차적으로 들어간다.
		for( int num : arr )
		{
			total += num;
		}
		
		System.out.println(total);
	}

}
