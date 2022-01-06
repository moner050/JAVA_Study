package ch02;

public class MyArray {

	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	// 기본 생성자
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	// 매개변수를 받는 생성자
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	// 매개변수를 받아 배열에 더해줌.
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE)
		{
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	// 중간에 삽입하는 메서드
	public void insertElement(int position, int num)
	{
		int i;
		
		// 삽입하지 못하는 경우 오류를 리턴.
		if( position < 0 || position > count)
		{
			return ;
		}
		if( count >= ARRAY_SIZE )
		{
			return;
		}
		// 맨 뒤에 있는 인덱스부터 차례대로 오른쪽으로 이동.
		for( i = count-1; i >= position; i++)
		{
			intArr[i+1] = intArr[i];
		}
		// 비어있는 position 인덱스에 num을 추가 후 count++
		intArr[position] = num;
		count++;
	}
	
	// 매개변수로 인덱스값 받아서 배열의 해당 인덱스에 있는 값 삭제후 정렬
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		// count가 0이면
		if( isEmpty() )
		{
			System.out.println("Array is Empty");
			return ret;
		}
		if( position < 0 || position > count - 1 )
		{
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i < count-1; i++)
		{
			intArr[i] = intArr[i+1];
		}
		count--;
		
		return ret;
	}
	
	// 해당 배열의 인덱스에 있는 값 리턴
	public int getElement(int position)
	{
		if( position < 0 || position > count - 1 )
		{
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	// count의 값이 얼마인지
	public int getSize()
	{
		return count;
	}
	
	// count가 0인지 체크 후 boolean값 리턴
	public boolean isEmpty()
	{
		if( count == 0 )
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	// 배열 전체 출력.
	public void printAll()
	{
		if( count == 0)
		{
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
		
		for(int i = 0; i < count; i++)
		{
			System.out.println(intArr[i]);
		}
	}
}
