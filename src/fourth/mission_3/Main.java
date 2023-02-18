package fourth.mission_3;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("제이슨");
        System.out.println("이 계산기는 " + calculator.getOwner() + "의 계산기입니다.");
        System.out.println("3+4는 " + calculator.add(3, 4) + "입니다.");
        System.out.println("6-2는 " + calculator.minus(6, 2) + "입니다.");
        System.out.println("2*9는 " + calculator.multiply(2, 9) + "입니다.");
        System.out.println("9/4은 " + calculator.divide(9, 4) + "입니다.");
        System.out.println("9/4은 " + calculator.divide("9", "4") + "입니다.");
    }

}