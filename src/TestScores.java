public class TestScores {
    private double[] TestScores; //initalizes Test scores array

    //class constructor
    public TestScores(double[] TestScores) {
        this.TestScores = TestScores; //refrences the class varible not the method
    }


    public double calculateAverage() {
        if (TestScores.length == 0) {//checks to make sure there is not an empty array
            return 0; // Return 0 if there are no test scores.
        }

        double total = 0.0; //initalizes total variable
        for (double score : TestScores) {
            if (score < 0 || score > 100) {//checks if the value is less than zero OR if the value is greater than 100
                //if either is true it throws the below exception
                throw new IllegalArgumentException("Invalid test score: " + score +
                        " The average could not be calculated due to an invalid test score.");
            }
            total += score; //this has score added to it at each item in the array
        }

        return total / TestScores.length; //This calculates the avg by the total value divided by the number of items
    }





    public static void main (String[] args){
            double[] testScores = {78,97.2,67,83,100,113}; //  array of test scores
            TestScores test = new TestScores(testScores); // creates a new object of TestScores and names the object test

            try {//Note when one exception is found it stops the program after it throws
                double average = test.calculateAverage();
                System.out.println("Average test score: " + average);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage());
            } finally {//This will ALWAYS execute even if there is no exception

                System.out.println("Done");

            }

        }
    }

