package example;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }


    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("0-ге бөлүүгө болбойт!");
        }
        return (double) a / b;
    }

    // Негизги метод (тест үчүн)
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Plus: " + calc.add(5, 3));
        System.out.println("Minus: " + calc.subtract(10, 4));
        System.out.println("Multiply: " + calc.multiply(6, 7));
        System.out.println("Division: " + calc.divide(15, 3));
    }
}


