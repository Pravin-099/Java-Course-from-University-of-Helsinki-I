/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class Matches {
    private String homeTeam;
    private String visitingTeam;
    private int homeTeamScore;
    private int visitingTeamScore;
    
    public Matches(String homeTeam, String visitingTeam, int homeTeamScore, int visitingTeamScore){
        this.homeTeam =homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamScore = homeTeamScore;
        this.visitingTeamScore = visitingTeamScore;
    }
    
    public String getHomeTeam(){
        return homeTeam;
    }
    
    public String getVisitingTeam(){
        return visitingTeam;
    }
    
    public int getHomeTeamScore(){
        return homeTeamScore;
    }
    
    public int getvisitingTeamScore(){
        return visitingTeamScore;
    }
    
}
