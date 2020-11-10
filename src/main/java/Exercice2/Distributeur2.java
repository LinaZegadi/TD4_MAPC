package Exercice2;

public class Distributeur2 {

    private DistribState state;
    public int c = 0;

    public Distributeur2() {
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

    public int getRefund() {
        int sum = c;
        c = 0;
        return sum;
    }

}
