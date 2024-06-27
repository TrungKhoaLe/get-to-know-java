import java.util.Random;

public class LearnVariableScopesDiceRollerClass {
    /*
    Random random = new Random();
    int number = 0;
    */

    LearnVariableScopesDiceRollerClass() {
        // solution 1: move the following 2 lines out of 
        // the constructor
        Random random = new Random();
        int number = 0;
        // roll();
        // solution 2: pass the local variables to the roll
        // method
        roll(random, number);
    }

    public void roll(Random random, int number) {
        number = random.nextInt(6) + 1;
        System.out.println(number);
    }
}
