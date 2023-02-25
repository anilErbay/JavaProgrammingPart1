package filesAndReadingData;

import java.nio.file.Paths;
import java.util.Scanner;

public class SportsStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // file name ?
        System.out.println("File:");
        String fileName = scanner.nextLine();

        // team name ?
        System.out.println("Team:");
        String teamName = scanner.nextLine();


        // reading file and selection part
        int games = 0;
        int wins = 0;
        int losses = 0;
        try (Scanner input = new Scanner(Paths.get(fileName))) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String[] parts = line.split(",");

                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeScore = Integer.parseInt(parts[2]);
                int awayScore = Integer.parseInt(parts[3]);

                if (teamName.equals(homeTeam)) {
                    if (homeScore > awayScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                } else if (teamName.equals(awayTeam)) {
                    if (awayScore > homeScore) {
                        wins++;
                    } else {
                        losses++;
                    }
                    games++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}
