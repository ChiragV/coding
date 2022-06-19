import java.util.*;

public class LeetCode797AllPathsFromSourceToTarget
{
    public static void main(String[] args)
    {
        Boolean a = null;
        if (true || a)
            System.out.println("worked");

        //List a = allPathsSourceTarget(new int[][]{{4, 3, 1}, {3, 2, 4}, {3}, {4}, {}});
        //System.out.println(a);
    }


    public static List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        List<List<Integer>> ans = new ArrayList();
        int startIndex = 0;
        int endIndex = graph.length - 1;//number of nodes
        Queue<List<Integer>> qu = new LinkedList<>();
        List<Integer> list2 = Arrays.asList(0);
        qu.add(Arrays.asList(startIndex)); //add first index

        while (!qu.isEmpty())
        {
            List<Integer> path = qu.poll();

            int lastNode = path.get(path.size() - 1);
            if (lastNode == endIndex)
            {
                //List<Integer> list2 = new ArrayList<>(path);
                //ans.add(list2);
            } else
            {
                int neighbours[] = graph[lastNode];

                for (int a : neighbours)
                {
                    List<Integer> list1 = new ArrayList<>(path);
                    list1.add(a);
                    qu.add(list1);
                }
            }
        }

        return ans;
    }
}
