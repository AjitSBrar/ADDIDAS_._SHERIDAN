package cardgameweek4;
/**
 * Starter code for the Card class.
 * 
 * @author Addidas Sheridan 2019
 */
public class Card {
    
    private int value; //initialize the rank (2,3,4...King, Ace)
    private int suit; //initialize the suit (spades, hearts...)
    
    //constructor
    public Card(int s, int gVal){
        value = gVal;
        suit = s;
    }//end construcor
    
    //getter method
    public int getValue(){
        return value; 
    }//end getCard
    
    //setter method
    public void setValue(int gVal){
        value = gVal;
    }//end setValue

    /**
     * @return the suit
     */
    public int getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(int suit) {
        this.suit = suit;
    }
}//end Card Class 
