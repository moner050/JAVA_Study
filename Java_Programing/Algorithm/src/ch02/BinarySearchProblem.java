package ch02;

public class BinarySearchProblem {

	public static void main(String[] args) {
		
		int[] numbers = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108}; 
		
		// 찾고싶은 수.
		int target = 83;
		
		int left = 0;
		int right = numbers.length - 1;
		int mid = (left + right) / 2;
		
		int temp = numbers[mid];
		// 찾았나 안찾았나
		boolean find = false;
		
		while( left <= right)
		{	// 만약 83이 중간값과 같으면
			if(target == temp)
			{
				find = true;
				break;
			}
			else if( target < temp)
			{
				right = mid - 1;
			}
			else
			{
				left = mid + 1;
			}
			
			mid = (left + right) / 2;
			temp = numbers[mid];
		}
		
		if(find == true)
		{
			mid++;
			System.out.println("찾는 수는 " + mid + "번째에 있습니다.");
		}
		else
		{
			System.out.println("찾는 수가 없습니다.");
		}
	}

}
