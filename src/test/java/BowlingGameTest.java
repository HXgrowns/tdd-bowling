import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void get_score_all_hit() {
        int[] hits = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int result = BowlingGame.calculateScore(hits);
        assertEquals(300, result);
    }
}
