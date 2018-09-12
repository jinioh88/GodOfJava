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
  - 참조 자료형은 초기화 하지 않으면 null이 된다. 
  - 중괄호를 사용해 초기화 할 땐 반드시 한번에 변수 선언 및 초기화가 이뤄져야 한다. 
  - 중괄호는 보통 절대 변경되지 않는 값을 지정할 때 선언하여 사용한다. 
    - (ex 달 --> 달처럼 변하지 않는 값은 메소드 내에 사용하는 것 보단 클래스 변수로 선언해 재활용 하는게 좋다. 
    - 단 메서드 하나에서만 이 달 배열을 사용하면 반드시 메소드 밖으로 뺼 필요는 없다...(메모리 문제 등등)
    - 위를 해결하려면 static 예약어를 활용하면 된다. 
  - 2차원 배열은 웬만하면 사용하지 않는 걸 권장한다. 
  - .length를 사용해 for 루프가 수행될 때마다 길이를 얻어오는 것은 성능 적 측면서 별로 좋지 않다. 
    > for(int one=0; one < twoDim.lenth; one++) ...
    - 다음 과 같이 수정하즈아
    >
        int len = twoDim.length;
        for(int one=0; one < len; one++)...
  - 2차원 for 루프
    >
        int[][] arr = {{1,2,3}, {4,5,6}};
        for(int[] dimArr : arr) {
          for(int data : dimArr) {
            System.out.print(data);
          }
        }
  - 배열의 값만을 처리할 수 있을 때 위처럼 향상된 배열 표현법을 쓰는게 편리하다. 
    - 하지만 1차원 배열과 2차원 배열의 위치를 모른다는 단점이 있다...
    - 위치를 확인 하려면 임시 변수를 두어야 한다. 
  - 값만 처리하기 위한 배열은 향상된 for루프를, 배열의 위치 정보도 같이 필요한 배열은 기본 for 루프를 사용하는게 편리하다. 
  - 배열은 무조건 선언할때 크기가 지정되어야 한다. 중간에 배열 크기를 감소 증가 할 수 없다. 이런 단점 보안을 위해 나온게 Collection이다. 

## 참조 자료형
  - 인스턴스 변수들을 선언한 후 생성자를 위치시키고, 그 다음 필요하나 메서드를 위치 시키자. 
  - 자바 패턴 중에 DTO, VO 라는 것이 있다.
    - DTO : 어떤 속성을 갖는 클래스를 만들고, 그 속성을 쉽게 전달하기 위해 만든 것. 데이터를 다른 서버로 전달하기 위한 것이 주 목적.
    - VO : DTO와 형태는 비슷하나, 데이터를 담아 두기 위한 목적으로 사용. 
    - DTO를 만드는 이유는 클래스안의 복잡한 데이터를 리턴할 때 DTO를 만들어 메소드의 리턴 타입에 DTO로 선언하고 그 객체를 리턴하면 편리하기 떄문이다. 
      >   public MemberDTO getMemberDto() {...}
  - 생성자는 꼭 필요에 맞는 생성자만 만드는 습관을 들이자. 
  - 함수의 리턴 타입은 하나인데, 여러개를 넘겨주고 싶으면 DTO를 사용하라.
  - 리턴값이 void 인 경우 'return;' 이렇게 해주면 메서드 수행을 종료해 라는 의미이다. 
  - static 메서드
    - 클래스 변수만 사용할 수 있다는 단점이 있따. 
  - static 블록
    - 객체는 여러개 생성하지만, 한 번만 호출되어야 하는 코드가 있다면 static 블록을 사용하면 된다. 
    - 객체가 생성되기 전에 한 번만 호출 되고, 그 이후엔 호출 되지 않는다. 
    - 클래스 내에 선언되있어야 하고, 메서드 내에서 선언될 수 없다. 
    - 클래스를 초기화 할 때 꼭 수행되야 하는 작업이 있을 경우 유용하다. 
  - Pass by Value는 호출되기 전과 후에 데이터가 변경되지 않는다.
    - 참조변수일 경우에도 호출된 메서드에서 다른 객체로 대체하여 처리하면(new ~) 기존 값은 바뀌지 않는다. 
  - Pass by Reference
    - 매개 변수로 받은 참조 자료형 안에 있는 객체를 변경하면, 호출한 참조 자료 형 안에 있는 객체는 호출된 메서드에서 변경한 대로 데이터가 바뀐다. 
  - 매개 변수 지정하기
    - 매개 변수가 갯수가 유동적이라면 배열로 넘겨주는 방법이 있다. 매개 변수 넘겨줄 땐 배열을 만든 후 넘겨줘야 하는 불편함이 있다.  
    - 위는 불편함이 있어 자바에선 임의의 매개 변수를 넘겨줄 방법을 제공한다. "타입...변수명"으로 선언해 주면 배열로 인식해 준다.
    - 필요에 따라 매개 변수 수를 정하기 애매한 경우 사용한다. 
    - 이 매개 변수는 다른 매개 변수들 쓰고, 가장 마지막에 선언해야 한다. 
      >   pubilc void atrb(String message, int... numbers)
  
## 등가교환 연산자
  - 기본 자료형은 같은 종류끼리 비교가 가능하다.
  - char == int, double == int, boolean == boolean 같이 비교할 수 있다. 
  - boolean == int 는 안된다. 


## 패키지
  - 패키지 이름은 java로 시작하면 안된다. 컴파일은 되지만 실행이 안된다. 
  - 패키지 이름은 모두 소문자로 지정해야 한다. 
  - 자바 예약어를 사용하면 안된다. 
  - 자바 패키지가 있을 때, 같은 패키지에 있는 클래스들과 java.lang 패키지에 있는 클래스들만 찾을 수 있다. 
  - 다른 패키지에 있는 클래스를 찾지 못할 경우 import 예약어를 사용한다. 
  - JDK 5부터 import static 이라는 것이 추가 됬는데, static한 변수와 satic 메서드를 사용하고자 할 때 용이하다. 
      > 
          // c.javapackage.sub.SubStatic.java에 static 변수 CLASS_NAME과 static함수 subStaticMethod()가 있다고 할때.
          // imort static이 없다면 SubStatic.CLASS_NAME, SubStatic.subStaticMethod() 이런 식으로 물러오지만
          // import static 이 있다면 System.out.println(CLASS_NAME);  subStaticMethod() 처럼 바로 쓸 수 있다. 

## 접근 제어자
  - public
    - 누구나 접근할 수 있도록 할 때 사용
  - protected
    - 같은 패키지에 있거나 상속받는 경우 접근할 수 있다.
  - package-private
    - 아무 접근제어자 안적어줄때 이렇게 불린다.
    - 같은 패키지 내에 있을 떄만 접근할 수 있다.
  - private
    - 해당 클래스 내에서만 접근 가능하다. 
  - 클래스 접근 제어자 선언할 때 유의점
    - public으로 선언된 클래스가 소스 내에 있다면, 그 소스 파일의 이름은 public 인 클래스 이름과 동일해야 한다. 

## 상속
  - 상속을 하게 되면 부모 클래스에 선언되 있는 public, protected로 선언된 모든 변수, 메서드를 사용할 수 있다. 
  - 자식클래스의 생성자를 호출하면, 부모 클래스의 기본 생성자가 먼저 호출된다. 
  - 자바는 다중 상속 안된다.
  - 상속과 생성자
    - 자식 클래스의 생성자가 실행할 떄 부모 클래스의 기본 생성자가 없다면 에러가 발생한다.(부모 클래스에 기본 생성자 없고, 매개변수 있는 생성자만 있을 경우)
    - 매개 변수가 있는 생성자를 만들면 기본 생성자는 자동으로 만들어 지지 않기 때문
    - 위의 해결 방법은 2가지가 있다.
      - 부모 클래스에서 기본 생성자를 만들어 준다.
      - 자식 클래스에서 부모 클래스의 생성자를 명시적으로 지정하는 super("매개변수")를 사용한다. 기본 super()는 자식에서 선언 안해도 자동으로 들어간다.
  - 오버라이딩
    - 부모 클래스의 메서드가 자식클래스에도 있다면 오버라이딩 인데, 리턴값을 마음데로 바꾸지 못한다. 
    - 자식클래스에서 접근자는 접근 권한이 부모보다 크거나 같아야 한다. ex) 부모가 public이면 자식이 private면 오류.
  - 참조 자료형의 형변환
    - 자바 컴파일러에선 자식 객체를 생성할 때 부모 생성자를 사용하면 안된다고 못을 밖았다. 명시적 형변환 해줘야 한다. 
    - 명시적 형 변환을 해도 예외가 발생 할 수 있다. 
      >
          Parent parent = new Parent();
          Child child = new Child();
          Parent parent2 = child;  // 가능
          Child child2 = (Child)parent;   // 형변환 필요. 컴파일은 되지만 예외가 발생한다. 
          Child child3 = (Child)parent2;  // 형변환 필요. 정상 작동한다. parent2가 겉보기엔 Parent 지만 child를 대입해줘 Child로 형변환 됬기 때문(힙의 Child객체를 가리킴) 
    - 일반적으로 여러 개의 값을 처리 하거나, 매개 변수로 값을 보낼 땐 보통 부모 클래스의 타입으로 보낸다.(배열...) 
      - 근데 부모는 넘겨주는 타입이 부모인지 자식인지 모르니 instanceof로 구분한다.
      - instanceof로 타입을 점검할 땐 부모 인스턴스인지 여부르 먼저 점검하면 안된다. 모든 결과가 부로로 찍힐 가능성이...
      - instanceof로 타입 점검할 땐 가장 하위에 있는 자식부터 확인하는게 안전하다. 
  - Polymorphism(다형성))
    - 형 변환을 하더라도, 실제 호출된는 것은 원래 객체에 있는 메서드가 호출된다(new 생성자를 사용한 클래스). 

## Object
  - 모든 클래스는 Object 클래스를 상속 받는데, Object 클레스에 있는 메서드들을 통해 클래스의 기본적인 행동을 정의할 수 있기 떄문이다. 
  - Objectg 클래스에서 제공하는 메서드 종류 
    - 객체를 처리하기 위한 메소드와 쓰레드를 위한 메소드로 나뉜다. 
    - 필요할 떄 이것들은 오버라이딩해서 사용해야 한다. 
      - 오버라이딩이 필요한 떄는 DTO를 사용할 떄 오버라이딩 하면 좋다. 내용확인이 쉽기 떄문. 객체를 비교하기 위함.
  - toString() 메서드
    - 해당 클래스가 어떤 객체인지 쉽게 나타낼 수 있다. 
    - System.out.println() 에 매개변수로 들어가는 경우 toString()이 자동으로 호출된다. 
    - String을 제외한 참조 자료형에 더하기 연산을 수행하면, 자동으로 toString() 메서드가 호출된다. 
  - 객체에 '==' ? 'equals()'
    - 참조자료형에서 '=='는 주소값을 비교한다. 
    - equals()는 오버라이딩 해야지 제대로 비교가 가능해 진다. 안하면 같은 값을 같는 객체라도 hashCode() 값이 달라져 같다고 판단을 안한다. 
    - equals() 오버라이딩할 떈 hashCode()도 같이 오버라이딩 해줘야한다. 
  - hashCode()
    - 객체의 메모리 주소를 16진수로 리턴한다. 

## 인터페이스
  - DAO라는 패턴이 있는데 데이터를 저장하는 저장소에서 원하는 값을 요청하고 응답을 받는다. 
  - 인터페이스와 추상 클래스를 사용하는 이유
    - 설계시 선언해 두면 개발할 때 기능을 구현하는데 집중할 수 있다. 
    - 개발자 역량에 따른 메서드 이름과 매개 변수 선언의 격차를 줄일 수 있다. 
    - 선언과 구현을 구분할 수 있다. 
  - abstract란 자베아센 메서드가 구현되지 않은, 인터페이스에 있는 메서드 선운문들과 같이 몸통이 없이 선언한 것을 말한다. 
  - 인터페이스의 또다른 목적은 외부에 노출되는 것을 정의해 놓고자 할 떄 사용된다. 
  - static이나 final을 선언하면 안된다. 

## abstract 클래스
  - abstract 클래스는 abstract로 선언한 메서드가 하나라도 있을때 선언한다. 
  - 메서드가 구현되 있어도 상관 없다. 

## final 클래스/메서드/변수/참조자료형
  - 더 이상 확장해선 안되는 클래스, 누군가 이 클래스를 상속 받아 내용을 변경하면 안되는 클래스를 선언할 때 final을 붙인다. 
  - 메서드를 final로 하면 오버라이딩 할 수 없다. final 메서드는 사실 별로 잘 안쓴다. 
  - 인스턴스 변수나 클래스 변수에 final을 붙으면 생성과 동시에 초기화를 해야 한다. 
  - 매개 변수나 지역변수에 final이 붙으면 초기화 안해줘도 된다. 
  - final 참조자료형도 생성곽 선언을 한번에 해야하며, 두 번 이상 값을 할당하거나 새로 생성자를 사용해 초기화 할 수 없다. 
    - 하지만 그 객체의 안에 있는 변수들을 final로 선언된게 아니라서 값을 할당해 줄 수 있다. 

## enum 클래스
  - 어떤 클래스가 상수 만으로 만들어져 있을 경우 반드시 class로 선언할 필요는 없다. emum으로 선언하자.  
  - enum은 클래스의 일종이다. 
  - enum을 사용하는 방법은 switch 문에서 사용하는 것이다. 
  - enum 타입은 'enum 클래스이름.상수이름'으로 클래스의 객체 생성이 완료된다. 
  > 
      int myAmount = manager.getOverTimeAmount(OverTimeValues.THREE_HOUR);
      // 다음과 같이 풀어 쓸 수 있다.
      OverTImeValues value = OverTImeValues.THREE_HOUR;
      int myAmount = manager.getOverTimeAmount(value);
  - enum 상수 값을 지정하는 것은 가능하다. 단 동적으론 할당이 안된다. 
  - enum에서 생성자는 private와 package-private 접근 제어자를 사용할 수 있다. public, protected 안된다. 
    - 각 상수를 enum 클래스 내에서 선언할 때에만 이 생성자를 사용할 수 있따. 
  - 컴파일할 때 enum 생성자를 자동으로 만들어준다. 
  - enum 클래스의 부모는 무조건 java.lang.Enum이어야 한다. 
    - 컴파일러가 자동으로 java.lang.Enum을 부모로 상속해서 그러므로 마음대로 extends하지 말자.(이중 상속 안되서)

## 예외
  - System.err.println() 하면 개발도구 IDE에서 출력 겨로가가 다른 색으로 표시된다. 
  - 오류 발생 부분에 위와 같이 쓰도록 하자. 
  - try-catch의 변수 선언
    - try블록안에서 선언한 변수는 catch블록에서 사용할 수 없다. 블록이 달르기 때문.
    - 일반적으로 catch 믄장에서 사용할 변수에 대해선 try 앞에 미리 선언해 놓는다. 
  - finally 블로긍ㄴ 코드의 중복을 피하기 위해 반드시 필요하다. 
  - 두개 이상의 catch
    - catch 블록의 순서는 매우 중요하다. 
    - 모든 예와의 부모 클래스는 java.lang.Exception 클래스다. 
    - 부모 예외 클래스가 이미 catch를 하고 자식클래스가 아래에서 catch를 하면 자식 클래스가 예외 처리할 기회가 없어진다. 
    - Exception 클래스로 catch 하는 것은 가장 아래에 추가할 것을 권장한다. (안전한 프로그램)
  - 예외의 종류는 3가지 이다.
    - 1) checked exception
    - 2) error
    - 3) runtime exception OR unchecked exception
    - 2),3)을 제외한 모든 예외는 1)에 해당한다. 
  - error예외
    - 자바 프로그램 밖에서 발생한 예외를 말한다. 
    - 서버의 디스크가 고장낫다거나, 메인보드가 맛이간 경우. 
    - Error는 프로세스에 영향을 주고, Exception은 쓰레드에만 영향을 준다. 
  - runtime exception
    - 예외가 발생할 것을 미리 감ㄱ지하지 못했을 때 발생한다. 
    - 컴파일 할 때 예외가 발생하지 않고, 실행시 발생할 가능이 있는 예외를 런타임 예외라 한다. 
    - ![image](https://user-images.githubusercontent.com/37525926/44562638-70d87600-a795-11e8-9336-a6d84ab3e230.png)
  - 모든 예외의 최고봉 조상은 java.lang.Throwable 클래스다.
    - Exception이나 Error를 Throwable로 처리해도 무관하다. 
    - Throwable 생성자에서 Throwable 매개 변수로 예외의 원인을 넘겨줄 수 있다. 
    - Throwable을 오버라이딩한 메서드 중에 다음 가장 많이 사용하는 메서드들
      - getMessage() : 예외 메세지를 String 형태로 받는다. 어떤 예외가 발생했는 지 확인할 떄 좋음. 
      - toString() : 예외 메세지를 String 형태로 받는다. getMessage보다 더 자세하게 제공.
      - printStackTrace() : 가장 첫줄에 예외 메세지를 출력하고, 두번째 부터 예외가 발생하게 된 메서드들의 호출 관계를 출력. 
        - 이건 개발할 때만 사용하자. 운영 시스템에서 많은 로그가 쌓이기 때문...
  - 예외를 던질 throws
    - throw한 예외와 동일하거나 상속 관계가 있는 예외가 있다면 그 블록에서 예외를 처리할 수 있다. 
    - 만약 해당하는 예외가 없다면 예외가 발생된 메서드를 호출한 메서드로 던진다. 
      - 이럴떄 사용하는게 throws 구문이다. 
      - 이거 해놓으면 예외 발생 시 try-catch문 묶어주지 않아도 그 메서드를 호출한 메서드로 예외 처리를 위임한다. 
      - 하지만 throws로 메서드를 선언하면 개발이 어려워진다. 
      - throws를 선언한 매서드를 호출한 메서드 쪽에선 이 호출한 메서드를 반드시 try-catch블럭으로 감싸야 한다. 
      - 다른 방법은 호출한 메서드 쪽에서도 throws 해버리면 된다. 
        - throws한걸 또 throws하는건 좋지 않은 습관이다. 
      - 가장 좋은 방법은 throws 하는 메서드를 호출하는 쪽에서 try-catch로 처리하는 것이다. 
    - 예외를 throw하는 이유는 해당 메서드에서 예외를 처리하지 못하는 상황이거나, 미처 처리하지 못한 예외가 있을 경우 대비하기 위함이다. 
  - 예외를 만들 수 있다. 
    - Error와 관련된 클래스는 개발자는 손델 필요 없고, Exception을 처리하는 예외 클래스는 개발자가 임의로 추가해 만들 수 있다. 
      - 단 Throwable이나 그 자식 클래스의 상속을 받아야 한다. (extends Exception)
  - 자바의 예외 처리 전략
    - catch 문장에 아무런 처리를 하지 않는다면 문제가 어디서 발생했는지 전혀 찾을 수 없게 된다. 
    - 구글검색으로 '자바 예외 전략', 'java exception strategy'로 검색해 자료를 찾아보자

## String
  - String 클래스는 Serializable, Comparable, CharSequence 인터페이스를 구현하고 있다.
  - Serializable은 객체를 파일로 저장하거나 다른 서버에 전송 가능한 상태가 된다. 
  - Comparable은 객체의 순서를 처리할 때 유용하다. 
  - Charset
    - 영어를 제외한 것은 특수문자로 본다.
    - 한글도 특수문자로 봐서 UTF-16을 많이 쓴다. 예전엔 EUC-KR, UTI-8을 많이 썻다. 
  - 문자열을 byte로 변환하기
    - 일반적으론 getBytes()를 쓰면 된다.
    - 하지만 다른 시스템에서 전달 받은 물자열을 byte 배열로 변환할 떈 getBytes(Charset charset), getBytes(String charsetName)을 쓴다. 
  - 문자열이 깨지는걸 방지하기 위해 byte 배열로 생성할 떄 사용한 캐릭터 셋을 문자열로 다시 전환할 때도 동일하게 사용해야 한다. 
  - 객체의 null 체크는 반드시 필요하다. 
    - String뿐만아니라 모든 객체를 처리할 떈 널 체크를 반드시 해야한다. 
    - null인 겍체의 메서드에 접근하면 NullPointException이 발생한다. 
    - 메서드로 넘어오는 객체가 널일 확률이 조금이라도 있다면 반드시 한 번씩 null체크를 고려하자. 
  - String의 내용을 비교하고 검색하는 메서드
    - 문자열이 비었는지 확인
      - isEmpty()를 쓰면 된다. 문자열의 길이가 0인자 확인하는 것보다 이게 훨씬 간단하다. 
    - 문자열 길이가 같은지 확인
      - equals, compareTo, contentEquals 메소드로 분류할 수 있다. 
      - IgnoreCase가 붙은 메서드들은 대소문자 구분을 할지 안할지 여부이다. 
      - 자바에선 객체들을 재사용하기 위한 'Constant Pool'이라는 것이 있다. String의 경우 동일한 값을 갖는 객체가 있으면 이미 만든 객체를 사용한다. 
      - new String()으로 객체를 따로 생성한다면, Constant Pool의 값을 재활용하지 않고 별도의 객체를 생성한다. 
    - 특정 조건에 맞는 문자열이 있는지 확인 메서드
      - startsWith() : 매개 변수로 넘겨준 값으로 시작하는지 확인.
      - startsWith(), endsWith() 메소드를 사용하면 원하는 값이 해당하는 물자열에 있는지 쉽게 확인할 수 있다. 
      - 중간값에 있는 것은 contains()로 확인한다. matches()도 동일 기능인데 이것은 정규표현식을 되어 있어야 한다. 
        - 인사이트의 "손에 잡히는 정규 표현식" 책을 참고.
    - String 내에서 위치 찾는 방법
      - indexOf(), lastIndexOf() 메서드를 활용하자. 둘의 차이는 검색 시작 위치만 다를 뿐이지 리턴하는 값의 위치는 같다. 
    - 문자열 일부를 잘라내는 법
      - substring()을 사용하는데, 보통 indexOf()메서드와 함께 사용한다. 
    - 문자열을 여러개 String 배열로
      - 정규 표현식을 사용해 문자열을 나눈다면 split()을 사용한다. 
      - 그렇지 않고 특정 String으로 문자열을 나눈다면 StringTokenizer 클래스를 사용하는 것이 편하다. 
  - String 값을 바꾸는 메서드
    - String을 조작하기 전에 null인지 먼저 체크하는 습관을 들이자. 
    - replace()는 문자열 내용중 일부를 바꾸는 건데, 기존 문자열의 값은 바뀌지 않는다. 
  - 기본 자료형을 문자열로 변환 - valueOf()
    - 기본 자료형에 + "문자열"을 해줘도 같은 기능이 된다.
    - String으로 변환만 해 놓고 별도의 문자열과 합치는 과정이 없을 경우에는 valueOf()를 사용하는 걸 권장한다. 
    - valueOf()의 매개변수로 Object가 왔을 때 toString()의 결과를 리턴해 준다. 이 때 객체가 null이면 null을 리턴해 주기 떄문에, nullException이 발생하는 결과를 방지하기 위해서 객체를 출력할 때 valueOf() 메서드를 사용하면 좋다. 
  - StringBuffer, StringBuilder
    - String은 immutable(불변)한 객체다.   
    - String 객체는 변하지 않고, 문자열이 바뀌면 새로운 String 객체가 생성되고 기존껀 버려진다. '+'로 계속 더한다면 쓰레기 값이 증가할 것이다.
    - 이런 단점을 보완하고자 StringBuffer와 StringBuiler가 나왔다.  두 기능은 동일 하다. 
    - StringBuffer는 Thread safe하고, StringBuilder는 Thread safe하지 않다. 
      - StringBuffer가 더 안전. 속도는 Thread safe하지 않는것이 빠르다. 
      - 두 클래스에서 append() 메서드를 사용하면 된다. 
      - JDK 5 부턴 String의 더하기 연산을 할 경우 컴파일 할때 자동으로 해당 연산을 StringBuilder로 변환해 준다. 
        - 단 for루프와 반복 연산을 할 땐 자동으로 변환해 주지 않는다. 
      - String, StringBufer, StringBuilder 모두 CharSequence 인터페이스를 구현했다.
        - 이 세개의 클래스를 사용해 매개 변수로 받은 작업을 할 때 String, StringBuffer 타입으로 받는것 보다 CharSequence 타입으로 받는게 좋다. 
        - 어떤 변수가 여러 Thrad에서 이 변수에 동시 접근하는 일이 생긴다면 StringBuffer를 사용해야만 한다. 

## 클래스 안의 클래스
  - 클래스 안의 클래스를 'Nested 클래스'라고 부른다. 
  - 이 것이 있는 이유는 코드를 간단하게 표현하기 위함이다. 
  - Nested 클래스는 선언한 방법에 따라 'Static nested클래스'dhk '내부 클래스'로 구분된다.
  ![image](https://user-images.githubusercontent.com/37525926/44575422-ee68aa00-a7c6-11e8-8202-219e283d2a95.png)
  - Static nested 클래스와 내부 클래스의 차이는 static으로 선언되 있는 지 여부다. 
  - 내부 클래스는 두가지로 나뉘는데, 이름이 있는 내부클래스는 '로컬 내부 클래스', 이름 없는 클래스를 '익명 내부 클래스'라고 부른다. 
  - Nested 클래스를 만드는 이유
    - 한 곳에서만 사용되는 클래스를 놀리적을 묶어 처리할 필요가 있을 때.(Staic Nested 클래스 이용)
    - 캡슐화가 필요할 때. 즉 내부 구현을 감추고 싶을 떄.(내부클래스 이용)
    - 소스의 가독성과 유지보수성을 높이고 싶을 때.
  - static nested 클래스 
    - 내부 클래스는 감싸고 있는 외부 클래스의 어떤 변수도 접근할 수 있다. private 변수도 가능. 
    - 하지만 Static nested 클래스는 그렇게 사용 못함. 
    - 사용예
      - Student 클래스와 University 클래스가 있다고 할때, Student 클래스를 만들면 School의 학생인지 University의 학생인지 불문명하다. 
      - SchoolStudent 클래스를 만들어도 되지만 School안에 static nested 클래스인 Studnet를 만들면 용도가 명확해 진다. 
      - 겉으로 보기엔 유사하지만 내부적을 구현이 달라야 할 때 이와 같이 static nested 클래스를 사용한다. 
  - 내부 클래스와 익명 클래스
    - Inner 클래스의 객체를 생성하려면 먼저 이를 감싸고 있는 Outer 클래스의 객체를 만들어야 한다. 
    - 캡슐화 땜에 사용하는데, 하나의 클래스에서 어떤 공통적인 작업을 수행하는 클래스가 필요한데 다른 클래스에서 그 클래스가 전혀 필요 없을 때 이런 내부클래스를 만들어 사용한다. 
    - 내부 클래스는 GUI 관련 프로그램을 개발할 때 가장 많이 사용됨. 리스너를 처리할 때 많이 사용. 
    - 내부 클래스를 만드는 것 보다 더 간단한 방법은 '익명 클래스'를 만드는 것이다. 
    - 익명클래스의 장점
      - 클래스를 만들면 만들수록 메모리에 올라가니 메모리가 많이 필요해지고, 애플리케이션 시작할 때 많은 시간이 소요된다. 
      - 익명 클래스로 이를 줄일 수 있다. 
  - Nested 클래스의 특징
    - Static Nested 클래스에서는 감싸고 있는 클래스의 static 변수만 참조할 수 있다. 
    - 내부 클래스와 익명 클래스는 감싸고 있는 클래스의 어떤 변수라도 참조할 수 있다. 

## java.lang
  - 숫자를 처리하는 클래스들
    - 자바에서 기본 자료형은 힙이 아닌 스택에 저장되 관리된다. (속도 빠름)
    - 기본 자료형의 숫자를 객체로 처리하고 플때 숫자 처리 타입 클래스를 사용한다. 
    - Boolean, Character를 제외한 숫자 처리 클래스는 Wrapper 클래스라 불리고, Number라는 추상클래스를 확장한다. 
    - parseXXX() 메서드는 기본 자료형을 리턴하고, valueOf() 메서드는 참조 자료형을 리턴한다. 
    - 참조 자료형 만든 이유?
      - 매개 변수를 참조 자료형으로만 받는 메서드를 처리하기 위해
      - 제네릭을 사용하기 위해
      - MIN_VALUE, MAX_VALUE같은 클래스의 상수값을 사용하기 위해
      - 문자열을 숫자로, 숫자를 문자로 쉽게 변환하고, 진수 표현을 쉽게 처리하기 위함.
        - 진수의 숫자 표현하고 플때, 직접 구현보단 이를 활용하자. 
  
  - 각종 정보를 확인하기 위한 System 클래스
    - 3개의 static 변수가 선언되 있다. (err, in, out)
    - 현재 시간 조회
      - currentTimeMillis() : 현재 시간을 나타낼때 유용하다.
      - nanoTime() : 시간 차이를 측정하기 위한 용도의 메서드. 
  
  - System.out
    - write() 메서드가 있지만 잘 사용 안한다. 
    - println()으로 객체를 출력할 때 String의 valueOf()가 실행된다. (toString이 실행되는거 아님. null값 처리 때문))
    - 객체를 출력할 때는 toString()보단 valueOf()메서드를 사용하는 것이 훨 안전하다. 
      - toString하면 예외 발생. 
    - null 과 문자열을 합치면 예외가 발생하지 않는다. 컴파일러에서 더하기 문장을 StringBuilder로 변환하기 때문. .

### 제네릭
  - 제네릭?
    - DTO 클래스는 private변수, getter, setter, Serializable을 구현해야 제대로 된것이다. 
    - Object로 받았을때 형변환해야 하는 문제점을 컴파일 할 때 없애기 위해 제네릭이 나왔다. 
    - 형변환을 할 필요가 없어진다. 
  - 제네릭 타입 이름 정하기 
    - 아무거나 써도 되지만 자바에서 정의한 기본 규칙이 있다.
    - E : 요소 (자바 컬렉션)
    - K : 키
    - N : 숫자
    - T : 타입
    - V : 값
  - 제네릭에 ?
    - 메서드의 매개변수로 제네릭을 쓰려면 ?(wildcard)를 지정해야 한다. 
    - 매개변수로 오는 제네릭한 클래스의 타입만 바꾼다고 Overriding 되지 않는다. 
    - 매개변로 <>에 오는 것을 특정한 타입 대신 ?로 적어주면 어떤 타입의 제네릭이라도 상관없다. (어떤 값인지 모르기 때문에 Object로 넘어옴))
    - 매개 변수로 넘어오는 타입이 두세 가지로 정해진다면, 메서드 내에서 instanceof 예약어를 사용해 타입을 확인한다. 
    - 와일드 카드는 함수의 매게변수로만 사용하자.
  - 제네릭 선언에 사용하는 타입의 범위 지정
    - ? 대신 ? extends 타입으로 선택해 하면 된다. extends 뒤에 오는거 상속받은 모든 클래스를 다 사용할 수 있다. 
  - 메서드를 제네릭하게 선언(다시)
    - 메서드 선언시 리턴 타입 앞에 제네릭한 타입을 선언해 주고, 그 타입을 매개 변수에 사용하면 컴파일에 문제없다. 
    - 매개변수에 값도 할당해 줄 수 있다. (앞선 방식은 매개변수에 값 할당 못함)

### List
  - 배열은 크기가 정해져 있을 때 유용하다. 
  - Collection은 Iterable 인터페이스를 확장했는데, 이는 Iterator 인터페이스를 사용해 데이터를 순차적으로 가져올 수 있게 된다. 
  - Vector와 ArrayList는 기능이 거의 동일한데, Vector는 Thread Safe 하고, ArrayList는 그러지 않다. 
  - Stack은 Vector를 확장해 만들었다. 
  - Vector보단 ArrayList를 많이 사용한다. 
  - 왠만하면 한 가지 종류의 객체만 저장하자. .여러 객체는 DTO 객체를 만들어 담자. 
  - 그래서 컬렉션 관련 클래스 객체 선언은 제네릭을 이용하자. 
  - 저장되는 초기 크기는 기본이 10이라 데이터가 더들어가면 크기가 자동 증가는 되지만 성능상 아싸리 크게 잡자. 
  - Collection을 매개 변수로 갖는 생성자가 존재한다. 셋과 큐 등을 복사하기 위함.
    - list2.add(list); 처럼 list2에 list를 추가하며 복사해도 된다.
    - 근데 다음 생성자를 통해 사용하면 편하다. ArrayList<String> list2 = ArrayList<>(list);
    - list2 = list; 처럼 치환해버리면 list 객체가 참조되고 있는 주소를 사용하겠다는 의미다. 
  - 하나의 Collection 관련 객체를 복사할 땐 생성자나, addAll()을 사용하는걸 권장한다. 
  - ArrayList는 중복이 가능해서 앞에서부터 찾을땐 indexOf()를 뒤에서 부터 찾을 땐 lastIndexOf()를 사용한다. 
  - 배열로 뽑아 낼 땐 toArray()를 사용한다. p/603 다시보기
  - 값을 변경하는 set() 메서드가 있는데 이거 모르면 특정 위치 삭제하고 그 위치에 add해야 한다...
  - ArrayList는 쓰레드에 안전하지 않으므로 안전하게 만들려면 다음과 같이 한다.
    - List list = Collections.synchronizedList(new ArrayList(...));
    - 이렇게 안하면 원하지 않은 데이터가 나올 수 있다. 
  - Stack
    - 웹 개발엔 잘 사용 안한다. 
    - 마지막에 들어온 데이터를 가장 처음 꺼내는 기능 구현할 때 필요하다. 
      - 이기능을 위해선 ArrayDeque 클래스를 사용할 것을 권장한다. (쓰레드에 안전하진 않음)
    - Stack은 Vector를 상속받고 있는데, 원래 취지인 LIFO를 생각하면 잘 못받은 클래스다. (하위호환위해 남아있음).

### Set
  - 순서에 상관 없이 어떤 데이터가 존재하는 지 확인 하는 용도로 사용한다. 중복 방지
  - HashSet : 순서가 필요 없는 데이터를 해시 테이블에 저장. Set중 성능이 가장 좋음
    - 데이터가 같은지 확인하는 작업이 핵심이다. equals(), hashCode()를 구현한느건 중요하다. 
    - 생성자 인자에 로드팩터가 나오는데, 로드팩터 = 데이터의 개수/저장공간 을 의미한다. 
    - 로드팩터가 클수록 공간은 넉넉햊지만, 데이터 찾는 시간은 증가한다. 
  - TreeSet : 저장된 데이터의 값에 따라 정렬되는 셋. 
  - LinkedHashSet : 연결된 목록 타입으로 구현된 해시 테이블에 데이터 저장. 저장 된 순서에 따라 값이 정렬.

### Queue
  - 사용자들의 요청을 들어온 순서대로 처리할 떄 큐를 사용한다. 

### LinkedList
  - List도 되고, Queue도 된다. 
  - 생성자로 객체의 생성크기를 지정하지 않는다.
  - push()는 앞쪽에 데이터 추가.
  - add(), offer()는 뒤쪽에 데이터 추가. 
  - set() 데이터 수정
  - 같은기능 하는 함수가 있으니 남들이 볼때 혼동안되게 한가지만 사용하자. 
  - 조회 함수는 기본이 아페껄 가져온다. getFirst()권장.
  - 삭제의 경우 여러 함수가 있는데, 혼동을 피하려면 remove 붙은 함수를 사용하자. 
  - ListIterator가 있는데, Iterator의 다음 데이터만 검색하는 단점을 보완 햇다. 

### Map
  - 키와 값이 1:1로 매칭된다. 키는 중복 안된다. 
  - keySet() : 키 목록을 Set타입으로 리턴
  - values() : 값 목록을 Collection 타입으로 리턴. 
  - entrySet() : Map 안에 Entry라는 타입의 Set을 리턴. Entry엔 단 하나의 키와 값만 저장된다. 
  - Hashtable
    - Map 인터페이스를 구현했긴 했다. 
    - Map은 컬렉션 뷰를 이요하고, Hashtable은 Enumeration 객체를 통해 데이터 처리한다. 
    - Map은 이터레이션을 처리하는 도중 데이터를 삭제하는 안전한 방법을 제공하지만 Hashtable은 그렇지 못하다.
    - HashMap은 키나 값에 null 저장 가능하지만 해시테이블은 그렇지 못하다.
    - HashMap은 여러 쓰레드에 안전하지 않고, 해시테이블은 안전하다. 
  - 해시 테이블을 제외한 Map으로 끝나는 클래스들은 여러 쓰레드 동시접근에 안전 하지 않다.
    - Map map = Collections.synchronizedMap(new HashMap(...)); 이렇게 쓰자
  - HashMap
    - 생성자는 기본으로 쓰는게 좋지만, 담을 데이터가 많다면 초기 크기를 지정해 줄것을 권장한다. 
    - 키는 기본형과 참조 자료형 모두 가능하다. 
    - 키가 되는 객체를 직접 작성할 떈 개발툴에서 제공하는 hashCode(), equals()를 생성하자. p.641 다시 보기
    - null인걸 불러오면 null을 리턴한다.(Collection 에서는 익셉션 발생 했엇음)
    - 추가 삭제 모두 put()을 사용
    - 맵에 키를 확인하려면 keySet()을 이용한다. get()을 사용하려면 키를 알아야 해서.
    - 값을 받아올떄는 values()만 쓰면 된다. 
    - 무작정 get()으로 키나 값이 있는지 확인하는 거보단, containsKey(), containsValue()를 사용하는게 좋다. 
  - TreeMap
    - 키를 정렬하려면 HashMap은 여러 과정이 필요하다. 
    - Arrays 클래스를 사용해도 되는데 불필요한 객체가 생기는 단점이 있따.
    - 정렬된 목록을 원할 떄 TreeMap 사용한다. 
  - Prperties 클래스
    - Hashtable을 확장함
    - 쓰는 이유는 load(), store() 등의 함수 때문이다. 
    - 데이터 저장과 읽기를 한줄로 할 수 있다. 

### 쓰레드
  - 자바 명령어로 클래스를 실행시키면 JVM이 시작된다. 
  - JVM이 시작되면 자바 프로세스가 시작된다. 
    - 프로세스내에 여러 쓰레드가 실행된다.
  - 프로세스마다 JVM은 기본적으로 32~64MB를 점유한다. 쓰레드는 1MB 이내에 메모리를 점유한다.
    - 단일 쓰레드로 여러 프로세스 실행보단, 다중 쓰레드가 더 빠르고, 메모리 관리에 좋다. 
  - Runnable 인테페이스, Thread 클래스
    - 쓰레드 생성은 Runnable 인터페이스 사용, Thead 클래스 사용 두가지가 있다. 
    - Thrad가 구현이 더 편해 Thread 선호. 
    > 
        RunnableSample runnable = new RunnableSample();
        new Therad(runnable).start();  // Runnable 실행방법

        ThreadSample thread = new ThreadSample();
        thread.start();  // Thread 방식 실행방법
    - 자바에선 하나의 클래스만 확장할 수 있으므로, 쓰레드 클래스가 다른 클래스 확장할 필요가 있을 땐 Runnable 인터페이스를 구현하고, 그렇지 않으면 쓰레드 클래스를 사용하는게 편하다. 
    - start()를 호출하면 run() 메서드 내용이 끝나든 말든 쓰레드를 시작한 메서드에서 그 다음 줄이 실행된다. 
    - 쓰레드는 run() 메서드가 종료되면 끝난다. 
    - 쓰레드 시작할 때 100 숫자를 넘겨주고 싶다면? --> 쓰레드를 상속받은 생성자에 매개변수로 받으면 된다. 
  - sleep() 메서드
    - 사용할 땐 항상 try-catch로 묶어준다. 적어도 InterrptedException을 catch해주자.  
  - 쓰레드 함수
    - 쓰레드우선순위는 기본 값이 5이다. 
      - 우선순위를 지정할 일이 있다면 상수로 지정하다. MAX_PRIORITY, NORMA_PRIORITY, MIN_PRIMRITY
      - 가능하면 우선순위는 지정안하는게 좋다. 
    - 데몬을 지정하려면 쓰레드 사용 이전에 해야된다. 데몬을 사용하면 쓰레드가 아직 끝나지 않았더라도, JVM이 끝날 수 있다. 
    - 데몬 쓰레드가 종료되지 않았더라도, 다른 실행중인 일반 쓰레드가 모두 중지되면 프로세스는 중지된다. 
  - synchronized
    - 어떤 클래스나 메서드가 쓰레드에 안전하려면, synchronized를 사용해야 한다. 
    - 메서드에서 인스턴스 변수를 수정하려 할 때에만 동시성 연산에 문제가 발생한다. 
    - 사용방법
      - 메서드 자체를 synchronized로 선언하는 방법
      - 메서드 특정 문장만 synchronized로 감싸는 방법 2가지가 있다. 
      - 메서드 자체를 synchronized 하면 성능상 문제가 발생할 수 있다. 
      - 인스턴스 변수를 처리하는 부분에만 synchronized 블럭을 해주면 성능 문제가 해결된다.
        - 일반적으로 별도의 객체를 선언해 사용한다. (잠금 처리 객체)
        > 
          Object lock = new Object();
          
          public void puls(int value) {
            synchronized(lock) {
              amount += value;
            }
          }

          public void minus(int value) {
            synchronized(lock) {
              amount += value;
            }
          }
        - 하나의 클래스에 인스턴스 변수가 2개 있다면, 잠금처리 객체가 하나면 문제가 되서 2개를 별도로 만들면 효율적인 프로그램이 된다. 
    - synchronized는 같은 객체를 참조할 때만 유효하다. 
    - 인스턴스 변수가 선언된 객체를 다른 쓰레드에서 공유할 일이 없다면 synchronized를 사용 안해도 된다. 
    - StringBuffer는 쓰레드에 안전해서 하나의 문자열에 객체를 여러 쓰레드에 공유하는 경우 사용한다. 
    - StringBuilder는 쓰레드에 안전하지 않아 여러 쓰레드에서 공유할 일이 없을 때 사용한다. 
    - stop() 메서드는 안전상 deprecated됬다. interrupt()로 쓰레드를 멈추자. 
    - interrpted()는 본인의 쓰레드가 중지됬는지 확인
    - isInterrupted()는 다른 쓰레드에서 확인할 때 사용.
    - notify()는 먼저 대기한 쓰레드 먼저 풀어준다. 함께 풀어줄라면 notifyAll()을 이용하는게 좋다. 
    - ThreadGroup
      - 쓰레드 그룹은 tree 구조를 가진다. 

### I/O
  - 

### Serilizable
  - 우리가 만든 클래스가 파일에 읽고 쓸수 있게 하거나, 다른 서버로 보내거나 받으려면 반드시 Serializable 인터페이스를 구현해야 한다. 
  - 이 인터페이스 구현 후 seralVersionUID라는 값을 지정하는걸 권장. 지정 안하면 컴파일때 자동 생성.
    > static final long serialVersionUID = 1L;
  - 반드시 static final long으로 선언하고 이름도 serialVersionUID로 선언해 줘야 한다. 
    - 이 변수는 서버A에서 서버B로 DTO 객체를 보낼때 해당 객체가 같은지 다른지 확인용으로 쓰인다. 
    - 클래스 이름이 같더라도 ID 값이 다르면 다른걸로 인식한다. 
    - ID가 같아도 DTO의 변수 개수나 타입이 다르면 다른 클래스로 인식한다. 
  - 객체 저장
    - ObjectOutputStream 클래스로 객체를 저장하고, ObjectInputStream 클래스로 저장한 객체를 읽는다.
  - 객체 읽기
    - Serializable 객체의 형태가 변경되면(인스턴스 변수 추가 등...) 컴파일시 serialVersionUID가 다시 생성되 읽어오지 못한다. 
    - 해결하려면 클래스에 serialVersionUID 변수를 추가해 주자. 
    - Serializable 객체가 변경되면 serialVersionUID의 값을 변경해 주는 습관을 들이자.
  - transient 예약어
    - 객체를 저장하거나 다른 JVM 으로 보낼 때, transient 예약어를 사용한 변수는 Serializable의 대상에서 제외된다. 
      - 보안상 중요한 변수에 권장한다. 

### I/O
  - I/O??
    - JVM 기준으로 Input, Output을 구분한다. 
    - java.io 패키지에 바이트 기반 데이터를 처리하기 위한 여러 스트림 클래스를 제공한다. 
    - 읽는 작업은 InputStream, 쓰는 작업은 OutputStream을 통해 작업한다.
    - 바이트가 아닌 char 기반 문자열은 Reader, Writer 크랠스로 처리한다. 
  - 자바의 File과 Files 클래스
    - File은 파일 및 경로 정보를 통제하기 위한 클래스다. 
    - File의 몇가지 불편사항이 있어 java7부터 java.nio.file 패키지의 Files라는게 나왔다. 
  - File 클래스에서 separator라는게 있는데, 파일 경로를 윈도우건 유닉스계열이건 통일하게 맞춰 준다. 
    >   String pathName = File.separator+"godofjava+File.separator+"text";
  - InputStream, OutputStream
    - I/O는 기본적으로 InputStream, OutputStream이라는 abstractt 클레스를 통해 제공한다.
    - 쓸때는 확장한 자식클래스를 활용한다. 
    - 해당 리소스(파일, 네트워크 등등...)를 다른 클래스에서도 작업할 수 있도록 java.io 패키지에 있는 클래스를 사용할때 작업 종료 후 작업중인 대상을 close()로 항상 닫아주자. 
    -  FileInput Stream : 텍스트보단 이미자와 같은 바이트 코드 읽어올때 사용.
    - OutputSteram에 Flushable을 받는데, flush()가 있다. 
  - Reader Writer
    - char 기반 문자열 처리 클래스인데, 텍스트 에디터로 쉽게 볼 수 있는 파일들을 처리하기 위한 클래스다. 
    - 모든 작업 후 close()는 꼭 해주자. 
    - Wireter에 write()와 append()는 같은 기능을 하는데, 만들어진 문자열이 String타입이면 write()를 StringBuilder, StringBuffer면 append()를 사용하자. 
    - write()나 append()로 데이터를 쓰면, 메서드 호출할 때마다 파일에 쓰기 때문에 비효율적이다.
      - BufferedWriter를 쓰도록 하자. 버퍼 공간에 데이터 보관 했다 버퍼가 차면 데이터를 저장한다. 
  - Scanner 클래스는 텍스트 기반의 기본 자료형이나 문자열 데이터를 처리하기 위한 클래스다.

### 자바 NIO(New IO)
  - 속도 때문에 JDK1.4 부터 추가 됬다. 
  - 스트림을 사용하지 않고 채널과 버퍼를 사용한다. 
  - NIO에서 데이터 주고 받으래 버퍼를 통해 처리한다. 
  - Channel은 객체만 생성하여 read(), write() 메서드를 불러주면 된다. 
  - NIO는 파일을 읽고쓰기, 복사, 네트워크로 데이터 주고 받을때도 사용한다. 

### Java7
  - 2진수 표현 0b가 추가 됨. 
  >   int binalVal = 0b1001001001;
  - '_'사용 가능(숫자에서만 가능. 10진수 8진수에서만)
  >   int million = 1_000_000;
  - switch-case 문장에 String도 사용 가능해짐. 단 문자열이 null인지 꼭 확인
  - 생성자에 있는 new와 클래스 이름 사이에 타입을 이름을 명시적으로 두려면, 다이아몬드 <>를 사용하면 안된다. 
  - @SafeVararages
    - 가변 매개 변수 사용할 때 내부적으로 Object의 배열로 처리된다.
    - 잠재적으로 문제가 발생할 수 있어 애노테이션을 붙인다. 
    - 가변 매개 변수를 사용하고, final이나 static으로 선언되있어야 이 애너테이션을 사용할 수 있다. 
  - 예외도 변경됨.
    - 여러 catch 블록에서 처리하는 방식이 동일하다면, '|'기호로 여러개 쓸 수 있다. 
    - catch(IllegalArgumentException | FileNotFoundException | NullPointException exception)...
  - try-with-resource
    - 자바7에서 AutoCloseable 인터페이스가 추가 됬다. 
    - try-with-resource를 사용하면 이 인터페이스를 사용한 클래스는 별도의 close를 안해도 된다. 
  - java.io.Closeable 인터페이스는 AutoCloseable을 새로 상속 받게 되서 이 인터페이스를 사용하는 클래스를 close 안해줘도 된다.  

### Java7에 추가 된 것
  - Fork/Join 클래스가 있는데 Fork는 여러 개로 나누는 것을 말하고, Join은 나누어 작업한 결과를 모으는 것을 말한다. 
    - Fork/Join에 Work steal 개념이 기본적으로 포함된다. (다시 보기)
  - NIO2
    - 
### Java8
  - Optional
    - 기본 객체 생성하지 않는다. empty(), of(), ofNullable()을 리턴한다. 
  - 날짜 관련 클래스
    - Date, SimpleDateFormatter는 조금 문제가 있었다. 
    - 자바 8에서 java.time 패키지를 만들었다. 
    - 국제화 시간을 위해 ZonedDateTime, LocaleDate가 추가됨. 
  - 병렬 배열 정렬
    - 배열 정렬은 Arrays 클래스를 사용하는 것이다. 
    - binarySearch() 배열 내에서의 검색
    - copyOf() 배열 복제
    - equals() : 배열 비교
    - fill() : 배열 채우기
    - hashCode() : 배열의 해시코드 제공
    - sort() : 정렬(단일 쓰레드로 수행), paralleSort(필요에 따라 여러 개의 쓰레드로 나뉘어 작업 수행)
      - 갯수가 적은 배열은 sort()를 쓰자. 
    - toString() : 배열 내용 출력
  - StringJoiner
    - 배열 구분을 콤마로 할때 배열 마지막 뒤에 콤마 처리를 쉽게 해 준다. 
    - 스프림과 람다표현식으로도 같은기능 구현할 수 있다. 
  - Lambda
    - 익명 클래스의 가독성을 좋게 한다. 
    - 인터페이스 메서드가 하나 인 것들만 적용 가능 하다. (==기능적 인터페이스)
    - 인터페이스에 메서드 하나만 하기 위해 @FuntionalInterface를 붙이면 편하다. 
  - Stream
    - 연속된 정보를 처리하는데 사용한다. 
    - 컬렉션엔 스트림 사용가능하고 배열은 스트림 사용 안된다. 
      - 배열을 컬렉션의 List로 변환해주는 방법은 있다. 
      - Arrays.asList(배열명);
      - Arrays.stream(배열명).collect(Collectors.toList()); // 스트림 객체를 리턴. 
    - 일반적인 웹프로그램에는 stream()을 사용한다. (parallelStream()있긴한데, 병렬처리라 잘 안씀. )
    - map()으로 데이터를 특정 데이터로 변환 할 수 있다. 
    - forEach()와 map()은 각각의 값을 처리하고, collect()는 모든 값을 한곳으로 모아 연산한다. 
    - filter()
      - 필요 없는 데이터나 웹 요청ㄷ르을 걸러낼 때 사용한다. 

### classpath
  - 여러개의 jar 파일을 한꺼번에 사용하는 방법은, -classpath 옵션을 컴파일할 때나 실행할 때 다음과 같이 추가
  >   
      java -cp c:\godogjava Calculator
  - 클래스 패스에 디렉터리만 지정해 주면 해당 디렉터리가 프로그램을 실행하는 기본 위치가 된다. 

### ThreadLocal
  - 쓰레드 별로 서로 다른 값을 처리해야 할 필요가 있을 때 ThreadLocal을 사용한다. 
  - ThreadLocal 메서드는 initalValue(), set(), get(), remove()가 있다. 
  - ThreadLocal 클래스의 변수는 private static final로 선언한다. 
  - 사용이 끝난 후 remove()하는 습관을 들이자. 웹 기반에서 쓰레드 풀을 사용하는데, 끝나질 않아서...

### 정리
1. String 클래스와 StringBuilder, StringBuffer클래스의 차이.
  - String은 불변, 나머지 둘은 변할 수 있다. 
  - String은 문자열을 조작하는 경우 유용하고, 문자열, 숫자, char등을 concat할 땐 StringBuffer,StringBuilder사용.
  - JDK 5부터 반복문이 아닌 곳에서 String의 +연산은 내부적으로 StringBuilder로 변환되어 처리 된다. 
  - 복잡하지 않다면 String의 +로 처리해도 된다. 
  - StringBuffer와 StringBuilder의 차이는 StringBuffer가 동기화를 지원한다. 
  - 멀티쓰레드 환경에선 StringBuffer를 사용해 동기화를 보장 받는다. 

2. String 클래스의 indexOf(), substring(), splie(), getBytes() 사용용도. 
  - indexOf() : 지정한 문자가 문자열에 몇번재 위치해 있는지 확인
    >   int indexOf = str.indexOf("d");  // d의 위치를 반환.
  - substring() : 문자열에 지정한 범위의 문자열 반환 (끝나는 범위는 포함하지 않음.)
    >   String substr = str.substring(0,2);
  - split() : 지정한 문자로 문자열을 배열로 반환. 
    > String[] res = str.split(":"); // :로 문자열을 나눔.
  - getBytes() : 문자열의 바이트 배열을 돌려줌. 

3. System 클래스의 주요 용도
  - 주요 기능은 시스템에 대한 정보를 확인하는 것이다. 
  - err, in, out 3가지 변수가 있다. 

4. System 클래스에서 절대 개발자가 절대 사용하면 안되는 메서드
  - GC 수행 메서드
  - JVM  종료 메서드

5. 제네릭사용 이유
  - Object의 타입 변환을 하지 않아도 된다. 
  - 잘못된 형변환으로 인한 컴파일 에러를 줄일수 있다. 

6. Set의 용도와 주요 클래스 
  - 순서에 신경 쓰지 않을 때 Set을 사용. 
  - 데이터 유무만 중요함. 
  - HashSet : 순서 없는 데이터를 hash table에 저장. 성능 굳
  - TreeSet : 저장된 데이터의 값에 따라 저장. 
  - LinkedHashSet : 저장 순서에 따라 값이 정렬. 가장 느림.

7. Set에서 데이터를 꺼내오는 방법
  - iterator를 사용한다. 
  - for each문으로도 가능