
/**
 * 
 * ScoreCard
 * Lydia Fritz
 */
public class ScoreCard {
    private int[] upperSection;
    private int[] lowerSection;

    public ScoreCard() {
        upperSection = new int[6];
        lowerSection = new int[7];
        initializeCards();
    }

    /**
     * displays upper section of
     * score card
     */
    public void showUpperSection() {
        for (int i = 0; i < upperSection.length; i++) {
            System.out.printf("Total of %-14s %-4d%n",
                    Upper.values()[i], upperSection[i]);
        }
    }

    /**
     * displays lower section of 
     * score card
     */
    public void showLowerSection() {
        System.out.printf("%-20s (tot all dice): %-15d%n",
                Lower.values()[0], lowerSection[0]);
        System.out.printf("%-20s (tot all dice): %-15d%n",
                Lower.values()[1], lowerSection[1]);
        System.out.printf("%-20s (25 pts): %8d%n",
                Lower.values()[2], lowerSection[0]);
        System.out.printf("%-20s (30 pts): %8d%n",
                Lower.values()[3], lowerSection[3]);
        System.out.printf("%-20s (40 pts): %8d%n",
                Lower.values()[4], lowerSection[4]);
        System.out.printf("%-20s (50 pts): %8d%n",
                Lower.values()[5], lowerSection[5]);
        System.out.printf("%-20s (tot all dice): %-15d%n",
                Lower.values()[6], lowerSection[6]);
    }

    private void initializeCards() {
        for (int i = 0; i < 6; i++) {
            upperSection[i] = -1;
        }
        for (int i = 0; i < 7; i++) {
            lowerSection[i] = -1;
        }
    }
}

enum Upper {
    ACES, TWOS, THREES, FOURS, FIVES, SIXES;
}

enum Lower {
    THREE_OF_A_KIND, FOUR_OF_A_KIND,
    FULLHOUSE, SMALL_STRAIGHT,
    LARGE_STRAIGT, YAHTZEE, CHANCE;
}