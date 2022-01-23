# JAVA를 처음부터 다시 복습하는 프로젝트    

> 프로그래밍은 컴퓨터가 일을 수행할 수 있도록 프로그래밍 언어로 명렁어 집합(프로그램)을 만드는 일  
>> 컴파일은 프로그래밍 언어를 컴퓨터가 실행 가능한 기계어로 만드는 일  
컴파일러는 기계어로 바꾸어주는 프로그램이다.  
>>> C와 C++은 포인터로 메모리를 직접 핸들링을 해서 시스템이 다운될 확률이 높아, 더 안정적인 언어가 없을까 해서 제임스 고슬링이 만든 언어가 JAVA이다.  
-----------------------------------------------  
- 자바의 특징  
    - 플랫폼에 영향을 받지 않으므로 다양한 환경에서 사용가능하다.  
    - 객체지향 언어이기 때문에 유지보수가 쉽고 확장성이 좋다  
    - 프로그램이 안정적이다  
    - 풍부한 기능이 제공되는 오픈 소스이다.  
-----------------------------------------------  

- 객체지향 프로그래밍(OOP)이란?  
    - 프로그램의 구현을 시간의 흐름순이 아닌  
    - 객체간의 관계와 협력을 기반으로 프로그래밍 하는것이다.    

----------------------------------------------
- ## 컴퓨터에서 자료 표현하기    

    - 컴퓨터는 0과 1로만 데이터를 저장한다.  
    - 1bit 는 컴퓨터가 표현하는 데이터의 최소 단위로 2진수 하나의 값을 저장할 수 있는 메모리의 크기이다.  
    - 1byte는 8bit 다.    

    - 16진수 : 2 3 4 A  
    - 10진수 : 2 3 4 10  
    - 8진수 : 2 3 4 12  
    - 2진수 : 10 11 100 1010  

    - 8bit(1byte)로 5를 표현하면  
    0 0 0 0 0 1 0 1  
    ↑  
    맨 첫번째 비트는 부호비트(MSB)이다.    

    - 비트로 나타낼 수 있는 수의 개수는  
    2 ^ ?개의 비트  
    - 비트로 나타낼 수 있는 수의 범위는  
    2 ^ ?개의 비트 - 1    

    - 앞에 0B를 붙히면 이건 2진수로 표현하겠다는 뜻 이다.  
    - 앞에 0 을 붙히면 이건 8진수로 표현하겠다는 뜻 이다.  
    - 앞에 0X를 붙히면 이건 16진수로 표현하겠다는 뜻 이다.    
------------------------------------------------------
- ## 변수 선언 및 네이밍(컨벤션)규칙   

    - package 이름은 숫자가 들어가도 좋지만  
    소문자로 작성하는것이 좋다.  
    - class 이름은 대문자로 시작하는게 좋다.      

    - 변수는 변하는 수이다.  
    - 변수 선언은 자료형과 변수 명으로 선언함.  
    - 선언과 동시에 초기화를 할 수 있다.  
    - 변수 처음 시작글자는 소문자로 하는게 좋다.  
    - 변수 이름은 영문자(대/소문자) 나 숫자를 사용할 수 있고, 특수문자는 $와_만 사용가능.  
    - 변수의 이름은 숫자로 시작 불가능.  
    - 자바에서 이미 사용하고 있는 예약어는 사용할 수 없다.(while, break등)  
    - 변수 이름은 프로그램 내에서 사용되는 것 이므로 그 용도에 맞고 가독성이 좋게 만드는 것이 중요하다.      
-----------------------------------------------
- ## 리터럴    

    - 프로그램에서 사용되는 숫자, 문자, 논리값을 뜻한다.  
    - 리터럴은 상수 풀에 있음.  
    - 정수 리터럴은 int로 실수 리터럴은 double로 저장됨.  
    - 정수의 범위가 넘어가는 경우에는 L,l을,  
    float로 사용하려는 경우는 F,f 식별자를 써줘야한다.    

- ### 자료형    

    - byte : 1byte 단위의 자료형 동영상, 음악파일, 실행 파일의 자료를 처리할 때 사용  
    - short : 2byte의 단위의 자료형 C/C++ 언어와 호환 시 사용  
    - int : 4byte 단위의 자료형    
    - long : 8byte 자료형  

    - ↑ 자바에서 사용되는 가장 기본 자료 형  
    - 프로그램에서 사용되는 모든 숫자(리터럴)은 int로 저장됨  
    - 32 비트를 초과하는 숫자는 long 자료형으로 처리  
    - 숫자 뒤에 알파벳 L 또는 l을 써서 long형임을 표시한다.    
- ### 정수형    

    - byte는 -128 ~ 127 까지 표현이 가능하다  
    byte bnum = -128;  
    4byte로 표현할 수 있는 범위를 넘어서 오류가 난다.  
    int num = 12345678900;  
    - long형을 표현할때는 숫자 뒤에 L을 표현.  
    크기가 작은 숫자라도 뒤에 L을 붙히면 자동으로 long 형으로 변환.  
    long lNum = 12345678900L;    

- ### 실수형    

    - 실수를 표현할때는 부동소수점으로 표현을 한다.  
    float형은 4byte  
    double형은 8byte    

    - 실수는 기본적으로 double(8byte) 에 저장된다.  
    double dnum = 3.14;  
    - float 타입 변수에 소수를 집어넣을때는 끝에 f를 적어준다  
    float fnum = 3.14f;    

    - 지수와 가수로 나타내는 부동 소수점 방식에는 지수부가 0을 표현할 수 없기 때문에 약간의 오차가 발생할 수 있다.    

- ### 문자형    

    - 문자도 정수로 표현이 가능하다.  
    - ASCII(아스키코드)는 8bit이고  
    'A' 가 인코딩 되면 65  
    65를 디코딩 하면 'A'  
    - 문자 세트 : 각 문자를 얼마로 표현할 것인지 코드 값을 모아둔 것을 문자세트라고 한다.  
    - 각 나라의 언어를 하나의 코드표로 표준화 한것이 UNICODE(UTF-8, UTF-16)  
    - 1byte를 쓰는 경우에는 ASCII(아스키코드)와 완벽하게 호환이 가능하다.    

    - 문자를 위한 데이터 타입은 char이다.  
    char ch = 'A';  
    'A' 는 문자를 나타내고  
    "A" 는 문자열을 나타낸다.  
    유니코드를 선언할려면 \u를 앞에 쓰면된다.    

- ### 논리형    

    - boolean  
    - true(참), false(거짓) 두 가지만 나타남  
    - 1byte를 사용한다.  
    - 값이 존재하는지, 배열이 비었는지, 결과가 참인 거짓인지 등을 표현  
  
- ### 상수 

    - 상수는 변하지 않는 수다.  
    원주율 3.14, 1년 12개월 등  
    - final 예약어를 사용하여 선언한다.    

- ### 형 변환    

    - 서로 다른 자료형 간에 연상등의 수행을 위해 하나의 자료형으로 통일하는 것  
    - 묵시적 형 변환,(자동 형 변환)과 명시적 형 변환(강제 형 변환)이 있다.  
    - 바이트 크기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 진다.  
    - 덜 정밀한 자료형에서 더 정밀한 자료형으로읜 형 변환은 자동으로 이루어 진다.  

- ### 연산자    

    - 항(operand) : 연산에 사용되는 값  
    - 연산자(operator) : 항을 이용하여 연산하는 기호  

    - 대입 연산자 (assignment operator)  
        - 변수에 다른 변수나 값을 대입하는 연산자  
        - 이항 연산자 중 우선 순위가 가장 낮은 연산자들  
        왼쪽 변수 = 오른쪽 변수(또는 식, 값)    

    - 부호 연산자  
        - 단항 연산자이다.  
        - 변수의 부호를 유지하거나(+) 바꾼다(-)  
        - 실제 변수의 부호가 변하려면 대입 연산자를 이용해야 한다.  
        예) int num = 10;  
        syso(-num);  
        - 이때 num값은 바뀌지 않고 부호만 바뀌는 것 이다.    

    - 삼항연산자  
        - 조건식의 결과가 true(참) 인 경우와 false(거짓)인 경우에 따라 다른 결과가 수행됨.    

        - 조건식 ? 결과1 : 결과2  
        조건식이 참이면 결과1, 거짓이면 결과2가 선택    

    - switch case문    
        - switch case문에서 반환할때는 yield라는 것을 쓴다  (JDK 14 버전부터 사용가능!)
---------------------------------------------------------
- ## for문    

    - for문은  
    초기화식 -> 조건식 -> 수행문 -> 증감식 -> 조건식순으로 무한 반복하고  
    조건식에 만족하면 for문이 종료가 된다.    

    - for문은 초기화식이 생략이 가능하다. (이미 이전의 값이 초기화 되있을때)  
    - for문은 조건식이 생략이 가능하다. (for문안에 반복 수행에 대한 조건이 있을경우)  
    - for문은 증감식이 생략이 가능하다. (for문 안에 증감에 대한 식이 있을 경우)  