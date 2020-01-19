
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
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
public class Team implements Comparable, Serializable{
    
    //instance variables
    private String name;
    private int number;
    private double rp;
    private double tbp;
    
    private ArrayList<Integer> scores;
    

    private ArrayList<Integer> scores_simulated;
    private TreeSet<Integer> matchNumbers;

	//constructor for variables
    public Team() {
        
        name = "";
        number = 0;
        rp = 0.0;
        tbp = 0.0;

        scores = new ArrayList<>();

        scores_simulated = new ArrayList<>();
        matchNumbers = new TreeSet<>();
    }

	//parameter constructor with name, number, and scores as inputs
    public Team(String name, int number, ArrayList<Integer> scores) {
        this.name = name;
        this.number = number;
        this.scores = scores;
        
        rp = 0.0;
        tbp = 0.0;
        
        scores_simulated = new ArrayList<>();
        matchNumbers = new TreeSet<>();
    }


	//getters and setters for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getRp() {
        return rp;
    }

    public void setRp(double rp) {
        this.rp = rp;
    }

    public double getTbp() {
        return tbp;
    }

    public void setTbp(double tbp) {
        this.tbp = tbp;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public ArrayList<Integer> getScores_simulated() {
        return scores_simulated;
    }

    public void setScores_simulated(ArrayList<Integer> scores_simulated) {
        this.scores_simulated = scores_simulated;
    }
    
    public TreeSet<Integer> getMatchNumbers() {
        return matchNumbers;
    }

    public void setMatchNumbers(TreeSet<Integer> matchNumbers) {
        this.matchNumbers = matchNumbers;
    }
    
    public void addMatchNum(int num){
        matchNumbers.add(num);
    }

	//returns number, name, and scores of the team
    @Override
    public String toString() {
        
        String text = "";
        
        text += number + " - " + name + ", RP/TBP " + rp + "/" + tbp + "\n" +
                "\t Historical Scores: " + scores + "\n" + 
                "\t Simulated Scores: " + scores_simulated + "\n" +
                "\t Match Numbers: " + matchNumbers;
        return text;
    }

    @Override
    public int compareTo(Object o) {
        // Compares the teams based on the following criteria
        // RP - ranking points
        // TBP - Tie Break Points
        // High Score - based on simulated scores
        // Average Score - based on simulated scores
        // Team Number
        
        Team other = (Team)o;
        
        if (this.rp > other.rp) return -1;
        if (this.rp < other.rp) return 1;
        
        if (this.tbp > other.tbp) return -1;
        if (this.tbp < other.tbp) return 1;
        
        Collections.sort(this.scores_simulated);
        Collections.sort(other.scores_simulated);
        
        int thisHighScore = this.scores_simulated.get(this.scores_simulated.size()-1);
        int otherHighScore = other.scores_simulated.get(other.scores_simulated.size()-1);

        if (thisHighScore > otherHighScore) return -1;
        if (thisHighScore < otherHighScore) return 1;
        
        double thisAverageScore = ScoreMaker.getAverage(this.scores_simulated);
        double otherAverageScore = ScoreMaker.getAverage(other.scores_simulated);
        
        if (thisAverageScore > otherAverageScore) return -1;
        if (thisAverageScore < otherAverageScore) return 1;
        
        if (this.number > other.number) return -1;
        if (this.number < other.number) return 1;
        
        return 1;
    }
    
    
    
    
    
}
