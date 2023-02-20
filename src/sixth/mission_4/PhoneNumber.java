package sixth.mission_4;

import java.util.Scanner;

public class PhoneNumber {

    private String value;

    protected PhoneNumber(String value) {
        try {
            this.validate(value);
            this.value = value;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.inputPhoneNumberAgain();
        }
    }

    private void validate(String phoneNumber) {
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
        }
        if (!phoneNumber.substring(0, 3).equals("010")) {
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
        }
    }

    private void inputPhoneNumberAgain() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("휴대폰 번호를 입력해주세요. ");
        String inputValue = scanner.nextLine();

        try {
            this.validate(inputValue);
            this.value = inputValue;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            this.inputPhoneNumberAgain();
        }

    }


    protected String getPhoneNumberFormally() {
        String phoneNumber = this.value;
        String phoneNumberFormally =
            phoneNumber.substring(0, 3) + '-' + phoneNumber.substring(3, 7) + '-'
                + phoneNumber.substring(7, 11);
        return phoneNumberFormally;
    }
}
