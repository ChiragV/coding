import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LeetCode3LongestSubstring {

	public static void main(String[] args) {

		
		
		
		
		  assertEquals(lengthOfLongestSubstring("abcabcbb"),3);
		  
		  assertEquals(lengthOfLongestSubstring("bbbbb"),1);
		  assertEquals(lengthOfLongestSubstring( "pwwkew"),3);
		  assertEquals(lengthOfLongestSubstring(" "),1);
		  assertEquals(lengthOfLongestSubstring("aab"),2);
		  
		  assertEquals(lengthOfLongestSubstring( "dvdf"),3);
		  
		  assertEquals(lengthOfLongestSubstring("abcabcbbb"),3);
		  assertEquals(lengthOfLongestSubstring("bbtablud"),6);
		  
		  
		  assertEquals(lengthOfLongestSubstring("tmmzuxt"), 5);
		  
		  
		  assertEquals(lengthOfLongestSubstring("GHZABCDB"), 7);
		  assertEquals(lengthOfLongestSubstring("OHVHJDML"), 6);
		 
		assertEquals(lengthOfLongestSubstring("PYOHVXHJDT"), 6);

	}

	public static int lengthOfLongestSubstring(String s) {

		char[] ch = s.toCharArray();
		int longest = 0;
		int counter = 0;
		Set<Character> set = new HashSet<Character>();

		for (int i = 0; i < ch.length; i++) 
		{

			if (set.add(ch[i])) 
			{
				counter = counter + 1;

			} else // duplicate character found
			{
				longest = counter > longest ? counter : longest;
				if (i>0 && i+1<ch.length && i<ch.length && ch[i] == ch[i - 1] && ch[i] != ch[i+1]) 
				{
					// same as previous char so
					i=i-1;
				} else 
				{
					// go back
					int temp = s.lastIndexOf(ch[i], i - 1);
					if(ch.length-(temp+1)>longest) //trying to improve runtime,if longest string already achieved no point in going back
					i = temp;
				}
				counter = 0;
				set = new HashSet<Character>();
				
			}
		}
		longest = set.size() > longest ? set.size() : longest;// this comes into the picture when last combination is
																// biggest string

		return longest;
	}

}
