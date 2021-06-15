import static org.junit.Assert.assertEquals;
/*
 An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:

s = s1 + s2 + ... + sn
t = t1 + t2 + ... + tm
|n - m| <= 1
The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
Note: a + b is the concatenation of strings a and b.

Questions to ask :

1. Is order maintained ?
2. Is count how many chars taken from each string remains same ?

 * */

public class LeetCode97InterleavingString {

	public static void main(String[] args) {
		assertEquals(isInterleave("bb","bx","bxbb"),true);
		assertEquals(isInterleave("ab","cd","abcd"),true);
		assertEquals(isInterleave("aabcc","dbbca","aadbbcbcac"),true);
		assertEquals(isInterleave("aabcc","dbbca","aadbbbaccc"),false);
		assertEquals(isInterleave("","",""),true);
		assertEquals(isInterleave("","","a"),false);
		assertEquals(isInterleave("aa","ab","aaba"),true);

	}
	//whoever matches maximum match will win assertEquals(isInterleave("bb","bx","bxbb"),true);
	public static boolean isInterleave(String s1, String s2, String s3) {
	        if(s1.equals("")||s2.equals(""))
	        {
	        	if(s1.equals("") && s2.equals(s3) || s2.equals("") && s1.equals(s3))
		    	return true;
	        	else 
	        		return false;
	        }
	        if(s1.length()+s2.length()!=s3.length()) return false;
	        char[] chars=s3.toCharArray();//bxbb
	        int i=0,j=0,k=0;
	       
	        for (k=0;k<chars.length;) 
	        {
	        	 int counti=0;
	        	 int countj=0;
	        	int i1=i;
	        	int k1=k;
	        	//compare with first string
				while(i1<s1.length() && chars[k1]==s1.charAt(i1) )
				{
					
					i1++;
					k1++;
					counti++;
				}
				int j1=j;
				countj=0;
				 k1=k;//reinitialize so can compare s3 with s2 at position
				 //compare with second string
				while(j1<s2.length() && chars[k1]==s2.charAt(j1))
				{
					j1++;
					k1++;
					countj++;
				}
			/*
			 * if(i1==s1.length()-1) { i=i1; } if(i==s2.length()-1) { j=j1; }
			 */
				if(i1>=j1 && i<=s1.length() && counti>0)
				{
					i=i1;
					k=k+counti;
				}
				else if(i1<=j1 && j<=s2.length() && countj>0)
				{
					
					j=j1;
					k=k+countj;
					
				}
				else
					return false;	
				System.out.println(i+":"+j+":"+k);
			}
	    	if(i==s1.length() && j==s2.length() && k==s3.length())
	    		return true;
	    		else
	    			return false;
	    }
	
	//simple scenario takes care of assertEquals(isInterleave("ab","cd","abcd"),true);
    public static boolean isInterleave1(String s1, String s2, String s3) {
        
        char[] chars=s3.toCharArray();//aadbbcbcac
        int i=0,j=0,k=0;
        for (k=0;k<chars.length;k++) 
        {
			if(i<s1.length() && chars[k]==s1.charAt(i))
			{
				i++;
			}
			else if(j<s2.length() && chars[k]==s2.charAt(j))
			{
				j++;
			}
			else
			return false;
		}
    	if(i==s1.length() && j==s2.length() && k==s3.length())
    		return true;
    		else
    			return false;
    }

}
