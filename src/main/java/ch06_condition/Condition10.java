package ch06_condition;

import java.util.Scanner;

/*
 삼항 연산자
 정의 : 조건식을 평가하여 true / false에 따라 두 가지 표현식 중 하나를 선택적으로 실행

 형식 :
 조건식 ? 표현식1 : 표현식2;

 조건식 : true / false로 평가 가능한 식
 표현식1 : 조건식이 true일 떄 실행되는 식
 표현식2 : 조건식이 false일 때 실행되는 식
 */
public class Condition10 {
    public static void main(String[] args) {
//

        // 이상의 삼항연산자 개념을 윤년에 응용하도록 하겠습니다.
        Scanner scanner=new Scanner(System.in);
        System.out.print("연도를 입력하세요 >>>");
        int year= scanner.nextInt();

//        // boolean 자료형의 변수명은 is로 시작하는 일이 많습니다.
//        boolean b1 = year % 400 == 0;
//        boolean isLeapYear = ((year % 4 == 0 && year % 100; ;! = 0;) || );

//                String result = isLeapYear ? "유년입니다" : "윤년이 아닙니다";
//        System.out.println(year+"년은"+result);
//
//
//        // 이제 그러면 음수 연도를 걸러내기 위해서는 어떻게 할 수 있냐면
////        String result2="";
////         if (year < 0){
////             result2 = "불가능한 연도 입력입니다";
////         }else {       // 그러면 애는 0 이상
//
//         }
////        System.out.println(year+"년은"+result2);
////
////        // 중첩 삼항 연산자
////        String  = "윤년이 아닙니다.";
////        String result3 = year <= 0 ? "불가능한 연도 입력입니다."
////                : ((year % 4 ==0 && year % 100 ! = 0 ) || (year % 400 == 0))
////        ? "윤년입니다."
////        : "윤년이 아닙니다.";
    }
}
