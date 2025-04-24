package ch07_loops;

import java.util.Scanner;

/*
        몇 줄의 별을 찍겠습니까? >>> 3
        ***
        **
        *
 */
public class Loop7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("몇 줄의 별을 찍계습니까? >>>");
        int row = 0;
        row=scanner.nextInt();

        for(int i = row ; i > 0 ;i--){
            for(int j = 0 ; j < i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0 ; i < row ; i++){
            for(int j = row ; j - i > 0 ; j--){
                System.out.print("*");
            }
            System.out.println();
        }
            // 오늘 복습 시간에 md 파일 정리할 때 # 1 풀이업으로도 작성하세요


    }
}
