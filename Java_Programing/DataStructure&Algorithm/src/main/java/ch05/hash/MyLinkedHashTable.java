package ch05.hash;

import ch02.list.MyLinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MyLinkedHashTable<K, V> implements IHashTable<K, V> {

    private static final int DEFAULT_BUCKET_SIZE = 1024;

    // 배열 한칸한칸에 Node 를 넣을수 있는 공간을 생성
    private List<Node>[] buckets;
    private int size;
    private int bucketSize;

    public MyLinkedHashTable()
    {
        this.buckets = new List[DEFAULT_BUCKET_SIZE];
        this.bucketSize = DEFAULT_BUCKET_SIZE;
        this.size = 0;

        for(int i = 0; i < bucketSize; i++)
        {   // for 문으로 각 칸을 초기화.
            this.buckets[i] = new LinkedList<>();
        }
    }

    public MyLinkedHashTable(int bucketSize)
    {
        this.buckets = new List[bucketSize];
        this.bucketSize = bucketSize;
        this.size = 0;

        for(int i = 0; i < bucketSize; i++)
        {   // for 문으로 각 칸을 초기화.
            this.buckets[i] = new LinkedList<>();
        }
    }


    @Override
    public void put(K key, V value) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        // Key 값이 중복되면 Value 를 업데이트 시켜버리기.
        for(Node node : bucket)
        {
            if(node.key.equals(key))
            {
                node.data = value;
                return;
            }
        }
        Node node = new Node(key, value);
        bucket.add(node);
        this.size++;

    }

    @Override
    public V get(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        for(Node node : bucket)
        {   // key값이 중복되면 data 를 리턴
            if(node.key.equals(key)) return node.data;
        }
        return null;
    }

    @Override
    public boolean delete(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        // 데이터 집합에서 값을 하나씩 꺼내오면서 순환할수 있도록 도와주는 객체
        for(Iterator<Node> iter = bucket.iterator(); iter.hasNext();)
        {
            Node node = iter.next();
            // 만약 node 의 키값이 매개변수로 받은 키값과 동일하다면
            if(node.key.equals(key))
            {   // 삭제하고 사이즈를 줄이고 true 반환
                iter.remove();
                this.size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(K key) {
        int idx = this.hash(key);
        List<Node> bucket = this.buckets[idx];
        // bucket 을 돌면서
        for(Node node : bucket)
        {   // node 의 key 값이 매개변수로 받은 key 값과 동일하면 true 반환
            if(node.key.equals(key))
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

    private int hash(K key)
    {
        int hash = 0;
        for(Character ch : key.toString().toCharArray())
        {
            hash += (int) ch;
        }
        // bucketSize 보다 값이 커질 수 있기 때문에 무조건 작은 값이 나오도록 조정
        return hash % this.bucketSize;
    }

    private class Node{
        K key;
        V data;

        Node(K key, V data)
        {
            this.key = key;
            this.data = data;
        }
    }
}
