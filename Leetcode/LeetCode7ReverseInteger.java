import static org.junit.Assert.assertEquals;

public class LeetCode7ReverseInteger {

	public static void main(String[] args) {
		//assertEquals(reverse(-123),-321);
		assertEquals(reverse3(1534236469),0);
		//assertEquals(reverse(-2147483648),0);
		//assertEquals(reverse(-2147483412),-2143847412);

	}
	public static int reverse1(int x) {
        int num=x<0?-x:x; // if negative then make it positive, it will make life simple
        StringBuffer sb=new StringBuffer(num+"");
        try
        {
          long finalVal=Long.parseLong(sb.reverse().toString());
          if(finalVal>Integer.MAX_VALUE ||  finalVal<Integer.MIN_VALUE)
            return 0;
          if(x<0) //it was negative at the beginning, so make answer(reversed number) as negative too.
          finalVal=-finalVal;
          return (int)finalVal;
        }catch(NumberFormatException e){return 0;} //overflow handling
     }
	   
	   //without using string function
	   public static int reverse(int x) {
		   int rev=0;
		    while(x!=0)
		    {
		        int reminder=x%10; 
		        x=x/10;
		   
		       rev=rev*10+reminder;
		       
		       //handling overflow logic
		       if((rev>Integer.MAX_VALUE/10 ||rev<Integer.MIN_VALUE/10) && x!=0) 
		       return 0;
		    }
		    return rev;
	   }
	   
	   public static int reverse3(int x) {

		    int rev=0;
		    while(x!=0)
		    {
		        int reminder=x%10; 
		        x=x/10;       
		        rev=rev*10+reminder;
		    }
		    return rev;
		}
}
