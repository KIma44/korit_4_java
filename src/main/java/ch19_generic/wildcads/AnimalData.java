package ch19_generic.wildcads;

import ch13_inheritance.Animal;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalData <T>{

private T animal;


public void a() {
    ((Animal)animal).move();

    if(animal.getClass()==Human.class) {
        ((Human)animal).read();
    }else if(animal.getClass()==Tiger.class) {
        ((Tiger)animal).hunt();
    }


}


}
