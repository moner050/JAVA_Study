package ch03.stack;

public class MyStack<T> implements IStack<T> {

    private int size;
    private Node head;

    public MyStack() {
        this.size = size();

        // 더미 데이터를 쓰지않고 구현하려면 빼야한다.
        this.head = new Node(null);
    }

    @Override
    public void push(T data) {
        // 새로 생성한 node 에 매개변수로 받은 data 를 넣어줌.
        // 그리고 head Node 의 next Pointer 가 가리키고 있던 곳(Null)으로 설정해줌.
        Node node = new Node(data, this.head.next);

        // 그리고 head Node 의 next Pointer 를 새로 생성한 node 를 가리키게 함
        this.head.next = node;

        // 그리고나서 사이즈를 늘려주고 push 가 종료된다.
        this.size++;
    }

    @Override
    public T pop() {
        // 비어있으면 null 을 return
        if(this.isEmpty()) return null;

        // head 의 next Pointer 는 항상 가장 최신의 Node 를 가리키고 있기 때문에
        // curr Node 를 head 의 next Pointer 가 가리키고 있는 곳(가장 최근에 push 된 Node)으로 설정해줌.
        Node curr = this.head.next;

        // 그리고 head 의 next Pointer 가 가리키고 있던 곳을
        // curr 의 next Pointer 가 가리키고 있는 곳(가장 최근에 push 된 Node 가 가리키는 곳(null))으로 설정해줌.
        this.head.next = curr.next;

        // 그리고 curr 의 next Pointer 가 가리키고 있는 곳을 null 로 설정
        curr.next = null;
        this.size--;
        return curr.data;
    }

    @Override
    public T peek() {
        // 비어있으면 null 을 return
        if(this.isEmpty()) return null;

        return this.head.next.data;
    }

    @Override
    public int size() {
        return this.size;
    }

    private boolean isEmpty()
    {
        return this.head.next == null;
    }


    private class Node{
        T data;
        Node next;

        // 생성자
        Node(T data)
        {
            this.data = data;
        }

        // 매개변수 두개를 받는 생성자
        Node(T data, Node next)
        {
            this.data = data;
            this.next = next;
        }
    }
}
