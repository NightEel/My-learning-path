public class matricesMultiplication {
    public static void main(String[] args){
        int i   =   Integer.parseInt(args[0]);
        int j   =   Integer.parseInt(args[1]);
        int n   =   Integer.parseInt(args[2]);
        int m   =   Integer.parseInt(args[3]);
        double[][] first_matrix = new double[i][j];
        double[][] second_matrix = new double[n][m];
        double[][] resultant_matrix = new double[i][m];

        if (j != n) System.out.println("The number of columns in the first matrix must be equal to the number of rows in the second matrix.");
        else
        {
            // Forming the first matrix from input
            for (int k = 0; k < first_matrix.length; k++)
            {
                for (int l = 0; l < first_matrix[k].length; l++)
                {
                    first_matrix[k][l]  =   Integer.parseInt(args[4 + k * first_matrix[k].length + l]);
                }
            }

            // Forming the second matrix from input
            for (int k = 0; k < second_matrix.length; k++)
            {
                for (int l = 0; l < second_matrix[k].length; l++)
                {
                    second_matrix[k][l]  =   Integer.parseInt(args[4 + i * j + k * second_matrix[k].length + l]);
                }
            }

            // Printing the first matrix
            System.out.println("The first matrix is:");
            for (int k = 0; k < first_matrix.length; k++)
            {
                for (int l = 0; l < first_matrix[k].length; l++)
                {
                    System.out.print(" " + first_matrix[k][l] + " ");
                }
                System.out.println();
            }

            // Printing the second matrix
            System.out.println("The second matrix is:");
            for (int k = 0; k < second_matrix.length; k++)
            {
                for (int l = 0; l < second_matrix[k].length; l++)
                {
                    System.out.print(" " + second_matrix[k][l] + "  ");
                }
                System.out.println();
            }

            // Computing the resultant matrix
            for (int k = 0; k < first_matrix.length; k++)
            {
                for (int l = 0; l < m; l++) // I write m instead of second_matrix[k].length because
                {                           // there may be less or more rows in the second matrix
                    double z    =   0;      // than in the first one.

                    for (int h = 0; h < second_matrix.length; h++)
                    {
                        z   +=   first_matrix[k][h] * second_matrix[h][l];
                    }

                    resultant_matrix[k][l]  =   z;
                }
            }

            // Printing the resultant matrix
            System.out.println("The resultant matrix is:");
            for (int k = 0; k < resultant_matrix.length; k++)
            {
                for (int l = 0; l < resultant_matrix[k].length; l++)
                {
                    System.out.print(" " + resultant_matrix[k][l] + "  ");
                }
                System.out.println();
            }
        }
    }
}