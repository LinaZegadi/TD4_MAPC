package TD4_MAPC;

public class App {

    public String getGreeting() {
        return "Hello.";
    }

    public static void main(String[] args) {
        Distributeur1 d = new Distributeur1();
        int c = d.give(5);
        c = d.give(10);
        d.askcoffee();
        d.asktea();
        d.dontask();
    }
}
