## 기본 자료 구조 질문 모음

<details open>
  <summary> 프로세스와 스레드에 대해 설명하시오 </summary>

프로세스는 운영체제로부터 자원을 할당받는 작업의 단위이고 스레드는 프로세스가 할당받은 자원을 이용하는 실행의 단위이다.

프로세스는 컴퓨터 메모리에 올라가서 실행되고 있는 프로그램의 인스턴스로, 운영체제로부터 시스템 자원(cpu 시간, 주소 공간, 메모리 영역)을 할당받는 작업의 단위 입니다.
프로세스는 각각의 독립된 메모리 영역(코드, 데이터, 스택, 힙)을 할당받고, 기본적으로 프로세스당 최소 1개의 스레드(메인 스레드)를 가지며 한 프로세스는 별도의 주소공간에서 실행되어 다른 프로세서에 접근할수 없습니다.

스레드는 프로세스 내에서 실행되는 여러 흐름의 단위로, 프로세스가 할당 받은 자원을 이용하는 실행의 단위라고 할 수 있습니다.
스레드는 프로세스 내에서 각각 스택만 따로 할당받고, 코드, 데이터, 힙은 공유합니다. 따라서 한 스레드가 프로세스 자원을 변경하면 이웃 스레드도 그 변경결과를 즉시 확인할 수 있습니다.

</details>

<details open>
  <summary> 컨텍스트 스위칭이 무엇인가요? </summary>

멀티 프로세스 환경에서 CPU가 특정 프로세스를 실행하고 있는 상태에서 인터럽트 요청에 의해 다음 우선순위의 프로세스가 실행되어야할 때 기존 프로세스의 상태 또는 레지스터 값을 PCB에 저장하고 다음 프로세스를 수행하도록 새로운 프로세스의 상태 또는 레지스터 값을 교체하는 작업을 컨텍스트 스위칭이라고 합니다.

</details>

<details open>
  <summary> 멀티 프로세스와 멀티 스레드의 특징에 대해 설명해보시오 </summary>

멀티 프로세스

- 하나의 프로세스가 죽어도 다른 프로세스에 영향을 끼치지 않고 계속 실행
- 멀티 쓰레드보다 많은 메모리 공간과 CPU 시간 차지

멀티 쓰레드

- 스택 영역만 독립된 공간을 할당받고 Code, Data, Heap 영역은 서로 공유하고 있기 때문에 적은 메모리 공간 차지, context switching이 빠르다
- 서로 공유하는 영역이 있기 때문에 하나의 쓰레드에 문제가 생기면 전체 쓰레드가 영향을 받는다.
- 동기화 문제가 발생할 수 있다

   </details>

<details open>
  <summary> 멀티 쓰레드의 동시성과 병렬성을 설명해주세요 </summary>

동시성은 멀티 작업을 위해 싱글 코어에서 여러 개의 쓰레드가 번갈아 실행하는 것을 말합니다. 즉, 문맥교환이 빠르게 수행되면서 실제로는 번갈아가며 실행되는 것이지만 그 속도가 너무 빨라서 동시에 실행되는 것처럼 보여지는 것입니다.

병렬성은 멀티 작업을 위해 멀티 코어에서 한 개 이상의 스레드를 포함하는 각 코어들을 동시에 실행하는 것을 말합니다.

</details>

<details open>
  <summary> 멀티 스레드 환경에서 주의할 점이 있나요? </summary>

다수의 쓰레드가 공유 데이터에 동시에 접근하는 경우 상호배제 또는 동기화 기법을 통해 레이스 컨디션(동기화 문제), 또는 데드락(교착 상태)가 발생하지 않도록 주의해야 한다.

  </details>

<details open>
  <summary> 멀티 프로세싱, 멀티 프로그래밍, 멀티 태스킹, 멀티 스레딩의 차이점 </summary>

멀티 프로세싱 : 다수의 프로세서(CPU)가 서로 협력적으로 일을 처리하는 것을 의미합니다. 다수의 프로세서가 다수의 작업을 함께 처리하는 것.

- 멀티 프로세싱의 장점은 하나의 프로세서가 고장이 나더라도 해당 프로세서가 진행 중인 작업은 다른 프로세서에서 수행하고 있기 때문에 작업이 정지되지 않는다.
- ​여러 개의 프로세스가 처리되어야 할 때 동일한 데이터를 사용한다면 각 데이터를 각 프로세서에게 할당할 필요 없이 하나의 공간에 데이터를 저장한 후 이를 공유하여 사용하도록 한다면 비용을 절약할 수 있다.

멀티 프로그래밍 : 프로세서가 입출력 작업의 종료를 대기할 동안 하나의 프로세서에서 다른 프로그램을 수행할 수 있도록 하는 것입니다.

멀티 태스킹 : OS의 스케쥴링에 의해 task를 번갈아가며 수행하는 것을 의미합니다. 즉, 여러개의 task를 자주 번갈아가며 수행하다 보니 사용자는 동시에 여러 task가 수행되고 있다고 느낍니다.

멀티 스레딩 : 하나의 프로세스를 다수의 스레드로 구분하여 자원을 공유하고 자원의 생성과 관리의 중복성을 최소화하여 수행 능력을 향상시키는 것을 의미합니다.

  </details>

<details open>
  <summary> 멀티스레드의 장단점에 대해 설명해보시오 </summary>

   </details>

<details open>
  <summary> 멀티 프로세스에서는 어떤 과정이 일어나는지 설명하시오 </summary>

  </details>

<details open>
  <summary> 멀티 프로세스 대신 멀티 스레드를 사용하는 이유를 설명하시오  </summary>
멀티 프로세스로 실행되는 작업을 멀티 스레드로 실행할 경우, 프로세스를 생성하여 자원을 할당하는 시스템 콜이 줄어들어 자원을 효율적으로 관리할 수 있습니다.

또한, 프로세스 간의 통신보다 스레드 간의 통신 비용이 적으므로 작업들 간 통신의 부담이 줄어듭니다. (처리비용 감소. 프로세스는 독립구조이기 때문)

스레드를 활용하면 자원의 효율성이 증가하기도 하지만, 스레드 간의 자원 공유는 전역 변수를 이용하므로 동기화 문제가 발생 할 수 있으므로 프로그래머의 주의가 필요하다.

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
