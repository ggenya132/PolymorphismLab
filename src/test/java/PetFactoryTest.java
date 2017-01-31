import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by eugenevendensky on 1/31/17.
 */
public class PetFactoryTest {

    PetFactory petFactory;
    @Before
    public void setUp(){ petFactory = new PetFactory();}
    @Test
    public void getPetTest(){
        petFactory.makePet("Cat", 1);
        int actual = petFactory.petCollection.pets.size();
        int expected = 4;
        petFactory.petCollection.pets.get(0).setPetName("Derp");
        System.out.print(petFactory.petCollection.pets.get(0).getName());
        assertEquals(expected, actual);

    }
}
