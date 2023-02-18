package second.mission_7;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("몇 기인지 입력해주세요.");
        int year = sc.nextInt();
        System.out.println("HTML 과목 점수를 입력해주세요.");
        int htmlScore = sc.nextInt();
        System.out.println("CSS 과목 점수를 입력해주세요.");
        int cssScore=sc.nextInt();
        System.out.println("JavaScript 과목 점수를 입력해주세요.");
        int javaScriptScore = sc.nextInt();

        int maxScore = Math.max(Math.max(htmlScore,cssScore),javaScriptScore);
        int minScore = Math.min(Math.min(htmlScore,cssScore),javaScriptScore);

        double aver = (htmlScore+cssScore+javaScriptScore)/3.0;

        if(year==1 || year==2){
            if(aver>=60){
                System.out.println("합격입니다.");
            } else if (htmlScore==100 && cssScore==100 ||
                htmlScore==100&&javaScriptScore==100 ||
                cssScore==100&&javaScriptScore==100) {
                System.out.println("합격입니다.");
            }
            else{
                System.out.println("불합격입니다.");
            }
        } else if (year==3) {
            if(aver>=70){
                System.out.println("합격입니다.");
            } else if (htmlScore==100 && cssScore==100 ||
                htmlScore==100&&javaScriptScore==100 ||
                cssScore==100&&javaScriptScore==100) {
                System.out.println("합격입니다.");
            } else{
                System.out.println("불합격입니다.");
            }
        }
        else{
            System.out.println("기수를 다시 입력해주세요.");
            return;
        }
        System.out.println("전체 과목 중 최고점은 "+maxScore+"입니다.");
        System.out.println("전체 과목 중 최저점은 "+minScore+"입니다.");
        System.out.println("전체 과목의 평균은 "+aver+"점입니다.");
    }
}