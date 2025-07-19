class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 10));  // 15
        System.out.println(calc.add(5.5, 10.5));  // 16.0
    }
}