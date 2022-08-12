public class RandomWalkers {
    public static void main(String[] args){
        int r       =   Integer.parseInt(args[0]);
        double trials  =   Integer.parseInt(args[1]);
        int m       =   0;
        for (int k = 0; k <= trials; k++)
        {
            int n                   =   0;
            int i                   =   0;
            int j                   =   0;
            int manhattan_distance  =   0;

            while (manhattan_distance < r)
            {
                double z                =   Math.random();
                if (z < 0.25)       i   +=  1;
                else if (z < 0.5)   i   -=  1;
                else if (z < 0.75)  j   +=  1;
                else                j   -=  1;
                manhattan_distance      =   Math.abs(i) + Math.abs(j);
                n                       +=  1;
            }
            m   +=   n;
        }
        System.out.println("The average number of steps is " + m / trials);
    }
}