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
 * @author anant
 */
public class RankedTeam implements Comparable, Serializable{
    
    private int number;
    private double totalTBP;
    private double totalRP;
    
    
    public RankedTeam(){
        number = 0;
        totalRP = 0;
        totalTBP = 0;
    }
    
    public RankedTeam(int num, double rp, double tbp){
        number = num;
        totalRP = rp;
        totalTBP = tbp;
    }
    
    public void addTBP(double tbp){
        totalTBP += tbp;
    }
    
    public void addRP(double rp){
        totalRP += rp;
    }
    
    public int getNumber() {
        return number;
    }

    public double getTotalTBP() {
        return totalTBP;
    }

    public double getTotalRP() {
        return totalRP;
    }
    @Override
    public int compareTo(Object o){
        
        RankedTeam other = (RankedTeam)o;
        
        if (this.totalRP > other.totalRP) return -1;
        if (this.totalRP < other.totalRP) return 1;
        
        if (this.totalTBP > other.totalTBP) return -1;
        if (this.totalTBP < other.totalTBP) return 1;
        
        if (this.number > other.number) return -1;
        if (this.number < other.number) return 1;
        
        return 1;
    }
}
