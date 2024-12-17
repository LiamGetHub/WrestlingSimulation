package src.main;

public class Wrestler {
    private String name;
    private int seed;  // Ranking or seed for the tournament
    private int strength;  // Arbitrary stat for determining match outcomes
    private String specialty;  // Optional, e.g., "High Flyer", "Powerhouse"

    public Wrestler(String name, int seed, int strength, String specialty) {
        this.name = name;
        this.seed = seed;
        this.strength = strength;
        this.specialty = specialty;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public int getSeed() {
        return seed;
    }

    public int getStrength() {
        return strength;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return name + " (Seed " + seed + ")";
    }
}
