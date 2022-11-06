package Foliensatz2;

public class IfExample {

    public static void main(String[] args) {
        boolean iAmHealthy = true;

        if (iAmHealthy) {
            System.out.println("Yeah");
        }
        else {
            System.out.println("Noooo");
        }

        int grade = 1;

        if(grade == 1) {
            System.out.println("Very Good");
        }
        else if(grade == 2) {
            System.out.println("Good");
        }
        else if(grade ==3) {
            System.out.println("Satisfying");
        }
        else if(grade ==4) {
            System.out.println("Sufficient");
        }
        else {
            System.out.println("Take next chance");
        }

        String day = "Sonntag";
        String time = "Nacht";

        if(day.equals("Sonntag") || day.equals("Samstag") && time.equals("Nacht")) {
            System.out.println("WE-Nacht Tarif");
        }

        String[] tag= new String[7];
        tag[0] = "Montag";
        tag[1] = "Dienstag";
        tag[2] = "Mittwoch";
        tag[3] = "Donnerstag";
        tag[4] = "Freitag";
        tag[5] = "Samstag";
        tag[6] = "Sonntag";

        String[] zeit = new String[3];
        zeit[0] = "Vormittag";
        zeit[1] = "Nachmittag";
        zeit[2] = "Nacht";


        }

        }

