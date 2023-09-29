public class TestScores {
    static double Total = 0;
    static int ValidArg = 0;
    private double[] TestScores; // initializes Test scores array

    // class constructor
    public TestScores(double[] TestScores) {
        this.TestScores = TestScores; // references the class variable not the method
    }

    public void calculateAverage() {
        if (TestScores.length == 0) {// checks to make sure there is not an empty array
            throw new IllegalArgumentException("Array is empty therefore the average cannot be calculated.");
        }

        double total = 0.0; // initializes total variable
        for (double score : TestScores) {
            if (score >= 0 && score <= 100) {
                total += score; // this has score added to it at each item in the array
                ValidArg++;
            } else {
                System.err.println("Invalid test score: " + score + " The item will be skipped.");
            }
        }

        Total = total; // Store the total in the static variable
    }

    public static void main(String[] args) {
        double[] testScores = { -1, 78, 97.2, 100, 89 }; // array of test scores
        TestScores test = new TestScores(testScores); // creates a new object of TestScores and names the object test

        try {
            test.calculateAverage();
            double average = Total / ValidArg; // Calculate the average after the loop
            System.out.println("Average test score: " + average);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } finally {// This will ALWAYS execute even if there is no exception
            System.out.println("Done");
        }
    }
}
