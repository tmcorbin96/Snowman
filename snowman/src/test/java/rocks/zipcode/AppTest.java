package rocks.zipcode;

import static org.junit.Assert.assertTrue;

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
        Complier complier = new Compiler();
        String input = "(print {divide 12 3))";
        System.out.println(";; Input: " +input);
        System.out.println(output);
        assertTrue( true );
    }
}
