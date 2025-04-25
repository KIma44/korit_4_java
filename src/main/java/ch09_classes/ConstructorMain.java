package ch09_classes;

public class ConstructorMain {
    public static void main(String[] args) {

        // 기본생성자를 통한 객체 생성
    Constructor Constructor1=new Constructor();
        System.out.println(Constructor1.num);

    // int 매개변수 생성자를 통산 객체 생성
     Constructor Constructor2 = new Constructor(21);
        System.out.println(Constructor2.num);
    // String 매개변수 생성자를 통한 객체 생성
        Constructor Constructor3 = new Constructor("김삼");
        // 이상의 경우 만들 때 속성값을 바로 초기화
        Constructor3.num = 23;
        // 이상의 경우는 default로 0으로 초기화되었을 거기 떄문에
        // 23을 '제대입' 했다고 해석할 수 있겠습니다.

       // AllArgsConstructor를 기준으로 두 개의 객체를 생성하겠습니다.
        Constructor constructor4 = new Constructor("김사", 24);
        Constructor constructor5 = new Constructor("김오",25);


//        constructor1.displayInfo();
//        constructor2.displayInfo();
//        constructor3.displayInfo();
//        constructor4.displayInfo();
//        constructor5.displayInfo();



    }
}
