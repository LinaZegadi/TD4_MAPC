package Exercice2;

public class App {

    public static void main(String[] args) {
        Distributeur2 d = new Distributeur2();
        d.askcoffee();
        d.give(5);
        d.askcoffee();
        d.give(10);
        d.askcoffee();
        d.getRefund();
        d.getRefund();
    }

}
