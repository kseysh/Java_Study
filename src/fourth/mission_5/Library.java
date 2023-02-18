package fourth.mission_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    private List<Book> bookList;

    public Library(List<Book> books) {
        this.bookList = books;
    }

    void rentBook(){

        Scanner scanner = new Scanner(System.in);

        while(true){
            for (int i = 0; i<bookList.size();i++) {
                System.out.println("대여할 책의 번호를 입력하세요.");
                System.out.print(i + 1 + ". " + bookList.get(i).getBookName() + " - ");
                if (bookList.get(i).getRentInformation() == true) {
                    System.out.println("대여 가능");
                } else {
                    System.out.println("대여 중");
                }
            }

            int rentBookNumber = scanner.nextInt();

            if(rentBookNumber<1||rentBookNumber>bookList.size()){
                System.out.println("이 책은 도서관에 없습니다.");
                break;
            }

            Book wantRentBook = bookList.get(rentBookNumber-1);
            if(wantRentBook.getRentInformation()) {
                wantRentBook.isPossibleRent = false;
                System.out.println("정상적으로 대여가 완료되었습니다.");
            }else {
                System.out.println("대여 중인 책은 대여할 수 없습니다.");
            }
        }
    }
}