package ch06.sort;

public class InsertionSort implements ISort{
    @Override
    public void sort(int[] arr) {
        for(int i = 1; i < arr.length; i++)
        {
            int key = arr[i];       // 삽입 위치를 찾아줄 데이터
            int j = i - 1;          // 0부터 j까지 정렬된 서브 리스트

            // j 가 0보다 크거나 같고, arr[j] 가 key 값보다 클때
            while(j >= 0 && arr[j] > key)
            {
                arr[j + 1] = arr[j];  // 데이터를 한칸씩 이동시켜준다.
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
