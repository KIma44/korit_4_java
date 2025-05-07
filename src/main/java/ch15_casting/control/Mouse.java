package ch15_casting.control;

public class Mouse implements Power{

    @Override
    public void on() {
        System.out.println("마우스의 전원 겹니다");
    }

    @Override
    public void off() {
        System.out.println("마우스 전원 끕니다");
    }
    public void leftClick() {
        System.out.println("왼쪽 버튼을 클릭합니다.");
    }
}
