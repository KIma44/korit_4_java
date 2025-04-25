package ch09_classes.students;
/*
    1. Student 클래스의 필드를 정의하시오.
        1) int studentCode
        2) String name
        3) double score

     2. 기본 생성자를 정의하고, 객체를 생성했을 때
        "기본 생성자로 객체가 생성되었습니다. "라고 출력될 수 있도록 코드 작성

     3. int 매개변수를 가지는 매개변수 생성자를 정의하고
        "int 매개변수 생성자로 객체가 생성되었습니다."라고 출력

     4. String 매개변수를 가지는 매개변수 생성자를 정의하고
      "String 매개변수 생성자로 객체가 생성되었습니다."라고 출력

      5. studentCode / name을 매개변수로 하는 생성자를 정의하고
        "학번과 이름으로 학생 객체가 생성되었습니다."라고 출력

      6. studentCode / name / score를 매개변수로 하는 생성자를 정의하고
      "학번/ 이름 / 점수를 등록한 학생 객체가 생성되었습니다."라고 출력

      7. StudentMain 클래스에서, 이하의 객체명과 속성을 가질 수 있도록

      8. 학생의 정보가 출력될 수
 */
public class Student {
    int studentCode;
    String name;
    double score;



    Student (int studentCode) {
        System.out.println("int 매개변수 생성자로 객체가 생성되었습니다.");
        this.studentCode=studentCode;
    }
    Student (String name) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다.");
        this.name=name;
    }
    Student (double score) {
        System.out.println("String 매개변수 생성자로 객체가 생성되었습니다.");
        this.score=score;
    }
    Student (int studentCode,String name) {
        System.out.println( "학번과 이름으로 학생 객체가 생성되었습니다.");
        this.name=name;
        this.studentCode=studentCode;
    }
    Student (int studentCode,String name,double score) {
        System.out.println("학번/ 이름 / 점수를 등록한 학생 객체가 생성되었습니다.");
        this.name=name;
        this.studentCode=studentCode;
        this.score=score;



    }
    void displayInfo() {

        System.out.println("이 객체의 studentCode 값: "+ studentCode);
        System.out.println("이 객체의 name 값: "+ name);
        System.out.println("이 객체의 score 값: "+ score);
        System.out.println("이 객체의 studentCode값: "+ studentCode+"name값 :"+name);
        System.out.println("이 객체의 studentCode값: "+ studentCode+"name값: "+name+"score값: "+score);
        System.out.println();

    }

}
