package ch08_methods;

import java.util.Scanner;

/*
    bmi 계산기 method을 정의하고 실행시킬겁니다.
    메서드명 : calculateBmi()
    return type : void
    매개변수 유뮤 : 없음
 */
public class Method04 {

    public static void  calculateBmi(){
        Scanner scanner = new Scanner(System.in);
String grade=" ";
        double height = 0;
        double weight = 0;
        double bmi = 0;
        System.out.print("키를 입력");
        height = scanner.nextDouble()/100;

        System.out.print("몸무게 입력");
        weight = scanner.nextDouble();
        bmi=weight/(height);
        if(bmi < 18.5){
            grade="저체중";
        }else if(bmi < 23){
            grade="정상제중";
        } else if (bmi < 25) {
            grade="과체중";
        }else{
            grade="비만";
        }
        System.out.println("당신의 BMI 지수는"+bmi+"이고"+grade+"입니다");
    }

    public static void main(String[] args) {
//        calculateBmi;
        /*
            실행 예
            키 (cm)를 입력하세요 >>> 172.5
            몸무게(kg)를 입력하세요 >>> 68.7
            당신의 BMI 지수는 23.08이고, 과체중입니다.
         */
//        Scanner scanner = new Scanner(System.in);
//        double cm = 0.0;
//        double kg = 0.0;
//        double BMI;
//        System.out.print("나의 키:");
//            cm= scanner.nextDouble();
//        System.out.print("나의 몸무게");
//        kg = scanner.nextDouble();
//
//       BMI=kg*kg/cm;
//
//        System.out.println(BMI);

    }
}
