/**
 * 
 * YahtzeePlayer
 * Lydia Fritz
 */

public class YahtzeePlayer extends Player{
    
    private ScoreCard scoreCard;

    public YahtzeePlayer(String n){
        //initialize the Player name
        super(n);
        //initialize the scoreCard
        scoreCard = new ScoreCard();
    }

    public void showScoreCard(){
        System.out.printf("Upper Section for %s%n", this.getName());
        this.scoreCard.showUpperSection();
        System.out.printf("%nLower Section for %s%n", this.getName());
        this.scoreCard.showLowerSection();
    }
    
}
