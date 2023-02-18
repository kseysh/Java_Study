package third.mission_1;

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputValue="";
        int number = 0;
        int MAX_NUMBER=9;

        while (true){
            System.out.println("[구구단] 몇 단을 출력하실건가요?");
            inputValue=sc.next();
            if(inputValue.equals("exit")){
                System.out.println("프로그램을 성공적으로 종료했습니다.");
                return;
            }else {
                System.out.println(inputValue);
                number = Integer.valueOf(inputValue);
            }

            if(number>MAX_NUMBER && number<1){
                System.out.println("1단에서 "+MAX_NUMBER+"단까지만 출력이 가능합니다.");
            }
            else {
                for(int i = 1;i<=9;i++){
                    System.out.println(number+" * "+i+" = "+number*i);
                }
            }

        }
    }
}