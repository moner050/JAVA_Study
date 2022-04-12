package ch06.sort;

public class QuickSort implements ISort{
    @Override
    public void sort(int[] arr) {
        quickSort(arr,0, arr.length - 1);

    }

    private void quickSort(int[] arr, int low, int high)
    {
        // 배열이 사이즈가 1이 될때까지 재귀호출로 계속 타고들어감
        if(low >= high) return;

        // pivot idx 는 중간값을 사용
        int pivot = low + ((high - low) / 2);
        int pivotValue = arr[pivot];

        int left = low;
        int right = high;

        while(left <= right)
        {
            // arr[left] 가 pivotValue 보다 작으면 left++
            while(arr[left] < pivotValue) left++;

            // arr[right] 가 pivotValue 보다 작으면 right--
            while(arr[right] > pivotValue) right--;

            // 만약 left 가 right 보다 작거나 같으면
            if(left <= right)
            {
                // arr[right] 와 arr[left] 의 값을 서로 바꾼다.
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
                // 그리고 left++, right--
                left++;
                right--;
            }
        }
        quickSort(arr, low, right);
        quickSort(arr, left, high);
    }
}
