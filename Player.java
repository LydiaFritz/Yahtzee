/**
 * 
 * Player
 * Lydia Fritz
 */

public class Player {
    final int NUMDICE = 6;
    private Dice[] dice = new Dice[NUMDICE];
    private String playerName;
    

    /**
     * create a player, set playerName to
     * 
     * @param name
     *             initialize player's dice
     */
    public Player(String name) {
        playerName = name;
        getDice();
    }

    public String getName(){ return playerName; }

    /**
     * rolls all the player's dice
     */
    public void roll() {
        for (int i = 0; i < NUMDICE; i++) {
            dice[i].roll();
        }
    }

    public int getScore(){
        int score = 0;
        for(Dice d : dice){
            score += d.getFaceValue();
        }
        return score;
    }

    @Override
    public String toString() {
        String str = String.format("%s%n%s %s %s %s %s %s%n",
                this.playerName, dice[0], dice[1], dice[2], dice[3], dice[4], dice[5]);
        return str;
    }

    private void getDice() {
        for (int i = 0; i < NUMDICE; i++) {
            dice[i] = new Dice();
        }
    }
}