package ch19_generic.wildcads;

public class Main {

    // AnimalData의 필드가 Animal의 서브 클래스에 해당하는지 확인하는 메서드를 정의
    // wildcard가 적용되기 떄문에 주의깊게 보시기 바랍니다.
public AnimalData<? extends Animal> getAnimal (int clan) {
    if(clan==1){
        AnimalData<Human> animalData1 = new AnimalData<>(new Human());
    return animalData1;
    }else if (clan==2){
        AnimalData<Tiger> animalData2 = new AnimalData<>(new Tiger());
        return animalData2;
    }
    return null;
    }
    public static void main(String[] args) {
Main main = new Main();

AnimalData<? extends Animal> animalData3 = main.getAnimal(1);
AnimalData<? extends Animal> animalData4 = main.getAnimal(2);
AnimalData<? extends Animal> animalData5 = main.getAnimal(3);

if(animalData3!=null) {
    animalData3.a();
}else{
    System.out.println("없음");
}
        if(animalData4!=null) {
            animalData4.a();
        }else{
            System.out.println("없음");
        }
        if(animalData5!=null) {
            animalData5.a();
        }else{
            System.out.println("없음");
        }

}
}