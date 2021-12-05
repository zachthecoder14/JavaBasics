import java.util.Random;

public class diceSimulator {
    public static void main(String args[]) {
        int dice_amount = 2; // Replace this number with the amount of dice that you would like to roll
        int dice_num = 1;
        Random random = new Random();
        for (int i = 0; i < dice_amount; i++) {
            System.out.println("Die #" + dice_num + ": " + random.nextInt(1, 7));
            dice_num++;
        }
    }
}
