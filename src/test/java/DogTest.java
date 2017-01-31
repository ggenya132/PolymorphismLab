import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;


public class DogTest {

Dog dog;
@Before
public void setUp(){ dog = new Dog();}

@Test
public void speakTest(){
    String expected = " ";
    String actual = " ";
    dog.speak();
    assertEquals("I expect the dog to print 'Woof woof", expected, actual);


}
}