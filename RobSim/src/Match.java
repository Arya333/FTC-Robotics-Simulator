
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
class Match implements Comparable, Serializable{
    
    //instance variables
    private String name;
    private int red1;
    private int red2;
    private int blue1;
    private int blue2;
    private int redScore;
    private int blueScore;
    private boolean[] surrogates = {false, false, false, false};
    
    //constructor sets values to variables
    public Match(){
        name = "";
        red1 = 0;
        red2 = 0;
        blue1 = 0;
        blue2 = 0;
        redScore = 0;
        blueScore = 0;
    }
	
	//parameter constructor takes in all variables as parameters
    public Match(String name, int red1, int red2, int blue1, int blue2, boolean[] array) {
        this.name = name;
        this.red1 = red1;
        this.red2 = red2;
        this.blue1 = blue1;
        this.blue2 = blue2;
        surrogates = array;
        redScore = 0;
        blueScore = 0;
    }

	//return name of match
    public String getName() {
        return name;
    }

    public int getRed1() {
        return red1;
    }

    public int getRed2() {
        return red2;
    }

    public int getBlue1() {
        return blue1;
    }

    public int getBlue2() {
        return blue2;
    }

    public int getRedScore() {
        return redScore;
    }

    public int getBlueScore() {
        return blueScore;
    }

    public boolean[] getSurrogates() {
        return surrogates;
    }

    public void setRedScore(int redScore) {
        this.redScore = redScore;
    }

    public void setBlueScore(int blueScore) {
        this.blueScore = blueScore;
    }
    
    
    //returns red and blue scores and red and blue teams for the match
    @Override
    public String toString(){
        return name + " : " + redScore + " (" + red1 + " " + red2 + "), " + blueScore + " (" + blue1 + " " + blue2 + ")";
    }
	
    //compares matches based on the last digit of the string name
    @Override
    public int compareTo(Object o) {
        Match otherMatch = (Match)o;
        
        int thisMatchNum = Integer.parseInt(name.substring(this.name.indexOf(" ")+1));
        int otherMatchNum = Integer.parseInt(otherMatch.name.substring(otherMatch.name.indexOf(" ")+1));
        if (thisMatchNum > otherMatchNum){
            return 1;
        }
        if (otherMatchNum > thisMatchNum){
            return -1;
        }
        return 0;
    }
    
    

    
}
