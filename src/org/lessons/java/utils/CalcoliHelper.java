package org.lessons.java.utils;

public class CalcoliHelper {

    private CalcoliHelper() {

    }

    // Overloading dei metodi

    // Somma di due numeri interi
    public static int somma(int a, int b) {
        return a + b;
    }

    // Somma di due numeri double
    public static double somma(double a, double b) {
        return a + b;
    }

    // Differenza tra due numeri interi
    public static int differenza(int a, int b) {
        return a - b;
    }

    // Differenza tra due numeri double
    public static double differenza(double a, double b) {
        return a - b;
    }

    // Moltiplicazione di due numeri interi
    public static int moltiplicazione(int a, int b) {
        return a * b;
    }

    // Moltiplicazione di due numeri double
    public static double moltiplicazione(double a, double b) {
        return a * b;
    }

    // Valore assoluto di un numero intero
    public static int valoreAssoluto(int a) {
        return a < 0 ? -a : a;
    }

    // Valore assoluto di un numero double
    public static double valoreAssoluto(double a) {
        return a < 0 ? -a : a;
    }

    // Minimo tra due numeri interi
    public static int minimo(int a, int b) {
        return a < b ? a : b;
    }

    // Minimo tra due numeri double
    public static double minimo(double a, double b) {
        return a < b ? a : b;
    }

    // Massimo tra due numeri interi
    public static int massimo(int a, int b) {
        return a > b ? a : b;
    }

    // Massimo tra due numeri double
    public static double massimo(double a, double b) {
        return a > b ? a : b;
    }
}
