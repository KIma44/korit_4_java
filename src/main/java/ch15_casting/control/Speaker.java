package ch15_casting.control;

public class Speaker implements Power{

    @Override
    public void on() {
        System.out.println("스피커 킨다");
    }

    @Override
    public void off() {
        System.out.println("스피커 끕다");
    }
    public void changeEqual() {
        System.out.println("이퀄아저를 변경하다");
    }
}
