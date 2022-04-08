package ch02.list;

public class MyDoubleLinkedList<T> implements IList<T> {

    private Node head;
    private Node tail;
    private int size;

    public MyDoubleLinkedList()
    {
        this.size = 0;
        this.head = new Node(null);
        this.tail = new Node(null);
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public void add(T t) {
        // 추가할때는 tail Node 의 prev Pointer 위치에 넣어주면 된다.
        Node last = this.tail.prev;

        // 새로운 Node 에 t 를 넣어주고
        // 새로운 Node 의 prev Pointer 를 원래 Tail 의 prev Pointer 가 가리키고 있던 Node 로 설정해주고
        // 새로운 Node 의 next Pointer 를 Tail Node 를 가리키게 한다.
        Node node = new Node(t, last, tail);

        // 그리고 tail 의 prev Pointer 가 가리키고 있었던 노드의 next Pointer 와
        // tail 의 prev Pointer 가 node 를 가리키게 한다.
        last.next = node;
        this.tail.prev = node;
        this.size++;
    }

    @Override
    public void insert(int index, T t) {

        Node prev = null;
        Node curr = null;

        int i = 0;
        // 인덱스가 Head 에서 더 가까우면
        if( index < this.size / 2)
        {   // prev 는 head 를, curr 은 head 의 next Pointer 가 가리키는 위치로 지정해준다.
            prev = this.head;
            curr = this.head.next;
            while(  i++ < index )
            {
                prev = prev.next;
                curr = curr.next;
            }
        }
        else
        {// 인덱스가 Tail 에서 더 가까우면
            // curr 은 tail, prev 는 tail 의 prev Pointer 가 가리키는 위치로 지정.
            curr = this.tail;
            prev = this.tail.prev;

            // curr 이 Tail 부터 역순으로 시작하기 때문에 그냥 - index
            while( i++ < (this.size - index))
            {
                curr = curr.prev;
                prev = prev.prev;
            }
        }
        // 데이터 t 를 가지는 Node 를 새로 생성하고
        // prev Pointer 와 next Pointer 를 각각 prev Node 와 curr Node 를 가리키게 한다.
        Node node = new Node(t, prev, curr);
        // 그리고 curr Node 의 prev Pointer 를 새로 생성한 node 에 연결해 주고
        curr.prev = node;
        // prev Node 의 Next Pointer 를 새로 생성한 Node 에 연결해준다.
        prev.next = node;

        // insert 해줬기 때문에 증가
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.head.next = this.tail;
        this.tail.prev = this.head;
    }

    @Override
    public boolean delete(T t) {

        Node prev = this.head;
        Node curr = prev.next;

        while( curr != null)
        {
            if( curr.data.equals(t) )
            {
                prev.next = curr.next;
                curr.next = null;
                this.size--;
                return true;
            }
            prev = prev.next;
            curr = curr.next;
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {

        Node prev = null;
        Node curr = null;
        Node next = null;

        int i = 0;
        // 인덱스가 Head 에서 더 가까우면
        if( index < this.size / 2 )
        {
            prev = this.head;
            curr = this.head.next;
            while(i++ < index)
            {
                prev = prev.next;
                curr = curr.next;
            }
            // curr 의 앞에있는 Node 와 뒤에있는 Node 를 연결해줘야 하기 때문에
            // prev Node 의 next Pointer 를 curr Node 의 Next Pointer 가 가리키고 있는 곳으로 지정
            prev.next = curr.next;
            // curr Node 자체를 prev Node 로 지정.
            curr.next.prev = prev;

            // 그다음 curr 의 next, prev Pointer 가 가리키고 있던것을 null 로 지정해
            // gca 가 자동으로 삭제시켜줌.
            curr.next = null;
            curr.prev = null;
        }
        else // 인덱스가 Tail 에서 더 가까우면
        {
            curr = this.tail.prev;
            next = this.tail;
            // curr 이 실제 데이터가 있는곳부터 시작하기 때문에 index - 1
            while(i++ < (this.size - index - 1))
            {
                next = next.prev;
                curr = curr.prev;
            }
            // curr 의 앞에있는 Node 와 뒤에있는 Node 를 연결해줘야 하기 때문에
            // next Node 의 prev Pointer 를 curr Node 의 prev Pointer 가 가리키고 있는 곳으로 지정
            next.prev = curr.prev;
            // curr Node 를 next Node 로 지정
            curr.prev.next = next;

            // curr 의 next, prev Pointer 를 null 로 지정
            // gca 로 인해서 자동 삭제
            curr.next = null;
            curr.prev = null;
        }
        this.size--;
        return false;
    }

    @Override
    public T get(int index) {

        // 인덱스가 size 보다 같거나 크거나 음수일때
        if(index >= this.size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        int i = 0;
        Node curr = null;

        // 인덱스가 Head 에서 더 가까우면
        if(index < this.size / 2)
        {   // curr 를 head 의 next Pointer 가 가리키는 곳으로 지정
            curr = this.head.next;
            while( i++ < index )
            {
                curr = curr.next;
            }
        }
        else
        { // 인덱스가 Tail 에서 더 가까우면
            // curr 을 tail 의 prev Pointer 가 가리키는 곳으로 지정
            curr = this.tail.prev;
            // Tail 부터 검사하는것이기 때문에 index 가 역순으로 감.
            while( i++ < (this.size - index - 1))
            {
                curr = curr.prev;
            }
        }

        return curr.data;
    }

    @Override
    public int indexOf(T t) {

        Node curr = this.head.next;

        int index = 0;

        while( curr != null)
        {
            if( t.equals(curr.data) )
            {
                return index;
            }
            curr = curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == this.tail;
    }

    @Override
    public boolean contains(T t) {

        Node curr = this.head.next;

        while( curr != null )
        {
            if( t.equals(curr.data) )
            {
                return true;
            }
            curr = curr.next;
        }

        return false;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public int elementSize() {
        return this.size;
    }

    private class Node
    {
        T data;
        Node prev;
        Node next;

        Node(T data)
        {
            this.data = data;
        }
        Node(T data, Node prev, Node next)
        {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }
}
