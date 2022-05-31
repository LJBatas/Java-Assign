package Fractions;


/**
 * Stores 2 fractions.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FracStorage
{
    private int Num1;
    private int Den1;
    private int Num2;
    private int Den2;
    private int FracNum;
    private int FracDen;
    private int holder;
    private int Frac1int;
    private int Frac2int;
    
    //setters
    public void setNum1(int newNum1){
     Num1 = newNum1;
    }
    
    public void setDen1(int newDen1){
        if(newDen1 != 0){
     Den1 = newDen1;
    }
    }
    
    public void setNum2(int newNum2){
     Num2 = newNum2;
    }
    
    public void setDen2(int newDen2){
        if(newDen2 != 0){
     Den2 = newDen2;
    }
    }
    
    //setters operations and actions
    public void addFrac(){
    FracNum = Num1 + Num2;
    FracDen = Den1 + Den2;
    }
    
    public void subFrac(){
    FracNum = Num1 - Num2;
    FracDen = Den1 - Den2;
    }
    
    public void mulFrac(){
    FracNum = Num1 * Num2;
    FracDen = Den1 * Den2;
    }
    
    public void divFrac(){
    holder = Den1;
    Den1 = Den2;
    Den2 = holder;
    FracNum = Num1 * Num2;
    FracDen = Den1 * Den2;
    }
    
    public int compareTo(){
    Frac1int = Num1 / Den1;
    Frac2int = Num2 / Den2;
    if( Frac1int > Frac2int)
     return 1;
    else if(Frac1int < Frac2int)
     return -1;
    else 
    return 0;
    }
    
    public String toString(){
    return Num1 + " / " + Den1 + " " + Num2 + " / " + Den2;
    }
    
    //getters
    public int getNum1(){
    return Num1;
    }
    
    public int getDen1(){
    return Den1;
    }
    
     public int getNum2(){
    return Num2;
    }
    
    public int getDen2(){
    return Den2;
    }
    
    public int getFracNum(){
    return FracNum;
    }
    
    public int getFracDen(){
    return FracDen;
    }
}   
