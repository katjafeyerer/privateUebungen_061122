package Foliensatz1;

public class Aufgabe2_ArithmetischeOperationen {
    public static void main(String[] args) {
        int a = 2;
        double b = 3;

        double sum = a+b;
        double subtraction = a-b;
        double division = a/b;
        double multiplication = a*b;
        double modulo = a%b;
        boolean same = a==b;

        System.out.println(sum + ", " + subtraction + ", " + division + ", "
                + multiplication + " and " + modulo + ", " + same);

        String myString1 = new String("Hallo");
        String myString2 = new String("Hey");
        boolean sameObject = myString1.equals(myString2);
        System.out.println("same object? " + sameObject);
    }
}
