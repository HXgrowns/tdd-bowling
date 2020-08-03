import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void calculate_hit_not_10_score() {
        int firstHit = 3;
        int secondHit = 3;
        int expected = Bowling.calculate(firstHit, secondHit);
        assertEquals(6,expected);
    }

}
