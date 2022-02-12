import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/*
    Results in Time limit exceeded
*  There is better solution to this problem
* */
public class LeetCode567PermutationInString
{
    public static void main(String[] args)
    {
        checkInclusion("ab","eidbaooo");
        checkInclusion("ab","eidbaooo");
    }

    public static boolean checkInclusion(String s2, String s1)
    {

        if(s2.length()>s1.length())
            return false;
        //if length is same then easier to check
        if(s2.length()==s1.length()  )
        {
            if(s2.equals(s1))
            {
                return true;
            }
            else
            {
                char ch1[]=s2.toCharArray();
                Arrays.sort(ch1);
                s2=String.valueOf(ch1);
                char ch2[]=s1.toCharArray();
                Arrays.sort(ch2);
                s1=String.valueOf(ch2);
                return s1.contains(s2);
            }
        }

        char small[]=s2.toCharArray();
        char big[]=s1.toCharArray();
        List<Character> sourceList = new ArrayList<>();
        //prepare list to can be modified easily
        for (char c : small)
        {
            sourceList.add(c);
        }
        List<Character> sourceListCopy = new ArrayList<>(sourceList);
        for(int i=0;i<big.length;i++)
        {

            if(sourceList.contains(big[i]))
            {
                int j=i;
                //using iterator so we can modify list
                Iterator<Character> it = sourceList.listIterator();
                while( it.hasNext() && j<big.length && sourceList.contains(big[j]) )
                {
                    if(big[j]==it.next())
                    {
                        it.remove();
                        j++;
                        it = sourceList.listIterator();
                    }

                }
                if(sourceList.isEmpty())
                    return true;
                else
                {
                    sourceList=new ArrayList<>(sourceListCopy);
                }
            }
        }

        return false;
    }
}
