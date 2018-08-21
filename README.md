# 자바의신 정리파일
  - 자바의신 책을 보며 메모하는 리파지토리
  - 개인 공부용이라 자세한 내용이 궁금하면 책을 참고하시길...

## 변수의 종류
  - 지역변수
    - 중괄호 내에서 선언된 변수
    - 중괄호 내에서만 유효
  - 매개 변수
    - 메소드에 넘겨주는 변수
    - 메서드가 호출될 때 생명이 시작되고, 메서드가 끝나면 소멸.
  - 인스턴스 변수
    - 메서드 밖에, 클래스 안에 선언된 변수. static 예약어가 없어야 함.
    - 객체가 생성될 때 생명이 시작되고, 그 객체를 참조하고 있는 다른 객체가 없으면 소멸.
  - 클래스 변수
    - 메서드 밖에, 클래스 안에 선언된 변수. static 예약어가 붙은거. 
    - 클래스가 처음 호출될 때 생명이 시작되고, 자바 프로그램이 끝날 때 소멸.

## 변수의 자료형
  - String은 참조 자료형이지만 new를 사용해 객체를 생성하지 않아도 되는 유일한 리턴타입이다.
    > String bookName = "hahahaha";
  - 자바에서 돈계산 괸련된건 정확성 떄문에 BigDecimal 사용한다. float, double 안씀.

## 기본형 자료형
  - 자바의 모든 자료형은 기본형이 있지만, 지역변수로 기본 자료형을 사용할 땐 반드시 값을 지정해야 한다. (사용하지 않을땐 컴파일 에러 안남)

## 조건
  - if 문장이 하나라도 중괄호를 열고 닫는 습관을 들이자. 가독성이 좋아진다. 
  - 학점, 이자 계산 같이 하나의 값이 여러 범위에 걸쳐 비교될 때는 switch 구문 사용이 좋다. 
  - switch
    - 비교 대상의 값에 범위가 있으면 if를 사용하는 것이 좋고, 특정 조건에 따른 처리를 해야할 경우 switch문이 좋다. 
    - default는 맨 뒤에 넣는 것을 권장한다. 
    - 숫자 비교시 작은 숫자부터 증가 시켜 나가는게 좋다. 
  - label
    - 두개 이상의 for나 while 루프가 있을때 아주 가끔 사용된다. 

## 배열
  - 지역변수의 경우 초기화를 하지 않으면 사용이 불가한데, 배열의 경우는 크기만 잡아주면 초기화 하지 않아도 각 배열의 기본값이 할당 된다. 
  
  
