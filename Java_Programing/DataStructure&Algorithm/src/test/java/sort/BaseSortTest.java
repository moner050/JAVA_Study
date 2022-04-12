package sort;

import java.util.Random;

abstract public class BaseSortTest {
    // 받은 size 값에 따라 랜덤 배열 생성
    protected int[] createRandomArray(int size)
    {
        int[] ret = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++)
        {
            ret[i] = random.nextInt() % size;
        }
        return ret;
    }
}
