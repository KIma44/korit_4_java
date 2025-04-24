package ch04_scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        /*
        .next() : String 데이터를 받을 때 띄어쓰기를 인정하지 않음
        .nextLine() : String 데이터를 받을 때 띄어쓰기 인정하고 enter 키 기준으로 데이터가 입력됨

        실행 예
        이름을 입력하세요>>>여러분이름
        나이를 입력하세요>>>여러분나이
        주소를 입력하세요>>>여러분주소(시 / 구 또는 도 / 기까지)

        안녕하세요, 제 이름은 여러분이름입니다.  여러분주소에 살고 있습니다.
        10년 후 나이는 여러분+10살입니다.
         */

        /*
        Scabber클래스 import
       변수 선언 및 입력
       프롬프트 입력
         */
        int age10=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("제 이름:");
        String name=scanner.nextLine();

        System.out.println("나의 주소:");
        String address=scanner.nextLine();

        System.out.println("10년후 나이:");
        age10=scanner.nextInt();
age10=age10+10;
        System.out.println("안녕하세요, 제 이름은:"+name+"입니다."+"\t"+address+"에 살고 있습니다.");
        System.out.println("10년 후 나이는"+age10+"살입니다");


    }
}
