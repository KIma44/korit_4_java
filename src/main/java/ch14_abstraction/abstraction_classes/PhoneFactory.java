package ch14_abstraction.abstraction_classes;

public class PhoneFactory extends Factory{

private String name;

    @Override
    public void produce(String model) {
        System.out.println("[ "+model+" ] 모델 스마폰을 생산합니다." );
    }

    @Override
    public void manage() {
        System.out.println("스마트폰 공장을 관리합니다.");
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

}
