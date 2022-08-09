public class PrimeCounter {
    public static void main(String[] args){
        long start  =   System.currentTimeMillis(); // For measuring the time to see if it is "reasonable"

        int n       =   Integer.parseInt(args[0]);

        if (n >= 2) System.out.println(2);          // Because 2 % 1 == 0 but 1 isn't prime
        if (n >= 3) System.out.println(3);          // Because, if not used, the for inside the else should start at 1
        if (n >= 5) System.out.println(5);
        if (n >= 7) System.out.println(7);
        if (n >= 11) System.out.println(11);
        if (n >= 13) System.out.println(13);
        if (n >= 17) System.out.println(17);
        if (n >= 19) System.out.println(19);
        if (n >= 23) System.out.println(23);


        for (int m = 29; m <= n; m += 2)
        {
            if (m % 3 == 0) System.out.print("");
            else if (m % 5 == 0) System.out.print("");
            else if (m % 7 == 0) System.out.print("");
            else if (m % 11 == 0) System.out.print("");
            else if (m % 13 == 0) System.out.print("");
            else if (m % 17 == 0) System.out.print("");
            else if (m % 23 == 0) System.out.print("");
            else
            {
                boolean z = true;
                for (int k = 31; k < (m / k) + 1; k = k + 2)    // The "/ k" instead of a constant decreases significaly the run time
                {
                    if (m % k == 0)
                    {
                        z   =   false;
                        break;                                  // That way it stops computing the rest
                    }
                }
                if (z) System.out.println(m);
            }
        }
        System.out.println("It has been " + (System.currentTimeMillis() - start) + "ms.");
    }
}
