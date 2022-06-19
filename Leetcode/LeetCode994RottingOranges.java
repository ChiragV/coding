import java.util.LinkedList;
import java.util.Queue;

public class LeetCode994RottingOranges
{
    public static void main(String[] args)
    {
        orangesRotting(new int[][]{{2, 2}, {1, 1}, {0, 0}, {2, 0}});
    }

    private static class Point
    {
        private int x;
        private int y;

        Point(int a, int b)
        {
            this.x = a;
            this.y = b;
        }

        public String toString()
        {
            return x + ":" + y;
        }
    }

    public static int orangesRotting(int[][] grid)
    {
        int minute = 0;
        Queue<Point> qu = new LinkedList<>();
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == 2)
                    qu.add(new Point(i, j));
            }
        }

        //step 2
        while (!qu.isEmpty())
        {
            System.out.println(qu);
            int size = qu.size();
            for (int k = 0; k < size; k++)
            {

                Point p = qu.poll();

                int i = p.x;
                int j = p.y;

                if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length)
                    continue;

                if (grid[i][j] == 0) continue;
                if (grid[i][j] == -1) continue; //visited

                grid[i][j] = -1;

                if (i > 0 && grid[i - 1][j] == 1)//up
                {
                    qu.add(new Point(i - 1, j));
                    grid[i][j] = 3;//visit nexzt time
                }
                if (j < grid[0].length - 1 && grid[i][j + 1] == 1)
                {
                    qu.add(new Point(i, j + 1));//right
                    grid[i][j] = 3;//visit nexzt time
                }
                if (i < grid.length - 1 && grid[i + 1][j] == 1)
                {
                    qu.add(new Point(i + 1, j));//down
                    grid[i][j] = 3;//visit nexzt time
                }
                if (j > 0 && grid[i][j - 1] == 1)
                {
                    qu.add(new Point(i, j - 1));//left
                    grid[i][j] = 3;//visit nexzt time
                }


            }
            System.out.println(qu.size());
            if (!qu.isEmpty())
                minute++;
        }
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (grid[i][j] == 1)
                    return -1;
            }
        }

        return minute;
    }

}
