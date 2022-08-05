public class three_sort {
    public static void main(String[] args)
    {
        //Defining the variables as the three inputs
        int a   =   Integer.parseInt(args[0]);
        int b   =   Integer.parseInt(args[1]);
        int c   =   Integer.parseInt(args[2]);

        //Defining the minimum and maximum variables
        int min     =   Math.min(Math.min(a,b),c);
        int max     =   Math.max(Math.max(a,b),c);

        //Printing the inputs in ascending order
        System.out.println( min + ", " + (a + b + c - min - max) + ", " + max );
    }
}