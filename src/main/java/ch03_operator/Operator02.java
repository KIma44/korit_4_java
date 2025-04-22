package ch03_operator;
/*
    논리 연산자

    true(1) / false(0) : 컴퓨터가 읽을 수 있는 두 숫자
    boolean : true / false를 구분하는 자료형

    AND(&&) : 곱 연산자 T X T = T / T X F = F / F X F= F ->하나라도 false라면 false
    OR(||) : 합 연산자 T + T = T / T + F = T / F + F= F ->하나라도 true라면  true
    NOT(!) :true값을 false로, false를 true로 역전시키는 연산자
 */
public class Operator02 {
    public static void main(String[] args) {
        boolean flag1=true;
        boolean flag2=false;
        System.out.println("-----&& 연산자 -----");
        boolean result1= flag1 && flag1;
        System.out.println("T X T ="+result1);
        boolean result2= flag1&&flag2;
        System.out.println("T X F =" +result2);
        boolean resulst3=flag2&&flag1;
        System.out.println("FXF="+resulst3);
        System.out.println("------ || 연산자 -----");
        boolean result4=flag1 || flag1;
        System.out.println("T + T="+result4);
        boolean resykt5= flag1 || flag2;
        System.out.println("T + F="+resykt5);
        boolean result6=flag2 || flag2;
        System.out.println("F + F="+result6);

        boolean result7= (flag1 || flag2) &&  flag2;
        System.out.println(result7);        //false

        boolean result8= flag1 && flag2 && flag2;
        System.out.println(result8);        //false

        boolean result9=10 % 3==0;
        System.out.println("10 / 3 연산의 나머지는 0이다? :"+ result9);





    }
}
