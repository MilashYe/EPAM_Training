package Model;

import junit.extensions.RepeatedTest;
import org.junit.*;


public class ModelTest extends Assert {

    private static Model model;

    @BeforeClass
    public static void init() {
        model = new Model();
    }

    /*
    * Run this test only if you change method for randomize numbers
    * */
    @Ignore
    @Test
    public void rand() {


        int ONE = 0;
        int NINETY_NINE = 0;

        for ( int i = 0; i < 200000 ; i++ ) {
            model.rand();
            if ( model.getGuessNumber() == 1 ) {
                ONE = 1;
            }
            if ( model.getGuessNumber() == 99 ) {
                NINETY_NINE = 99;
            }
            if ( model.getGuessNumber() <= 0 | model.getGuessNumber() >= 100 ) {
                Assert.fail();
            }


        }
        assertEquals(1, ONE);
        assertEquals(99,NINETY_NINE);

    }



    @Test
    public void checkAnswer() {
        model.rand();
        int result = model.getGuessNumber();

        assertEquals(result, model.getGuessNumber());
        assertNotEquals(5000, result);


    }


}