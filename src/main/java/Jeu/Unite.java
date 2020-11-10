package Jeu;

public class Unite implements Deplacement, Attaque {

    public enum UniteType {
        SOLDAT, CHAR, HELICOPTERE
    }

    public static final int SOLDAT = 0;
    public static final int CHAR = 1;
    public static final int HELICOPTERE = 2;

    public Unite(int xType) {
        xType = 0;
    }

    @Override
    public void attaquer() {
        int x = 0;
        if (x == 0)
            System.out.println("Vous avez un cannon");
        if (x == 1)
            System.out.println("Vous avez un missile");
        else
            System.out.println("Vous lance flamme");

    }

    @Override
    public void deplacer() {
        int x = 0;

        if (x == 0)
            System.out.println("Vous courez");
        if (x == 1)
            System.out.println("Vous roulez");
        else
            System.out.println("Vous volez");
    }
}
