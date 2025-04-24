package ch06_condition;

import java.util.Scanner;

/*
        Condition07 파일을 확인하시면
        점수를 입력 받아서 등급을 산출을 했었습니다.
        이를 응용하여 중첩 if 문 + switch문 형태로 프로그램을 작성합니다.

        지시 사항
        사용자에게 score를 입력 받아서 다음과 같은 조건을 만족시키도록 작성하시오.
        score가 0미만이거나 100 초과라면 grade = x


        changeScore = 9 ~ 10,grade = A
        changeScore = 8,grade = B
        changeScore =7,grade = C
        changeScore = 6,grade = D
        changeScore = 5,4,3,2,1이면 grade = F

        실행 예
        점수를 입력하세요 >>> 100
        점수는 100점이고, 학점은 A학점이다
 */
public class Condition11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int score;
        int changScore;
        String grade="";
        System.out.println("점수:");
        score=scanner.nextInt();

         int changeScore = score / 10;


        if(score > 100 || score < 0) {
            grade = "X";
        }
            else {switch (changeScore) {
            case 9:
                    case 10:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                case 5, 4, 3, 2, 1:
                    grade = "F";
                    break;
                default:

            }
        }
        System.out.println("점수는"+score+"점이고, 학점은"+ grade +"학점이다");
    }
}
