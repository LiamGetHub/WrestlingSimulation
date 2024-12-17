package src.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        ArrayList<Wrestler> wrestlers = new ArrayList();


        Wrestler w1 = new Wrestler("john");
        Wrestler w2 = new Wrestler("jim");
        Wrestler w3 = new Wrestler("josh");
        Wrestler w4 = new Wrestler("jack");
        Wrestler w5 = new Wrestler("jayden");
        Wrestler w6 = new Wrestler("jonathan");
        Wrestler w7 = new Wrestler("sam");
        Wrestler w8 = new Wrestler("bob");
        //Wrestler w9 = new Wrestler("jim");

        wrestlers.add(w1);
        wrestlers.add(w2);
        wrestlers.add(w3);
        wrestlers.add(w4);
        wrestlers.add(w5);
        wrestlers.add(w6);
        wrestlers.add(w7);
        wrestlers.add(w8);


        for (int i = 0; i < wrestlers.size() -1; i += 2) {
            Match m = new Match(wrestlers.get(i), wrestlers.get(i+1));
            m.chooseWinner();
        }

    }
}
