/**
 * Created by eugenevendensky on 1/31/17.
 */

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
public class BirdTest {

    Bird bird;
    @Before
    public void setUp() { bird = new Bird();}
    @Test
    public void speakTest(){
        String expected =  " ";
        String actual = " ";
        bird.speak();
        assertEquals("I expect the bird to squak", expected, actual);


    }


}
