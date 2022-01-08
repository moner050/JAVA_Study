package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// 일반적인 배열 출력 방법
		for(int num : arr)
		{
			System.out.println(num);
		}
		System.out.println();
		
		// 모든 배열들은 Arrays클래스를 활용 가능하다.
		// forEach를 사용해 하나하나씩 꺼낸다음 람다식을 사용해 출력.
		Arrays.stream(arr).forEach(n->System.out.println(n));
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		// stream은 한번 쓰고나면 소모가 되기 때문에 다시 사용 불가능하다.
//		int testSum = is.forEach(n->System.out.println(n));   오류
		System.out.println();
		
		// 변수 sum에 배열 arr 의 총 합을 저장.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}

}
