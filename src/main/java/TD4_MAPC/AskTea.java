package TD4_MAPC;

import javax.lang.model.util.ElementScanner14;

public class AskTea implements DistribState {

    private static DistribState instance;

    public static DistribState instance() {
        if (instance == null)
            instance = new AskTea();
        return instance;
    }

    private AskTea() {
    }

    @Override
    public void askcoffee(Distributeur1 d) {
        if (d.c >= 10) {
            System.out.println("-> Ask Coffee");
            d.setState(AskCoffee.instance());
        } else
            System.out.println("Pas possible");
    }

    @Override
    public void asktea(Distributeur1 d) {
        System.out.println("Déjà fait"); // pour l'illustration
    }

    @Override
    public void dontAsk(Distributeur1 d) {
        System.out.println("Pas possible");

    }

}
