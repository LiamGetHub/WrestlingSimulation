package src.main;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, World!");
        //ArrayList<Wrestler> wrestlers = new ArrayList();


        Wrestler w1 = new Wrestler("john");
        System.out.println(w1.getName());

        Wrestler w2 = new Wrestler("jim");
        System.out.println(w2.getName());


        Match m1 = new Match(w1, w2);
        m1.chooseWinner();

    }
}
