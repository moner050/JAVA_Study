package list;

import ch02.list.IList;
import ch02.list.MyDoubleLinkedList;
import ch02.list.MyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyDoubleLinkedListTest {
    @Test
    public void add()
    {
        IList<Integer> given = new MyDoubleLinkedList<>();

        // 0부터 49까지 넣어준다.
        for(int i = 0; i < 50; i++)
        {
            System.out.println(i);
            given.add(i);
            assertEquals(i + 1, given.size());
            assertEquals(i, given.get(i));
        }

        // 사이즈가 50인지 확인
        assertEquals(50, given.size());
    }

    @Test
    public void insert()
    {
        IList<Integer> given = new MyDoubleLinkedList<>();

        // 0부터 49까지 넣어준다.
        for(int i = 0; i < 50; i++)
        {
            System.out.println(i);
            given.add(i);
            assertEquals(i + 1, given.size());
            assertEquals(i, given.get(i));
        }
        // 0번 인덱스에 5를 넣어준다.
        given.insert(0, 5);

        // 5를 삽입했으니 사이즈가 51인가 확인
        assertEquals(51, given.size());

        // 0번 인덱스에 5가 넣어졌나 확인
        assertEquals(5, given.get(0));

    }

    @Test
    public void delete()
    {
        IList<Integer> given = new MyDoubleLinkedList<>();

        // 0부터 49까지 넣어준다.
        for(int i = 0; i < 50; i++)
        {
            System.out.println(i);
            given.add(i);
            assertEquals(i + 1, given.size());
            assertEquals(i, given.get(i));
        }

        // 값이 30인 인덱스를 삭제한다.
        given.delete(30);

        // 30을 삭제했으니 사이즈가 49인가 확인
        assertEquals(49, given.size());

        // 30인 값이 있나 확인 (없으면 -1 리턴)
        assertEquals(-1, given.indexOf(30));

        // 30인 값이 있나 확인 (없으면 false 리턴)
        assertEquals(false, given.contains(30));
    }

    @Test
    public void deleteByIndex()
    {
        IList<Integer> given = new MyDoubleLinkedList<>();

        // 0부터 49까지 넣어준다.
        for(int i = 0; i < 50; i++)
        {
            System.out.println(i);
            given.add(i);
            assertEquals(i + 1, given.size());
            assertEquals(i, given.get(i));
        }

        // 10번 인덱스에 있는 값을 삭제(9)
        given.deleteByIndex(10);

        // 10번 인덱스의 값을 삭제했으니 사이즈가 49인가 확인
        assertEquals(49, given.size());

        // 10번 인덱스에 있던 값이 있나 확인 (없으면 -1 리턴)
        assertEquals(-1, given.indexOf(10));

        // 10인 값이 있나 확인 (없으면 false 리턴):
        assertEquals(false, given.contains(10));
    }
}
