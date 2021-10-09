package for_Command;

public class NestedLoop {

	public static void main(String[] args) {
		
		// 1단에서 9단
		for(int i=1; i<10; i++) 
		{ 
			for(int j=1; j<10; j++) 
			{ // 각 단의 구구셈 출력
				System.out.print(i + "X" + j + "=" + i*j); // 구구셈 출력
				System.out.print('\t'); // 하나씩 탭으로 띄기
			}
			 // 한 단이 끝나면 다음 줄로 커서 이동
			System.out.println();
		}
	}
}
