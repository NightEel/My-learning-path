public class righttriangle {
    public static void main(String[] args)
    {
        //Defining the variables whose values are the inputs
        int a   =   Integer.parseInt(args[0]);
        int b   =   Integer.parseInt(args[1]);
        int c   =   Integer.parseInt(args[2]);

        boolean isRight =   (a > 0) && (b > 0) && (c > 0) && (
        (b * b + c * c == a * a) ||
        (a * a + c * c == b * b) ||
        (a * a + b * b == c * c)
        );
        System.out.println(isRight);
    }
}