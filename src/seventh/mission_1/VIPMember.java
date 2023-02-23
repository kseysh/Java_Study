package seventh.mission_1;

import java.util.Scanner;

public class VIPMember extends Member {

    VIPMember() {
        setMemberInformation();
    }

    private void setNumberOfPersonalTrainingSession(int numberOfPersonalTrainingSession) {
        this.numberOfPersonalTrainingSession = numberOfPersonalTrainingSession;
    }

    private int numberOfPersonalTrainingSession;

    protected boolean isVIP() {
        return isVIP;
    }

    private final boolean isVIP = true;


    public int getNumberOfPersonalTrainingSession() {
        return numberOfPersonalTrainingSession;
    }


    private void setMemberInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이메일을 입력해주세요.");
        this.setMemberEmail(scanner.nextLine());
        System.out.println("이름을 입력해주세요.");
        this.setMemberName(scanner.nextLine());
        System.out.println("나이를 입력해주세요.");
        this.setMemberAge(scanner.nextInt());
        System.out.println("신청한 PT 횟수를 입력해주세요.");
        this.setNumberOfPersonalTrainingSession(scanner.nextInt());
    }
}
