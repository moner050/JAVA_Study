import java.util.ArrayList;

public class QueueTest<T> {

    private ArrayList<T> queue = new ArrayList<T>();

    public void enqueue(T item)
    {
        queue.add(item);
    }

    public T dequeue()
    {
        if(queue.isEmpty()) return null;
        else return queue.remove(0);
    }

    public boolean isEmpty()
    {
        if(queue.size() == 0) return true;
        else return false;
    }

    public static void main(String[] args)
    {
        QueueTest<Integer> qt = new QueueTest<>();

        qt.enqueue(1);
        qt.enqueue(10);
        qt.enqueue(100);
        System.out.println(qt.dequeue());
        System.out.println(qt.dequeue());
        System.out.println(qt.dequeue());
    }
}
