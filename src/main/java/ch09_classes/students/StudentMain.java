package ch09_classes.students;

public class StudentMain {
    public static void main(String[] args) {

        Student student1 = new Student(33);
        Student student2=  new Student("김삼");
        Student student3 = new Student(80.5);
        Student student4 = new Student(23,"김민효");
        Student student5 = new Student(10,"김이",3.14);

        // 이상의 방법들로 객체를 생성했을 떄,비어있는 속성값들이 있습니다.
        // 채우기 위한 방법은 20250424 학습했습니다
        // student1

        student1.studentCode = 2025001;
        student1.name = "김일";
        student1.score = 4.5;


        student2.name = "김이";
        student2.score = 4.9;

        student3.studentCode=2025003;
        student3.score=95.8;

        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
        student5.displayInfo();

    }
}
