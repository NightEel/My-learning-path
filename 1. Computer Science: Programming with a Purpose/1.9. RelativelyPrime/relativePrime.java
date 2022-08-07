public class relativePrime {
    public static void main(String[] args)
    {
        int n   =   Integer.parseInt(args[0]);
        for (long i = 1; i <= n; i++)
        {
            long    b   =   i;
            for (long j = 1; j <= n; j++)
            {
                long a      =   j;
                double k    =   1;
                //Finding the gcd
                if (i == 1 || j == 1) k   =   1;
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
                                //System.out.print(factor + " ");
                                j   =   j / factor;
                                k   =   k * factor;
                            }
                        }
                        factor  =   factor + 1;
                    }
                }
                if (i > 1 && j % i == 0) k  =   k * i;
                j   =   a;
                i   =   b;
                if (k == 1) System.out.print(" * ");
                else        System.out.print("   ");
            }
            System.out.println();
        }
    }
}