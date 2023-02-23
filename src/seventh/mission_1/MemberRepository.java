package seventh.mission_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberRepository {

    private List<Member> members = new ArrayList<>();

    protected void addMember(Member member) {
        this.members.add(member);
    }

    protected List<Member> getMemberRepository() {
        return this.members;
    }

    protected void searchMember() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("조회하려는 회원의 이름을 입력해주세요.");
        String nameForSearch = scanner.nextLine();
        if (isMemberInRepository(nameForSearch)) {
            printMemberInformation(searchSpecificMember(nameForSearch));
        } else {
            System.out.println("등록되지 않은 회원입니다.");
        }

    }

    private boolean isMemberInRepository(String name) {
        for (int i = 0; i < this.getMemberRepository().size(); i++) {
            if (this.getMemberRepository().get(i).getMemberName().equals(name)) {
                return true;
            }
        }
        return false;
    }

    private Member searchSpecificMember(String name) {
        for (int i = 0; i < this.getMemberRepository().size(); i++) {
            if (getMemberRepository().get(i).getMemberName().equals(name)) {
                return this.getMemberRepository().get(i);
            }
        }
        return null;
    }

    private void printMemberInformation(Member member) {
        System.out.print(member.getMemberName() + "님은 ");
        if (member.isVIP()) {
            System.out.print("VIP 회원이고, ");
        } else {
            System.out.print("일반 회원이고, ");
        }
        System.out.print("이메일은 " + member.getMemberEmail() + "이고, ");
        System.out.println("나이는 " + member.getMemberAge() + "살입니다.");
    }
}
