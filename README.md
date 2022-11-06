# kotlin-racingcar

### 기능 요구 사항
* 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
* 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
* 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
* 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

### 기능 명세서
- [X] 입력 객체 생성
  - [X] 자동차 댓수 입력
  - [X] 시도할 횟수 입력
- [X] 음수가 아닌 숫자 객체 생성
  - [X] 0 보다 작은 경우 검증
  - [X] 더하기 기능 추가
- [ ] 숫자 문자열 변환 객체 생성
  - [ ] 숫자 문자열이 아닌 경우 검증
- [ ] 자동차 객체 생성
  - [ ] 전진 로직 구현 (0 ~ 9 사이 무작위 값 중 4 이상일 경우)
- [ ] 출력
  - [ ] 자동차의 상태 화면 출력