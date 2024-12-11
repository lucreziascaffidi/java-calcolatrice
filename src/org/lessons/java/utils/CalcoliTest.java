package org.lessons.java.utils;

public class CalcoliTest {
    public static void main(String[] args) {

        // somma
        System.out.println("Somma int: " + CalcoliHelper.somma(5, 3));
        System.out.println("Somma double: " + CalcoliHelper.somma(5.4, 3.3));

        // differenza
        System.out.println("differenza int: " + CalcoliHelper.differenza(5, 3));
        System.out.println("differenza double: " + CalcoliHelper.differenza(5.4, 3.4));

        // moltiplicazione
        System.out.println("moltiplicazione int " + CalcoliHelper.moltiplicazione(4, 6));
        System.out.println("moltiplicazione double " + CalcoliHelper.moltiplicazione(4.4, 6.9));

        // Valore assoluto
        System.out.println("valore assoluto int " + CalcoliHelper.valoreAssoluto(-4));
        System.out.println("valore assoluto double " + CalcoliHelper.valoreAssoluto(-4.4));

        // minimo
        System.out.println("minimo int " + CalcoliHelper.minimo(4, 6));
        System.out.println("minimo double " + CalcoliHelper.moltiplicazione(4.4, 6.9));

        // massimo
        System.out.println("massimo int " + CalcoliHelper.massimo(4, 6));
        System.out.println("massimo double " + CalcoliHelper.massimo(4.4, 6.9));

        // Potenza
        System.out.println("Potenza (base 2, esponente 3): " + CalcoliHelper.potenza(2, 3));
        System.out.println("Potenza (base -2, esponente 3): " + CalcoliHelper.potenza(-2, 3));
        System.out.println("Potenza (base 2, esponente -3): " + CalcoliHelper.potenza(2, -3));
        System.out.println("Potenza (base 0, esponente 0): " + CalcoliHelper.potenza(0, 0));

    }
}
