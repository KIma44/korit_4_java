package ch18_static.builders;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class PesonLombok {
    private String name;
    private int age;
    private String address;

}
