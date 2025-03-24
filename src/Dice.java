import java.util.Random;

public class Dice {
    private Random random;
    private int sides;

    public Dice(){
        this.sides = 6;
        this.random = new Random();
    }

    public Dice(int sides){
        this.sides = sides;
        this.random = new Random();
    }

    public int roll(){
        return random.nextInt(sides)+1;
    }

    public int getSides(){
        return sides;
    }


}
