

public class Attributes {  //class to handle attributes  
    int str = 10;          //character created with default 10/0 
    int dex = 10;          //racial bonuses decided later 
    int con = 10;
    int intel = 10;
    int wis = 10;
    int cha = 10;    
    //series of public methods to invoke bonus calculation
    //plan is for methods to call the calc method when
    //bonus is required 
    public int calcStrBonus(){
        int Bonus = (int) Math.floor((str - 10)/2.0);
        return Bonus;
    }

    public int calcDexBonus(){
        int Bonus = (int) Math.floor((dex - 10)/2.0);
        return Bonus;
    }

    public int calcConBonus(){
        int Bonus = (int) Math.floor((con - 10)/2.0);
        return Bonus;
    }

    public int calcIntelBonus(){
        int Bonus = (int) Math.floor((intel - 10)/2.0);
        return Bonus;
    }

    public int calcWisBonus(){
        int Bonus = (int) Math.floor((wis - 10)/2.0);
        return Bonus;
    } 

    public int calcChaBonus(){
        int Bonus = (int) Math.floor((cha - 10)/2.0);
        return Bonus;
    }

}
