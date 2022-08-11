public class GeneralizedHarmonic {
    public static void main(String[] args){
        int n       =   Integer.parseInt(args[0]);
        int r       =   Integer.parseInt(args[1]);
        double h    =   1;
        double l    =   1;

        for (int m = 2; m < n + 1; m++)
        {
            for (int k = 1; k < r + 1; k++)
            {
                l   *=  m;
            }
            h   +=  1 / l;
            l   =   1;
        }
        System.out.println(h);
    }
}