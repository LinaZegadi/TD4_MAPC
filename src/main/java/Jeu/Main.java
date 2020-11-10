package Jeu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("***********************************");
        System.out.println("Choisissez votre unité entre 0 et 2");

        Scanner sc = new Scanner(System.in);
        int u = sc.nextInt();
        sc.nextLine();

        Unite uni;

        switch (u) {
            case 0:
                System.out.println("UNITE SOLDAT");
                uni = new Unite(0);
                break;
            case 1:
                System.out.println("UNITE CHAR");
                uni = new Unite(1);
                break;
            case 2:
                System.out.println("UNITE HELICOPTERE");
                uni = new Unite(2);
                break;
            default:
                System.out.println("Vous devez choisir une inité");
        }
        sc.close();

        System.out.println("***********************************");

    }

}
