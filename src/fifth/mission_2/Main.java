package fifth.mission_2;

import fifth.mission_2.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("3+4는 " + calculator.add(3, 4) + "입니다.");
        System.out.println("6-2는 " + calculator.minus(6, 2) + "입니다.");
        System.out.println("2*9는 " + calculator.multiply(2, 9) + "입니다.");
        System.out.println("9/3은 " + calculator.divide(9, 3) + "입니다.");

        fifth.mission_2.ScientificCalculator scientificCalculator = new fifth.mission_2.ScientificCalculator();
        System.out.println("3+4는 " + scientificCalculator.add(3, 4) + "입니다.");
        System.out.println("6-2는 " + scientificCalculator.minus(6, 2) + "입니다.");
        System.out.println("2*9는 " + scientificCalculator.multiply(2, 9) + "입니다.");
        System.out.println("9/3은 " + scientificCalculator.divide(9, 3) + "입니다.");
        System.out.println("3^2는 " + scientificCalculator.square(3) + "입니다.");
    }
}
