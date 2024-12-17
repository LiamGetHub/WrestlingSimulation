package src.main;

public class Match {
    private Wrestler wrestler1;
    private Wrestler wrestler2;
    private Wrestler winner;

    // Constructor to initialize two wrestlers for the match
    public Match(Wrestler wrestler1, Wrestler wrestler2) {
        this.wrestler1 = wrestler1;
        this.wrestler2 = wrestler2;
    }

    // Function to randomly choose one wrestler as the winner
    public void chooseWinner() {
        if (wrestler1 == null || wrestler2 == null) {
            throw new IllegalStateException("Both wrestlers must be present to determine a winner.");
        }

        int random = (int) (Math.random() * 2); // Generate 0 or 1
        winner = (random == 0) ? wrestler1 : wrestler2; // Choose the winner based on random value
        System.out.println(wrestler1.getName() + " and " + wrestler2.getName() + " are wrestling...");
        System.out.println("The winner is: " + winner.getName());
        System.out.println("-----------------------------------\n");
    }

    // Getter for the winner
    public Wrestler getWinner() {
        return winner;
    }
}
