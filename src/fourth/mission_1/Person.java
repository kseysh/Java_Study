package fourth.mission_1;

public class Person {
    String name = "홍길동";
    int age = 0;
    boolean isStudent = false;
    double weight = 0.0;
    Person(String n,int a ,boolean u ,double w){
        name =n;
        age=a;
        isStudent = u;
        weight =w;
    }

    void getPersonInformation(){
        System.out.println("이름 : "+name);
        System.out.println("나이 : "+age);
        System.out.println("대학생인가요? : "+isStudent);
        System.out.println("몸무게 : "+weight);

    }

}