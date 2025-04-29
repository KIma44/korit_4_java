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
}
