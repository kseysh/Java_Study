package fifth.mission_4;

import java.util.Scanner;

public class ExamProgram {

    private int year = 0;
    private int htmlScore = 0;
    private int cssScore = 0;
    private int JavascriptScore = 0;

    private void setCssScore(int cssScore) {
        this.cssScore = cssScore;
    }

    private void setHtmlScore(int htmlScore) {
        this.htmlScore = htmlScore;
    }

    private void setJavascriptScore(int javascriptScore) {
        JavascriptScore = javascriptScore;
    }

    private void setYear(int year) {
        this.year = year;
    }

    private int getJavascriptScore() { //get함수도 private로 설정하는 것이 맞나?
        return JavascriptScore;
    }

    private int getHtmlScore() {
        return htmlScore;
    }

    private int getCssScore() {
        return cssScore;
    }

    private int getYear() {
        return year;
    }

    private double getAverage() {
        return (getCssScore() + getHtmlScore() + getJavascriptScore()) / 3.0;
    }

    private int getMaxScore() {
        return Math.max(Math.max(getCssScore(), getHtmlScore()), getJavascriptScore());
    }

    private int getMinScore() {
        return Math.min(Math.min(getCssScore(), getHtmlScore()), getJavascriptScore());
    }

    protected void execute() {
        inputInformation();
        printInformation();
    }

    private void inputInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("몇 기인지 입력해주세요.");
        setYear(scanner.nextInt());
        System.out.println("HTML 과목 점수를 입력해주세요.");
        setHtmlScore(scanner.nextInt());
        System.out.println("CSS 과목 점수를 입력해주세요.");
        setCssScore(scanner.nextInt());
        System.out.println("Javascript 과목 점수를 입력해주세요.");
        setJavascriptScore(scanner.nextInt());
    }

    private void printPassInformation() {
        if (isPassedByScore100()) {
            System.out.println("합격입니다.");
            return;
        }
        if (getYear() == 3) {
            printPassInformationByCutline(70);
        } else if (getYear() == 1 || getYear() == 2) {
            printPassInformationByCutline(60);
        } else {
            System.out.println("기수를 잘못 입력하셨습니다.");
        }

    }

    private void printPassInformationByCutline(int cutLine) {//네이밍을 어떻게..? Cutline vs CutLine
        if (getAverage() >= cutLine) {
            System.out.println("합격입니다.");
        } else {
            System.out.println("불합격입니다.");
        }
    }

    private void printInformation() {
        printPassInformation();
        System.out.println("전체 과목 중 최고점은 " + getMaxScore() + "점입니다.");
        System.out.println("전체 과목 중 최저점은 " + getMinScore() + "점입니다.");
        System.out.println("전체 과목의 평균은 " + getAverage() + "점입니다.");
    }

    private boolean isPassedByScore100() { // 10줄 오바
        int score100Count = 0;
        if (getHtmlScore() == 100) {
            score100Count++;
        }
        if (getCssScore() == 100) {
            score100Count++;
        }
        if (getJavascriptScore() == 100) {
            score100Count++;
        }
        if (score100Count >= 2) {
            return true;
        } else {
            return false;
        }
    }

}
