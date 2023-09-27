public class TestScores {
    private int[] TestScores;

    //class constructor
    public TestScores(int[] TestScores) {
        this.TestScores = TestScores;
    }


    public double calculateAverage() {
        if (TestScores.length == 0) {
            return 0; // Return 0 if there are no test scores.
        }

        double total = 0.0;
        for (int score : TestScores) {
            if (score < 0 || score > 100) {
                throw new IllegalArgumentException("Invalid test score: " + score);
            }
            total += score;
        }

        return total / TestScores.length;
    }





    public static void main (String[] args){
            int[] testScores = {85, 90, 78, 95, 100, 118,}; // Example array of test scores
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

