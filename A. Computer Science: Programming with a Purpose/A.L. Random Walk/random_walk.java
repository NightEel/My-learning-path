public class random_walk {
    public static void main(String[] args){
        int     n   =   2 * Integer.parseInt(args[0]);
        int     k   =   0;
        int     l   =   0;
        int     m   =   0;

        while (Math.abs(k) < n && Math.abs(l) < n)
        {
            double  z   =   Math.random();
            if (z <= 0.25) k    =   k + 1;
            else if (z <= 0.5) k    =   k - 1;
            else if (z <= 0.75) l   =   l + 1;
            else l  =   l - 1;
            m   =   m + 1;
            System.out.println("Step " + m + ": " + "(" + k + ", " + l + ").");
        }
        System.out.println("It took " + m + " steps.");
    }
}