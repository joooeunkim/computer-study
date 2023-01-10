## 기본 자료 구조 질문 모음

<details open>
  <summary> 프로세스와 스레드에 대해 설명하시오 </summary>

프로세스는 컴퓨터 메모리에 올라가서 실행되고 있는 프로그램의 인스턴스로, 운영체제로부터 시스템 자원(cpu 시간, 주소 공간, 메모리 영역)을 할당받는 작업의 단위 입니다.
프로세스는 각각의 독립된 메모리 영역(코드, 데이터, 스택, 힙)을 할당받고, 기본적으로 프로세스당 최소 1개의 스레드(메인 스레드)를 가지며 한 프로세스는 별도의 주소공간에서 실행되어 다른 프로세서에 접근할수 없습니다.

스레드는 프로세스 내에서 실행되는 여러 흐름의 단위로, 프로세스가 할당 받은 자원을 이용하는 실행의 단위라고 할 수 있습니다.
스레드는 프로세스 내에서 각각 스택만 따로 할당받고, 코드, 데이터, 힙은 공유합니다. 따라서 한 스레드가 프로세스 자원을 변경하면 이웃 스레드도 그 변경결과를 즉시 확인할 수 있습니다.

</details>

<details open>
  <summary> 멀티스레드의 장단점에 대해 설명해보시오 </summary>

   </details>

<details open>
  <summary> 멀티 프로세스에서는 어떤 과정이 일어나는지 설명하시오 </summary>

  </details>

<details open>
  <summary> 멀티 프로세스 대신 멀티 스레드를 사용하는 이유를 설명하시오  </summary>

</details>

<details open>
  <summary> 선점 스케줄링과 비선점 스케줄링에 대해 설명해보시오 </summary>
</details>

<details open>
  <summary> cpu 스케줄링 평가 기준에 대해 말해보시오 </summary>
</details>

<details open>
  <summary> cpu 스케줄링이 필요한 이유를 설명해보시오 </summary>
</details>

<details open>
  <summary> 알고있는 cpu 스케줄링 기법을 말해보시오 </summary>
</details>

<details open>
  <summary>스케줄러 종류 3가지를 설명하시오 </summary>
</details>

<details open>
  <summary> 콘보이 현상이란? 콘보이 현상이 발생될 수 있는 cpu 스케줄러 알고리즘은? </summary>
</details>

<details open>
  <summary> 선점 스케줄링의 종류를 3가지 예를 들고 그에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 비선점 스케줄링의 종류 3가지 이상 예를 들고 그에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 스케줄링의 종류에서 fifo 스케줄링과 라운드 로빈 스케줄링에 대해 설명하시오 </summary>
</details>

<details open>
  <summary>메모리 내 프로세스가 어떻게 탑재되는지 구조를 설명하시오 </summary>
</details>

<details open>
  <summary> PCB의 역할을 설명하시오 </summary>
</details>

<details open>
  <summary> IPC의 두 모델을 설명하시오 </summary>
</details>

<details open>
  <summary> context switching 문맥 교환이란? </summary>
</details>

<details open>
  <summary> FCFS의 한계, SJF의 한계, priority scheduling의 한계를 설명하시오 </summary>
</details>

<details open>
  <summary> 멀티레벨 피드백 큐를 사용하는 이유를 설명하시오
 </summary>
</details>

<details open>
  <summary> aging방식을 설명하시오 </summary>
</details>

<details open>
  <summary> 다단계 큐가 실제 작동하는 방식은 무엇인가 </summary>
</details>

<details open>
  <summary> 다단계 큐와 다단계 피드백 큐의 차이점에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> race condition이란 무엇인지 설명하시오 </summary>
</details>

<details open>
  <summary> 임계영역이란 무엇인지 설명하시오 </summary>
</details>

<details open>
  <summary> lock의 방식, lock의 한계를 설명하시오 </summary>
</details>

<details open>
  <summary>blocking과 nonblocking에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> race condition 예방법에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 임계영역 문제가 만족해야 하는 3가지 조건에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> testandset에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 피터슨 알고리즘 단점과 문제점에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 상호배제의 기법 중 SW solution 한가지를 설명하시오 </summary>
</details>

<details open>
  <summary> 상호배제의 기법 중 HW solution 한가지를 설명하시오 </summary>
</details>

<details open>
  <summary> 데드락 발생조건 4가지에 대해 설명하시오. </summary>
</details>

<details open>
  <summary> 은행원 알고리즘에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 데드락의 탐지 및 회복에 대해 설명하시오. </summary>
</details>

<details open>
  <summary> 데드락이 무엇인지 설명하시오 </summary>
</details>

<details open>
  <summary>데드락을 해결하는 방법 3가지를 설명하시오 </summary>
</details>

<details open>
  <summary> 메모리 관리의 목표에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 메모리 관리가 필요한 이유 3가지 이상 설명하시오 </summary>
</details>

<details open>
  <summary> 정적링킹과 동적링킹의 차이에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 컴파일 과정의 내용을 설명하시오 </summary>
</details>

<details open>
  <summary> 동적 적재의 장점에 대해 설명하시오</summary>
</details>

<details open>
  <summary> 오버레이와 paging VMM의 차이에 대해 설명하시오 </summary>
</details>

<details open>
  <summary>스와핑과 VMM의 차이에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 동적 로딩에 대해서 설명해보시오 </summary>
</details>

<details open>
  <summary> Overlay에 대해서 설명해보시오 </summary>
</details>

<details open>
  <summary> 스와핑에 대해서 설명해보시오 </summary>
</details>

<details open>
  <summary> 물리적 주소에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 바인딩이 되는 시점 3가지에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 내부 단편화와 외부 단편화에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> address binding이 필요한 이유는? </summary>
</details>

<details open>
  <summary> compile time binding, load time binding, run time binding 이란 무엇인지, 한계는 무엇인지 설명하시오. </summary>
</details>

<details open>
  <summary> contiguous allocation이란 무엇인가? </summary>
</details>

<details open>
  <summary> 연속 메모리 할당에서 외부 단편화를 줄이기 위한 방법을 설명하시오 </summary>
</details>

<details open>
  <summary> 페이징 기법이 무엇인지, 사용하는 이유에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> 최초 적합, 최적 적합, 최악 적합의 효율성에 대해 설명하시오 </summary>
</details>

<details open>
  <summary> fit 방식의 문제점에 대해 설명하시오 </summary>
</details>
