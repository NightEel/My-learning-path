public class CMYKtoRGB {
    public static void main(String[] args)
    {
        //CMYK command-line arguments
        double cyan     =   Double.parseDouble(args[0]);
        double magenta  =   Double.parseDouble(args[1]);
        double yellow   =   Double.parseDouble(args[2]);
        double black    =   Double.parseDouble(args[3]);

        //RGB
        int white    =   (int) (1 - black);
        int red      =   (int) (255 * white * (1 - cyan));
        int green    =   (int) (255 * white * (1 - magenta));
        int blue     =   (int) (255 * white * (1 - yellow));

        //Printing the RGB values
        System.out.println("red   =  " + red);
        System.out.println("green   =  " + green);
        System.out.println("blue   =  " + blue);
    }
}