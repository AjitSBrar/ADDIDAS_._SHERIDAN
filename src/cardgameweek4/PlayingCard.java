
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author  Addidas Sheridan 2019
 */
public  class PlayingCard  extends GamePlayer{
    
    public void cardplay(LinkedList<Card> deckCPU,LinkedList<Card> deckP1,String player1)
    {
        int size = deckCPU.size();
        int size1 = deckP1.size();
        boolean res = false;
         res = checkShuffle(size,size1);
         if(res)
         {
      
             System.out.println("Error: The size of the shuffled deck between players are not equal.");
       
         }
         else
         {
             System.out.println("<<<<<  Game Begins >>>>> ");
             System.out.println("                   ");
             System.out.println("-.-..-.-..-.-.-.-..-.-..-.-..-.-.-..-..-.-");
              while(true){
            Card p1Card = deckCPU.pop();  //each player place one card face up
            Card p2Card = deckP1.pop();
            
            //display the face up card
            
            System.out.println(player1 + " plays card is " + p1Card.toString());
            System.out.println("Computer plays card is " + p2Card.toString());
            
            System.out.println("                                    ");
            
            
            //rank comparation between two cards
            if(p1Card.getValue() > p2Card.getValue()){//if player 1 win 
                deckCPU.addLast(p1Card);  //higher value wins both cards and 
                deckCPU.addLast(p2Card);  //places them at the bottom of his deck.
                System.out.println(player1 + " wins the round");
                System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
            }//end if
 
            else if(p1Card.getValue() < p2Card.getValue()){//if player 2 win 
                deckP1.addLast(p1Card);   
                deckP1.addLast(p2Card);  
                System.out.println("Computer wins the round");
                System.out.println("-.-.-..-.-.-.-.-.-.-..-.-.-.-.-..-.-.-..--.-.-.");
            }//end else if
            
            else { //war happens when both cards' value matched
                System.out.println("   <<<<<<<<<   War    >>>>>>>>>");
                System.out.println("                   ");
                
                //creating war cards
                List<Card> war1 = new ArrayList<Card>(); 
                List<Card> war2 = new ArrayList<Card>();
                
                //checking do players have enough (4)cards 
                for(int x=0; x<3; x++){ 
                    //either one player runs out of card is game over
                    if(deckCPU.size() == 0 || deckP1.size() == 0 ){                      
                        break;
                    }//end if
                    
                    System.out.println("War card for " + player1 + "is xx\nWar card for Computer is xx");

                    war1.add(deckCPU.pop());  //place additional card for war
                    war2.add(deckP1.pop());                  
                }//end for
                
                //only compare result when both players have enough cards for war
                
                if(war1.size() == 3 && war2.size() == 3 ){
                    //display the war cards from each player
                    System.out.println("-.-.-.-..-.-.-.-.-.-..-.-.-.-..-.-..-.-.-.");
                    System.out.println("                   ");
                    System.out.println(" <<<<<<< War Time: >>>>>>>");
                    System.out.println("                   ");
                     System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
                    System.out.println("War card for " +player1 +"  is " + war1.get(0).toString());
                    System.out.println("War card for Computer is " + war2.get(0).toString());
                    
                    //if player 1 wins the war round
                    if(war1.get(2).getValue() > war2.get(2).getValue()){
                        deckCPU.addAll(war1); //player1 get all 10 cards
                        deckCPU.addAll(war2);
                        System.out.println(player1 + " wins the war round");
                         System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
                    }//end if
                    //otherwise player 2 wins the war round
                    else{
                        deckP1.addAll(war1); //player2 get all 10 cards
                        deckP1.addAll(war2);
                        System.out.println("Computer wins the war round");
                        System.out.println("                   ");
                         System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
                    }//end else                      
                }//end if
                
            }//end war round else
            
            //game over either one player runs out of card(deck size is 0)
            if(deckCPU.size() == 0 ){
                System.out.println("game over\n" + player1 + " wins the game");
                 System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
                break;
            }
            else if(deckP1.size() == 0){
                System.out.println("game over\n Computer wins the game");
                 System.out.println("-.-.--.-.-.--.-.-.--.-.-.--.-.-.-.--.-.-.--.-.-");
                break;
            }
           
        }//end while 
         }
        
    }
    public static boolean checkShuffle(int size,int size1)
    {
        if(size == 25 && size1 == 25)
        {
            return true;
        }
        return false;
    }
}
    
    

