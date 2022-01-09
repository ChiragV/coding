import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//TODO: implement this using Trie
public class LeetCode2135CountWordsObtained 
{

	public static void main(String[] args) 
	{
		
		assertEquals(2,wordCount(new String[]{"ant","act","tack"},new String[]{"tack","act","acti"}));
		//wordCount(new String[]{"mox","bj","rsy","jqsh"},new String[]{"trk","vjb","jkr"});
		//wordCount(new String[]{"ant","act","tack"},new String[]{"tack","act","acti"});
		assertEquals(2,wordCount(new String[]{"g","vf","ylpuk","nyf","gdj","j","fyqzg","sizec"},new String[]{"r","am","jg","umhjo","fov","lujy","b","uz","y"}));
	}
	
	 public static int wordCount(String[] startWords, String[] targetWords) 
	 {
	        Set<String> setStart=new HashSet<>();
	        
	        for(int i=0;i<startWords.length;i++)
	        {
	        	char ch[]=startWords[i].toCharArray();
	        	Arrays.sort(ch);
	            setStart.add(new String(ch));
	        }
	        
	        List<String> listTarget=new ArrayList<>();
	        for(int i=0;i<targetWords.length;i++)
	        {
	        	char ch[]=targetWords[i].toCharArray();
	        	Arrays.sort(ch);
	        	listTarget.add(new String(ch));
	        }
	        int finalAns=0;
	        //loop through target string
	       for(String str :listTarget)
	       {
	    	   //for each string skip one char and check in start set
	    	   for (int j = 0; j < str.length(); j++)
		   {
				String prefix = str.substring(0, j);
	    		   	String suffix = str.substring(j+1);
	               		String new_str = prefix + suffix;
	               		if (setStart.contains(new_str))
				{
				   finalAns++;
				   break;
	                	}
	           }
	       }
	       return finalAns;
	    }

}
