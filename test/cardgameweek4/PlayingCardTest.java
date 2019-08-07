/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

import java.util.LinkedList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ajits
 */
public class PlayingCardTest {
    
    public PlayingCardTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cardplay method, of class PlayingCard.
     
    @Test
    public void testCardplay() {
        System.out.println("cardplay");
        LinkedList<Card> deckCPU = null;
        LinkedList<Card> deckP1 = null;
        String player1 = "";
        PlayingCard instance = new PlayingCard();
        instance.cardplay(deckCPU, deckP1, player1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    * */
    @Test
    public void testShuffleGood()
    {
        System.out.println("Testing size of shuffle cards is Good");
        int size =25;
        int size1 = 25;
        boolean expresult = true;
        boolean result = PlayingCard.checkShuffle(size,size1);
        assertEquals(expresult,result);   
         
    }
    @Test
     public void testShuffleBad()
    {
         System.out.println("Testing size of shuffle cards is Bad");
        int size = 24;
        int size1 = 24;
        boolean expresult = false;
        boolean result = PlayingCard.checkShuffle(size,size1);
        assertEquals(expresult,result);   
        
    }
     @Test
      public void testShuffleBoundary()
    {
         System.out.println("Testing size of shuffle cards is Boundary");
          int size = 0;
        int size1 = 0;
        boolean expresult = false;
        boolean result = PlayingCard.checkShuffle(size,size1);
        assertEquals(expresult,result);   
        
    }
    
    
}
