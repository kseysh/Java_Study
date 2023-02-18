package second.mission_6;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("3의 배수인지 판단하고 싶은 숫자를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        int inputVal= sc.nextInt();
        if(inputVal%3==0){
            System.out.println("3의 배수입니다.");
        }else {
            System.out.println("3의 배수가 아닙니다.");
        }
    }
}