package src.main;

public class Wrestler {
    private String name;
    private int wins;
    private int losses;
    private String team;

    public Wrestler( String n) {
        this.name = n;
        this.wins = 0;
        this.losses = 0;
    }

    public Wrestler() {
        this.name = "Unammed player";
        this.wins = 0;
        this.losses = 0;
    }

    //name getter and setter functions
    public void setName(String n) {
        this.name = n;
    }

    public String getName() {
        return this.name;
    }

    //wins
    public void setWins(int w) {
        this.wins = w;
    }

    public int getWins() {
        return this.wins;
    }

    //losses
    public void setLosses(int l) {
        this.losses = l;
    }

    public int getLosses() {
        return this.losses;
    }

}
