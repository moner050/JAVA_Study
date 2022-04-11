package ch06.sort;

public class BubbleSort implements ISort {
    @Override
    public void sort(int[] arr) {
        // 안정 정렬
        // 인플레이스 정렬
        for(int i = 0; i < arr.length - 1; i++)     // 전체 리스트 반복
        {
            for(int j = 0; j < arr.length -1 -i;j++)    // 정렬된 리스트를 제외하고 반복
            {
                if(arr[j] > arr[j + 1])
                {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
