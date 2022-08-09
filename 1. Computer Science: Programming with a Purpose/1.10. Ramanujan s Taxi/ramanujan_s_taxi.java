public class ramanujan_s_taxi {
    public static void main(String[] args)
    {
        int n   =   Integer.parseInt(args[0]);

        for (int a = 1; a <= Math.cbrt(n); a++)
        {
            for (int b = 1; b <= a; b++)
            {
                for (int c = 1; c <= b; c++)
                {
                    for (int d = 1; d <= c; d++)
                    {
                        int a3  =   a * a * a;
                        int b3  =   b * b * b;
                        int c3  =   c * c * c;
                        int d3  =   d * d * d;

                        if (a != c && a3 + b3 == c3 + d3){
                            System.out.println(a3 + ", " + b3 + ", " + c3 + ", " + d3);
                            System.out.println(a + "^3 + " + b + "^3 = " + (a3 + b3) + " = " + c + "^3 + " + d + "^3");
                        }
                        if (a != b && a3 + c3 == b3 + d3){
                            System.out.println(a3 + ", " + b3 + ", " + c3 + ", " + d3);
                            System.out.println(a + "^3 + " + c + "^3 = " + (a3 + c3) + " = " + b + "^3 + " + d + "^3");
                        }
                        if (a != c && a3 + d3 == b3 + c3){
                            System.out.println(a3 + ", " + b3 + ", " + c3 + ", " + d3);
                            System.out.println(a + "^3 + " + d + "^3 = " + (a3 + d3) + " = " + b + "^3 + " + c + "^3");
                        }
                    }
                }
            }
        }
    }
}