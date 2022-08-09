import static java.lang.Math.asin;

public class greatcircle {
    public static void main(String[] args)
    {
        //Parse (mathematical) variables from command-line
        double x1   =   Math.toRadians(Double.parseDouble(args[0]));
        double y1   =   Math.toRadians(Double.parseDouble(args[1]));
        double x2   =   Math.toRadians(Double.parseDouble(args[2]));
        double y2   =   Math.toRadians(Double.parseDouble(args[3]));

        //The mean radius of the Earth
        double r    =   6371.0;

        //Other variables for the calculation
        double xsineSquared  =  (Math.sin((x2-x1)/2)) * (Math.sin((x2-x1)/2));
        double ysineSquared  =  (Math.sin((y2-y1)/2)) * (Math.sin((y2-y1)/2));
        double cosineProduct =  Math.cos(x1) * Math.cos(x2);

        //Haversine formula
        double distance =   2 * r * Math.asin(Math.sqrt(xsineSquared + cosineProduct * ysineSquared));

        //Print the distance
        System.out.println(distance + " kilometers");
    }
}