import static org.junit.Assert.assertEquals;

public class CompareVersionNumbers_165 {

	public static void main(String[] args) {
		assertEquals(-1, compareVersion("1.0","1.0.1"));
		assertEquals(1, compareVersion("1.0.1","1.0"));	
		assertEquals(0, compareVersion("1.0","1.0.0"));	

	}

	 public static int compareVersion(String version1, String version2) {
	     String[] version1Arr=version1.split("\\.");   
	     String[] version2Arr=version2.split("\\.");
	     
	     int size=(version1Arr.length>version2Arr.length)?version1Arr.length:version2Arr.length;
	     
	     for(int i=0;i<size;i++)
	     {
	    	 int v1Val=0,v2Val=0;
	    	 if(version1Arr.length<=i)
	    		 v1Val=0;
	    	 else
	    		 v1Val=Integer.parseInt(version1Arr[i]);
	    	 
	    	 
	    	 if(version2Arr.length<=i)
	    		 v2Val=0;
	    	 else	    		 
	    		 v2Val=Integer.parseInt(version2Arr[i]);
	    	 	    	 
	    	
	    		 if(v1Val<v2Val)
	    			 return -1;
	    		 else if (v1Val>v2Val)
	    			 return 1;
	    		 else if (v1Val==v2Val)
	    			 continue;
	    	 
	     }
	     
		 return 0;
	    }
}
