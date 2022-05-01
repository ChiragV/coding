import java.util.Stack;

import static org.junit.Assert.*;

public class LeetCode844BackspaceStringCompare
{
    public static void main(String[] args)
    {
        assertTrue(backspaceCompare("ab#c", "ad#c"));
        assertTrue(backspaceCompare("ab##", "c#d#"));
        assertFalse(backspaceCompare("ab#c", "b"));
    }

    public static boolean backspaceCompare(String s1, String t)
    {

        String str1 = convertString(s1);
        String str2 = convertString(t);
        Stack<Character> stk1 = convertStack(s1);
        Stack<Character> stk2 = convertStack(t);
        return str1.equals(str2) && stk1.equals(stk2);

    }

    public static String convertString(String str)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
        {
            char charS = str.charAt(i);


            if (charS == '#')
            {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);

            } else
                sb.append(charS);


        }
        return sb.toString();
    }

    public static Stack<Character> convertStack(String str)
    {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++)
        {
            char charS = str.charAt(i);

            // stack.push(charS);

            if (charS == '#')
            {
                if (!stack.isEmpty())
                    stack.pop();


            } else
                stack.push(charS);

        }

        return stack;
    }
}
