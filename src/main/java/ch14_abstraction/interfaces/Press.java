package ch14_abstraction.interfaces;

public interface Press {
    String NAME = "button";
    // interface이기 때문에 변수 앞에 접근 지정자를 명시하지 않았지만
    /*
    public final에 해당합니다. 또한 상수이기 떄문에 상수명을 나타내는 NAME으로
    작성하였고, 일반 클래스의 field 선천처럼 String name;으로 작성하는 것이 불가능

    나중에 갓어브 확인하실 때 보게 안되는 것들 나열합니다
     */
//    String name;
//    public Press() {
//        System.out.println("추상 메서드만 가능 / 일반 메서드 불가능 예시");
//    }
    // 되는 것
    void onPressed();    // 아무 표시 안했지만 abstract입니다.

    // interface인 Up.java / Down.java를 생성하시고
    // void 형태힌 onUp() /  onDown() 메서드를 선언하시오.




}
