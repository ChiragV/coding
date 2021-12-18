
import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class LeetCode221MaximalSquare 
{

	public static void main(String[] args) 
	{
	  assertEquals(4,maximalSquare(new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
	  assertEquals(1,maximalSquare(new char[][] {{'0','1'},{'1','0'}}));
	}
	
	 public static int maximalSquare(char[][] matrix) 
	 {
	      /*logic where first column or row has atleast one 1*/
			 boolean atlead1=false;
			 for(int i=0;i<matrix[0].length;i++)
			 {
				 if(matrix[0][i]=='1')
					 atlead1=true;
			 }
			 for(int i=0;i<matrix.length;i++)
			 {
				 if(matrix[i][0]=='1')
					 atlead1=true;
			 }
	         /*logic where first column or row has atleast one 1 ends*/
	        
			 int ans=0;
		     int[][] dp = convert(matrix);
			 int[] array=new int[3];
			 for(int i=1;i<=dp.length-1;i++)
			 {
				 for(int j=1;j<=dp[0].length-1;j++)
				 {
					 if(dp[i][j]==1)
					 {
						 array[0]=dp[i-1][j];//top
						 array[1]=dp[i][j-1];//left
						 array[2]=dp[i-1][j-1];//diagonal
	                     
	            //if all of above is 1 then let's make two..and so on..
						 dp[i][j]=Arrays.stream(array).min().getAsInt()+1;
	           //keep track of largest value we found
						 ans=Math.max(ans, dp[i][j]);					 
					 }
				 }			
			 }
	     // logic where first column or row has atleast one 1 and all else 0
			 if(atlead1 && ans==0)ans=1;
			 return ans*ans;
	 }
	 
	    //convert to int array
	  private static int[][]  convert(char[][] matrix) 
	  {
			int[][] dp = new int[matrix.length][matrix[0].length];
			for (int i=0;i<matrix.length;i++) 
			{
				for (int j=0;j<matrix[0].length;j++) 
				{
					dp[i][j]=Character.getNumericValue(matrix[i][j]);
				}			
			}
		    return dp;
	  }
}
