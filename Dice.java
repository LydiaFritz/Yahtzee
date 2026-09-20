/**
 * 
 * Dice class
 * Lydia Fritz
 */

public class Dice {

    private int faceValue;

    /**
     * initialize faceValue to -1
     */
    public Dice(){
        faceValue = -1;
    }
    /**
     * set the faceValue to a random
     * integer between 1 and 6, inclusive
     */
    public void roll(){
        faceValue = (int)(Math.random() * 6) + 1;
    }
    /**
     * 
     * @return the face value of the dice
     */
    public int getFaceValue(){
        return faceValue;
    }
    
    @Override 
    public String toString(){
        String str = String.format("%s", FaceValue.values()[faceValue-1]);
        return str;
    }
    
}
enum FaceValue{
    ONE, TWO, THREE, FOUR, FIVE, SIX;
}