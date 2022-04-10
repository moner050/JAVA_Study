package ch04.queue;

public class MyCircularQueue<T> implements IQueue<T> {

    private T[] elements;
    private int front;
    private int rear;
    private int maxSize;

    public MyCircularQueue(int size)
    {   // isEmpty 와 isFull 을 구분하기 위해 더미공간 1칸 주기
        this.elements = (T[]) new Object[size + 1];
        this.front = 0;
        this.rear = 0;
        this.maxSize = size + 1;
    }


    @Override
    public void offer(T data) {
        // queue 가 꽉찬 상태라면 Exception 발생
        if(this.isFull()) throw new IllegalStateException();

        // data 를 넣을때는 rear 기준으로 data 를 넣어준다.
        this.rear = (this.rear + 1) % this.maxSize;
        this.elements[this.rear] = data;

    }

    @Override
    public T poll() {
        // queue 가 비어있는 상태라면 Exception 발생
        if(this.isEmpty()) throw new IllegalStateException();

        // data 를 가져오면서 뺄때는 front 기준으로 data 를 빼준다.
        this.front = (this.front + 1) % this.maxSize;
        return this.elements[this.front];
    }

    @Override
    public T peek() {
        // queue 가 비어있는 상태라면 Exception 발생
        if(this.isEmpty()) throw new IllegalStateException();

        // 어느값이 있는지 조회만 하기.
        return this.elements[this.front + 1];
    }

    @Override
    public int size() {
        if(this.front <= this.rear)
        {
            return this.rear - this.front;
        }

        return this.maxSize - this.front + this.rear;
    }

    @Override
    public void clear() {
        this.front = 0;
        this.rear = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.front == this.rear;
    }

    private boolean isFull()
    {   // +1 한 값은 index 에서 벗어났을 수 있기 때문에
        return (this.rear+1) % this.maxSize == this.front;
    }
}
