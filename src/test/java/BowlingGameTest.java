import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BowlingGameTest {
    @Test
    void get_score_all_hit() {
        int[] hits = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        int result = BowlingGame.calculateScore(hits);
        assertEquals(300, result);
    }

    @Test
    void get_score_make_up_hit() {
        int[] hits = {1, 9, 3, 4, 10, 2, 4, 2, 8, 10, 8, 1, 9, 1, 0, 1, 10, 10, 10};
        int result = BowlingGame.calculateScore(hits);
        assertEquals(131, result);
    }

    @Test
    void get_score_not_hit() {
        int[] hits = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int result = BowlingGame.calculateScore(hits);
        assertEquals(0, result);
    }

}
