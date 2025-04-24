package ch06_condition;

import java.util.Scanner;

public class Condition6 {
    public static void main(String[] args) {
        // Condition05를 생각했을 때 100 초과 / 0 미만의 점수가 입력 가능합니다.
        //



                Scanner scanner = new Scanner(System.in);
                int score;
                String grade=" ";
                System.out.print("나의 점수:");
                score= scanner.nextInt();

                // 문제 상황을 해결하지 못하는 방식
//                if(score>=90){
//                    grade="A";
//                }else if(score>=80){
//                    grade="B";
//                }else if(score>=70){
//                    grade="C";
//                }else if(score>=60){
//                    grade="D";
//                }else if(score<=59) {
//                    grade="F";
//                } else if(score>100){
//                    System.out.println("불가능한 점수 입력입니다");
//                    grade="X";
//                }else if(score < 0){
//                    System.out.println("불가능한 점수 입력입니다");
//                }
            if(score>100){
                grade="X";
            }else if(score<0){
                grade="X";
            }else if(score>89){
                grade="A";
             }else if(score>79){
                  grade="B";
             }else if(score>69){
                    grade="C";
             }else if(score>59){
                 grade="D";
            }else{
                 grade="F";
            }
                System.out.print("당신의 점수는"+score+"이고, 학점은 "+grade+"입니다");


    }
}
