package sort;

import ch06.sort.BubbleSort;
import ch06.sort.InsertionSort;
import ch06.sort.MergeSort;
import ch06.sort.QuickSort;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest extends BaseSortTest{
    // 버블, 삽입, 퀵, 분할 정렬 테스트
    private BubbleSort bubbleSort = new BubbleSort();
    private InsertionSort insertionSort = new InsertionSort();
    private QuickSort quickSort = new QuickSort();
    private MergeSort mergeSort = new MergeSort();

    @Test
    void bubbleSort() {
        for (int i = 1; i < 100; i++)
        {
            int[] arr = createRandomArray(i);
            int[] expected = Arrays.copyOf(arr, arr.length);
            Arrays.sort(expected);
            bubbleSort.sort(arr);
            assertArrayEquals(expected, arr);
        }
    }

    @Test
    void insertionSort() {
        for (int i = 1; i < 100; i++)
        {
            int[] arr = createRandomArray(i);
            int[] expected = Arrays.copyOf(arr, arr.length);
            Arrays.sort(expected);
            insertionSort.sort(arr);
            assertArrayEquals(expected, arr);
        }
    }

    @Test
    void quickSort() {
        for (int i = 1; i < 10; i++)
        {
            int[] arr = createRandomArray(i);
            int[] expected = Arrays.copyOf(arr, arr.length);
            Arrays.sort(expected);
            quickSort.sort(arr);
            assertArrayEquals(expected, arr);
        }
    }

    @Test
    void mergeSort()
    {
        for (int i = 1; i < 100; i++) {
            int[] arr = createRandomArray(i);
            int[] expected = Arrays.copyOf(arr, arr.length);
            Arrays.sort(expected);
            mergeSort.sort(arr);
            assertArrayEquals(expected, arr);
        }
    }
}
