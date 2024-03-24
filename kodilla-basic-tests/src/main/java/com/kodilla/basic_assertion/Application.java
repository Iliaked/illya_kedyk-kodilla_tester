package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 11;
        int b = 4;
        int subtractResult = calculator.subtract(a, b);
        boolean correct = ResultChecker.assertEquals(7, subtractResult, 0.00001);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int x = (-4);
        double squareResult = calculator.square(x, 2);
        boolean correct1 = ResultChecker.assertEquals(16, squareResult, 0.00001);
        if (correct1) {
            System.out.println("Metoda square działa poprawnie dla liczby " + x);
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + x);
        }
    }
}
