package src.main;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Wrestler> wrestlers = FileManager.loadWrestlersFromCSV("reasources/wrestlers.csv");
        Tournament tournament = new Tournament(wrestlers);
        tournament.start();
    }
}
