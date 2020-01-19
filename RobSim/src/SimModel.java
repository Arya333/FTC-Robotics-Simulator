
import java.io.Serializable;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anantula_927978
 */
public class SimModel implements Serializable{
    
    private TreeMap<Integer, Team> teams;
    private TreeSet<Match> matches;
    private TreeMap<Integer, Double> opr; 
    private TreeSet<Team> rankedTeams;
    private ArrayList<Simulation> simulations;
    private TreeSet<RankedTeam> rankedTeams2;

    public SimModel(TreeMap<Integer, Team> teams, TreeSet<Match> matches, TreeMap<Integer, Double> opr, TreeSet<Team> rankedTeams, ArrayList<Simulation> simulations, TreeSet<RankedTeam> rankedTeams2) {
        this.teams = teams;
        this.matches = matches;
        this.opr = opr;
        this.rankedTeams = rankedTeams;
        this.simulations = simulations;
        this.rankedTeams2 = rankedTeams2;
    }

    public TreeMap<Integer, Team> getTeams() {
        return teams;
    }

    public TreeSet<Match> getMatches() {
        return matches;
    }

    public TreeMap<Integer, Double> getOpr() {
        return opr;
    }

    public TreeSet<Team> getRankedTeams() {
        return rankedTeams;
    }
    
    public ArrayList<Simulation> getSimulations(){
        return simulations;
    }
    
    public TreeSet<RankedTeam> getRankedTeams2(){
        return rankedTeams2;
    }
    
}
