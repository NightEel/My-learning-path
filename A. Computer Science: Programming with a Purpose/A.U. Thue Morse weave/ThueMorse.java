public class ThueMorse {
    public static void main(String[] args){
        int n   =   Integer.parseInt(args[0]);
        boolean is_multiple_of_2    =   true;
        int[] sequence = new int[n];
        sequence[1] = 1;

        System.out.print(("The first " + n + " elements of the Thue-Morse sequence are " + sequence[0]) + sequence[1]);

        for (int i = 2; i < n; i++)
        {
            // Figuring out if i is multiple of two
            int k = i;
            while (k != 1)
            {
                if (k % 2 == 0 ) k /= 2;
                else
                {
                    is_multiple_of_2 = false;
                    break;
                }
            }

            // Computing the Thue–Morse sequence
            if (is_multiple_of_2)
            {
                for (int j = 0; j < (2 * i -1); j++)
                {
                    sequence[i + j] = (sequence[j] + 1) % 2;
                    if (i + j == n - 1) break;
                }
            }
            System.out.print(sequence[i]);
            is_multiple_of_2 = true;
        }
        System.out.println(".");

        // Printing the table
        for (int i = 0; i < sequence.length; i++)
        {
            if (sequence[i] == 0)
            {
                for (int j = 0; j < sequence.length; j++)
                {
                    if (sequence[j] == 0) System.out.print(" + ");
                    else System.out.print(" - ");
                }
            }
            else
            {
                for (int j = 0; j < sequence.length; j++)
                {
                    if (sequence[j] == 0) System.out.print(" - ");
                    else System.out.print(" + ");
                }
            }
            System.out.println();
        }
    }
}