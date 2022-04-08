package ch02.list;

public class MyLinkedList<T> implements IList<T> {

    private int size;
    private Node head;


    public MyLinkedList() {
        this.size = 0;
        // 더미 헤드 노드
        this.head = new Node(null);
    }

    @Override
    public void add(T t) {
        // curr 를 (head)Node 로 설정
        Node curr = this.head;
        // 다음 데이터가 없을때까지 노드를 쭉 타고 들어가라.
        while(curr.next != null) curr = curr.next;

        // node 를 하나 생성해서 node 에 넣어줄 데이터 t(매개변수)를 넣어주고
        Node node = new Node(t);
        // 현재 Node 의 Next Pointer 가 새로 생성한 node 를 가리키게 하고
        curr.next = node;
        // 사이즈 1늘리기
        this.size++;
    }

    @Override
    public void insert(int index, T t) {

        // 만약 index 가 현재 사이즈보다 크거나 음수일경우
        if( index > this.size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        // 이전 Node 설정
        Node prev = this.head;
        // 현재 Node 를 타고 들어가기 때문에 curr 를 prev 의 next Pointer 로 설정
        Node curr = prev.next;

        int i = 0;
        // i 가 index 의 위치에 가게 되면 종료
        while( i++ < index )
        {   // i 가 증가될때 마다 하나씩 타고 들어가기.
            prev = prev.next;
            curr = curr.next;
        }

        // node 를 생성해서 데이터(t)를 넣어주고
        // 생성한 node 의 Pointer 를 원래 이전 Node 의 Pointer 가 가리키고 있던 Node 로 설정.
        Node node = new Node(t, curr);
        // 이전 Node 의 pointer 를 생성한 node 를 가리키게 한다.
        prev.next = node;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        // head 의 next 가 null 을 가리키면 자동으로 linkedList 는 끊어지게 된다.
        this.head.next = null;
    }

    @Override
    public boolean delete(T t) {

        // 이전 Node 설정 및 next Pointer 설정
        Node prev = this.head;
        Node curr = prev.next;

        // curr 이 null 이 아닐때까지 반복
        while( curr != null )
        {   // 만약 curr 의 data 가 매개변수로 받은 t 와 같다면
            if( curr.data.equals(t) )
            {   // 이전 pointer 를 curr 의 pointer 가 가리키고 있는 node 로 변경해줌.
                prev.next = curr.next;
                // curr 의 pointer 는 아무것도 가리키지 않게 설정.
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

        // 만약 index 가 현재 사이즈보다 크거나 같고 또는 음수일경우
        if( index >= this.size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        // 이전 Node 설정 및 next Pointer 설정
        Node prev = this.head;
        Node curr = prev.next;

        int i = 0;
        // i 가 index 의 위치에 가게 되면 종료
        while( i++ < index )
        {   // i 가 증가될때 마다 하나씩 타고 들어가기.
            prev = prev.next;
            curr = curr.next;
        }

        prev.next = curr.next;
        curr.next = null;
        this.size--;
        return true;
    }

    @Override
    public T get(int index) {

        // 만약 index 가 현재 사이즈보다 크거나 같고 또는 음수일경우
        if( index >= this.size || index < 0)
        {
            throw new IndexOutOfBoundsException();
        }

        // curr 에 처음 데이터가 들어있는 위치인 head.next 설정
        Node curr = this.head.next;

        int i = 0;
        while( i++ < index )
        {
            curr = curr.next;
        }
        return curr.data;
    }

    @Override
    public int indexOf(T t) {

        // head 는 비어있으니 갈필요 없어서 head.next
        Node curr = this.head.next;

        int index = 0;
        // curr 이 null 값이 아닐때 까지 반복
        while( curr != null )
        {   // 만약 매개변수 t 가 찾고자 하는 데이터와 같다면
            if( t.equals(curr.data))
            {   // index 리턴
                return index;
            }
            // curr 이 한개씩 옮겨질때 마다 index 증가
            curr = curr.next;
            index++;
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.head.next == null;
    }

    @Override
    public boolean contains(T t) {

        // 포함되어 있는지 찾는거니깐 curr 만 생성
        Node curr = this.head.next;

        // curr 이 null 값이 아닐때 까지 반복
        while( curr != null )
        {   // 만약 매개변수 t 가 찾고자 하는 데이터와 같다면
            if( t.equals(curr.data) )
            {   // true 반환
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
