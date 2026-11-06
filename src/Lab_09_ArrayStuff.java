import java.util.Arrays;
import java.util.Random;

public class Lab_09_ArrayStuff {
    /**
     * Main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        int[] dataPoints = new int[100];
        Random rnd = new Random();

        // IPO
        for(int i = 0; i < 100; i++) {
            dataPoints[i] = rnd.nextInt(1,101);
        }
    }
}