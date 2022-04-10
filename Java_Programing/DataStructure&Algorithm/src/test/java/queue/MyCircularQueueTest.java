package queue;

import ch04.queue.IQueue;
import ch04.queue.MyCircularQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyCircularQueueTest {

    @Test
    public void basic()
    {
        IQueue<Integer> given = new MyCircularQueue<>(30);
        
        // (값이 들어있는)size 가 0인지 확인
        assertEquals(given.size(), 0);
        // 비어있나 확인
        assertTrue(given.isEmpty());

        // 0~9 까지 값을 넣어줌
        for (int i = 0; i < 10; i++) {
            given.offer(i);
            // 사이즈가 늘어나나 확인
            assertEquals(given.size(), i + 1);
        }

        //
        for (int i = 0; i < 10; i++)
        {
            int currentSize = given.size();
            int peek = given.peek();

            // 사이즈가 현재 사이즈와 맞나 확인
            assertEquals(given.size(), currentSize);
            // i 의 값이 있나 조회만 해보기
            assertEquals(peek, i);

            // 지역변수 poll 에 데이터 빼고 넣어주기
            int poll = given.poll();
            // peek 과 poll 의 값이 맞나 확인
            assertEquals(peek, poll);
            // 사이즈가 맞나 확인
            assertEquals(given.size(), currentSize - 1);
        }

        // 사이즈가 0인지 확인
        assertEquals(given.size(), 0);
        // 비어있나 확인
        assertTrue(given.isEmpty());
    }
    @Test
    public void offer_too_much() {
        IQueue<Integer> given = new MyCircularQueue<>(30);
        for (int i = 0; i < 30; i++) {
            given.offer(i);
            assertEquals(i + 1, given.size());
        }
        // given.offer() 의 예외타입이 맞는지 확인
        assertThrows(IllegalStateException.class, () -> given.offer(100));
    }

    @Test
    public void offer_remove_offer() {
        IQueue<Integer> given = new MyCircularQueue<>(30);
        assertEquals(given.size(), 0);
        assertTrue(given.isEmpty());

        for (int i = 0; i < 10; i++) {
            given.offer(i);
            assertEquals(given.size(), i + 1);
        }

        for (int i = 0; i < 10; i++) {
            int ret = given.poll();
            assertEquals(i, ret);
        }

        for (int i = 10; i < 20; i++) {
            given.offer(i);
        }

        for (int i = 10; i < 20; i++) {
            int peek = given.peek();
            assertEquals(peek, i);
            assertEquals(peek, given.poll());
        }

        assertEquals(given.size(), 0);
        assertTrue(given.isEmpty());
    }

    @Test
    public void clear() {
        IQueue<Integer> given = new MyCircularQueue<>(30);
        assertEquals(given.size(), 0);
        assertTrue(given.isEmpty());

        for (int i = 0; i < 10; i++) {
            given.offer(i);
            assertEquals(given.size(), i + 1);
        }

        given.clear();
        assertEquals(given.size(), 0);
        assertTrue(given.isEmpty());
        assertThrows(IllegalStateException.class, given::poll);
        assertThrows(IllegalStateException.class, given::peek);
    }

}
