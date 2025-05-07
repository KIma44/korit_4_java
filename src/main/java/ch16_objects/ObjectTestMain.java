package ch16_objects;

public class ObjectTestMain {
    public static void main(String[] args) {


        // 객체 생성
        ObjectTest objectTest1 = new ObjectTest("김민효","양산시");




        objectTest1.displayInfo();
        System.out.println();
        System.out.println(objectTest1);
        Teacher teacher1 = new Teacher("김민효","정보처리");
        System.out.println(teacher1);

    }
}
