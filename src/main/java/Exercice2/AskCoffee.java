package Exercice2;

public class AskCoffee implements DistribState {

    private static DistribState instance;

    public static DistribState instance() {
        if (instance == null)
            instance = new AskCoffee();
        return instance;
    }

    private AskCoffee() {
    }

    @Override
    public void asktea(Distributeur2 d) {
        if (d.c >= 10) {
            System.out.println("-> Ask tea");
            d.setState(AskTea.instance());
            d.c -= 10;
        } else
            System.out.println("Pas possible");
    }

    @Override
    public void askcoffee(Distributeur2 d) {
        System.out.println("Déjà fait");
    }

    @Override
    public void dontAsk(Distributeur2 d) {
        System.out.println("Pas possible");
    }

}
