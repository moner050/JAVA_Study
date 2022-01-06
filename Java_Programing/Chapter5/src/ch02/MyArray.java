package ch02;

public class MyArray {

	int[] intArr;
	int count;
	
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	// �⺻ ������
	public MyArray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	// �Ű������� �޴� ������
	public MyArray(int size)
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	// �Ű������� �޾� �迭�� ������.
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE)
		{
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num;
	}
	
	// �߰��� �����ϴ� �޼���
	public void insertElement(int position, int num)
	{
		int i;
		
		// �������� ���ϴ� ��� ������ ����.
		if( position < 0 || position > count)
		{
			return ;
		}
		if( count >= ARRAY_SIZE )
		{
			return;
		}
		// �� �ڿ� �ִ� �ε������� ���ʴ�� ���������� �̵�.
		for( i = count-1; i >= position; i++)
		{
			intArr[i+1] = intArr[i];
		}
		// ����ִ� position �ε����� num�� �߰� �� count++
		intArr[position] = num;
		count++;
	}
	
	// �Ű������� �ε����� �޾Ƽ� �迭�� �ش� �ε����� �ִ� �� ������ ����
	public int removeElement(int position)
	{
		int ret = ERROR_NUM;
		
		// count�� 0�̸�
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
	
	// �ش� �迭�� �ε����� �ִ� �� ����
	public int getElement(int position)
	{
		if( position < 0 || position > count - 1 )
		{
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	// count�� ���� ������
	public int getSize()
	{
		return count;
	}
	
	// count�� 0���� üũ �� boolean�� ����
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
	
	// �迭 ��ü ���.
	public void printAll()
	{
		if( count == 0)
		{
			System.out.println("����� ������ �����ϴ�.");
			return;
		}
		
		for(int i = 0; i < count; i++)
		{
			System.out.println(intArr[i]);
		}
	}
}
