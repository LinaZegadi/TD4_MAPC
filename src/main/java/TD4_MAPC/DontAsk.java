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
        System.out.println("Rien demandé");
    }

    @Override
    public void askcoffee(Distributeur1 d) {
        System.out.println("Rien demandé");
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
