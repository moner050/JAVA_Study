package ch04.queue;

public class MyLinkedQueue<T> implements IQueue<T> {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedQueue()
    {
        this.size = 0;
        this.head = new Node(null);
        this.tail = this.head;
    }

    @Override
    public void offer(T data) {
        // data 를 가진 node 를 생성
        Node node = new Node(data);
        // tail 의 next Pointer 가 node 를 가리키게 함
        this.tail.next = node;
        // 그다음 tail Node 를 새로 생성한 node 자리로 옮겨준다.
        this.tail = this.tail.next;
        this.size++;
    }

    @Override
    public T poll() {
        if(this.isEmpty())
        {
            throw new IllegalStateException();
        }

        // head 의 next Pointer 가 가리키고 있던 데이터를 node 로 생성
        Node node = this.head.next;
        // 데이터를 가리키고있던 head 의 next Pointer 를 node 의 next Pointer 가 가리키고 있던 Node 로 설정
        this.head.next = node.next;
        // 그리고 node 의 next Pointer 가 null 을 가리키게 설정
        node.next = null;
        this.size--;

        // 만약 head 의 next Pointer 가 가리키고 있는게 null 이면 초기화시켜주기
        if(this.head.next == null) this.tail = this.head;
        return node.data;
    }

    @Override
    public T peek() {
        if(this.isEmpty())
        {
            throw new IllegalStateException();
        }

        return this.head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public void clear() {
        this.head.next = null;
        this.tail = head;
        this.size = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    private class Node
    {
        T data;
        Node next;

        // 생성자
        Node(T data) { this.data = data; }

        // 매개 변수를 받는 생성자
        Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
