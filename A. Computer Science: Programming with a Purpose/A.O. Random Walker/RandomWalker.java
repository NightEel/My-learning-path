public class RandomWalker {
    public static void main(String[] args){
        int r                   =   Integer.parseInt(args[0]);
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
            System.out.println("Step " + n + ": " + "(" + i + ", " + j + ")");
        }
        System.out.println("It took " + n + " steps.");
    }
}