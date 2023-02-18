package second.mission_5;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        System.out.println("보너스 금액을 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int bonusMoney = sc.nextInt();
        System.out.println("3등분된 보너스 금액은 "+bonusMoney/3.0+"입니다.");
    }
}