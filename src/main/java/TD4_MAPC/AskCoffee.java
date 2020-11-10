package TD4_MAPC;

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
    public void asktea(Distributeur1 d) {
        System.out.println("-> Ask tea");
        d.setState(AskTea.instance());
    }

    @Override
    public void askcoffee(Distributeur1 d) {
        System.out.println("Déjà fait"); // pour l'illustration
    }

    @Override
    public void dontAsk(Distributeur1 d) {
        // TODO Auto-generated method stub

    }

    @Override
    public int give(int n) {
        // TODO Auto-generated method stub
        return 0;
    }

}
