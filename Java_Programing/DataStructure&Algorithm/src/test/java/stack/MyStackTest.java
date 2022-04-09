package stack;

import ch03.stack.IStack;
import ch03.stack.MyStack;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyStackTest {

    @Test
    public void push()
    {
        IStack<Integer> stack = new MyStack<>();

        // 일단 stack 에 0~9 를 push 해줌
        for(int i = 0; i < 10; i++)
        {
            stack.push(i);
            // push 할때 size 가 잘 늘어나나 테스트
            assertEquals(i+1, stack.size());
        }
    }

    @Test
    public void basic()
    {
        IStack<Integer> stack = new MyStack<>();

        // 일단 stack 에 0~49 를 push 해줌
        for(int i = 0; i < 50; i++)
        {
            stack.push(i);
            // head 의 next Pointer 가 가리키고 있는 데이터가 i 인지 확인
            assertEquals(stack.peek(), i);
            // 사이즈도 잘 늘어나고 있나 확인
            assertEquals(stack.size(), i + 1);
        }

        // stack 에 49~0 을 pop 해줌
        for(int i = 49; i >= 0; i--)
        {
            assertEquals(stack.pop(), i);
            // 사이즈가 잘 줄어들고 있나 확인
            assertEquals(stack.size(), i);
        }
    }
}
