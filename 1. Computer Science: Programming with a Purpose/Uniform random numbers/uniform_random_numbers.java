public class uniform_random_numbers {
    public static void main(String[] args)
    {
        //Generating the numbers
        double first    =   Math.random();
        double second   =   Math.random();
        double third    =   Math.random();
        double fourth   =   Math.random();
        double fifth    =   Math.random();

        //Calculating their average value, and their minimum and maximum values
        double average  =   (first + second + third + fourth + fifth)/5;
        double minimum  =   Math.min(Math.min(Math.min(Math.min(first, second),third),
                            fourth),fifth);
        double maximum  =   Math.max(Math.max(Math.max(Math.max(first, second),third),
                            fourth),fifth);

        //Printing the numbers, their average value, and their minimum
        // and maximum values
        System.out.println("The five uniform random numbers are " +
        first + ", " + second + ", " + third + ", " + fourth + ", and " + fifth +
        ". Their average value is " + average + ", their minimum value is " +
        minimum + ", and their maximum value is " + maximum + ".");
    }
}