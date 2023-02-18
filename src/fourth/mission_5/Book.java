package fourth.mission_5;

public class Book{
    String bookName = "";
    boolean isPossibleRent = true;
    Book(String book){
        this.bookName=book;
        this.isPossibleRent= true;
    }

    String getBookName(){
        return bookName;
    }
    boolean getRentInformation(){
        return isPossibleRent;
    }
}