package Foliensatz2;

public class ArrayDemo2 {
    public static void main(String[] args) {
        String[] months = new String[13];
        months[0] = " ";
        months[1] = "Jänner";
        months[2] = "Februar";
        months[3] = "Maerz";
        months[4] = "April";
        months[5] = "Mai";
        months[6] = "Juni";
        months[7] = "Juli";
        months[8] = "August";
        months[9] = "September";
        months[10] = "Oktober";
        months[11] = "November";
        months[12] = "Dezember";



        for (int i = 1; i <= months.length; i++) {
            System.out.println(months[i] + "[" + i + "]");

        }
    }
}
