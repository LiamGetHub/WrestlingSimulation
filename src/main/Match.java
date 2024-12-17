package src.main;

import src.main.Wrestler;

public class Match {
    private Wrestler wrestler1;
    private Wrestler wrestler2;
    private Wrestler winner;

    public Match(Wrestler wrestler1, Wrestler wrestler2) {
        this.wrestler1 = wrestler1;
        this.wrestler2 = wrestler2;
    }

    // Simulate match outcome based on random or wrestler strength
    public void conductMatch() {
        int random = (int) (Math.random() * 2);  // Simple random choice
        // Optionally use attributes like strength to determine the winner
        winner = (random == 0) ? wrestler1 : wrestler2;
    }

    public Wrestler getWinner() {
        return winner;
    }

    @Override
    public String toString() {
        return wrestler1.getName() + " vs " + wrestler2.getName() + " - Winner: " + winner.getName();
    }
}
