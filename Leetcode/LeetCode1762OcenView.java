import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LeetCode1762OcenView
{
    public static void main(String[] args)
    {
        //System.out.println(Arrays.toString(findBuildings(new int[]{4,2,3,1})));
        assertArrayEquals( new int[]{0,2,3},findBuildings(new int[]{4,2,3,1}));
        assertArrayEquals( new int[]{0,1,2,3},findBuildings(new int[]{4,3,2,1}));
    }

    public static int[] findBuildings(int[] heights)
    {
        List<Integer> list=new ArrayList<>();
        list.add(heights.length-1);
        for(int i=heights.length-2;i>=0;i--)
        {
            //System.out.println(heights[list.get(list.size()-1)]+"<"+heights[i]);
            if(heights[list.get(list.size()-1)]<heights[i])//0,1
            {
                list.add(i);
            }
        }
        Collections.reverse(list);
        return list.stream().mapToInt(i->i).toArray();
    }
}
