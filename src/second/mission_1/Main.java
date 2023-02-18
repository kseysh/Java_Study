package second.mission_1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름을 입력하세요.");
        String name = sc.nextLine();
        System.out.println("입력하신 이름은 "+name+"입니다.");
    }
}
