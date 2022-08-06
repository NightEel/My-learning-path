public class kary {
    public static void main(String[] args)
    {
        //Taking the command-line arguments
        long l  =    Long.parseLong(args[0]);
        long k  =    Long.parseLong(args[1]);
        long i  =    Math.abs(l);

        //Forcing the second input to be between two and sixteen
        if (k >= 2 && k <= 16 )
        {
            //Finding the greater power of k less than i
            int a   =   0;
            while (Math.pow(k,a) <= i)
            {
                a   =   a + 1;
            }

            //Computing i in base k
            int b       =   a - 1;
            String j    =   "";
            double h    =   i;
            while (b >= 0)
            {
                double t    =   h;
                h           =   h / Math.pow(k, b);
                j           =   j + (int) h;
                h           =   t % Math.pow(k, b);
                b           =   b - 1;
            }

            //Printing the outcome
            if (i < 0) System.out.println(j);
            else System.out.println("-" + j);
        }
        else System.out.println("The second argument must be a integer between two and sixteen");
    }
}