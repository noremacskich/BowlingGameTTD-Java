package BowlingGame;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    @Test
    public void canRoll() throws Exception{
        g.roll(0);
    }

    @Test
    public void gutterGame() throws Exception{
        for(int i=0; i<10; i++){
            g.roll(0);
        }
        assertEquals(0, g.score());
    }
}
