package TD4_MAPC;

public class App {

    public String getGreeting() {
        return "Hello.";
    }

    public static void main(String[] args) {
        Distributeur1 d = new Distributeur1();
        d.askcoffee();
        d.give(5);
        d.askcoffee();
        d.give(30);
        d.askcoffee();
        d.give(1);
        d.askcoffee();
    }

}
