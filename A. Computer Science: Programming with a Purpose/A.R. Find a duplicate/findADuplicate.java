public class findADuplicate {
    public static void main(String[] args){
        int number_of_appearance    =   0;
        for (int i = 0; i < args.length; i++)
        {
            for (int j = 0; j < args.length; j++)
            {
                if (i + 1 == Integer.parseInt(args[j]))
                    number_of_appearance    +=  1;
                if (number_of_appearance    >=  2)
                {
                    System.out.println("There are duplicate values.");
                    break;
                }
            }
            if (number_of_appearance    >=  2) break;
            number_of_appearance    =   0;
        }
    }
}