# DoubleLinkedList란

## DoubleLinkedList의 특징
- #### Head Node와 Tail Node를 각각 따로 가지고 있다. (둘 다 더미노드)
- #### Next Pointer 만 있는게 아닌, Prev Pointer 도 함께 가지고 있다.
- #### 그래서 이전노드와 다음노드를 가리키고 있다.
- #### 실질적으로 가장 앞에있는 데이터 노드는 Head Node 의 다음 노드에 위치해있다.
- #### 가장 마지막에 있는 데이터 노드는 Tail Node 의 이전 노드에 위치해있다.

## DoubleLinkedList의 추가 (Add)
- #### DoubleLinkedList에서는 Tail Node 가 가장 마지막에 위치해 있다.
- #### 그래서 데이터 노드를 추가할때는 Tail Node의 prev pointer가 가리키는 곳에 넣어주면 된다.
- #### 시간복잡도: O(1)

## DoubleLinkedList의 검색 (by index)
- #### LinkedList와 마찬가지로 순서대로 타고 들어가지만 차이점이 있다.
- #### Head와 Tail 중 가장 가까운 노드에서부터 순서대로 타고 들어갈 수 있다.
- #### 시간복잡도: O(N) (LinkedList와 같지만 절반의 시간이 들어간다.)

## DoubleLinkedList의 삽입 (insert)
- #### Prev Node 의 Next Pointer와 Current Node 의 prev Pointer 가 삽입할 노드를 가리키게 한다.
- #### 그리고 삽입한 노드의 prev Pointer는 Prev Node를, Next Pointer는 Current Node를 가리키게 한다.
- #### 시간복잡도: O(1)

## DoubleLinkedList의 삭제 (delete by index)
- #### 삭제할 Node의 prev Node 의 Next Pointer와 next Node의 Prev Pointer를 서로 가리키게 한다.
- #### 시간복잡도: O(1)