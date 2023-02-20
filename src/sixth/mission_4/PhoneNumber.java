package sixth.mission_4;

import java.util.Scanner;

public class PhoneNumber {

    private String value;

    protected PhoneNumber(String value) {
        try {
            this.validate(value);
        } catch (IllegalArgumentException e) {

        }
        this.value = value;
    }


    private void validate(String phoneNumber) {
        System.out.println();
        if (phoneNumber.length() != 11) {
            throw new IllegalArgumentException("휴대폰 번호는 11글자여야 합니다.");
        }
        if (!phoneNumber.substring(0, 3).equals("010")) {
            throw new IllegalArgumentException("휴대폰 번호는 010으로 시작해야 합니다.");
        }
    }

    public String getPhoneNumberFormally() {
        return this.value;
    }
}
