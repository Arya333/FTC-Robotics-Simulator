
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anantula_927978
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tests the functionality of the ScoreMaker Class
        
        //adds scores manually
        ArrayList<Integer> scores = new ArrayList();
        scores.add(150);
        scores.add(200);
        scores.add(175);
        scores.add(183);
        scores.add(100);
        scores.add(210);
        scores.add(75);
        scores.add(125);
        scores.add(180);
        scores.add(190);
        
        //gets standard deviation and randomly generated score based on opr and std
        double std = ScoreMaker.getSTD(scores);
        double opr = 160.0;
        int score = ScoreMaker.getScore(opr, std);
        
        System.out.println(std + " : " + opr + " : " + score);
    }
    
}
