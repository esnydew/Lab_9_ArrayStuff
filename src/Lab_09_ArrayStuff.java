import java.util.Random;
import java.util.Scanner;

public class Lab_09_ArrayStuff {
    /**
     * Main method
     * @param args command line arguments
     */
    public static void main(String[] args) {
        // Declarations
        int[] dataPoints = new int[100];
        int userNum;
        int count = 0;
        double sum = 0;
        double average;
        boolean isFound = false;
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);

        // IPO
        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(1,101);
        }

        for(int i = 0; i < dataPoints.length; i++) {
            System.out.printf((i == dataPoints.length - 1) ? "%d%n" : "%d | ", dataPoints[i]);
        }

        for(int num : dataPoints) {
            sum += num;
        }
        average = sum / dataPoints.length;
        System.out.printf("The sum of the random array dataPoints is %.0f.%nThe average of the random array dataPoints is %.3f.%n", sum, average);

        userNum = SafeInput.getRangedInt(in, "Please enter an integer from 1 to 100", 1, 100);
        for(int num : dataPoints) {
            if(userNum == num) count += 1;
        }
        System.out.printf("Your number %d appeared %d time%s in the random array dataPoints!%n", userNum, count, (count == 1) ? "" : "s");

        userNum = SafeInput.getRangedInt(in, "Please enter another integer from 1 to 100", 1, 100);
        for(int i = 0; i < dataPoints.length; i++) {
            if(userNum == dataPoints[i]) {
                System.out.printf("The value %d was found in the random array dataPoints at index %d!%n", userNum, i);
                isFound = true;
                break;
            }
        }
        if(!isFound) System.out.printf("The value %d was not found within the random array dataPoints.%n", userNum);

        int min = dataPoints[0];
        int max = dataPoints[0];
        for(int num : dataPoints) {
            if(num < min) {
                min = num;
            } else if(num > max) {
                max = num;
            }
        }
        System.out.printf("The minimum value in the random array dataPoints is %d.%nThe maximum value in the random array dataPoints is %d.%n", min, max);

        // Create a new array of doubles to store all the values of dataPoints as double values rather than int.
        double[] dataAsDoubles = new double[dataPoints.length];
        for(int i = 0; i < dataAsDoubles.length; i++) {
            dataAsDoubles[i] = dataPoints[i];
        }
        System.out.printf("The average of dataAsDoubles is: %.3f.%n", getAverage(dataAsDoubles));

        in.close();
    }

    // Whoever wrote the lab for this said to make a method that takes an argument for an array of doubles. It also said to use an array of integers in the lab.
    /**
     * A method to calculate the average of an array of doubles.
     * @param values an array of doubles.
     * @return the average of the array values.
     */
    public static double getAverage(double[] values) {
        // Declarations
        double sum = 0;

        // IPO
        for(double value : values) {
            sum += value;
        }
        return sum / values.length;
    }
}