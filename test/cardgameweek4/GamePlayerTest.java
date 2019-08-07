/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgameweek4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author  Addidas Sheridan 2019
 */
public class GamePlayerTest {
    
    public GamePlayerTest() {
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
     * Test of main method, of class GamePlayer.
     *
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GamePlayer.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
    @Test
    public void testMainGood(){
        
        System.out.println("Testing Name of Player is Good");
        String pass = "Ajit Singh";
        boolean expresult = true;
        boolean result = GamePlayer.check(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testMainBad(){
        System.out.println("Testing Name of Player is Bad");
        String pass = "Ajit S@ngh";
        boolean expresult = true;
        boolean result = GamePlayer.check(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testMainBoundary(){
         System.out.println("Testing Name of Player is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GamePlayer.check(pass);
        assertEquals(expresult,result);   
        
    }
     @Test
    public void testLengthGood(){
        
        System.out.println("Testing length of Name of Player is Good");
        String pass = "Ajit Singh";
        boolean expresult = true;
        boolean result = GamePlayer.checklength(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testLengthBad(){
        System.out.println("Testing length of Name of Player is Bad");
        String pass = "Aj";
        boolean expresult = false;
        boolean result = GamePlayer.checklength(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testLengthBoundary(){
         System.out.println("Testing length of Name of Player is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GamePlayer.checklength(pass);
        assertEquals(expresult,result);   
        
    }
    public void testDigitGood(){
        
        System.out.println("Testing digit of Name of Player is Good");
        String pass = "Ajit Singh";
        boolean expresult = true;
        boolean result = GamePlayer.checkDigit(pass);
        assertEquals(expresult,result);
        
        
    }
    @Test
    public void testDigitBad(){
        System.out.println("Testing digit in Name of Player is Bad");
        String pass = "Ajit S2gh";
        boolean expresult = true;
        boolean result = GamePlayer.checkDigit(pass);
        assertEquals(expresult,result);   
        
    }
    @Test
    public void testDigitBoundary(){
         System.out.println("Testing digit in Name of Player is Boundary");
        String pass = "";
        boolean expresult = false;
        boolean result = GamePlayer.checkDigit(pass);
        assertEquals(expresult,result);   
        
    }
    
}
