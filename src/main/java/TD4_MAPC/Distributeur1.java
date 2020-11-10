package TD4_MAPC;

public class Distributeur1 {

    private DistribState state;
    public int c = 0;

    public Distributeur1() {
        this.state = DontAsk.instance();
    }

    void setState(DistribState s) {
        this.state = s;
    }

    public void askcoffee() {
        this.state.askcoffee(this);
    }

    public void asktea() {
        System.out.println("-> Ask tea");
        this.setState(AskTea.instance());
    }

    public void dontask() {
        this.state.dontAsk(this);
    }

    public int give(int n) {
        c = c + n;
        return c;
    }

}
