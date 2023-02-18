package third.mission_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> studentList = new ArrayList<>();
        String studentName = "";

        System.out.println("학생의 이름을 입력하고 엔터를 누르세요. (한글로만 입력해야 합니다.)");
        System.out.println("학생들을 다 입력했다면, print라고 입력해주세요.");
        while(true){
            studentName = sc.next();
            if(studentName.equals("print")){
                break;
            } else if (studentName.matches(".*[가-힣]")) {
                studentList.add(studentName);
            }else {
                System.out.println("학생의 이름은 한글로만 입력해야 합니다.");
            }
        }
        System.out.println("[학생 명단(가나다순)]");
        Collections.sort(studentList);
        for (String e: studentList) {
            System.out.println(e);
        }
    }
}
