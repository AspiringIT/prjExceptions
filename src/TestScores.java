
import java.util.Scanner;
public class TestScores {
    private double[] TestScores;

    //class constructor
    public TestScores(double[] TestScores) {
        this.TestScores = TestScores;
    }


    public double calculateAverage() {
        if (TestScores.length == 0) {
            return 0; // Return 0 if there are no test scores.
        }

        double total = 0.0;
        for (double score : TestScores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid test score: " + score + " The average could not be calculated due to an invalid test score.");
            }
            total += score;
        }

        return total / TestScores.length;
    }





    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
            double[] testScores = {78,97.2,67,83,100,113}; // Example array of test scores
        System.out.println("Please enter in the test scores.");

            TestScores test = new TestScores(testScores);

            try {//Note when one exception is found it stops the program after it throws
                double average = test.calculateAverage();
                System.out.println("Average test score: " + average);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {

                System.out.println("Done");

            }

        }
    }

