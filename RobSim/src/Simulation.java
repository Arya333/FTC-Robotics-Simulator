
import java.util.TreeSet;
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anantula_927978
 */
public class Simulation implements Serializable{
    
    private TreeSet<Team> rankedTeams;
    private TreeSet<Match> matches;
    
    public Simulation(){
        rankedTeams = new TreeSet<>();
        matches = new TreeSet<>();      
    }
    
    public Simulation(TreeSet rankedTeams, TreeSet matches){
        this.rankedTeams = rankedTeams;
        this.matches = matches;
    }

    public TreeSet<Team> getRankedTeams() {
        return rankedTeams;
    }

    public void setRankedTeams(TreeSet<Team> rankedTeams) {
        this.rankedTeams = rankedTeams;
    }

    public TreeSet<Match> getMatches() {
        return matches;
    }

    public void setMatches(TreeSet<Match> matches) {
        this.matches = matches;
    }
    
    
}
