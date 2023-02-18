package fourth.mission_4;

public class Student {
    String name = "홍길동";
    int koreanScore =0;
    int englishScore =0;
    Student(String n, int k, int e){
        name =n;
        koreanScore=k;
        englishScore=e;
    }
    void printScore(){
        System.out.println("이름 : "+name);
        System.out.println("국어 : "+koreanScore);
        System.out.println("영어 : "+englishScore+"\n");

    }
}