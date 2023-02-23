package seventh.mission_1;

import java.util.Scanner;

public class Member {

    private String memberName;
    private String memberEmail;
    private int memberAge;

    private final boolean isVIP = false;

    Member() {
        if (!isVIP()) {
            setMemberInformation();
        }
    }


    protected boolean isVIP() {
        return isVIP;
    }

    protected int getMemberAge() {
        return memberAge;
    }

    protected void setMemberAge(int memberAge) {
        this.memberAge = memberAge;
    }

    protected String getMemberEmail() {
        return memberEmail;
    }

    protected void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    protected String getMemberName() {
        return memberName;
    }

    protected void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    private void setMemberInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이메일을 입력해주세요.");
        this.setMemberEmail(scanner.nextLine());
        System.out.println("이름을 입력해주세요.");
        this.setMemberName(scanner.nextLine());
        System.out.println("나이를 입력해주세요.");
        this.setMemberAge(scanner.nextInt());

    }

}
