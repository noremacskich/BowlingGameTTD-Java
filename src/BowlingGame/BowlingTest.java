package BowlingGame;

import org.junit.Before;
import org.junit.Test;

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
}
