package ch02.list;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T>{

    private static final int DEFAULT_SIZE = 50;

    private int size;
    private T[] elements;


    public MyArrayList()
    {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public void add(T t) {

        // 만약 사이즈가 50이라면
        if(this.size == this.elements.length)
        {   // element 배열의 사이즈를 두배 늘려준다. (원본배열, 복사할 길이)
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }
        this.elements[this.size++] = t;
    }

    @Override
    public void insert(int index, T t) {
        // 만약 사이즈가 50이라면
        if(this.size == this.elements.length)
        {   // element 배열의 사이즈를 두배 늘려준다.
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        for(int i = index; i < this.size; i++)
        {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = t;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public boolean delete(T t) {

        for(int i = 0; i < this.size; i ++)
        {   // 만약 elements[i] 가 매개변수 t와 같다면
            if(this.elements[i].equals(t))
            {   // 해당 인덱스의 값을 무시하고 그 다음인덱스값을 해당 인덱스 값에 넣어줌.
                for(int j = i; j < this.size - 1; j++)
                {
                    this.elements[j] = this.elements[j + 1];
                }
                // 그럼 마지막 인덱스에 0이 남으니 size를 줄여준다.
                this.size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {
        // 만약 인덱스가 0보다 작거나 this.size - 1 보다 크면 false 리턴
        if(index < 0 || index > this.size - 1)
        {
            return false;
        }

        // 만약 사이즈가 50이라면
        if(this.size == this.elements.length)
        {   // element 배열의 사이즈를 두배 늘려준다.
            this.elements = Arrays.copyOf(this.elements, this.size * 2);
        }

        for(int i = index; i < this.size; i++)
        {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {
        // 만약 인덱스가 0보다 작거나 this.size - 1 보다 크면 IndexOutOfBoundsException 리턴
        if(index < 0 || index > this.size - 1)
        {
            throw new IndexOutOfBoundsException();
        }

        return this.elements[index];
    }

    @Override
    public int indexOf(T t) {
        for(int i = 0; i < this.size; i++)
        {   // 만약 매개변수가 elements 안에 있으면 i(인덱스) 를 리턴
            if(this.elements[i].equals(t))
            {
                return i;
            }
        }
        // 없으면 -1 리턴
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T t){
        for(int i = 0; i < this.size; i++)
        {
            if(this.elements[i].equals(t))
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int elementSize() {
        return this.elements.length;
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
