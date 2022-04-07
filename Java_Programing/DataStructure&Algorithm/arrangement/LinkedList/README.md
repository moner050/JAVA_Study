# LinkedList란

<br>

## LinkedList의 장점
- 배열의 복사나 재할당없이 데이터가 추가 가능하다.  

- 자신이 쓰는 공간만 늘어났다 줄었다 할 수 있어 유연한 공간 활용이 가능하다.  

## LinkedList의 단점  
-  Random Access 가 불가능해서 데이터 접근에 대한 시간이 늘어난다.

<br>

## LinkedList의 특징
- ### LinkedList는 Node 라는 객체로 구성되어 있다.  

- ### Node는 두가지 요소로 구성되어 있다.  
    1. #### Data를 저장할 수 있는 Field
    2. #### 다음 Node를 가리킬수 있는 Next Pointer Field
       >#### 이 Node들이 연결되있는 형태를 LinkedList 라고 부른다.  

- ### LinkedList에서 가장 앞에 위치하고 있는 Node를 Head,
  ### 가장 끝에 위치한 Node를 Tail 이라고 한다.  

<br>

## LinkedList의 검색 (Search)
- ### Index를 통한 Random Access 가 불가능하다.  
    > 자신을 가리키고 있는 Next Pointer 만을 통해 접근가능.  

- ### 그래서 LinkedList는 검색할 때 처음(Head)에서 부터 끝(Tail)까지 순회를 하면서 검색을 한다.

- ### 시간 복잡도는 O(N)

<br>

## LinkedList의 추가 (Add)
- ### 끝(Tail) Node의 뒤에 붙히는걸 기본값으로 한다.  

- ### 검색과 마찬가지로 앞에서 부터 하나씩 찾아가면서 제일 끝 Node에 간 다음,
  ### Null을 가리키고 있는 Pointer에 추가하고자 하는 Node Data를 넣어줘야 한다.  

- ### 시간 복잡도는 O(N)

<br>

## LinkedList의 삽입 (Insert)
- ### ArrayList와 다르게 Data를 다 밀어줄 필요가 없이 간단하게 Pointer만 바꿔주면 삽입된다.  

- ### 이전 Node의 Next Pointer가 삽입할 Node를 가리키게 한 다음  
  ### 삽입할 Node의 Next Pointer는 이전 Node가 원래 가리키고 있던 Node로 설정해주면 된다.  

- ### 시간 복잡도는 O(N)
> 맨 앞으로 삽입하는 경우 O(1)

<br>

## LinkedList의 삭제 (Delete)
- ### 삽입과 마찬가지로 간단하게 Pointer만 바꿔주면 삭제된다.  

- ### 이전 Node의 Next Pointer가 삭제할 Node의 Next Pointer가 가리키고 있던 Node로 바꿔준다.

- ### 그러면 아무것도 참조하지 않는 Node를 garbage collector가 수거 해 가면서 자동으로 삭제가 된다.

- ### 시간 복잡도는 O(1)
