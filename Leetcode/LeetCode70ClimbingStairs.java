import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.Map;

/*
You are climbing a staircase. It takes n steps to reach the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
 */
public class LeetCode70ClimbingStairs {

	public static void main(String[] args) {
	
		assertEquals(climbStairs(3),3);
		assertEquals(climbStairs(2),2);
		//System.out.println(climbStairs(2,0));
	}
	 public static int climbStairs(int n) {
	        return(climbStairs2(n,0,new HashMap<Integer,Integer>()));
	    }
	 
	 public static int climbStairs1(int n,int counter) {
			
			
	      if(n<1)
	     {
	    	 counter=counter+1;
	    	 return counter;
	     }
	     for(int i=1;i<=2;i++)
	     {
	    	 if(n-i>=0)
	    	 counter=climbStairs1(n-i,counter);
	     }
	     return counter;
	}
    /*memoization*/
	public static int climbStairs2(int n,int counter,Map<Integer,Integer> map) {
		
	     if(n==1)
	    	 return 1;
	     if(n==2)
	    	 return 2;
	     
	    if (map.containsKey(n)) 
	    	return map.get(n);
	     counter=climbStairs2(n-2,counter,map)+climbStairs2(n-1,counter,map);
	     map.put(n, counter);
	     return counter;
	}
}
