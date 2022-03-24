import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String fileName, teamName;
        String current, parts[];
        int games = 0, wins = 0, losses = 0;
        
        System.out.println("File:");
        fileName = scan.nextLine();
        System.out.println("Team:");
        teamName = scan.nextLine();
        
        try (Scanner fileData = new Scanner(Paths.get(fileName))) {
            while (fileData.hasNextLine()) {
                current = fileData.nextLine();
                if(!current.equals("")) {
                    parts = current.split(",");
                    
                    if (parts[0].equals(teamName)) {
                        games++;
                        if (Integer.valueOf(parts[2]) > Integer.valueOf(parts[3])) {
                            wins++;
                        } else {
                            losses++;
                        }
                    } else if (parts[1].equals(teamName)) {
                        games++;
                        if (Integer.valueOf(parts[3]) > Integer.valueOf(parts[2])) {
                            wins++;
                        } else {
                            losses++;
                        }
                    }
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
