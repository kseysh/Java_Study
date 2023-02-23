package seventh.mission_1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FitnessCenterMemberManagingProgram {


    private final List<String> menuList = Arrays.asList("회원 등록", "특정 회원 조회");
    private MemberRepository memberRepository = new MemberRepository();

    protected void execute() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("원하시는 번호를 입력해주세요.");
            for (int i = 1; i < menuList.size() + 1; i++) {
                System.out.println(i + ". " + menuList.get(i - 1));
            }

            int inputNumber = scanner.nextInt();
            if (inputNumber == 1) {
                System.out.println("원하시는 번호를 입력해주세요.");
                System.out.println("1. 일반 회원");
                System.out.println("2. VIP 회원");
                if (scanner.nextInt() == 1) {
                    Member member = new Member();
                    registerMember(member);
                } else {
                    VIPMember vipMember = new VIPMember();
                    registerMember(vipMember);
                }
            } else if (inputNumber == 2) {
                memberRepository.searchMember();
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }


    private void registerMember(Member member) {
        if (isDuplicatedEmail(member.getMemberEmail())) {
            System.out.println("이미 등록된 이메일이어서 회원 등록에 실패했습니다.");
        } else {
            System.out.println("회원 등록이 성공적으로 완료되었습니다.");
            memberRepository.addMember(member);
        }
    }

    private boolean isDuplicatedEmail(String email) {
        int memberNumber = memberRepository.getMemberRepository().size();
        System.out.println("멤버 수:" + memberNumber);
        for (int i = 0; i < memberNumber; i++) {
            System.out.println(memberRepository.getMemberRepository().get(i).getMemberEmail());
            if (memberRepository.getMemberRepository().get(i).getMemberEmail()
                .equals(email)) {
                return true;
            }
        }
        return false;
    }


}
