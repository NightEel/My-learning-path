public class relativePrime {
    public static void main(String[] args)
    {
        //Saving the input
        int n   =   Integer.parseInt(args[0]);
        
        //Printing the table
        for (long i = 1; i <= n; i++)
        {
            long    b   =   i;                      //Necessary because i will change during the calculation of the gcd
            for (long j = 1; j <= n; j++)
            {
                long a      =   j;                  //Necessary because j will change during the calculation of the gcd
                double k    =   1;                  //Because 1 is the multiplicative identity in the ring of integers
                
                //Finding the gcd
                if (i == 1 || j == 1) k   =   1;    //I know that k = 1 is redundant but I don't know any other way to do nothing yet
                else
                {
                    long factor =   2;
                    while (factor <= i / factor)
                    {
                        while (i % factor == 0)
                        {
                            i   =   i / factor;
                            if (j % factor == 0)
                            {
                                j   =   j / factor;
                                k   =   k * factor;
                            }
                        }
                        factor  =   factor + 1;
                    }
                }
                if (i > 1 && j % i == 0) k  =   k * i;
                //Here ends the calculation of the gcd
                
                j   =   a;
                i   =   b;
                if (k == 1) System.out.print(" * ");
                else        System.out.print("   ");
            }
            System.out.println();
        }
    }
}
