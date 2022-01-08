package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		
		// �Ϲ����� �迭 ��� ���
		for(int num : arr)
		{
			System.out.println(num);
		}
		System.out.println();
		
		// ��� �迭���� ArraysŬ������ Ȱ�� �����ϴ�.
		// forEach�� ����� �ϳ��ϳ��� �������� ���ٽ��� ����� ���.
		Arrays.stream(arr).forEach(n->System.out.println(n));
		System.out.println();
		
		IntStream is = Arrays.stream(arr);
		is.forEach(n->System.out.println(n));
		// stream�� �ѹ� ������ �Ҹ� �Ǳ� ������ �ٽ� ��� �Ұ����ϴ�.
//		int testSum = is.forEach(n->System.out.println(n));   ����
		System.out.println();
		
		// ���� sum�� �迭 arr �� �� ���� ����.
		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
	}

}
