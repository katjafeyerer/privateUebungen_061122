package Foliensatz2;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] Array1 = new int[3];
        Array1[0] = 1;
        Array1[1] = 2;
        Array1[2] = 3;

        int[] Array2 = new int[3];
        Array2[0] = 4;
        Array2[1] = 5;
        Array2[2] = 6;

        int add0 = Array1[0] + Array2[0];
        int add1 = Array1[1] + Array2[1];
        int add2 = Array1[2] + Array2[2];

        int multiplication0 = Array1[0] * Array2[0];
        int multiplication1 = Array1[1] * Array2[1];
        int multiplication2 = Array1[2] * Array2[2];

        System.out.println("+ " + add0 + ", " + add1 + ", " + add2);
        System.out.println("* " + multiplication0 + ", " + multiplication1 + ", " + multiplication2);

        int anzahlArraystellen = Array1.length;
        System.out.println(Array1.length);


        String[] days = new String[7];
        days[0] = "Montag";
        days[1] = "Dienstag";
        days[2] = "Mittwoch";
        days[3] = "Donnerstag";
        days[4] = "Freitag";
        days[5] = "Samstag";
        days[6] = "Sonntag";


        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i]);

        }


    }
}
