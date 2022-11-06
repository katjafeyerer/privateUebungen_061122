public class PersonDemoApp {

    public PersonDemoApp() {
    }

    public static void main(String[] args) {
        Person susi = new Person();
        susi.firstname = "Susi";
        susi.lastname = "Sorglos";
        susi.age = 21;

        Person max = new Person();
        max.firstname = "Max";
        max.lastname = "Mustermann";
        max.age = 39;

        System.out.println(max.firstname + " " + max.lastname + ", " + max.age + " Jahre");

    }
}
