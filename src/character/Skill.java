/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

/**
 *
 * @author Daniel
 */
public class Skill {
    private double strength;
    private double agility;
    private double intelligence;
    private double level;
    private double resistance;
    private double dexterity;
    
    
    public Skill() {
    strength = 1;
    agility = 1;
    intelligence = 1;
    resistance = 1;
    dexterity = 1;
    level = 1;         
}
    
    public double getLevel(){
        return(level);
    }
    public double getStrength(){
        return(strength);
    }
    public double getAgility(){
        return(agility);
    }
    public double getIntelligence(){
        return(intelligence);
    }
    public double getResistance(){
        return(resistance);
    }
    public double getDexterity(){
        return(dexterity);
    }
    public double addLevel(){
        level += 1;
        return(level);
    }
    public double addStrength(){
        strength += 1;
        return(strength);
    }
    public double addAgility(){
        agility += 1;
        return(agility);
    }
    public double addIntelligence(){
        intelligence += 1;
        return(intelligence);
    }
    public double addResistance(){
        resistance += 1;
        return(resistance);
    }
    public double addDexterity(){
        dexterity += 1;
        return(dexterity);
    }
}
