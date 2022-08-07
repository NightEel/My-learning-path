public class originalTermination {
    public static void main(String[] args)
    {
        long start          =   System.currentTimeMillis();
        long finish         =   System.currentTimeMillis();
        long elapsedTime    =   finish - start;
        long n              =   9999999999L;
        while (elapsedTime <= 10000)
        {
            long m  =   n;
            start   =   System.currentTimeMillis();
            System.out.println("Started at " + start + "ms.");
            // Print the prime factorization of n.
            for (long factor = 2; factor < n; factor++)
            { // Test potential factor.
                while (n % factor == 0)
                { // Cast out and print factor.
                    n /= factor;
                    System.out.print(factor + " ");
                } // Any factor of n must be greater than factor.
            }
            if (n > 1) System.out.print(n);
            System.out.println();
            finish      =   System.currentTimeMillis();
            System.out.println("Finished at " + finish + "ms.");
            elapsedTime =   finish - start;
            System.out.println("The elapsed time is " + elapsedTime + " ms.");
            n           =   m + 1;
        }
        System.out.println("The largest number such that the program has finished in 10 seconds or more is " + (n - 1));
    }
}
