# Queue

## Queue의 특징
- #### 선입선출(FIFO - First In First Out)
- #### 순서가 보장되는 처리 방식이다.
  - 사용자가 몰린 서버
- #### Data가 입력되는 동작을 Enqueue
- #### Data가 빠지는 동작을 Dequeue
- #### Data가 들어갈때는 제일 뒷쪽인 rear 쪽으로 data가 들어간다.
- #### Data가 빠질때는 제일 앞쪽인 front 쪽으로 data가 빠진다.
- #### 배열 형태로 구현하면 Data를 뺄때마다 나머지 Data를 옮겨줘야 하기 때문에 매우 비효율적이다.

## Queue에서의 중요한 연산
- #### push(), offer(), add()
  - data를 넣는 작업
- #### pop(), poll()
  - data를 빼오는 작업
- #### peek()
  - data를 확인하는 작업