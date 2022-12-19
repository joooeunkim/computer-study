## 기본 자료 구조 질문 모음

<details open>
  <summary> Array와 ArrayList의 차이를 설명하시오 </summary>

Array와 ArrayList는 모든 것이 비슷함.

가장 큰 차이점은 길이를 조절할 수 있는가 없는가 이다.

1. resizable

   java의 Array는 길이가 고정적이다.
   java의 ArrayList는 길이가 가변적이다. 하지만 내부적으로는 배열로 구성되어있다.

- ArrayList Object는 ArrayList의 size를 나타내는 capacity 변수를 가진다. ArrayList에 요소들이 더해지면, ArrayList의 capacity 또한 자동적으로 늘어난다. ArrayList의 devault 저장 용량은 10이다. 하지만 만약 capacity만큼 요소가 저장되면, 현재 배열 크기의 1.5배 크기의 새 배열을 생성후 기존의 배열을 copy 해준다.

2. performance

   Array나 ArrayList로부터 요소를 얻거나 추가할 때는 거의 비슷한 성능을 보인다.

3. primitives

   Array에는 primitive data type(int, float, double), object 둘다 저장 가능

   ArrayList에는 오로지 object type(Integer, Float, Double) 만 저장 가능

   - JVM은 Autoboxing(내부적으로 primitive type을 타입에 상응하는 object로 변환해주는 것, int => Integer)을 통해 ArrayList에 Object만 저장되도록 한다

4. Iterating values

   Array : for loop 아니면 for each loop를 통해 array를 순회할 수 있다.

   ArrayList : iterator를 사용해 ArrayList를 순회할 수 있다.

5. Length

   Array : Array의 길이를 반환하는 length 변수

   ArrayList : size() 메소드

   </details>

<details open>
  <summary> Array와 LinkedList 차이를 설명하시오 </summary>

- Array는 Random Access를 지원한다. 요소들을 인덱스를 통해 직접 접근할 수 있다. 따라서 특정 요소에 접근하는 시간 복잡도는 O(1)이다.
  반면 Linkedlist는 Sequential Access를 지원한다. 어떤 요소를 접근할 때 순차적으로 검색하며 찾아야 한다. 따라서 특정 요소에 접근할 때 시간 복잡도는 O(N)이다.
- 저장 방식도 배열에서 요소들은 인접한 메모리 위치에 연이어 저장된다.
  반면 Linkedlist에서는 새로운 요소에 할당된 메모리 위치 주소가 linkedlist의 이전 요소에 저장된다.
- 배열에서 삽입과 삭제는 O(N)이 소요되지만, Linkedlist에서 삽입과 삭제는 O(1)이 소요된다.
- 배열에서 메모리는 선언 시 컴파일 타임에 할당이 된다. (정적 메모리 할당)
  반면 Linkedlist에서는 새로운 요소가 추가될 때 런타임에 메모리를 할당한다. (동적 메모리 할당)
- 배열은 Stack 섹션에 메모리 할당이 이루어진다. 반면 Linkedlist는 Heap 섹션에 메모리 할당이 이루어진다.
- 결론 :

  - 삽입과 삭제가 빈번하다면 **LinkedList**를 사용하는 것이 더 좋다.
  - 데이터의 접근하는 게 중요하다면 **Array**를 사용하는 것이 좋다.

   </details>

<details open>
  <summary> ArrayList와 LinkedList 차이를 설명하시오 </summary>

ArrayList는 데이터들이 순서대로 늘어선 배열의 형식을 취하고 있지만, LinkedList는 자료의 주소값으로 서로 연결된 형식을 가지고 있다. 이러한 구조에 의해 둘은 각각의 장단점을 가지고 있습니다.

- ArrayList
  - 원하는 데이터에 무작위로 접근할 수 있다.
  - 리스트의 크기가 제한되어 있으며, 리스트의 크기를 재조정하는 것은 많은 연산이 필요하다.
  - 데이터의 추가/삭제를 위해서는 임시 배열을 생성하여 복제하고 있어 시간이 오래 걸린다.
- LinkedList
  - 리스트의 크기에 영향 없이 데이터를 추가할 수 있다.
  - 데이터를 추가하기 위해 새로운 노드를 생성하여 연결하므로 추가/삭제 연산이 빠르다.
  - 무작위 접근이 불가능하며, 순차 접근만이 가능하다.
  </details>

<details open>
  <summary> Array 사용 예시를 말해보시오 </summary>
- 주식 차트
  - 주식 차트 데이터는 요소가 중간에 새롭게 추가되거나 삭제되는 정보가 아니고 날짜별로 주식 가격이 차례대로 저장되어야 하는 데이터
    즉, 순서가 중요한 데이터이기 때문에 array 같이 순서를 보장해주는 자료구조를 사용하는 것이 좋다
</details>

<details open>
  <summary> 큐와 스택을 구현할 때 리스트와 array중 어떤 것으로 하는게 좋은가? </summary>
- 큐(Queue): Array로 구현하면 poll 연산 이후 객체를 앞당기는 작업이 필요하다. 하지만 List로 구현하면 객체 1개만 제거하면 되므로 삽입 및 삭제가 용이한 LinkedList로 구현하는 것이 좋다.
- 스택(Stack): List로 구현하면 객체를 제거하는 작업이 필요하다. 하지만 Array로 구현하면 삭제할 필요 없이 index를 줄이고 초기화만 하면 되므로, Array로 구현하는 것이 좋다.
</details>
<details open>
  <summary> 스택과 큐의 구조에 대해 실사용 예를 들어 설명하시오 </summary>


- 스택의 활용 예시
  - 웹 브라우저 방문기록 (뒤로 가기) : 가장 나중에 열린 페이지부터 다시 보여준다.
  - 역순 문자열 만들기 : 가장 나중에 입력된 문자부터 출력한다.
  - 실행 취소 (undo) : 가장 나중에 실행된 것부터 실행을 취소한다.
  - 후위 표기법 계산
  - 수식의 괄호 검사 (연산자 우선순위 표현을 위한 괄호 검사)
- 큐의 활용 예시
  - 우선순위가 같은 작업 예약 (프린터의 인쇄 대기열)	
  - 은행 업무
  - 콜센터 고객 대기시간
  - 프로세스 관리
  - 너비 우선 탐색(BFS, Breadth-First Search) 구현
  - 캐시(Cache) 구현

</details>

<details open>
  <summary> Tree에 관해 설명하시오 </summary>
- 계층적 관계 표현
- 하나의 루트 노드와 0개 이상의 하위 트리로 구성되어 있다.
- 데이터를 순차적으로 저장하지 않아 비선형 자료구조이고, 트리 내에 또 다른 트리가 있는 재귀적 자료구조이다. 
- 단순 순환이 아니라 무방향 그래프 구조 
- 노드 간에 부모 자식 관계를 갖고 있는 계층형 자료구조, 모든 자식 노드는 하나의 부모 노드만 갖는다.
- 노드가 n개인 트리는 항상 n-1개의 간선을 가짐

</details>


<details open>
  <summary> Binary Tree와 Binary Search Tree에 대해 설명하시오 </summary>
</details>
<details open>
  <summary> 트리와 그래프의 차이 3가지 이상 말해보시오 </summary>
-  트리는 한 개의 루트 존재 그래프는 루트 개념이 없다. 
- 그래프는 부모 자식 개념이 없지만, 트리는 1개의 부모 노드를 가짐
- 그래프는 네트워크 모델, 트리는 계층 모델

</details>

<details open>
  <summary> 그래프가 순환하는 지 판단하는 방법을 설명하시오 </summary>

-	유향 그래프 내에 back edge가 존재하면, 순환이 존재합니다. 
-	dfs와 stack 2개를 활용하여 유향 그래프내에 순환 그래프가 존재하는지 확인할 수 있습니다.

</details>


<details open>
  <summary> BinaryTree의 순회방법에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> BST의 최악의 경우의 예와 시간복잡도에 대해서 설명하시오 </summary>
</details>
<details open>
  <summary> 데크와 벡터의 차이에 대해 설명하시오 </summary>
- 가장 중요한 차이는 메모리에서의 연속성이다. vector는 메모리에 연속되어 있다.
  deque는 메모리에 연속되어 있지 않다.

</details>

<details open>
  <summary> Deque를 사용하는 이유에 대해 설명하시오 </summary>
- deque는 list보다 속도가 빠르고 쓰레드 환경에서 안전하기 때문

- 예를 들어 pop 메서드를 수행할 때 리스트의 경우 O(N)연산을 수행하지만 deque는 O(1) 연산을 수행한다.
  따라서, push와 pop이 빈번한 알고리즘의 경우, list보다 deque를 사용하는것이 효율적이며 속도가 더 빠르다. 
  </details>

<details open>
  <summary> 우선순위 큐의 동작 원리에 대해 설명하시오 </summary>
- 모든 항목에는 우선순위가 있습니다.
  우선 순위가 높은 요소는 우선 순위가 낮은 요소보다 먼저 queue에서 제외됩니다.
  두 요소의 우선 순위가 같으면 queue의 순서에 따릅니다

</details>

<details open>
  <summary> 힙을 사용하는 이유는 무엇인가? </summary>

- 배열에 데이터를 넣고, 최대값과 최소값을 찾으려면 O(n) 이 걸림
  이에 반해, 힙에 데이터를 넣고, 최대값과 최소값을 찾으면, $ O(log n) $ 이 걸림
  우선순위 큐와 같이 최대값 또는 최소값을 빠르게 찾아야 하는 자료구조 및 알고리즘 구현 등에 활용됨

</details>

<details open>
  <summary> 힙과 이진 탐색 트리의 공통점과 차이점 </summary>

- 공통점: 힙과 이진 탐색 트리는 모두 이진 트리임
- 차이점:
  힙은 각 노드의 값이 자식 노드보다 크거나 같음(Max Heap의 경우)
  이진 탐색 트리는 왼쪽 자식 노드의 값이 가장 작고, 그 다음 부모 노드, 그 다음 오른쪽 자식 노드 값이 가장 큼
  힙은 이진 탐색 트리의 조건인 자식 노드에서 작은 값은 왼쪽, 큰 값은 오른쪽이라는 조건은 없음
  힙의 왼쪽 및 오른쪽 자식 노드의 값은 오른쪽이 클 수도 있고, 왼쪽이 클 수도 있음
  이진 탐색 트리는 탐색을 위한 구조, 힙은 최대/최소값 검색을 위한 구조 중 하나로 이해하면 됨

</details>


<details open>
  <summary> Heap의 동작 원리에 대해서 설명하세요 </summary>
</details>
<details open>
  <summary> Priority Queue에서 Heap을 주로 사용하는 이유를 설명하세요 </summary>
</details>
<details open>
  <summary> 인덱스 트리가 쓰이는 경우에 대해 설명하시오 </summary>

- 특정 인덱스의 변경이 계속 일어날 수 있을 때 
- 부분합을 계속해서 구해야할 때

</details>

<details open>
  <summary> 트라이 자료 구조의 장단점에 대해 설명하시오 </summary>
- 트라이의 장점은 문자열을 빠르게 찾을 수 있다는 점이다. 

  문자열의 추가와 탐색 모두 O(M)만에 가능하다.

- 반면에 트라이의 단점은 필요한 메모리의 크기가 너무 크다는 점이다. 

​		최악의 경우에는 집합에 포함되는 문자열들의 길이의 총합만큼 노드가 필요하므로, 총메모리는

​		O(포인터 크기 * 포인터 배열 개수 * 총노드의 개수)가 된다. 

</details>


<details open>
  <summary> 인덱스 트리에 대해서 설명하시오 </summary>
</details>

<details open>
  <summary> 트라이 자료구조의 특징에 대해서 설명하시오 </summary>
</details>
<details open>
  <summary> B+tree의 장단점에 대해 설명하시오 </summary>

-  장점
  - leaf node에만 데이터 저장하므로 메모리 확보할 수 있다.
     하나의 node에 더 많은 포인터를 가질 수 있기 때문에 트리의 높이가 더 낮아지므로 검색속도 높일 수 있음.
- 단점
  - 반드시 특정 key에 접근하기 위해서 leaf node까지 가야한다. (B-Tree는 최상의 경우 특정 key를 root node에서 찾을 수 있다)

</details>

<details open>
  <summary> 최소 신장 트리의 특징 3가지에 대해 설명하시오 </summary>
- 노드의 수가 n개이면 에지의 수는 n-1개
- 에지 하나를 삭제하면 두 개의 부트리 생성
- 새로운 에지를 삽입하면 그 에지를 포함하는 사이클 생성

</details>

<details open>
  <summary> b-tree와 b+tree의 공통점과 차이점 </summary>
- B+tree는 B-tree의 확장개념으로, B-tree의 경우, internal 또는 branch 노드에 key와 data를 담을 수 있다. 
  하지만, B+tree의 경우 브랜치 노드에 key만 담아두고, data는 담지 않는다. 
  오직 리프 노드에만 key와 data를 저장하고, 리프 노드끼리 Linked list로 연결되어 있다. 

</details>


<details open>
  <summary> B-트리를 사용하는 이유에 대해서 설명하시오 </summary>
</details>

<details open>
  <summary> hashmap, hashtable의 원리를 설명하시오 </summary>
</details>

<details open>
  <summary> 해시 충돌이 발생하는 이유를 설명하시오 </summary>
</details>

<details open>
  <summary> 해시 테이블 충돌 해결방법 2가지를 설명하시오 </summary>
</details>
<details open>
  <summary> 해시맵과 해시테이블의 공통점과 차이점을 설명하시오 </summary>
- map 인터페이스를 상속받아 구현되며 데이터를 키와 값으로 관리한다.
- 차이점
  - 해시테이블은 키 값에 null을 허용하지 않지만, 해시맵은 null을 허용
  - 해시테이블은 동기화를 처리하는 비용 때문에 해시맵에 비해 속도가 느림

</details>

<details open>
  <summary> 해시 테이블 시간 복잡도에 대해 설명하시오 </summary>
- 각각의 Key값은 해시함수에 의해 고유한 index를 가지게 되어 바로 접근할 수 있으므로 평균 O(1)의 시간복잡도로 데이터를 조회할 수 있다. 하지만 데이터의 충돌이 발생한 경우 Chaining에 연결된 리스트들까지 검색을 해야 하므로 O(N)까지 시간복잡도가 증가할 수 있다.

</details>

<details open>
  <summary>언어별 해시테이블 충돌 해결 방법에 대해 설명하시오 </summary>
-  c++, Java,Go는 개별 체이닝 방식을 사용하고, Ruby, Python은 오픈 어드레싱 방식을 사용한다.

</details>
