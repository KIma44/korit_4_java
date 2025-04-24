package ch07_loops;

public class Loop5 {
    public static void main(String[] args) {
        // 1일차 1교실입니다 ~ 5일차 3교실입니다
        for(int i=1;i<6;i++){
            for(int j=1;j<4;j++){
                System.out.println(i+"일차"+j+"교실입니다.");
            }
        }

        // 이상의 코드를 응용하여 구구단을 출력하시오.
        /*
        1 2 3 4 5 6 7 8 9 10
        ...
        90 91 92 93 94 95 96 97 98 99 100
         */
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                System.out.println(i+"X"+j+"="+i*j);
            }
        }
        System.out.println();
            int i=2;
        while(i<10){
            int j=1;
            while(j<10){

                System.out.println(i+"X"+j+"="+i*j);

       j++;     }
     i++;   }

            // 반복 100번 하는 방법
        for(int i1 =0 ; i1 <101 ; i1++){
            System.out.println(i1+" ");
            if( i % 10 == 0){
                System.out.println();
            }
        }
                // 반복 10번 하는 방법
        for(int a=1;a<101;a++){
            System.out.println(a+" "+(a+1)+" "+(a+2)+" "+(a+3)+" "+(a+4)+" "+(a+5)+" "
                    +(a+6)+" "+(a+7)+" "+(a+8)+" "+(a+9)+" "+(a+10)+" ");
        }

    }
}
