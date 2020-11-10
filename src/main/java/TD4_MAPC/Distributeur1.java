package TD4_MAPC;

public class Distributeur1 {

    // public static final int MAX_USAGES = 2;
    private int usages;
    private DistribState state;
    private int c = 0;

    public Distributeur1() {
        this.state = AskCoffee.instance();
        this.usages = 0;
    }

    void setState(DistribState s) {
    }

    int usages() {
        return usages;
    }

    void razUsage() {
        usages = 0;
    }

    void augmenterUsages() {
        usages = usages + 1;
    }

    public void askcoffee() {
        this.state.askcoffee(this);
    }

    public void asktea() {
        this.state.asktea(this);
    }

    public void dontask() {
        this.state.dontAsk(this);
    }

    public int give(int n) {
        c = c + n;
        return c;
    }

}
