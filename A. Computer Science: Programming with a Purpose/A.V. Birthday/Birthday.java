public class Birthday {
    public static void main(String[] args){
        int n                   =   Integer.parseInt(args[0]);
        int trials              =   Integer.parseInt(args[1]);
        int[] birthdays         =   new int[n];
        double[][] statistics   =   new double[n][2];
        double fraction = 0;

        for (int l = 0; l < trials; l++)
        {
            int i = 0;
            while (true)
            {
                boolean k = false;
                birthdays[i] = (int) (Math.random() * (n - 1));
                for (int j = 0; j < i; j++)
                {
                    if (birthdays[j] == birthdays[i])
                    {
                        k = true;
                        statistics[i][0]    +=  1;
                        break;
                    }
                }
                if (k) break;
                i++;
            }
        }

        int i   =   0;
        while (fraction < 0.5)
        {
            statistics[i][1]    =   fraction;
            fraction    +=  statistics[i][0] / trials;
            System.out.println((i + 1) + "\t" + ((int) statistics[i][0]) + "\t" + fraction);
            i++;
        }
    }
}