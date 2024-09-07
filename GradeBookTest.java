import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GradeBookTest {
    private GradeBook g1;
    private GradeBook g2;
    @BeforeEach
    // Here we create the grades for testing
    void setUp() {
        g1 = new GradeBook(5);
        g1.addScore(50);
        g1.addScore(75);
        g2 = new GradeBook(5);
        g2.addScore(88);
        g2.addScore(79);
        g2.addScore(91);

    }

    @AfterEach
    // This is to be applied after the test is done
    void tearDown() {
        g1 = null;
        g2 = null;
    }

    @Test
    void addScore() {
        assertTrue(g1.toString().equals("50.0 75.0 "));
        assertTrue(g2.toString().equals("88.0 79.0 91.0 "));


    }

    @Test
    void sum() {
        assertEquals(125,g1.sum(),0.0001);
        assertEquals(258,g2.sum(),0.0001);
    }

    @Test
    void minimum() {
        assertEquals(50,g1.minimum(),.001);
        assertEquals(79,g2.minimum(),0.0001);
    }

    @Test
    void getScoresSize() {
        assertEquals(2,g1.getScoresSize());
        assertEquals(3,g2.getScoresSize());
    }
}