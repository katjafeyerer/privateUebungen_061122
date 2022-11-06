package Foliensatz1;

public class DurchtestenVonRückgabewerten {

    public static void printNumber(int number) {
        System.out.println("The number is: " + number);
    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int result = add(1, 2);
        System.out.println(result);

        System.out.println(add(1, 2));

        printNumber(add(1, 2));
    }
}
