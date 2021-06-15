import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LeetCode62UniquePaths {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
			System.out.println(uniquePaths(18,18,new HashMap()));
			long end = System.currentTimeMillis();
		      //finding the time difference and converting it into seconds
		      float sec = (end - start)/ 100F;
		      System.out.println(sec + " seconds");
		      System.out.println("---------------------------");
		      System.out.println("using short cut");
		       start = System.currentTimeMillis();
		       
				System.out.println(uniquePaths1(18,18,new HashMap()));
				 end = System.currentTimeMillis();
			      //finding the time difference and converting it into seconds
			       sec = (end - start)/ 100F;
			      System.out.println(sec + " seconds");
			      System.out.println("---------------------------");
			      
			      System.out.println("using array");
			       start = System.currentTimeMillis();
			       
					System.out.println(uniquePaths2(18,18));
					 end = System.currentTimeMillis();
				      //finding the time difference and converting it into seconds
				       sec = (end - start)/ 100F;
				      System.out.println(sec + " seconds");
	}
	
	//time complexity is 2^n
	public static long uniquePaths(int m, int n, Map<String,Long> map)
	{
		String key=m+","+n;
		if(m==0 || n==0) return 0;
		if(m==1 && n==1) return 1;
	
		
		//String key2=n+","+m;
		if(map.get(key)!=null ) return map.get(key);
		long res=uniquePaths(m-1,n,map)+uniquePaths(m,n-1,map);
		map.put(key,res);
		//map.put(key2,res);
    	return map.get(key);
    	
	}
	//time complexity is O(n*m)
	//https://youtu.be/oBt53YbR9Kk?t=3711
	public static long uniquePaths1(int m, int n, Map<String,Long> map)
	{
		String key=m+","+n;
		if(m==0 || n==0) return 0;
		if(m==1 && n==1) return 1;
	
		
		String key2=n+","+m;
		if(map.get(key)!=null || map.get(key2)!=null ) return map.get(key);
		long res=uniquePaths1(m-1,n,map)+uniquePaths1(m,n-1,map);
		map.put(key,res);
		map.put(key2,res);
    	return map.get(key);
    	
	}
	//this looks like O(n*m)
	//https://www.youtube.com/watch?v=rBAxUTqvlQA&t=206s
	public static long uniquePaths2(int m, int n) {
        long[][] dp = new long[m][n];
        
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		   System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("********");
        for(long[] arr:dp){
            Arrays.fill(arr,1);
        }
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		   System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("********");
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        for(int i=0;i<m;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		   System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
        return dp[m-1][n-1];
    }
    
}
