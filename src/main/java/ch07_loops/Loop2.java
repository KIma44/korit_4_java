package ch07_loops;
/*
           while(조건식1) {
            반복실행문1a
         while(조건식2) {
            반복실행문2
                }
            반복실행문1b
                    }
 */
public class Loop2 {
    public static void main(String[] args) {
        // 1일차 1교시입니다 ~ 1일차 3교시입니다 / 5일차 3교시입니다.
//            int day = 1;
//            while (day < 6) {
//                int lesson = 1;         // 반복문 내에 변수를 선언하고 초기화했습니다.
//            while ( lesson < 4) {
//                System.out.println(day+"일차"+lesson+"교시입니다.");
//                    lesson++;
//                }
//                    day++;
//                         }

            // 이상의 코드를 응용하여
                /*
               2 x 1 = 2
               2 x 2 = 2
               ...
               9 x 9 = 81
                 */
//            int i = 2;
//            int j = 1;
//            while(i<9){
//                ++i;
//                while (j<9){
//                    ++j;
//                }
//                System.out.println(i+"X"+j+"="+(i*j));
//            }
        int day = 2;
        while (day < 10) {
            int lesson = 1;         // 반복문 내에 변수를 선언하고 초기화했습니다.
            while ( lesson < 10) {
                System.out.println(day+"X"+lesson+"="+day*lesson);
                lesson++;
            }
            day++;
        }

    }
}
