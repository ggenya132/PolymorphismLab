import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by eugenevendensky on 1/31/17.
 */
public class CatTest {


    Cat cat;
    @Before
    public void setUp(){ cat = new Cat();}

    @Test
    public void speakTest(){
        String expected = " ";
        String actual = " ";
        cat.speak();
        assertEquals("I expect the cat to print 'Meoww", expected, actual);


    }
}

