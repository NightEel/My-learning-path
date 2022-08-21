public class Minesweeper {
    public static void main(String[] args){
        int m               =   Integer.parseInt(args[0]);
        int n               =   Integer.parseInt(args[1]);
        int k               =   Integer.parseInt(args[2]);
        int[][] grid        =   new int[m][n];

        // Choosing where the mines ought to be and adding the mines counters
        int i = 0;
        while (i < k)
        {
            int first_component   =   (int) (Math.random() * (m - 1));                  // I turn them into variables because I
            int second_component  =   (int) (Math.random() * (n - 1));                  // want to detect if they're on a border.

            if  (grid[first_component][second_component] != -1)                         // Because I want to identify bombs with -1s and
            {                                                                           // it can't be more than one bomb in each cell.
                grid[first_component][second_component] = -1;                           // If it is empty, put a bomb in there.

                boolean up = first_component != 0;                                      // Those are to
                boolean down = first_component != grid.length - 1;                      // make the cases
                boolean left = second_component != 0;                                   // distinction easier.
                boolean right = second_component != grid[first_component].length - 1;

                if (up)
                {
                    if (grid[first_component - 1][second_component] != -1) grid[first_component - 1][second_component] += 1;
                    if (left && grid[first_component - 1][second_component - 1] != -1) grid[first_component - 1][second_component - 1] += 1;
                    if (right && grid[first_component - 1][second_component + 1] != -1) grid[first_component - 1][second_component + 1] += 1;
                }
                if (down)
                {
                    if (grid[first_component + 1][second_component] != -1) grid[first_component + 1][second_component] += 1;
                    if (left && grid[first_component + 1][second_component - 1] != -1) grid[first_component + 1][second_component - 1] += 1;
                    if (right && grid[first_component + 1][second_component + 1] != -1) grid[first_component + 1][second_component + 1] += 1;
                }
                if (left && grid[first_component][second_component - 1] != -1) grid[first_component][second_component - 1] += 1;
                if (right && grid[first_component][second_component + 1] != -1) grid[first_component][second_component + 1] += 1;

                i++;
            }
        }

        // Printing the field
        for (int a = 0; a < grid.length; a++)
        {
            for (int b = 0; b < grid[a].length; b++)
            {
                if (grid[a][b] == -1) System.out.print(" * ");
                else System.out.print(" " + grid[a][b] + " ");
            }
            System.out.println();
        }
    }
}