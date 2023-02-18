package fourth.mission_3;

public class Calculator {
    String name = "홍길동";
    Calculator(String n){
        name=n;
    }
    String getOwner(){
        return name;
    }
    int add(int a, int b){
        return a+b;
    }
    int minus(int a, int b){
        return a-b;
    }
    int multiply(int a, int b){
        return a*b;
    }
    double divide(int a, int b){
        return a/b;
    }
    double divide(String a, String b){
        int aValue = Integer.parseInt(a);
        int bValue = Integer.parseInt(b);
        return aValue/bValue;
    }
}