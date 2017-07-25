# 예외(Exception)

## 1. 예외(Exception) 처리

- 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류를 **'예외(Exception)'**라고 함
- **예외가 발생하면 프로그램은 곧바로 종료된다는 점에서 에러와 동일**
- 하지만 예외처리를 통해 프로그램이 종료되지 않고, 정상 작동할 수 있도록 할 수 있음


> ##### 오류(Error)
> - 컴퓨터 하드웨어의 오동작 또는 고장으로 인해 응용 프로그램 실행 오류가 발생하는 것을 자바에서는 '에러(Error)'라고 함
>
> - ##### 에러는 JVM 실행에 문제가 발생했다는 것으로 JVM 위에서 실행되는 프로그램을 아무리 견고하게 만들어도 결국 실행 불능이 됨

### 1.1 일반 예외와 실행 예외
- 일반 예외와 실행 예외는 모두 예외 처리를 해줘야 프로그램 실행 시 적상 작동함
- 자바는 예외를 클래스로 관리함
- 따라서 예외 발생 시, 해당 예외 클래스를 생성함 (java.lang.Exception 클래스를 상속받음)

##### 1. 일반 예외 (Exception)
- 컴파일러 체크 예외라고도 불리움
- 자바 소스를 컴파일하는 과정에서 예외 처리 코드가 필요한지 검사하기 때문임
- 만약 예외 처리 코드가 없다면 컴파일 오류가 발생함

##### 2. 실행 예외 (Runtime exception)
- 실행 예외는 컴파일 하는 과정에서 예외 처리 코드를 검사하지 않는 예외를 말함
- 따라서 개발자의 경험으로 예외 처리를 하는 경우가 많음
- 예외 처리 하지 않으면 프로그램 종료됨

###### 실행 예외 종류 (암기할 필요는 없지만 종류들을 알아놓을 필요는 있음)
###### 1. NullPointerException
- 객체 참조가 없는 상태, 즉 null 값을 갖는 참조 변수로 객체 접근 연산자인 도트(.)를 사용했을 때 발생함
- 객체가 없는 상태에서 객체를 참조하려고 하니 예외 발생할 수 밖에 없는 상황

###### 2. ArrayIndexOutOfBoundsException
- 배열에서 인덱스 범위를 초과하여 사용할 경우 실행 예외인 java.lang.ArrayIndexOutOfBoundsEception이 발생
> ##### 처리방법
> 배열값을 읽기 전에 배열의 길이를 먼저 조사한다. 실행 매개값이 없거나 부족할 경우 조건문을 이용해서 사용자에게 실행방법을 알려준다.

###### 3. NumberFormatException
- 문자열의 데이터를 숫자로 변환할 때, 숫자로 변환될 수 없는 문자가 포함되어 있다면 java.lang.NumberFormatException을 발생시킴

###### 4. ClassCastException
- 타입 변환(Casting)은 상위 클래스와 하위 클래스 간에 발생하고 구현 클래스와 인터파에스 간에도 발생

> ##### 클래스 간 type casting 가능 여부 판단
> - instanceof 연산자로 확인하기
> - instanceof 연산의 결과가 true이면 좌항 객체를 우항 타입으로 변환이 가능하다는 뜻

### 1.2 예외 처리 코드
- 프로그램에서 예외가 발생했을 경우 프로그램의 갑작스러운 종료를 막고, 정상 실행을 유지할 수 있도록 처리하는 코드를 예외처리 코드라고 함.

##### **Try - catch - finally**

- 예외 처리 시, 사용하는  문법으로 예외가 어디서 발생하는지까지 내부 메서드를 통해 확인할 수 있음
- 예외 처리를 하는 가장 큰 이유는 예외 발생 시, **'프로그램을 정상적으로 끝마칠 수 있다는 것'**에 방점을 찍을 수 있음
  - 예외가 발생하더라도 해당 작업에 대한 결과값을 반영해야하는데, 그렇지 못할 경우 프로그램이 정상적으로 작동하지 않을 경우가 많음
  - 따라서 예외처리를 통해 **프로그램을 (표면상으로)정상적으로 끝까지 작동할 수 있도록** 해야함

```
public clasee Exception {
  public static void main(String[] args) {
        
    try {
      
      // 내부 로직 실행
      
    } catch(예외 타입 예외 식별자) {
      // ex) ArrayIndexOutOfBoundsException e
      // 예외 처리 시 실행하고자 하는 작업
      // 해당 명렁을 통해 어디서 예외가 발생했는지 추척 가능
      e.printStackTrace();
      
    } catch(예외 타입 예외 식별자) {
    
      // 작업하고자 하는 내용
      e.printStackTrace();
      
    } finally {
    
      // 위의 예외처리를 하는 작업을 뚫고, 작업하고자 하는 내용
      
    }  
  }
}
```

- Try - Catch 구문의 작동 과정은 아래와 같음



![try-catch 작동 과정](https://i.stack.imgur.com/Piz9D.png)





# 객체 지향 프로그래밍(Object Oriented Programming)

### 1. 객체란?

- 객체는 물리적으로 존재하거나 추상적으로 생각할 수 있는 것 중에서 자신의 속성을 가지고 있고 다른 것과 식별 가능한 것을 뜻함
  - 자동차, 비행기, 책 등 주변 모든 것이 객체가 될 수 있음
- 객체는 속성과 동작으로 구성되어 있음

![객체를 '자동차'라고 했을 때.](http://pds21.egloos.com/pds/201211/04/39/f0183439_5095e5617055b.png)

- 객체는 다른 객체와 관계를 맺고 있음

### 2. 객체지향 프로그래밍의 특징

#### 2.1 다형성

- 다형성은 같은 타입이지만 실행 결과가 다양한 객체를 이용할 수 있는 성질을 뜻함
- 자바는 다형성을 위해 '부모 클래스' 또는 '인터페이스의 타입 변환'을 허용함

#### 2.2 상속 (Inheritance)

- 객체 지향 프로그래밍에서도 부모 역할의 상위 객체와 자식 역할의 하위 객체가 있음

- 상속은 부모 객체를 재사용해서 자식 객체를 쉽고 빠르게 설계할 수 있도록 도와주고, 이미 잘 개발된 객체를 재사용해서 새로운 객체를 만들기 때문에 반복된 코드의 중복을 줄여줌

- 데이터 관점에서는 부모 객체보다 자식 객체가 더 많은 데이터를 갖게 됨

  > "자식이기는 부모 없다지 않는가"
  >
  > : 같은 식별자를 갖고 있는 속성과 메서드라 할지라도 우선 순위가 높은 것은 자식 객체 >>>> 부모 객체임.

- 아래 그림을 보면 조금 더 이해가 쉬움

![쉽게 이해하는 상속](http://cfile27.uf.tistory.com/image/137FA83C4EB28F2C2DF176)

![](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSzVt_PzxA8ef5Vog8J19Uh6_BZevUy6keSOf_96YayvYB_dCB-)

```java
	// Son 클래스가 Father 클래스를 상속 받아, 부모 클래스와 자식 클래스 관계 성립
	// Son은 Father 클래스의 필드와 메서드 상속 받아옴
public class Son extends Father {
	
	public String name = "자식이름";
}
```



```java
public class PolyMain {

	public static void main(String[] args) {
	
      	// 인스턴스 생성 시, 자식 객체(son)은 부모 객체(Father)를 참조하여 인스턴스화시킬 수 있음
      	// 메모리 스택 영역에 Father의 필드값 올라감.
    	Father son = new Son();
      
        // son.(속성 혹은 메서드 호출) 할 때, 부모 객체에서 만든 메서드 혹은 속성 값만 호출할 수 있음

    }
}
```

- 위와 같이 의도적으로 자식 클래스를 인스턴스화 할 때, 메서드 혹은 속성의 선택 범위를 좁혀 코딩을 좀 더 유연하고 쉽게할 수 있게 해줌

|                  super.                  |                  this.                   |
| :--------------------------------------: | :--------------------------------------: |
| 부모 객체의 리소스를 사용함. 첫 번째 나오는 클래스 블록의 자원을 활용 | 자기(해당 객체) 자신을 가리킴.내 전역변수 (local 변수)를 지칭할 때 사용하기도 함. |
|               상속 시에만 사용 가능               |              상속하지 않아도 사용 가능              |

#### 2.3. 인터페이스 (Interface)

- 인터페이스는 '메서드 모음'으로서 객체의 사용 방법을 정의한 타입

- **인터페이스는 '다형성'을 높혀주기 때문에 자바 프로그래밍에 있어 매우 중요한 역할을 함**

- 작업하고 있는 클래스에서 어떤 인터페이스를 상속받을 경우 의무적(절대적)으로 해당 메서들을 구현해야만 함

- 인터페이스 클래스에서는 식별자 정의는 불가능하며 메서드만 정의할 수 있음

  - 식별자 정의가 필요한 경우, 인터페이스 작성이 아닌 클래스에 코드를 작성하는 게 더 효율적인 방법임
  - 메서드 구현은 불가, 인터페이스를 상속 받은 클래스에서 정의된 메소드 구현 로직을 코드로 작성

- 상속보다 더 자주 사용되는 클래스로서 추상 클래스(abstract class)와 기능이 유사함



  ```java
  public interface Cook extends interfaceA, interfaceB {
    
    public void boil();
    // 인터페이스는 abstract가 생략됨
    public abstract void grill();
  }
  ```

```java
package com.junhee.java.obj;

// 'Cook'이라는 인터페이스를 상속함.
// 상속의 경우, 커플링(결속력)이 강해 문제가 생길 여지가 생김. 
					// Cook 인터페이스를 상속함
public class Father implements Cook {

	public String lastname;
	public String name;

	public int age;
	public int money;
	public String house;
	public String car;
	public String wife;

	public void process9() {
		// 9줄의 코드
	}

	public void goDestination() {
		process9();
		System.out.println("회사를 출근합니다.");
	}

	// 인터페이스
	@Override
	public void boil() {
		// TODO Auto-generated method stub

	}

	@Override
	public void grill() {
		// TODO Auto-generated method stub

	}

	@Override
	public void fry() {
		// TODO Auto-generated method stub

	}

	@Override
	public void oven() {
		// TODO Auto-generated method stub

	}

	@Override
	public void stea() {
		// TODO Auto-generated method stub

	}

	// 상속 시키고 싶지 않다면 private 을 걸어주면 됨.
	// 접근 제한자를 private으로 걸어줄 경우, 코드블럭{} 안에서만 호출할 수 있음.
}

```



#### 2.4 추상 클래스 (Abstract Class)

- 일반 클래스인데, 추상화된 메서드들(아직 메서드 블럭 내에 코드를 작성하지 않은 상태의)의 집합(모음)

1. **인터페이스와 동일한데**

2. **인터페이스 + 클래스(코드)**

   - 코드뿐만 아니라 메서드 안(코드블럭 내부)에 메서드(기능)을 작성할 수 있음
   - 메서드(의 로직)를 추상화시킬 수 있을 때, 주로 사용하는 것이 '추상 클래스'
     - 코드가 알고리즘화 할 수 있을 때, 인터페이스보다 '추상 클래스'로 코드를 작성하는 것이 훨씬 효율적일 때가 있음


   ```java
   public abstract class Fix {

   	public void totalProcess() {
   		
   		disassemble();
         // 어떤 stuff든 3번씩 부품 교체함 
         // 메서드 코드 블럭 안, 로직 추상화 가능하여 추상 클래스에 작성
         // 아래 코드 같은 경우엔 for문으로 메서드 로직 구성함
   		for(int i = 0; i < 2; i++) {
   			replacePart();
   		} 
   		
   		clean();
   		assemble();
   	}

   	public abstract void disassemble();

   	public abstract void replacePart();

   	public abstract void clean();

   	public abstract void assemble();
   }
   ```

   ​

- 객체를 직접 생성할 수 있는 클래스를 실체 클래스라고 한다면 **이 클래스들의 공통적인 특성을 추출해서 선언한 클래스를 '추상 클래스'**라고 함
- 추상 클래스와 실체 클래스는 상속 관계에 있음
  - 추상 클래스가 부모 클래스며, 실체 클래스는 추상 클래스의 모든 특성을 상속받고, 추가적인 필드와 메서드를 가질 수 있음