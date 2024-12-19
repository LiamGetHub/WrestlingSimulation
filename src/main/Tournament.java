package src.main;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tournament {
    private List<Wrestler> wrestlers;
    private List<Wrestler> winners;

    public Tournament(List<Wrestler> wrestlers) {
        this.wrestlers = wrestlers;
        this.winners = new ArrayList<>();
    }

    public void start() {
        // Sort wrestlers by seed (for seeding purposes)
        wrestlers.sort((w1, w2) -> Integer.compare(w1.getSeed(), w2.getSeed()));

        // Conduct tournament
        while (wrestlers.size() > 1) {
            System.out.println("Round " + (wrestlers.size() / 2) + ":");
            for (int i = 0; i < wrestlers.size() / 2; i++) {
                Wrestler wrestler1 = wrestlers.get(i);
                Wrestler wrestler2 = wrestlers.get(wrestlers.size() - 1 - i);
                Match match = new Match(wrestler1, wrestler2);
                match.conductMatch();
                winners.add(match.getWinner());
            }
            //print winner of matches out
            for (int i = 0; i < winners.size() -1; i++) {
                System.out.println("winner of match " + (i+1) + ": "+winners.get(i));

            }
            wrestlers = winners;
            winners = new ArrayList<>();
        }

        System.out.println("The winner of the tournament is: " + wrestlers.get(0).getName());
    }
}
