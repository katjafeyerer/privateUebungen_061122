package Foliensatz2;

public class Aufgabe1_Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int sum = a + b;
        String name = "Katja";

        //für Ausgabe der gesamten Ergebnisse
        //double[] results= new double[5];



        System.out.println("Mein Name ist: " + name + " und das ist mein Ergebnis der Addition: " + sum);
        /*results[0] = add(1, 2);
        results[1] = subtrahieren(1, 2);
        results[2] = multiplizieren(1, 2);
        results[3] = division(1, 2);
        results[4] = modulo(1, 2);

        System.out.printf("%d%n", (int) results[0]);
        System.out.printf("%d%n", (int) results[1]);
        System.out.printf("%d%n", (int) results[2]);
        System.out.printf("%.2f%n", results[3]);
        System.out.printf("%d%n", (int) results[4]);

        System.out.println(add(1, 2));
        System.out.println(subtrahieren(1, 2));
        System.out.println(multiplizieren(1, 2));
        System.out.println(division(1, 2));
        System.out.println(modulo(1, 2));*/
        //results(3, -1, 2, 0.5, 1);

        results(add(1, 2), subtrahieren(1, 2), multiplizieren(1, 2),
                division(1, 2), modulo(1, 2));

        results(add(1, 2), subtrahieren(1, 2), multiplizieren(1, 2),
                division(1, 0), modulo(1, 2));

        results(add(1, 2), subtrahieren(1, 2), multiplizieren(1, 2),
                division(1, 3), modulo(1, 2));




        // Array aus der Aufgabe #8
        int[] summe = new int[4];
        summe[0] = 1;
        summe[1] = 2;
        summe[2] = 3;
        summe[3] = 4;

        printArray(summe);


    }
    /*public static int addi(int a, int b) {
        int resultAdd = a +b;
        return resultAdd;
    }
    public static int subtr(int a, int b) {
        int resultSubtrahieren = a-b;
        return resultSubtrahieren;
    }
    public static int multi(int a, int b) {
        int resultMultiplizieren = a*b;
        return resultMultiplizieren;
    }
    public static double divi(int a, double b) {
        double resultDivision = a/b;
        return resultDivision;
    }
    public static int modul(int a, int b) {
        int resultModulo = a-b;
        return resultModulo;
    }*/


    public static int add(int a, int b) {
        return a+b;
    }
    public static int subtrahieren(int a, int b) {
        return a-b;
    }
    public static int multiplizieren(int a, int b) {
        return a*b;
    }
    public static double division(int a, double b) {

        if(b == 0) {
            System.out.println("Eine Division durch 0 ist nicht möglich");
        } else if(b!=0){
            return a / b;
        }
        return 0;
    }
    public static int modulo(int a, int b) {
        return a%b;
    }
    public static void results(int resultAdd, int resultSubtrahieren, int resultMultiplizieren,
                                 double resultDivision, int resultModulo) {
        System.out.println(resultAdd +", " + resultSubtrahieren +", "
                + resultMultiplizieren +", " + resultDivision +", " + resultModulo);


    }
    public static int printArray(int[] summe) {

        int sum = summe[0] + summe[1] + summe[2] + summe[3];
        System.out.println("Das ist die Summe der Array-Stellen: " + sum);
            return sum;
        }
    }
