package ch18_static.builders;

public class PersonLombokMain {
    public static void main(String[] args) {
        PesonLombok pesonLombok1 =PesonLombok.builder().
                name("김일")
                .age(21)

                .build();
        System.out.println(pesonLombok1);
    }
}
