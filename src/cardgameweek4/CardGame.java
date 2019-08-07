/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

/**
 *
 * @author  Addidas Sheridan 2019
 */
public class CardGame extends Card {
    
    public CardGame(int s, int gVal)
    {
        super(s,gVal);
    }
    
    @Override
    public String toString(){
    //combine rank and suit together into a single string(ex: Ace of Diamonds)

        //suing StringBuilder 
        StringBuilder display = new StringBuilder();
        
        //personal choice to use switch
        switch(super.getValue()){
            //since rank is int type, now match int 11 to String jack...14 to Ace
            case 11:
                display.append("Jack");
                break;
            case 12:
                display.append("Queen");
                break;
            case 13:
                display.append("King");
                break;
            case 14:
                display.append("Ace");
                break;    
            default:
                display.append(super.getValue()); // does not need to modify
                break;
        }//end rank switch
        
        display.append(" of "); // the format of the output
        
        switch(super.getSuit()){
            case 0:
                display.append("Spades");
                break;
            case 1:
                display.append("Hearts");
                break;
            case 2:
                display.append("Clubs");
                break;
            case 3:
                display.append("Diamonds");
                break;
            default: 
                break;
        }//end suit switch
        
        // result of an entire cmombined string
        return display.toString();
    }//end toString
}
