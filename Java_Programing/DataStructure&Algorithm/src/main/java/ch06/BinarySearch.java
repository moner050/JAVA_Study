package ch06;

public class BinarySearch {
    // 1. 데이터 중간 인덱스 값을 찾는다.
    // 2. 중간 인덱스 위치를 기준으로 arr 을 절반으로 나눈다
    // 3. 나눠진 절반의 리스트에서 target 값을 찾는다

    public int search(int[] arr, int target)
    {
        int l = 0;                  // arr 의 가장왼쪽
        int r = arr.length-1;       // arr 의 가장 오른쪽

        int m;

        while(l <= r)
        {
            // 중간값 구하기
            m = l + ((r - 1) / 2);
            // 만약 arr 의 절반값이 target 과 같으면 m 리턴
            if(arr[m] == target) return m;

            // 만약 arr 의 절반값이 target 보다 작으면 l 은 m+1, 아니면 r = m-1
            if(arr[m] < target) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }
}
