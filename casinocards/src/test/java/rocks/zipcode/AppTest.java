package rocks.zipcode;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void testDeck() {
        ArrayList<Card> d = Deck.newDeck();
		Collections.sort(d);
		
		for(Card c : d){
			System.out.println(c);
		}
    
        Collections.shuffle(d);
        System.out.println("Shuffled");
        for(Card c : d){
			System.out.println(c);
		}
        assertTrue(true);
    }
}
