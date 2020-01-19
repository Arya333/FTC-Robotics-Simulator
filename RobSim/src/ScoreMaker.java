
import java.util.ArrayList;
import java.util.Collection;
import org.apache.commons.math3.special.Erf;
import org.apache.commons.math3.stat.descriptive.moment.StandardDeviation;

/*
 * ScoreMaker.class
 * Utility class used to calculate performance scores based on a team's historical
 * data. Will use the historical data to generate Standard Deviation to calculate
 * random scores using statistical zscores on a normal distribution.
 */

/**
 *
 * @author Anantula_927978
 */
public class ScoreMaker {
    
    public static double getAverage(ArrayList<Integer> scores) {
        // return the avg of the scores list
        double sum = 0;
        double avg = 0;
        for (int i = 0; i < scores.size(); i++){
            sum += scores.get(i);
        }
        avg = sum / scores.size();
        return avg;
    }
    
    public static double getSTD(Collection<Integer> scores) {
        // return the standard deviation of the list
        StandardDeviation std = new StandardDeviation();
        
        //convert scores ArrayList<Integer> into double array for the
        // StandardDeviation.evaluate(double[]) method
        
        double[] values = new double[scores.size()];
        int i = 0;
        for (Object o : scores){
            double value = (Integer)o;
            values[i] = value;
            i++;
        }
        
        return std.evaluate(values);
    }
    
    public static int getScore(double mean, double std){
        
        // returns a randomized score on a normal distr of historical scores.
        // score = z-score * STD + mean
        // z-score = SquareRoot(2) * (InverseErrorFunction of 2*Percentile) * -1
        // percentile = random value btwn 0 and 1
        // STD = standardDeviation(historicalScores) / 2
        // For our calculations, uses OPR to reflect contribution of one team
        // instead of the score avg which reflects 2 teams
        
        double percentile = Math.random();
        
        double zScore = Math.sqrt(2) * Erf.erfcInv(2*percentile) * -1;
        
        int score = new Double(zScore*std/2 + mean).intValue();
        
        return score;
    }
    
    
}
