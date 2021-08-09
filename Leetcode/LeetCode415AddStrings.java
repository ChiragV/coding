import static org.junit.Assert.assertEquals;

public class LeetCode415AddStrings {

	public static void main(String[] args) {
		
		assertEquals(addStrings("11","123"),"134");
		assertEquals(addStrings("5","6"),"11");
		assertEquals(addStrings("456","77"),"533");
		assertEquals(addStrings("0","0"),"0");

	}
	public static String addStrings(String num1, String num2)  {
        
		
		 //keep adding zeros at the beginning till both string length becomes equal
	    if(num1.length()>num2.length()) //num1 string bigger
	    {
	        while(num1.length()-num2.length()!=0)
	        num2="0"+num2;
	    }
	    else if(num2.length()>num1.length()) ////num2 string bigger
	    {
	      while(num2.length()-num1.length()!=0)
	      num1="0"+num1;
	    } // else //both are equal and nothing to do
	    System.out.println("num1:"+num1+","+" num2 :"+num2);
	    
	    //step 2 
	    //Read one chracter at a time from right to left and add them
	    
	    String finalString="";
	    int carry=0;
	    for(int i=num1.length()-1;i>=0;i--)
	    {
	         int finalSum=carry+Integer.parseInt(num1.charAt(i)+"")+Integer.parseInt(num2.charAt(i)+"");        
	         
	         //Step 3
	         //Take care of carry. For this if finalSum is greater then 9 then add 1 to extra variable otherwise make it 0.
	         if(finalSum>9 && i!=0)// i==0 means we reached at the end so no carry required
	         {
	            carry=1;
	            finalString=finalSum-10+finalString;
	        }
	        else
	        {
	            carry=0;
	            finalString=finalSum+finalString;
	        }
	    }
		return finalString;
    }
}
