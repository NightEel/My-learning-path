public class DiscreteDistribution {
    public static void main(String[] args){
        int m   =   Integer.parseInt(args[0]);
        int[] s =   new int[args.length];

        // Defining s
        s[0]    =   0;
        for (int i = 1; i < args.length; i++)
        {
            s[i]    =   s[i-1] + Integer.parseInt(args[i]);
        }

        // Picking and printing the random indices
        for (int i = 0; i < m; i++)
        {
            double r    =   Math.random() * (s[args.length - 1]);
            for (int j = 1; j < args.length; j++)
            {
                if ((s[j-1] <= r) && (r < s[j]))
                {
                    System.out.print(j + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}