package ch15_casting.control;

public class Tv implements Power{
    @Override
    public void on() {
        System.out.println("Tv를 키다");
    }

    @Override
    public void off() {
        System.out.println("Tv를 끕다");
    }

    public void channelUp() {
        System.out.println("Tv채널 올리다");
    }
}
