import java.util.Random;

public class RandomNumberDemo {
    public static void main(String[] args) {
        Random num = new Random ();

        int randomInt = num.nextInt(100);
        double randomDouble = num.nextDouble();

        System.out.println("Random Integer (0-99): " + randomInt);
        System.out.println("Random Double (0.0-1.0): " + randomDouble);
    }
}