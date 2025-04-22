package ch02_variable;
/*
    주석(comment) : Java 프로그램의 경우 풀더 및 파일의 전체 코드를 컴파일령하는데,
    거기서 오류가 하나라도 발생하면 전체 프로그램이 실행 x
    하지만 주석 처리를 한 부분에 대해서는 컴퓨터가 콛로 인지하지 않기 때문에
    오료가 발생하지 않습니다.

    즉, 주석이란 컴퓨터가 읽어서 처리하는 부분이 아니라 사람이 읽어서 정보를 얻을 수 있는
    데에 의의가 있습니다.
    1) 한 줄 주석 : //
    2)다중 주석 : / + shift 8+enter
    3)사후 주석: 주석 처리할 부분의 코드 라인에 ctrl+/(Mac : command +/)
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("안녕하세요, 제 이름은 김민효입니다");
//        System.out.println(aojcllaj); 오류 발생
        System.out.println(1);      //1
        System.out.println("1");        //1
        System.out.println(1+2);        //3
        System.out.println("1+3");      //1+3
        System.out.println("1"+"2");        //12
        System.out.println("1"+2);        //12

        // 이상과 같은 방식의 코드 대입을 하드 코딩이라는 표현을 씁니다.
        //명령문에 데이터(변수에 대입되지 않은 데이터를 리터럴(literal))를 바로 집어넣는 것
        //데이터를 변수에 대입하고, 변수를 통해서 명령을 내리는 것이 권장됨.
    /*
    변수(variable) : 데이터를 담는 바구니 -> 이름표를 달아줘야 함.
    변수 선언 방법:
    자료형 변수명 = 데이터;
     */
        int scoreEnglish=100;
        System.out.println(scoreEnglish);
    String introduction="안녕하세요. 저는 Java를 가르치게 된 안근순입니다.";
        System.out.println(introduction+"앞으로 잘 부탁드리겠습니다");

        //변수의 의미에 주목해보면 데이터 값이 바뀔 수 잇음을 뜻합니다.
        scoreEnglish=90;
        System.out.println(scoreEnglish);
        /*
        1.논리 자료형(boolean) 변수: 참/거짓 (true/false)
        자료형 변수명   = 대아터;        변수의 선언 및 초기화
         */
        boolean checkFlag1=false;
//변수에 데이터 재대입
        checkFlag1=true;

        boolean chekFlag2;      //변수의 선언
        chekFlag2=true;         // 변수의 초기화
        chekFlag2=false;         //변수의 재대입

        /*
        2. 문자 자료형 변수 char
         */
        char name1='김';
        char name2='민';
        char name3='효';
        /*
        char -> 문자 / String -> 문자열
         */
        System.out.println(name1+name2+name3);  //144732
        System.out.println(""+name1+name2+name3);  //김민효
    /*
        이상의 코드에서 알 수 있는 점은 컴퓨터는 생각보다 멍청ㅎ래서 개발자잉ㄴ 저희가
        하나하나 지정을 해줘야 한다는 점입니다. 문자와 문자열은 서로 다른 개념인데,
        문자(하나짜리)를 세 번 더했을 경우에 더이상 문자가 아니라 문자열로 인식되기 때문에
        원하는 방식으로 출력되지 않습니다(60번 라인).

        그렇기 때문에 저희는 61번 라인에서 sount()의 () 안에 " 를 넣어줌으로써,
        ()내부가 전체적으로 문자"열"로 인식되도록 꼼수를 부렸다고 할 수 있습니다.

        여기서 알 수 있는 점은 sout()에서 가장 먼저 나온 데이터의 자료형을
        따라간다는 점입니다.
     */
        System.out.println("123"+1);
        System.out.println(123+"1");
        //3. 정수 자료형 변수 (int)
        int width1=100;
        int width2=200;
        System.out.println(width1+width2);          //300숫자끼리는 연산이 가능
        System.out.println(width1+width2);          //300
        String width3="100";
        String width4="100";
        System.out.println(width3+width4);  //300400문자열끼리는 연산이 아니라 나"열"
        System.out.println(width4+width3);  //400300
        //4. 실수 자료형 변수 double
        double pi=3.14;
        //int pi1=3.1;
        //+ - *
        //pi 변수를 이용하여 원의 반지륾이 43인
        //원의 둘레 및 넓이를 구하시오 ->
        /*
        원의 둘레 공식 : 지름 x pi
        원의 넓이 공식 : 반지름 제곱 x pi
         */
        float pi1=3.14f;
        int j=10;
        //원 둘레
        System.out.println("원의 둘레:"+j*2*pi);
        //원 넓이
        System.out.println("원의 넓이:"+j*j*pi);
        /*
        Java에서의 변수 표기 방식:
     1.카멜 표기법(Camel case)를 사용
        :첫 문자는 소문자로 시작 / 복수의 단어로 이루어졌을 경우
        두 번째 단어의 첫 번째 문자만 대문자
        ex)한 단어 짜리 : result
        es) 복수 단어 : myTestResult
     2.특수 문자 지양

        cf)파이썬 학습하신 분들은 파이썬의 변수 표기 방식은  snake case라고해서
        my_test_result와 같은 방식으로 장석합니다.
         */
       //5.문자열 자료형 변수 String
        //주의해야할 점 : 애는 대문자인데 나중에 머리 아픈 일들이 생기게 된비다.
        String name="김민효";
        String major="재학생";
        String currentJob="훈련생";
        String previousJob="군인";
        //이상과 같이 변수에 대입하고 그 변수를 그대로 출력하는 방법이 가능합니다.
        //허자먼 아까 봤던 것처럼

        System.out.println("안녕하세요 제 이름은:"+name+" "+"입니다.제 전공은:"+major+
                "이고, 그래서 예전 직업은: "+previousJob+" "+"이었습니다.현재는: "+currentJob+"을 가지고 있습니다");
        //와 같은 식으로 literal과 연결 지어서 사용할 수도 있습니다.

        //연습
        //변수를 선언
        /*
        String name4;
        String major4;
        String mbti;
        int age4;*/
        //제가 위에 선언한 변수들에 여러분들에게 적합한 데이터로 '초기화'하여
        //저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 누구누구입니다. ??살입니다.
        //제 전공은 어쩌고저쩌고학과이며, mbti는 블라블라입니다. 열심히 할게요!!!
        //와 같이 출력되도록 sout을 작성하시오.

        String name4="김민효";
        String major4="컴퓨터학과";
        String mbti="잘 몰르겠습니다";
        int age=22;
        System.out.println();
        System.out.println("저는 코리아 it 아카데미 4월 국비 과정을 수강하고 있는 "+name4+"입니다."+"\n"+age+"살입니다."+"\n"+
        "제 전공은"+major4+"이며,mbti는"+mbti+"열심히 할게요!!!"
        );



    }
}
