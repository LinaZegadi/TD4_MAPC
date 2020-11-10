package Exercice2;

public class DontAsk implements DistribState {

    private static DistribState instance;

    public static DistribState instance() {
        if (instance == null)
            instance = new DontAsk();
        return instance;
    }

    private DontAsk() {
    }

    @Override
    public void asktea(Distributeur2 d) {
        System.out.println("-> Ask tea");
        d.setState(AskTea.instance());
        d.c -= 10;
    }

    @Override
    public void askcoffee(Distributeur2 d) {
        System.out.println("-> Ask Coffee");
        d.setState(AskCoffee.instance());
        d.c -= 10;
    }

    @Override
    public void dontAsk(Distributeur2 d) {
        // TODO Auto-generated method stub

    }

}
