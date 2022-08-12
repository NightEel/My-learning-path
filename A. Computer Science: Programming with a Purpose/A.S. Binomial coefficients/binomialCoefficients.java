public class binomialCoefficients {
    public static void main(String[] args){
        int n                   =   Integer.parseInt(args[0]);
        double[][] ragged_array =   new double[n][n];

        // Assigning values to the array entries
        if (n > 1) ragged_array[1][1]      =   1;
        for (int i = 0; i < ragged_array.length; i++) ragged_array[i][0] = 0;

        // Computing the other ones
        for (int i = 2; i < ragged_array.length; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                ragged_array[i][j] = (ragged_array[i-1][j] + ragged_array[i-1][j-1]) / 2.0;
            }
        }

        // Printing the array
        for (int i = 0; i < ragged_array.length; i++)
        {
            for (int j = 0; j <= i; j++) System.out.print(" " + ragged_array[i][j] + " ");
            System.out.println();
        }
    }
}