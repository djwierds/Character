/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package character;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Character {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int account, choice;
        int choiced, choiceb, choicem;
        String again = "Yes";
        
        Skill daniel = new Skill();
        Skill batterink = new Skill();
        Skill matt = new Skill();
        
        
        while(again.equalsIgnoreCase("Yes")){
            System.out.println("What account would you like to select? \n1. Daniel \n2. Batterink \n3. Matt");    
            account = input.nextInt();
            
            
            while(account == 1){
                System.out.println("\nWelcome Daniel");
                
                System.out.println("1.See Skills 2.Add Level 0.Quit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                
                if(choice == 1){
                    System.out.println("Level: " + daniel.getLevel() + "\nStrength level: " + daniel.getStrength() + "\nAgility level: " + daniel.getAgility() + "\nIntelligence level: " + daniel.getIntelligence() + "\nResistance level: " + daniel.getResistance() + "\nDexterity level: " + daniel.getDexterity());
                } else if(choice == 2){
                    daniel.addLevel();
                    System.out.println("Your level is: " + daniel.getLevel());
                    
                    
                    System.out.println("Would you like to: \n1.Add Strength \n2.Add Agility \n3.Add Intelligence \n4.Add Resistance \n5.Add Dexterity");
                    choiced = input.nextInt();
                    
                    if(choiced == 1){
                        System.out.println("Your strength level is: " + daniel.addStrength());
                    } else if(choiced == 2){
                        System.out.println("Your agility level is: " + daniel.addAgility());
                    } else if(choiced == 3){
                        System.out.println("Your intelligence level is: " + daniel.addIntelligence());
                    } else if(choiced == 4){
                        System.out.println("Your resistance level is: " + daniel.addResistance());
                    } else if(choiced == 5){
                        System.out.println("Your dexterity level is: " + daniel.addDexterity());
                    }
                } else if(choice == 0){
                    account = 0;
                }
            }
            while(account == 2){
                System.out.println("\nWelcome Batterink");
                
                System.out.println("1.See Skills 2.Add Level 0.Quit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                
                if(choice == 1){
                    System.out.println("Level: " + batterink.getLevel() + "\nStrength level: " + batterink.getStrength() + "\nAgility level: " + batterink.getAgility() + "\nIntelligence level: " + batterink.getIntelligence() + "\nResistance level: " + batterink.getResistance() + "\nDexterity level: " + batterink.getDexterity());
                } else if(choice == 2){
                    daniel.addLevel();
                    System.out.println("Your level is: " + batterink.getLevel());
                    
                    
                    System.out.println("Would you like to: \n1.Add Strength \n2.Add Agility \n3.Add Intelligence \n4.Add Resistance \n5.Add Dexterity");
                    choiceb = input.nextInt();
                    
                    if(choiceb == 1){
                        System.out.println("Your strength level is: " + batterink.addStrength());
                    } else if(choiceb == 2){
                        System.out.println("Your agility level is: " + batterink.addAgility());
                    } else if(choiceb == 3){
                        System.out.println("Your intelligence level is: " + batterink.addIntelligence());
                    } else if(choiceb == 4){
                        System.out.println("Your resistance level is: " + batterink.addResistance());
                    } else if(choiceb == 5){
                        System.out.println("Your dexterity level is: " + batterink.addDexterity());
                    }
                } else if(choice == 0){
                    account = 0;
                }
            }
            while(account == 3){
                System.out.println("\nWelcome Matt");
                
                System.out.println("1.See Skills 2.Add Level 0.Quit");
                System.out.println("Enter your choice: ");
                choice = input.nextInt();
                
                if(choice == 1){
                    System.out.println("Level: " + matt.getLevel() + "\nStrength level: " + matt.getStrength() + "\nAgility level: " + matt.getAgility() + "\nIntelligence level: " + matt.getIntelligence() + "\nResistance level: " + matt.getResistance() + "\nDexterity level: " + matt.getDexterity());
                } else if(choice == 2){
                    daniel.addLevel();
                    System.out.println("Your level is: " + matt.getLevel());
                    
                    
                    System.out.println("Would you like to: \n1.Add Strength \n2.Add Agility \n3.Add Intelligence \n4.Add Resistance \n5.Add Dexterity");
                    choicem = input.nextInt();
                    
                    if(choicem == 1){
                        System.out.println("Your strength level is: " + matt.addStrength());
                    } else if(choicem == 2){
                        System.out.println("Your agility level is: " + matt.addAgility());
                    } else if(choicem == 3){
                        System.out.println("Your intelligence level is: " + matt.addIntelligence());
                    } else if(choicem == 4){
                        System.out.println("Your resistance level is: " + matt.addResistance());
                    } else if(choicem == 5){
                        System.out.println("Your dexterity level is: " + matt.addDexterity());
                    }
                } else if(choice == 0){
                    account = 0;
                }
            }
        }
        // TODO code application logic here
    }
}
