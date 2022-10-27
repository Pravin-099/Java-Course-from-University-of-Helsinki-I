
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Matches> played = new ArrayList<>();
        int count=0;
        int wins=0;
        int losses=0;
        System.out.println("File:");
        String fileName = scan.nextLine();
        
        try(Scanner s = new Scanner(Paths.get(fileName))){
            while(s.hasNextLine()){
                String contains = s.nextLine();
                String values[] = contains.split(",");
                String homeTeam = values[0];
                String visitingTeam = values [1];
                int homeTeamPoints = Integer.valueOf(values[2]);
                int visitingTeamPoints = Integer.valueOf(values[3]);
                played.add(new Matches(homeTeam,visitingTeam,homeTeamPoints,visitingTeamPoints));
                
            }   
            System.out.println("Team:");
            String team = scan.nextLine();
            
            for(Matches matchesPlayed: played){
                if(matchesPlayed.getHomeTeam().equals(team) || matchesPlayed.getVisitingTeam().equals(team)){
                    count++;
                    if(matchesPlayed.getHomeTeam().equals(team)){
                        if(matchesPlayed.getHomeTeamScore() > matchesPlayed.getvisitingTeamScore()){
                            wins++;
                        }
                        else{
                            losses++;
                        }
                    }
                    if(matchesPlayed.getVisitingTeam().equals(team)){
                        if(matchesPlayed.getHomeTeamScore() < matchesPlayed.getvisitingTeamScore()){
                            wins++;
                        }
                        else{
                            losses++;
                        }
                    }
                }
            }
            System.out.println("Games: "+count);
            System.out.println("Wins: "+wins);
            System.out.println("Losses: "+losses);
        }
            
        catch(Exception e){
            System.out.println("Error: "+ e.getMessage());
        }
        

    }

}
