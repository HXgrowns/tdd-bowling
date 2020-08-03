public class BowlingGame {

    public static int calculateScore(int[] hits) {
        int score = 0;
        int frame = 0;

        for (int i = 0; i < hits.length; i++) {
            if(hits[i] == 10) {
                score += hits[i] + hits[i+1] + hits[i+2];
            } else if (hits[i] + hits[i+1] == 10) {
                score += hits[i] + hits[i+1] + hits[i+2];
                i++;
            } else {
                score += hits[i] + hits[i+1];
                i++;
            }

            if(++frame == 10) {
                break;
            }
        }

        return score;
    }
}
