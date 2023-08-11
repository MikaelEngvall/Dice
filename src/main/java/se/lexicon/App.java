package se.lexicon;

/**
 * Rolling some different dices with enum
 *
 */
import java.util.Random;

// Define the Dice enum
enum Dice {
    D6(6), // D6 with maxValue 6
    D10(10), // D10 with maxValue 10
    D20(20), // D20 with maxValue 20
    D100(100); // D100 with maxValue 100

    // Field for the maxValue of each roll
    private final int maxValue;

    // Constructor for setting the maxValue
    Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    // Method to roll the dice and return a random number between 1 and the maxValue
    int roll() {
        Random random = new Random();
        return random.nextInt(maxValue) + 1;
    }
}

// Example usage
public class App {
    public static void main(String[] args) {
        // Roll a D6
        int d6Result = Dice.D6.roll();
        System.out.println("D6 roll: " + d6Result);

        // Roll a D10
        int d10Result = Dice.D10.roll();
        System.out.println("D10 roll: " + d10Result);

        // Roll a D20
        int d20Result = Dice.D20.roll();
        System.out.println("D20 roll: " + d20Result);

        // Roll a D100
        int d100Result = Dice.D100.roll();
        System.out.println("D100 roll: " + d100Result);
    }
}

