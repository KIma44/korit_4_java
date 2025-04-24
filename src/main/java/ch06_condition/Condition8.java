package ch06_condition;

import java.util.Scanner;

/*
    과제 :
    윤년 계산기 작성
    윤년(leap year)은 특정 조건을 만족하는 년을 의미합니다.

    윤녀을 판단하는 규칙은
    1. 연도가 4로 나뉘어 떨어지는 해는 윤년에 해당할 '수도 있음'
    2. 그러나 100으로 나누어 떨어지는 해는 윤년이 아님
    3. 근데 100으로 나누어 떨이지긴 하는데 400으로도 나누어 떨어지면 윤년에 해당함.

    예를 들어,
    2020년은 4로 나누어 떨어지므로 윤년입니다(100으로 나누어떨어지지 않습니다)'
    1900년은 100으로 나누어 떨어지기 때문에 윤년이 아닙니다(400으로 나누어 떨어지지 않습니다)
     2000년은 100으로 나누어 떨어지지만 400으로도 나누어 떨어지기 때문에 윤년에 해당합니다.
     */
public class Condition8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=0;
        System.out.print("연돌를 입력하세요 >>>");
        year=scanner.nextInt();
        //입력 받은 year가 윤년에 해당하는지 판단하는 조건문을 작성하시오.
        if( year % 400 == 0 ) {

            if (!(year % 100 == 0)) {


                if (year % 4 == 0) {

                }
            }
            System.out.println("윤련");

        }else {
           System.out.println("윤련 아님");
       }


//        if(year % 400 == 0) {
//            System.out.println("윤련");
//        }else if (year % 100 == 0) {
//            System.out.println("윤련 아님");
//        } else if (year % 4 == 0) {
//            System.out.println("윤련");
//        } else {
//            System.out.println("윤련 아님");
//        }
        // sout이 또 반복되는 것 같아서 줄일 수도 있겠죠
        // 음수값이 면 어떻게 처리할지
        // 더 극단적으로 줄일 방법은 없을지(논리 연산자 사용 / 삼항 연산자 사용)


        // 반복을 줄이기 위한 leapYear 변수를 선어
//        String leapYear = "";
//
//        if(year % 400 == 0) {
//            leapYear="윤년";
//        }else if (year % 100 == 0) {
//            leapYear="윤년 아님";
//        } else if (year % 4 == 0) {
//            leapYear="윤년";
//        } else {
//            leapYear="윤년 아님";
//        }
//
//        System.out.println(year+"년은"+leapYear);


    }
}
