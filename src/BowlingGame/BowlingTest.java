package BowlingGame;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BowlingTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    private void RollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Test
    public void gutterGame() throws Exception{
        rollMany(20, 0);
        int expectedScore = 0;
        assertEquals(expectedScore, g.score());
    }

    @Test
    public void allOnes() throws Exception{
        rollMany(20, 1);
        assertEquals(20, g.score());
    }

    @Test
    public void oneSpare() throws Exception{
        RollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }

}
