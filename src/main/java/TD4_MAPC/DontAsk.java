package TD4_MAPC;

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
    public void asktea(Distributeur1 d) {
        System.out.println("-> Ask tea");
        d.setState(AskTea.instance());
        d.c -= 10;
    }

    @Override
    public void askcoffee(Distributeur1 d) {
        System.out.println("-> Ask Coffee");
        d.setState(AskCoffee.instance());
        d.c -= 10;
    }

    @Override
    public void dontAsk(Distributeur1 d) {

    }

}
